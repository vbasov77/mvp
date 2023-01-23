package org.example;

import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
public class Journal {
    private Map<Date, Boolean> dateBooleanMap;

    public Journal() {
        this.dateBooleanMap = new HashMap<>();
    }

}

