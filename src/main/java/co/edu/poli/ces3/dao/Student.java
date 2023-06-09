package co.edu.poli.ces3.dao;

import java.sql.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public Student() throws ParseException {
        this.document = "32";
        this.name="Oscar";
        this.lastName="Mesa";

        String dDate="1990-10-01";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        this.birthDate = df.parse(dDate);
        this.languages = new String[10];
        this.languages[0] = "ingles";
        this.languages[1] = "japones";
        }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
