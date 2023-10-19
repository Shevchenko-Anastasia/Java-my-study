package net.study.basic.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class TableInserting {

    public static Random randomizer = new Random();

    public static void main(String[] args) throws SQLException {
        ConnectorDB connector = new ConnectorDB();
        final Connection connection = connector.getConnection();

/*        final Connection connection = DriverManager.getConnection("jdbc:mariadb://10.49.199.215:3306", "stis", "stis");

        final String insert = "INSERT INTO BI4INTF.barring_4deactivation_4stis (msisdn, barring_code, barring_lvl_code) VALUES ('380953340644', '2', '0')";
        final PreparedStatement insertStatement = connection.prepareStatement(insert);

        insertStatement.execute();
        connection.commit();*/

        for (int i = 1; i <= 100; i++) {
            final String insert = generateInsert(i);
            final PreparedStatement insertStatement = connection.prepareStatement(insert);

            insertStatement.execute();
            connection.commit();
        }
    }

    public static String generateInsert(long counter) {
        final int barring_code = randomizer.nextInt(4);
        final long initialNumber = 380970000000L;
        final long currentNumber = initialNumber + counter;
        final String pattern = "INSERT INTO BI4INTF.barring_4deactivation_4stis (msisdn, barring_code, barring_lvl_code) VALUES ('%d', '%d', '0')";
        final String insertReady = String.format(pattern, currentNumber, barring_code);
        return insertReady;
    }
}
