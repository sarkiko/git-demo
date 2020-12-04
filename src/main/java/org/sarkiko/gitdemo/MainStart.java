package org.sarkiko.gitdemo;

import org.sarkiko.gitdemo.controller.NameController;
import org.sarkiko.gitdemo.logic.NameGenerator;

public class MainStart {
    public static void main(String[] args) {
        NameController nameController= new NameController();

        String projectName = "git demo";
        System.out.printf("this is my %s project\n", projectName);


        System.out.println( nameController.generateName(25, "april" ));
        System.out.println( nameController.generateName(35, "april" ));
        System.out.println( nameController.generateName(10, "july" ));

    }
}
