//package packages;
public class oop1 {
    public static void main(String arg[]){
        Employee emp1 = new Employee(112,"raja",90000.6f,35);
        Employee emp2 = new Employee();
        Employee emp3 = new Employee(emp1);
        System.out.println(emp1.id + " " + emp1.name + " " + emp1.salary + " " + emp1.age);
        System.out.println(emp2.id + " " + emp2.name + " " + emp2.salary + " " + emp2.age);
        System.out.println(emp3.id + " " + emp3.name + " " + emp3.salary + " " + emp3.age); 
        
    }   
    static class Employee{
        int id;
        String name;
        float salary;
        int age;

        Employee(int i,String n, float s,int q){ // this constructor is called when we assign or declare and initialise
            //the values while creation of the object itself
        this.id=i;
        this.name=n;
        this.salary=s;
        this.age=q;
        }
        Employee(){ // this constructor is default constructor if we only create an object and do not assign any values or initialise
            this(111,"rani",55550.5f,24);
        }
        Employee(Employee copy){ // this is a copy constructor if in ehich an object is already created and initialised 
            //and there isa need to copy those values as iss you can call this copy constructor by creating another object and passing the object name to be copied
            this.id = copy.id;
            this.name = copy.name;
            this.salary = copy.salary;
            this.age = copy.age;
        }
    }

    class A {
        final int a =20;
        void change(){
           // a = 30;
        }
    }

}

