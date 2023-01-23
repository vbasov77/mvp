//Напишите программу, позволяющую анализировать посещаемость студентов. Используйте паттерн MVP.
//
//Есть группа студентов. Для каждого студента есть журнал его посещаемости: список дат занятий
//и для каждой даты — посетил студент занятие или нет.
// Создайте класс AttendanceService
//(сервис посещаемости), в котором хранится информация обо всех студентах.
//
//Создайте класс AttendanceView, который позволяет отображать студентов и их посещаемость.
//
//Создайте класс контроллера со следующими функциями:
//• Распечатать всех студентов и посещаемость каждого в процентах
//• Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
//• Распечатать студентов с посещаемостью ниже 25%
//
//Проверьте, как это работает.


package org.example;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Bob");
        Student student2 = new Student("Bob2");
        Student student3 = new Student("Bob3");

        Journal studentJournal1 = new Journal();
        Journal studentJournal2 = new Journal();
        Journal studentJournal3 = new Journal();

        AttendanceService attendanceService = new AttendanceService();
        attendanceService.getJournalMap().put(student1,  studentJournal1);
        attendanceService.getJournalMap().put(student2,  studentJournal2);
        attendanceService.getJournalMap().put(student3,  studentJournal3);

        studentJournal1.getDateBooleanMap().put(Date.valueOf("2023-01-20"), false);
        studentJournal2.getDateBooleanMap().put(Date.valueOf("2023-01-20"), true);
        studentJournal3.getDateBooleanMap().put(Date.valueOf("2023-01-20"), true);

        studentJournal1.getDateBooleanMap().put(Date.valueOf("2023-01-21"), true);
        studentJournal2.getDateBooleanMap().put(Date.valueOf("2023-01-21"), false);
        studentJournal3.getDateBooleanMap().put(Date.valueOf("2023-01-21"), true);

        studentJournal1.getDateBooleanMap().put(Date.valueOf("2023-01-22"), true);
        studentJournal2.getDateBooleanMap().put(Date.valueOf("2023-01-22"), false);
        studentJournal3.getDateBooleanMap().put(Date.valueOf("2023-01-22"), true);


        Controller controller = new Controller();
        controller.printStudPercent(attendanceService.getJournalMap());
    }
}