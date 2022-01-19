package com.company;

public class cwh_27 {
    public static void main(String[] args) {
        int [] marks = {96, 92, 89, 96, 91};
//        float [] marks = {96.3f, 92.2f, 89.4f, 95.6f, 90.8f};
        String [] students = {"John", "Ben", "Harry", "Ron"};
        System.out.println(marks[0]);
        System.out.println(students[0]);
        System.out.println(marks.length);
        System.out.println(students.length);

//        "for-each loop"
        for (int element: marks)
        {
            System.out.println(element);
        }

        for (String element: students)
        {
            System.out.println(element);
        }

//        "for loop"
        for (int i = 0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
