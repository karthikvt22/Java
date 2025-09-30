//package OOPS.packages.ExceptionHandling;

public class Student {

    int num;
    String name;

    Student(){
        this.num =-1;
        this.name = null;
    }
    Student (Student older){
        this.num = older.num;
        this.name = older.name;
    }

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
