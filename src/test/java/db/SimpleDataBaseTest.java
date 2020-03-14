package db;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.junit.Test;

import java.sql.*;

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

        /*String createSQL = "CREATE TABLE Products\n" +
                "(\n" +
                "    Id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "    ProductName VARCHAR(30) NOT NULL,\n" +
                "    Manufacturer VARCHAR(20) NOT NULL,\n" +
                "    ProductCount INT DEFAULT 0,\n" +
                "    Price DECIMAL\n" +
                ");";

        stmt.executeUpdate(createSQL);
        System.out.println("Table successfully created...");*/

        /*int insertedRows = stmt.executeUpdate ("INSERT INTO pet VALUES ('Rafael', 'Mr. S***', 'Varan', 'M', '2005-03-30', NULL), ('Antony', 'Mr. Cloidex', 'Eezh', 'M', '2006-10-10', NULL);");
        System.out.printf("Added %d rows", insertedRows);*/

        /*int updatedRows = stmt.executeUpdate("UPDATE pet SET name = 'Rafael!'");
        System.out.printf("Updated %d rows", updatedRows);*/

        /*int deletedRows = stmt.executeUpdate("DELETE FROM pet");
        System.out.printf("%d row(s) deleted", deletedRows);*/

        /*ResultSet rs = stmt.executeQuery("SELECT * FROM pet");

        while(rs.next()){

            String name = rs.getString("name");
            String owner = rs.getString("owner");
            String species = rs.getString("species");
            String sex = rs.getString("sex");
            Date birth = rs.getDate("birth");
            Date death = rs.getDate("death");

            System.out.format("%s, %s, %s, %s, %s, %s\n", name, owner, species, sex, birth, death);


        }


        rs.close();*/

        /*String dropSQL = "DROP TABLE Products;";

        stmt.executeUpdate(dropSQL);
        System.out.println("Table deleted in given database...");*/

        stmt.close();
        conn.close();
    }
}
