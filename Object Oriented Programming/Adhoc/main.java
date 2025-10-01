
public class oop2 {
    public static void main (String args[]){
        //System.out.println("hello world");
        human h1 = new human();
        human h2 = new human(25,"karthik",45000,true,2);
        human h3 = new human(25,"karthik",45000,true,2);
        h1.printval();
        h2.printval();
        h1.printval();
        wel();
        oop2 wel = new oop2();
    }

   static void wel(){
         int a = 90;
        System.out.println("hello");
    }

   public  static class human{
        int age;
        String name;
        int salary;
        boolean married;
        static long population;

        public human(int a, String q,int s,boolean m, long o){
            this.age=a;
            this.name=q;
            this.salary=s;
            this.married=m;
            human.population += 1;
        }
        human(){
            this(21,"kavt",35000,false, 2);
        }
         void printval(){
                System.out.println(this.age + " "+ this.name + " " + this.salary + " " + this.married + " " + human.population);
            }
        }
    }


 class Main{ // this is the top class
    public static void main(String args[]){

    }
    static class inner{
        void display(){
            System.out.println("this is inner class");
        }
    }
}
