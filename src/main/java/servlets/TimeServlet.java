package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;

@WebServlet(value = "/time")
public class TimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
//        resp.setHeader("Content-Type", "text/html; charset=utf-8");
        Date now = new Date();

        TimeZone.setDefault( TimeZone.getTimeZone("UTC+2"));
        resp.getWriter().write(String.valueOf(now));

        resp.getWriter().close();

    }
}
