package dio.me.services;

import dio.me.persistence.dao.BoardColumnsDao;
import dio.me.persistence.dao.BoardDao;
import dio.me.persistence.entity.BoardEntity;

import java.sql.Connection;
import java.sql.SQLException;

public class BoardService {

    private final Connection connection;

    public BoardService(Connection connection) {
        this.connection = connection;
    }

    public BoardEntity insert(final BoardEntity entity) throws SQLException {
        try {
            var boardDao = new BoardDao(connection);
            var boardColumnDao = new BoardColumnsDao(connection);
            boardDao.insert(entity);
            var columns = entity.getBoardColumns().stream()
                    .peek(c -> c.setBoard(entity)).toList();
            for (var column : columns) {
                boardColumnDao.insert(column);
            }
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        }

        return entity;
    }

    public boolean delete(final Long id) throws SQLException {
        try {
            var boardDAO = new BoardDao(connection);
            boolean boardExists = boardDAO.existsById(id);
            if(!boardExists) {
                return false;
            }
            boardDAO.delete(id);
            connection.commit();
            return true;
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        }
    }
}
