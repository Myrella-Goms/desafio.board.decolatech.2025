package dio.me.services;

import dio.me.persistence.dao.BoardColumnsDao;
import dio.me.persistence.entity.BoardColumnsEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

public class BoardColumnsQueryService {

    private final Connection connection;

    public BoardColumnsQueryService(Connection connection) {
        this.connection = connection;
    }

    public Optional<BoardColumnsEntity> findById(final Long id) throws SQLException {
        var dao = new BoardColumnsDao(connection);
        return dao.findById(id);
    }
}
