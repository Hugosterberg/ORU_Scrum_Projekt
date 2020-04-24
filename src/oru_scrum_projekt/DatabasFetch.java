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
public class DatabasFetch {
    
    public static char[] fetchLosenord(Connection con, String namn) {
        Statement myStatement = null;
        String query = "SELECT LÖSENORD FROM ANVÄNDARE WHERE NAMN = '" + namn + "'";
        ResultSet myResultset = null;
        String losenord = "";
        
        try {
            myStatement = con.createStatement();
            myResultset = myStatement.executeQuery(query);
            myResultset.next();
            losenord = myResultset.getString("Lösenord");
            myResultset.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return losenord.toCharArray();
    }
    
    public static ResultSet fetchAnvandarInfo(Connection con, String namn) {
        Statement myStatement = null;
        String query = "SELECT * FROM ANVÄNDARE WHERE NAMN = '" + namn + "'";
        ResultSet myResultSet = null;
        try {
            myStatement = con.createStatement();
            myResultSet = myStatement.executeQuery(query);
        } 
        catch(SQLException e) {
            System.out.println("Gick inte att fetcha med valt namn");
        }
        return myResultSet;
    }
    
    public static int fetchId(Connection con, String namn) {
        Statement myStatement = null;
        String query = "SELECT ID FROM ANVÄNDARE WHERE NAMN = '" + namn + "'";
        ResultSet myResultSet= null;
        int id = 0;
        try {
            myStatement = con.createStatement();
            myResultSet = myStatement.executeQuery(query);
            myResultSet.next();
            id = myResultSet.getInt("ID");
            myResultSet.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return id;
    }
}
