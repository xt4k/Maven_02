package com.telesens.academy.lesson13;

import com.telesens.academy.lesson11.HomeTask1;
import com.telesens.academy.lesson11.NamesCollections;
import com.telesens.academy.lesson11.ReadPropFile;
import com.telesens.academy.lesson11.SubscriberConstructor;

import java.sql.*;


public class HomeTask4aFillAbonentsDB {

    private static String JDBC_URL = "jdbc:mysql://localhost:3306/qa-ja-06?user=root&password=1234";
    private static int DB_SIZE = 200;

    public static void main(String[] args) {

        ReadPropFile readPropFile = new ReadPropFile( HomeTask1.getPropFilePath() );

        NamesCollections namesCollections = new NamesCollections( readPropFile );
        SubscriberConstructor subsArrayList = new SubscriberConstructor( namesCollections, DB_SIZE, namesCollections.getMinimalAge(), namesCollections.getMaximalAge(), readPropFile.isAgeGaussian() );


        System.out.println( "JDBC" );
        try {
// Инициализация драйвера
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            Connection connection = DriverManager.getConnection( JDBC_URL );
            Statement statement = connection.createStatement();

            statement.executeUpdate( "delete from `qa-ja-06`.abonent" );
            System.out.println( "clear content of table abonent" );

            for (int i = 0; i < subsArrayList.getArrayListSubsExt().size(); i++) {
                Long subId = subsArrayList.getArrayListSubsExt().get( i ).getId();
                String fName = subsArrayList.getArrayListSubsExt().get( i ).getFirstName();
                String lName = subsArrayList.getArrayListSubsExt().get( i ).getLastName();
                String gender = (String.valueOf( subsArrayList.getArrayListSubsExt().get( i ).getGender() ).substring( 0, 1 ));
                int age = subsArrayList.getArrayListSubsExt().get( i ).getAge();
                String requestSQL = "INSERT INTO abonent VALUES(" + subId + ", '" + fName + "', '" + lName + "', '" +
                        gender + "'," + age + ")";
                System.out.println( "i: " + i + " requestSQL: " + requestSQL );
                statement.executeUpdate( requestSQL );

            }

            ResultSet resultSet = statement.executeQuery( "SELECT * FROM abonent" );
            while (resultSet.next()) {
                long id = resultSet.getLong( "abonent_id" );
                String firstName = resultSet.getString( "first_name" );
                String lastName = resultSet.getString( "last_name" );
                String gender = resultSet.getString( "gender" );
                int age = resultSet.getInt( "age" );

                System.out.println( String.format( "ID: %d, First Name: %s, Last Name: %s, Gender: %s, Age: %s, ", id, firstName, lastName, gender, age ) );
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}