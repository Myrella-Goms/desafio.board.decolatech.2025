package dio.me.services;

import dio.me.dto.BoardColumnsDTO;
import dio.me.dto.BoardDetailsDTO;
import dio.me.persistence.dao.BoardColumnsDao;
import dio.me.persistence.dao.BoardDao;
import dio.me.persistence.entity.BoardEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class BoardQueryService {

    private final Connection connection;

    public BoardQueryService(Connection connection) {
        this.connection = connection;
    }

    public Optional<BoardEntity> findById(final Long id) throws SQLException {
        var boardDao = new BoardDao(connection);
        var boardColumnDAO = new BoardColumnsDao(connection);
        var boardExists = boardDao.findById(id);


        if(boardExists.isPresent()) {
            var entity = boardExists.get();
            entity.setBoardColumns(boardColumnDAO.findByBoardId(entity.getId()));
            return Optional.of(entity);
        }
        return Optional.empty();
    }

    public Optional<BoardDetailsDTO> showBoardDetails(final Long id) throws SQLException {
        var boardDAO = new BoardDao(connection);
        var boardColumnDAO = new BoardColumnsDao(connection);
        Optional<BoardEntity> boardEntity = boardDAO.findById(id);

        if (boardEntity.isPresent()){
            BoardEntity entity = boardEntity.get();
            List<BoardColumnsDTO> columns =
                    boardColumnDAO.findByBoardIdWithDetails(entity.getId());
            var dto = new BoardDetailsDTO(entity.getId(), entity.getName(), columns);
            return Optional.of(dto);
        }
        return Optional.empty();
    }
}

