package net.study.basic.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorDB {

    final Connection connection;

    public ConnectorDB() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mariadb://10.49.199.215:3306", "stis", "stis");
    }

    public Connection getConnection() {
        return connection;
    }
}
