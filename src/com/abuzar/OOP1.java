package com.abuzar;

public class OOP1 {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.Name);
        System.out.println(student.Rollno);
        System.out.println(student.marks);

    }
}


class Student{
    String Name;
    int Rollno;
    float marks;

    Student(){
        this.Name = "Abuzar Khan";
        this.Rollno = 120;
        this.marks = 89.0f;

    }
}

