package com.example.universitas.servlets;

import co.edu.poli.ces3.dao.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

@WebServlet(name = "ServletStudent", value = "/ServletStudent")
public class ServletStudent extends HttpServlet {

    public static LinkedList<Student> students;
    public static String languages[] = {"Ingles", "Portugues", "Frances"};
    static {
        try {
            students = new LinkedList<>(Arrays.asList(
                    new Student()
                    //new Student("3", "Diego","Perez", new Date("1879-10-19"),languages),
                    //new Student("6", "Ana","Carmensa", new Date("1990-01-11"),languages),
                    //new Student("99", "Diana","Suarez", new Date("1995-07-31"),languages)
            ));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       ServletOutputStream out = response.getOutputStream();
       response.setContentType("application/json");
       String doc = request.getParameter("document");
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
       for(Student s : students){
           if(s.getDocument().equals(doc)){
                out.print(gson.toJson(s));
               break;
               //continue;
           }
       }
       out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
