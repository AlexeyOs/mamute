package com.lessons.lesson1;

import java.util.Map;
import java.util.TreeMap;

public class Students {
    private static class Student {
        String firstName, name;
        Map<String,Integer> marks = new TreeMap<>();
        Student next;
    }

    private Student first;

    public void remove(String firstName, String name) {

    }

    public void mark(String firstName, String name, String  subject, int mark){

    }
}
