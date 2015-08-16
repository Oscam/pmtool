package Servlets;

import business.user;
//import database.adduser;
import data.userDAO;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

public class addEmp extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fname = request.getParameter("fname");
        String surname = request.getParameter("surname");
        String doB = request.getParameter("dob");
        String staffId = request.getParameter("staffId");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String usertype = request.getParameter("usertype");
        String status = request.getParameter("status");

        HttpSession session = request.getSession();

      if (doB != null) {

            Date dob = Date.valueOf(doB);

            int user_id =0;

            user employee = new user(user_id,fname, surname, dob, staffId,email, gender, usertype, status);
            System.out.println(fname+surname+dob+staffId+email+gender+usertype+status+user_id);
            

            userDAO.insert(employee);
      }

        List<user> users = userDAO.userlist();

        request.setAttribute("users", users);
        // session.setAttribute("employee", employee);
       // session.getAttribute("employee");
        request.getAttribute("users");

        String url = "/employees.jsp";

        RequestDispatcher d = getServletContext().getRequestDispatcher(url);
        d.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
