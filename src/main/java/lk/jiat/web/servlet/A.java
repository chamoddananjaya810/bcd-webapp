package lk.jiat.web.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.ejb.remote.UserDetails;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;

@WebServlet(name = "A", urlPatterns = "/a")
public class A extends HttpServlet {

    @EJB
    Cal cal;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            InitialContext ic = new InitialContext();
         UserDetails userDetails=(UserDetails) ic.lookup("java:global/ejb-module/UserDetailsImpl");

         resp.getWriter().println("username"+userDetails.getUsername()+"    :    "+userDetails.getEmail());
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}
