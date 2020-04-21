/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oru_scrum_projekt;
import java.sql.*;

/**
 *
 * @author HugoO
 */
public class Databaskoppling {

    
   public static Connection connect() throws ClassNotFoundException{
        
        Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=ForumDB;user=admin;password=admin";
        
        try{
            con = DriverManager.getConnection(connectionURL);
            System.out.println("Databaskopplingen lyckades!");
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
        return con;
    } 
    
}
