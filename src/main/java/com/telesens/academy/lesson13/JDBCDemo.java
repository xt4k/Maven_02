package com.telesens.academy.lesson13;

import java.sql.*;

public class JDBCDemo {
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/qa-ja-06?user=root&password=1234&serverTimezone=UTC&useSSL=false";

    //"jdbc:mysql://localhost:3306/qa-ja-06?user=root&password=1234";
    public static void main(String[] args) {

        System.out.println("JDBC");
        try {
// Инициализация драйвера
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM abonent");
            while (resultSet.next()) {
                long id = resultSet.getLong("abonent_id");
                String firstName = resultSet.getString("first_name");
                System.out.println(String.format("ID = %d, First Name = %s",
                        id, firstName));
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
/*        System.out.println("JDBC");
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL);
            Statement statement = connection.createStatement();
            //driver initialazing
            Class.forName("com.mysql.cj.jdbc.Driver");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM abonent");


            while (resultSet.next()) {

                long id = resultSet.getLong("abonent_id");
                String firstName = resultSet.getString("first_name");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}*/

