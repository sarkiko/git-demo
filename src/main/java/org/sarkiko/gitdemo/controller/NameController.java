package org.sarkiko.gitdemo.controller;

import org.sarkiko.gitdemo.data.Month;
import org.sarkiko.gitdemo.logic.NameGenerator;

public class NameController {

    private NameGenerator nameGenerator = new NameGenerator();

    public String generateName(int day, String month) {
        // validating day range
        if (!validateDay(day)) {
            return "wrong day " + day;
        }
        // validating month on exist
        Month userMont = getMonth(month);
        if (userMont == null) {
            return "wrong mont " + month;
        }
        return nameGenerator.generate(day, userMont);
    }

    private Month getMonth(String month) {
        for (Month m : Month.values()) {
            if (m.name().equalsIgnoreCase(month)) {
                return m;
            }
        }
        return null;
    }

    private boolean validateDay(int day) {
        if (day < 31 && day > 0) {
            return true;
        } else {
            return false;
        }

    }

}


