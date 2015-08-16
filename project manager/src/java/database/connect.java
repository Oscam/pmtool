/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mugusca
 */
public class connect {
    
    
    
    
    /**
     *
     * @param args
     * @return
     */
    
    static final String dbUrl = "jdbc:mysql://localhost:3306/masaba_services";
    static final String user = "root";
    static final String pawd="";
        Connection con;
        public static Connection getConnection() throws SQLException{
            Connection con;
            con = DriverManager.getConnection(dbUrl, user, pawd);
            return con;
        }
          
         
     }
  

