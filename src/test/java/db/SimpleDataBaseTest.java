package db;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleDataBaseTest {

    @Test
    public void dbTest() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("92JgseRu78");
        dataSource.setPassword("Gq8QccN8Eb");
        dataSource.setServerName("remotemysql.com");
        dataSource.setPort(3306);
        dataSource.setDatabaseName("92JgseRu78");

        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM pet");

        rs.close();
        stmt.close();
        conn.close();
    }
}
