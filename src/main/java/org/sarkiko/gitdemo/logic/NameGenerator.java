package org.sarkiko.gitdemo.logic;

import org.sarkiko.gitdemo.data.LastNameList;
import org.sarkiko.gitdemo.data.Month;
import org.sarkiko.gitdemo.data.NameList;

public class NameGenerator {

    private NameList nameList = new NameList();
    private LastNameList lastNameList = new LastNameList();

    public String generate(int day, Month month) {
        return firstName(day) + " " + lastName(month);
    }

    private String firstName(int day) {
        return nameList.listCreation().get(day - 1);
    }

    private String lastName(Month month) {
        return lastNameList.listCreation().get(month);
    }


}
