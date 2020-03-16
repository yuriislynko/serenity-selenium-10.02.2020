package utils;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDBManager {

    private MySQLDBManager() {
    }

    private final static String USER_NAME = "92JgseRu78";
    private final static String USER_PASS = "Gq8QccN8Eb";
    private final static String SERVER_NAME = "remotemysql.com";
    private final static int SERVER_PORT = 3306;
    private final static String DB_NAME = "92JgseRu78";

    private static Connection createConnection() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser(USER_NAME);
        dataSource.setPassword(USER_PASS);
        dataSource.setServerName(SERVER_NAME);
        dataSource.setPort(SERVER_PORT);
        dataSource.setDatabaseName(DB_NAME);

        return dataSource.getConnection();
    }

    private static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    public static ResultSet executeQuery(String query) throws SQLException {
        Connection connection = createConnection();
        //Statement statement = connection.createStatement();
        //statement.executeLargeUpdate("CREATE TABLE pet (name VARCHAR(20), owner VARCHAR(20), species VARCHAR(20), sex CHAR(1), birth DATE, death DATE);");
        ResultSet resultSet = connection.createStatement().executeQuery(query);
        closeConnection(connection);
        return resultSet;
    }

}