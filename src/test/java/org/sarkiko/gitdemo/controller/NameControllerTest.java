package org.sarkiko.gitdemo.controller;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameControllerTest {

    private NameController nameController = new NameController();

    @Test
    public void testGenerateNameAllowedDate() {
        String generateName = nameController.generateName(1, "january");
        assertEquals("Big Smoke", generateName);

        generateName = nameController.generateName(15, "january");
        assertEquals("Big Smoke", generateName);

        generateName = nameController.generateName(31, "january");
        assertEquals("Big Smoke", generateName);
    }

    @Test
    public void testGenerateNameWithWrongDay() {
        String generateName = nameController.generateName(-13, "january");
        assertEquals("wrong day -13", generateName);

        generateName = nameController.generateName(0, "january");
        assertEquals("wrong day 0", generateName);

        generateName = nameController.generateName(32, "january");
        assertEquals("wrong day 32", generateName);

        generateName = nameController.generateName(45, "january");
        assertEquals("wrong day 45", generateName);
    }

    @Test
    public void testGenerateNameWithWrongMonth() {
        String generateName = nameController.generateName(4, "jaanuary");
        assertEquals("wrong month jaanuary", generateName);

        generateName = nameController.generateName(4, null);
        assertEquals("wrong month null", generateName);
    }
}