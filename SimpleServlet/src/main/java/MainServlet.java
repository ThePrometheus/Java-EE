/**
 * Created by nazar on 22.01.17.
 */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    private final static String  _name = "NAZAR";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        req.getRequestDispatcher("ask.jsp").forward(req, resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        String username = req.getParameter("username");
        if(username.equals(_name)){
            String htmlResponse = "<html>";
            htmlResponse += "<h2>Hello out admin: " + username + "<br/>";
            htmlResponse += "</html>";
        }else{
            String htmlResponse = "<html>";
            htmlResponse += "<h2>incorrect name : " + username + "<br/>";
            htmlResponse += "</html>";
            throw new IllegalArgumentException("Not valid name");

        }



    }
}

