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
    
    public static boolean tomRuta (JTextField rutaAttKolla) {
        boolean result = false;
        
        if (rutaAttKolla.getText().isEmpty()) {
            
            result = true;
            JOptionPane.showMessageDialog(rutaAttKolla, "Rutan är tom");
            rutaAttKolla.requestFocus();
        }

        //Return a boolean
        return result;
    }
    
    public static boolean tomLosenord(JPasswordField rutaAttKolla) {
        boolean result = false;
        if(rutaAttKolla.getPassword().length == 0) {
            result = true;
            JOptionPane.showMessageDialog(rutaAttKolla, "Skriv in ditt lösenord");
            rutaAttKolla.requestFocus();
        }
        return result;
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
    
    /*public boolean KontrolleraLosenord(JTextField Anvandarnamn, String Losenord) {
        boolean passwordIsCorrect = true;
            String username = Anvandarnamn.getText();
            String password = Losenord;
            String correctPassword = "SELECT LOSENORD FROM USERS WHERE ANVANDARNAMN = '" + username + "';";
            correctPassword = fdb.fetchSingle(correctPassword);
            if (!(password.equals(correctPassword))) {
                passwordIsCorrect = false;
                JOptionPane.showMessageDialog(null, "Fel lösen. Försök igen");
            }
            else {
                 passwordIsCorrect = true ;
            }
              return passwordIsCorrect ;           
                }
    }*/
    
}
