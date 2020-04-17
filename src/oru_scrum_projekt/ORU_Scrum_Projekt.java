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
    public static void main(String[] args) throws ClassNotFoundException {
        
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //String connectionURL = "jdbc:sqlserver://(localdb)\\MSSQLLocalDB;databaseName=ORU_Forum;user=root;password=root;";
        //Connection con = DriverManager.getConnection(connectionURL);
        
        connect();
        new Startsida().setVisible(true);
    }
    
    
}
