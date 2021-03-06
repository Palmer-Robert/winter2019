

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author palmerfam
 * 
 */
@WebServlet(urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
                    String fname = request.getParameter("firstname");
                    String lname = request.getParameter("lastname");
            
                    if((fname.isEmpty()) && (lname.isEmpty())) {
                        out.println("You did not enter your name!");
                    } else {
                        out.println("Your name is " + fname + " " + lname + ".");
                }
            }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
    }
}

