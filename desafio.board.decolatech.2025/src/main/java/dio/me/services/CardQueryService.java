package dio.me.services;
import dio.me.dto.CardDetailsDTO;
import dio.me.persistence.dao.CardDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

public class CardQueryService {

    private final Connection connection;

    public CardQueryService(Connection connection) {
        this.connection = connection;
    }

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDao(connection);
        return dao.findById(id);
    }
}
