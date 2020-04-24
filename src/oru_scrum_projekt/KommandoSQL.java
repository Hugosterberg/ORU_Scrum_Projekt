/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oru_scrum_projekt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class KommandoSQL {
     /**
     * 
     * @param con
     * @param user_id
     * @param category
     * @param headline
     * @param text
     * @param tag
     * @param status
     * @param forum_id
     * @return
     * @throws SQLException 
     */
    /* SQL FRÅGA
    
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
        } */
    public static int insertPost(Connection con, int user_id, String category, String headline, String text, String tag, String status, int forum_id)
    throws SQLException {
        int post_id = 0;
        Statement stmt = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String currdate = dtf.format(localDate);

        try {
            post_id = 0;
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet uprs = stmt.executeQuery(
                "SELECT * FROM INLÄGG");

            uprs.moveToInsertRow();
            uprs.updateString("TEXT", text); 
            uprs.updateString("KATEGORI", category);
            uprs.updateString("SYNLIG", "1");
            uprs.updateString("FORMELL", status);
            uprs.updateInt("ANVÄNDAR_ID", user_id);
            uprs.updateInt("FORUM_ID", forum_id);
            

            uprs.insertRow();
            uprs.beforeFirst();
        } catch (SQLException e ) {
            System.out.println(e);
        }
        return post_id;
    }   
        public static ResultSet fetchPost(Connection con) {
        //Returnerar bara en rad
        Statement stmt = null;
        String query = "SELECT * FROM INLÄGG";
        ResultSet rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        }
        catch(SQLException e) {
            System.out.println("EERROR TO FETCH POST");
        }
        return rs;
    }
    
}
