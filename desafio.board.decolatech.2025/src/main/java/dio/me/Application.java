package dio.me;

import dio.me.persistence.migration.MigrationStrategy;
import dio.me.ui.MainMenu;

import java.sql.SQLException;
import static dio.me.persistence.config.ConnectionConfig.getConnection;

public class Application {

	public static void main(String[] args) throws SQLException {
		try (var connection = getConnection()) {
			new MigrationStrategy(connection).executeMigration();
		}

		new MainMenu().execute();
	}
}