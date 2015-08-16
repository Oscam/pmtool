/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import business.projectBean;
import business.user;
import data.projectDAO;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mugusca
 */
public class addProject extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //  String action = request.getParameter("action");
        HttpSession session = request.getSession(true);

        if (null == session.getAttribute("username")) {
            response.sendRedirect("/login.jsp");
        } else {
            String projectName = request.getParameter("pname");
            String startString = request.getParameter("startdate");
            String endString = request.getParameter("endDate");
            String staffId = request.getParameter("staffId");

            Date current = Date.valueOf(LocalDate.now());

            if (startString != null || endString != null) {
                final Date startDate = Date.valueOf(startString);
                final Date endDate = Date.valueOf(endString);

            // System.out.println(current);
                //int duratio
                //man = Integer.parseInt(durationString);
                //HttpSession session = request.getSession();
                int projectId = 0;

                projectBean project = new projectBean(projectId, projectName, startDate, endDate, staffId);

                //  if(project!=null)
               // List<user> staff = projectDAO.checkStaff();
                //   if (staffId.equalsIgnoreCase(staff)) {

                projectDAO.insertProject(project);
            } //else {
            //request.setAttribute("message", staff);
            // request.getAttribute("message");
            //request.getRequestDispatcher("/home.jsp").forward(request, response);
            // }

      //  }
            request.setAttribute("current", current);

            //session.setAttribute("project",project);
            List<projectBean> projects = projectDAO.viewProjects();
            //  List<user> users = projectDAO.viewProjects();
            request.setAttribute("projects", projects);
            request.getAttribute("projects");

            RequestDispatcher d = getServletContext().getRequestDispatcher("/home.jsp");
            d.forward(request, response);

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
