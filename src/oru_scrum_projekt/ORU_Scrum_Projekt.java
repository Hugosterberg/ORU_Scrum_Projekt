/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oru_scrum_projekt;

import java.sql.*;
import static oru_scrum_projekt.Databaskoppling.connect;

/**
 *
 * @author HugoO
 */

public class ORU_Scrum_Projekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Connection myConn = null;
        Statement myStatement = null;
        ResultSet myResultset = null;
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=ForumDB;user=admin;password=admin";
        
        try{
            //Skapa koppling till databas
            myConn = DriverManager.getConnection(connectionURL);
        
            //Skapa statement
            myStatement = myConn.createStatement();
        
            //Kör SQL fråga
            myResultset = myStatement.executeQuery("Select * from Användare");
        
            //Hantera ResultSet
            while (myResultset.next())
            {
                System.out.println(myResultset.getString("Namn") + ", " + myResultset.getString("Lösenord"));
            }
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
        finally 
        {
            if (myResultset != null)
            {
                myResultset.close();
            }
            if (myStatement != null)
            {
                myStatement.close();
            }
            if (myConn != null)
            {
                myConn.close();
            }
        }
        
        new LoggaIn().setVisible(true);
    }
    
    
}
