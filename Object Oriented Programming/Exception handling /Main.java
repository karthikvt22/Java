
//package OOPS.packages.ExceptionHandling;

public class main {
    public static void main(String[] args) {


        Student std1 = new Studnet(22,"karth");

        //Student std2 = new Student(32,"ik");




        int a = 10;
        int b = 0;
        divide(a, b);
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    // explicit exception handling
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero idiot");
        }
        return a/b;
    }


    private static class Studnet extends Student {
        public Studnet(int i, String karth) {
        }

    }
}
