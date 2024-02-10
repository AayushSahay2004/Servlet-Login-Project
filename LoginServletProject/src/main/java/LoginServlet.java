import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hardcoded username and password for validation
        String validUsername = "aayush";
        String validPassword = "pwd2326";

        // Get the username and password entered by the user
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the entered username and password match the valid credentials
        if (username != null && password != null && username.equals(validUsername) && password.equals(validPassword)) {
            // Redirect to redirect.html with username as parameter
            response.sendRedirect("redirect.html?username=" + username);
        } else {
            // Credentials are incorrect, redirect back to login.html
            // Notify user to give correct username and password
            response.sendRedirect("login.html?error=incorrect");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirect to login.html for GET requests
        response.sendRedirect("login.html");
    }
}
