/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oru_scrum_projekt;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author HugoO
 */
public class Validering {
    
    Connection con = null;
    
    public Validering()
    {
        try
        {
        Databaskoppling fdb = new Databaskoppling();
        con = fdb.connect();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
    
    public boolean RattLosenord(JTextField namn, JPasswordField losenord){
        String valtNamn = namn.getText();
        String valtLosenord = losenord.getPassword().toString();
        
        try{
             ResultSet anvandarnamn = con.createStatement().executeQuery("SELECT LÖSENORD FROM ANVÄNDARNAMN WHERE NAMN = ");
        }
        catch (Exception e){
             System.out.println("Error");
        }
        
        return true;
        
    }
    
    
}
