//package packages.revision.clasobj;

// class is a template which consist of prpperties and methods 
// below program is an example of food menu class 
public class Menu {
    static String special = "Peri Peri Fries";
    static int specialprice = 450;
    String user;
    String type;
    String food1;
    String food2;
    String food3;
    int price;

    // constructors are special type of method which is called when an object is created 
    // it helps to initialiase the properties of the object

    Menu(){ // this construct is called default construstor 
        //this.user = "none";
        //this.type = "none";
        //this.food1 = "none";
        //this.food2 = "none";
        //this.food3 = "none";
        System.out.println("total payable:" + Menu.specialprice);
    }
   // parameterised constructor
    Menu(String a, String b, String c, String d,String e, int p){ // constructor called when 3 food items are ordered 
        this.user = a;
        this.type = b;
        this.food1 = c;
        this.food2 = d;
        this.food3 = e;
        this.price = p;
    }

    Menu(String a, String b ,String c ,String d,int p){ // constructor called when 2 food items are ordered 
       this.user = a;
        this.type = b;
        this.food1 = c;
        this.food2 = d;
        this.food3 = null;
        this.price = p;
    }

    Menu(String a, String b ,String c ,int p){ // constructor called when 1 food items are ordered 
        this.user = a;
        this.type = b;
        this.food1 = c;
        this.food2 = null;
        this.food3 = null;
        this.price = p;
    }
     
    Menu(String a, String b,int p){ // constructor called when no food items are ordered
        this.user = a;
        this.type = b;
        this.food1 = null;
        this.food2 = null;
        this.food3 = null;
        this.price = p;
    }

    Menu(Menu reorder){ // copy constructor helps in reordering the same food items
        this.user = reorder.user;
        this.type = reorder.type;
        this.food1 = reorder.food1;
        this.food2 = reorder.food2;
        this.food3 = reorder.food3;
        this.price = reorder.price;

    }
    
    void display(){
        System.out.println(this.user);
        System.out.println(this.type);
        if (this.food1 != null) System.out.println(this.food1);
        if (this.food2 != null) System.out.println(this.food2);
        if (this.food3 != null) System.out.println(this.food3);
        if (this.price != 0) System.out.println("Total Payable:" + this.price);
       // System.out.println("Order Has Been Placed");
    }

}
