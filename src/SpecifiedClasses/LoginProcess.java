package SpecifiedClasses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginProcess {
    public int login(Connection connection, String username, String password) throws SQLException {
        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(
                "SELECT *\n" +
                        "FROM nauczyciele\n" +
                        "ORDER BY id_nauczyciela")) {
            while (resultSet.next()) {

            }
            return 0;
        }
    }
}