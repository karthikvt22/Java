import java.util.*;
public class oop {
    public static void main (String args[]){
        //System.out.print("Hello World");
        Student s1 = new Student();
        s1 = new Student();
       // s1[0].rno=1;
        //s1[0].name="vt";
        //s1[0].marks=99.91f;
        System.out.println(s1.rno + " " + s1.marks);
        //System.out.println();
        Student random = new Student();
    }
    static class Student{
        int rno;
        String name ;
        float marks;
        Student(){
            this.rno=1;
            this.name="vt";
            this.marks=99.91f; 
        }
    }
}

