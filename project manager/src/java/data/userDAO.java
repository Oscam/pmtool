/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import business.loginBean;
import business.user;
import static data.projectDAO.con;
import database.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mugusca
 */
public class userDAO {

    static String dbUrl = "jdbc:mysql://localhost/masaba_services";
    static String user = "root";
    static String pawd = "";

    static PreparedStatement ps;
    static ResultSet rs;
    static String query = "INSERT INTO masaba_services.employees (`user_id`,`fname`,`surname`,`dob`,`staffId`,`email`,`gender`,`usertype`,`status`)"
            + "VALUES(?,?,?,?,?,?,?,?,?)";
    //connect con = new connect();

    public static List<user> userlist() {
        //user u = new user();

        List<user> users = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(dbUrl, user, pawd);

            String query1 = "select * from employees";
            ps = con.prepareStatement(query1);
            //ps.setInt(1, u.getUser_id());
            rs = ps.executeQuery();
            while (rs.next()) {
                user ua = new user();
                ua.setFname(rs.getString("fname"));
                ua.setSurname(rs.getString("surname"));
                ua.setStaffId(rs.getString("staffId"));
                ua.setDob(rs.getDate("dob"));
                users.add(ua);
            }

            // return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return users;
    }

    public static int insert(user u) {
        try {
            Connection con = DriverManager.getConnection(dbUrl, user, pawd);
            ps = con.prepareStatement(query);
            ps.setInt(1, u.getUser_id());
            ps.setString(2, u.getFname());
            ps.setString(3, u.getSurname());
            ps.setDate(4, u.getDob());
            ps.setString(5, u.getStaffId());
            ps.setString(6, u.getEmail());
            ps.setString(7, u.getGender());
            ps.setString(8, u.getUsertype());
            ps.setString(9, u.getStatus());

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Data Inserted successfully");
            } else {
                System.out.println("Data insertion unsuccessfull");
            }

            return ps.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
            return 0;
        }
    }

    public static String login(loginBean bean) {
        //Boolean status = false;
        String username = bean.getUsername();
        String password = bean.getPassword();

        try {
            // user employee = new user();

            String userDB;
            String pawdDB;

            Connection con = DriverManager.getConnection(dbUrl, user, pawd);
            String queryLog = "SELECT fname,staffId from employees";
            ps = con.prepareStatement(queryLog);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                userDB = rs.getString("fname");
                pawdDB = rs.getString("staffId");
                if (userDB.equalsIgnoreCase(username) && pawdDB.equals(password)) {
                    return "SUCCESS";
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return "INVALID USER CREDENTIALS";
    }

    public static String utype(loginBean bean) {
        //Boolean status = false;
        //String username = bean.getUsername();
        String password = bean.getPassword();

        try {
            // user employee = new user();

            String utypeDB;
            String uidDB;

            Connection con = DriverManager.getConnection(dbUrl, user, pawd);
            String queryLog = "SELECT staffId,usertype from employees";
            ps = con.prepareStatement(queryLog);
            //ps.setInt(1,bean.getUser_id());
            rs = ps.executeQuery();
            while (rs.next()) {
                utypeDB = rs.getString("usertype");
                uidDB = rs.getString("staffId");
                if (utypeDB.equalsIgnoreCase("admin") && uidDB.equals(password)) {
                    return "admin";
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return "user";
    }

    public static List<user> getUserdetails(String staffid) {
       // loginBean bean = new loginBean();
     //   String staffid = bean.setPassword();
        String query1 = "select * from employees  where staffId = ?";
        List<user> gettype = new ArrayList<>();
        try {
            con = connect.getConnection();
            ps = con.prepareStatement(query1);
            ps.setString(1, staffid);
            rs = ps.executeQuery();
            while (rs.next()) {
                user u = new user();
                //u.setUsertype(rs.getString("usertype"));
                u.setFname(rs.getString("fname"));
                u.setDob(rs.getDate("dob"));
                u.setSurname(rs.getString("surname"));
                u.setUser_id(rs.getInt("user_id"));
                u.setStaffId(rs.getString("staffId"));
                gettype.add(u);

            }
            return gettype;

        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }

    }

}
