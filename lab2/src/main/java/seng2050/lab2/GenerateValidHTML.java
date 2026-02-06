package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GenerateValidHTML extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println(HtmlGen.doctype());
        out.println(HtmlGen.htmlOpen());
        out.println(HtmlGen.head("HTML Helper Test"));
        out.println(HtmlGen.bodyOpen());

        out.println(HtmlGen.h1("HtmlGen is working!"));
        out.println(HtmlGen.paragraph("This page was generated using helper methods."));

        out.println(HtmlGen.bodyClose());
        out.println(HtmlGen.htmlClose());
            }
}
