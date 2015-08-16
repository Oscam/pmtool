/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import business.projectBean;
import business.user;
import database.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mugusca
 */
public class projectDAO {

    static Connection con;
    static PreparedStatement ps;

    /**
     *
     * @return
     */
    public static List<projectBean> viewProjects() {
        List<projectBean> projectList = new ArrayList<>();
        // List<user> users = new ArrayList<>();

        String query = "SELECT * from projects,employees where projects.staffId=employees.staffId order by projectId ";
        try {
            con = connect.getConnection();
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                projectBean bean = new projectBean();
                
                bean.setProjectName(rs.getString("projectName"));
                bean.setstaffId(rs.getString("staffId"));
                bean.setFname(rs.getString("fname"));
                bean.setProjectId(rs.getInt("projectId"));
                bean.setEndDate(rs.getDate("endDate"));
              
                projectList.add(bean);
            }
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }

        return projectList;
    }

    public static int insertProject(projectBean bean) {

        try {
            String query = "INSERT INTO projects (`projectId`,`projectName`,`startDate`,`endDate`,`staffId`)"
                    + "VALUES(?,?,?,?,?)";

            con = connect.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, bean.getProjectId());
            ps.setString(2, bean.getProjectName());
            ps.setDate(3, bean.getStartDate());
            ps.setDate(4, bean.getEndDate());
            ps.setString(5, bean.getStaffId());
            int in = ps.executeUpdate();

            return in;

        } catch (SQLException ex) {
            Logger.getLogger(projectDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    public static List<user> checkStaff() {
        String query = "select staffId,fname,surname from employees";
        Statement st;
        String staff;
        try {
            con = connect.getConnection();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            List<user> staffids = new ArrayList<>();
            while (rs.next()) {
                user staf = new user();
                staf.setStaffId(rs.getString("staffId"));
                staf.setFname(rs.getString("fname"));
                staf.setSurname(rs.getString("surname"));
                staffids.add(staf);

            }
            return staffids;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public static List<projectBean> myprojects(String staffid) {
        List<projectBean> projectsTaken = new ArrayList<>();
        String query = "select * from projects where staffId=?";
        try {
            con = connect.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, staffid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                projectBean bean = new projectBean();
                bean.setProjectId(rs.getInt("projectId"));
                bean.setProjectName(rs.getString("projectName"));
                bean.setStartDate(rs.getDate("startDate"));
                bean.setEndDate(rs.getDate("endDate"));
                projectsTaken.add(bean);
            }
            return projectsTaken;

        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }

    }
}
