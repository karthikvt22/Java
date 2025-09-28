//package packages.revision.clasobj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Welcome to food ordering app");
       System.out.println("Menu");
       System.out.println("our Special item is : "  + Menu.special + "Press 5 to order");
       System.out.println("1.Pizza + Burger + French Fries - 300$");
       System.out.println("2.Pizza + Burger - 200$");
       System.out.println("3.Burger - 100$");
       System.out.println("4.Register yourself for takeaway");
       System.out.println("press 6 to place a pesnalised order");
       System.out.println("enter 7 to order previous order1");
       System.out.println("enter 8 to check your order status");
       
       System.out.println("please place your order");
       int a;
       Scanner scan = new Scanner(System.in);
       a = scan.nextInt();
       switch(a){ 
        case 1 : 

        Menu order1 = new Menu("user1" , "Dine-in" , "Pizza" , "Burger","French Fries",300);
        System.out.println("Order Has Been Placed");
        order1.display();
         break;

        case 2 : 
        
        Menu order2 = new Menu("user2" , "Takeaway" , "Pizza" , "Burger",200);
        System.out.println("Order Has Been Placed");
        order2.display();
         break;

        case 3 : 
        
        Menu order3 = new Menu("user3" , "Dine-in" , "Burger",100);
        System.out.println("Order Has Been Placed");
        order3.display();

        break;

        case 4 : 
        
       Menu order4 = new Menu("user4", "Takeaway",0); 
       System.out.println("Order Has Been Placed");
         order4.display();
        
         break;

        case 5 : 
        
        Menu order = new Menu();
        System.out.println(" Special Order Has Been Placed");
        order.display();
        
        break;

        case 6:

        System.out.println("welcome to addon,pay & coke options ");
        System.out.println("type addon");
        scan.nextLine();
        String addon = scan.nextLine();
       // scan.nextLine();
         System.out.println("type coke type");
        String coke = scan.nextLine();
        //scan.nextLine();
         System.out.println("type payment options");
        String payvia = scan.nextLine();
        //scan.nextLine();
         System.out.println("type phone no");
        Long phno = scan.nextLong();
        //scan.nextLine();
        Menu1 order6 = new Menu1("user1" , "Dine-in" , "Pizza" , "Burger","French Fries",300,addon,coke,payvia,phno); 
        order6.display();
        break;

        case 7 : 
       System.out.println("welcome to addon,pay & coke options ");
        System.out.println("type addon");
        String addon1 = scan.nextLine();
         System.out.println("type coke type");
        String coke1 = scan.nextLine();
         System.out.println("type payment options");
        String payvia1 = scan.nextLine();
         System.out.println("type phone no");
        Long phno1 = scan.nextLong();
        Menu1 order7 = new Menu1("user1" , "Dine-in" , "Pizza" , "Burger",300,addon1,coke1,payvia1,phno1); 

        break;


        case 8 : 
        Menu order8 = new Menu("user1" , "Dine-in" , "Pizza" , "Burger","French Fries",300);
        Menu reorder = new Menu(order8);
        System.out.println("Order Has Been Placed");
        reorder.display();

        break;

        case 9 : 
          System.out.println("Food be at your seat please seeet");

          break;

        default:
            System.out.println("Option not choosed try again");
       }   

       
    }
}

