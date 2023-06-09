package com.example.universitas.servlets;

import co.edu.poli.ces3.dao.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

@WebServlet(name = "ServletStudent", value = "/ServletStudent")
public class ServletStudent extends HttpServlet {

    public static LinkedList<Student> students;
    public static String languages[] = {"Ingles", "Portugues", "Frances"};
    static {
        students = new LinkedList<>(Arrays.asList(
                new Student(),
                new Student("3", "Diego","Perez", new Date("1879-10-19"),languages)
                ));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<b>Documento: "+request.getParameter("document")+"</b><br/>");
        out.print("<b>Nombre: "+request.getParameter("name")+"</b>");
*/


       getServletConfig().getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
