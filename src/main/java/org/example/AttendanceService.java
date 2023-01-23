package org.example;

import lombok.Data;


import java.util.HashMap;
import java.util.Map;

// Создайте класс AttendanceService
//(сервис посещаемости), в котором хранится информация обо всех студентах.

@Data
public class AttendanceService {

    private Map<Student, Journal> journalMap;

    public AttendanceService() {
        this.journalMap = new HashMap<>();
    }
}
