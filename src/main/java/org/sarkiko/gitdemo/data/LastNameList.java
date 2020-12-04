package org.sarkiko.gitdemo.data;

import java.util.HashMap;

public class LastNameList {

    public HashMap<Month, String> listCreation() {
        HashMap<Month, String> lastNameList = new HashMap<>();
        lastNameList.put(Month.JANUARY, "West");
        lastNameList.put(Month.FEBRUARY, "Wayne");
        lastNameList.put(Month.MARCH, "Smoke");
        lastNameList.put(Month.APRIL, "Tape");
        lastNameList.put(Month.MAY, "Done");
        lastNameList.put(Month.JUNE, "Shark");
        lastNameList.put(Month.JULY, "Street");
        lastNameList.put(Month.AUGUST, "Black");
        lastNameList.put(Month.SEPTEMBER, "White");
        lastNameList.put(Month.OCTOBER, "Mama");
        lastNameList.put(Month.NOVEMBER, "Ice");
        lastNameList.put(Month.DECEMBER, "Doom");
        return lastNameList;
    }


}
