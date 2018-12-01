package main;

import java.sql.*;

public class DatabaseUtility {

    private final String username = "IceCode";
    private final String password = "Icecodetruckers!";
    private final String hostname = "icecreamdb.cyjhszrx5hbj.us-west-1.rds.amazonaws.com";
    private final String port = "3306";
    private final String databaseName = "IceCream";
    private final String jdburl = "jdbc:mysql://" + hostname + ":" + port + "/" + databaseName + "?user=" + username + "&password=" + password;
    private static Connection connection;


    private void getConnection() throws SQLException {
        connection = DriverManager.getConnection(jdburl);
    }

    private void closeConnection() throws SQLException {
        connection.close();
    }

    public ResultSet queryDatabase(String query) throws SQLException {
        getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        closeConnection();
        return resultSet;
    }

    public boolean insertDatabase(String insertStatement) throws SQLException {
        getConnection();
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate(insertStatement);
        connection.close();
        return result > 0; //maybe return void?
    }
}
