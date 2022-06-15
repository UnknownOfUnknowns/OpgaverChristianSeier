package Hans.OPG5_11.databaseExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static final String HOST     = "localhost";
    private static final int    PORT     = 3307;
    private static final String DATABASE = "salessystem";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "MinkGate1";

    private static final String DELIMITER = ";;";

    private Connection connection;

    Connector() {
        try {
            String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE + "?serverTimezone=UTC";
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
