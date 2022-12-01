package testCode2;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

    public static void main(String[] args) throws Exception
    {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "test", "Pa$$word");

            System.out.println("connected");

            Statement state = con.createStatement();

            ResultSet result = state.executeQuery("SELECT * FROM course");

            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("|\tcourseID\t|\tsubjectID\t\t|\tcourseNumber\t|\t\ttitle\t\t|\t\tnumofcredits\t|");
            System.out.println("-----------------------------------------------------------------------------------------------------");
            while (result.next()){
                System.out.print("|\t");
                System.out.print(result.getString("courseID"));
                System.out.print("\t\t|\t\t");
                System.out.print(result.getString("subjectID"));
                System.out.print("\t\t|\t\t");
                System.out.print(result.getString("courseNumber"));
                System.out.print("\t\t\t|\t\t");
                System.out.print(result.getString("title"));
                System.out.print("\t|\t\t\t");
                System.out.print(result.getString("numofcredits"));
                System.out.println("\t\t\t|");
                System.out.println("-----------------------------------------------------------------------------------------------------");
            }



        }

        catch (Exception e){
            System.out.println(e);
        }

    }
}
