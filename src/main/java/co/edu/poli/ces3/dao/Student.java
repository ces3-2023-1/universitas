package co.edu.poli.ces3.dao;

import java.sql.Array;
import java.util.Arrays;
import java.util.Date;

public class Student {

    private String document;
    private String name;

    private String lastName;

    private Date birthDate;

    private String[] languages;

    public Student(String document, String name, String lastName, Date birthDate, String[] languages) {
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.languages = languages;
    }

    public Student(){
        this.document = "32";
        this.name="Oscar";
        this.lastName="Mesa";
        this.birthDate = new Date("1990-10-01");
        this.languages = new String[10];
        this.languages[0] = "ingles";
        this.languages[1] = "japones";
        }
}
