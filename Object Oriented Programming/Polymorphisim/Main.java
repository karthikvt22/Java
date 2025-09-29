//package OOPS.packages.polymorphisim;

 class main {
    public static void main(String[] args) {
    shapes shapes = new shapes();
    shapes square = new square();
    traiangle traiangle = new traiangle();
    shapes shape = new square();
    //shape.print();
    shapes.print();
    square.print();
    traiangle.print1();
    numbers number = new numbers();
    //int p = number.num(2,3);
    System.out.println(number.num(2,3));


    }
 static class numbers{
    int num (int a , int b){
        return a+b;
    }
    double num (int a, double b){
        return a*b;
    }

shapes shape1 = new shapes();
System.out.println(shape1.getl());

}




}
