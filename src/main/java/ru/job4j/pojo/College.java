package ru.job4j.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class College {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        student.setFullName("Гончарова Екатерина Дмитриевна");
        student.setGroup("ИБб-22-1");
        student.setDateOfReception(format.parse("01.08.2022"));
        System.out.println("ФИО студента: " + student.getFullName());
        System.out.println("Группа студента: " + student.getGroup());
        System.out.println("Дата поступления: " + student.getDateOfReception());
    }
}
