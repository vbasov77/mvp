package org.example;

//Создайте класс контроллера со следующими функциями:
//• Распечатать всех студентов и посещаемость каждого в процентах
//• Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
//• Распечатать студентов с посещаемостью ниже 25%

import java.util.Map;

public class Controller {

    public void printStudPercent(Map<Student, Journal> map) {
        map.entrySet().forEach(entry -> {
            Journal value = entry.getValue();
            long count = value.getDateBooleanMap().entrySet().stream().filter(e -> e.getValue() == true).count();
            int allDays = value.getDateBooleanMap().size();
            double v = (count * 100.0 / allDays);
            System.out.println(entry.getKey().getName() + " " + v + " %");
        });
    }


}

