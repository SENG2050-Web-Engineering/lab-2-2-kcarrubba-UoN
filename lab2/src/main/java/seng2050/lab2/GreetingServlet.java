package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        // Handle missing parameters nicely
        if (firstName == null) firstName = "";
        if (lastName == null) lastName = "";

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Greeting</title>");
        out.println("</head>");
        out.println("<body>");

        if (firstName.isBlank() && lastName.isBlank()) {
            out.println("<h1>Hello!</h1>");
            out.println("<p>Please provide your first and last name in the URL.</p>");
            out.println("<p>Example: <code>?firstName=Kaley&lastName=Carrubba</code></p>");
        } else {
            out.println("<h1>Welcome!</h1>");
            out.println("<p>Hello, " + escapeHtml(firstName) + " " + escapeHtml(lastName) + "!</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }

    // Simple HTML escaping so special characters don't break the page
    private String escapeHtml(String s) {
        return s.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;");
    }
}
