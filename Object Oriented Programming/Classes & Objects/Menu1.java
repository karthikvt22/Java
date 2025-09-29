//package OOPS.packages.revision.clasobj;

public class Menu1 extends Menu{
    String addon ;
    String coke;
    String payvia;
    long phno;

    Menu1(){
        // default construcror 
        this.addon = null;
        this.coke = null;
        this.payvia = null;
        this.phno = 00;
    }

    Menu1(String a,String b, String c, String d, String e,int f,String g, String h, String i,long j){
        super(a,b,c,d,e,f);
        System.out.println("Full persnalised order constructor called-> processing");
        this.addon = g;
        this.coke = h;
        this.payvia = i;
        this.phno = j;
    }

    public Menu1(String addon, String coke, String payvia, long phno) { // called only for menu1 
        this.addon = addon;
        this.coke = coke;
        this.payvia = payvia;
        this.phno = phno;
    }

    // public Menu1(String a, String b, String c, String d, String e, int p, String addon, String coke, String payvia,
    //         long phno) {
    //     super(a, b, c, d, e, p);
    //     this.addon = addon;
    //     this.coke = coke;
    //     this.payvia = payvia;
    //     this.phno = phno;
    // }

    public Menu1(String a, String b, String c, String d, int p, String addon, String coke, String payvia, long phno) {
        super(a, b, c, d, p);
        this.addon = addon;
        this.coke = coke;
        this.payvia = payvia;
        this.phno = phno;
    }

    public Menu1(String a, String b, String c, int p, String addon, String coke, String payvia, long phno) {
        super(a, b, c, p);
        this.addon = addon;
        this.coke = coke;
        this.payvia = payvia;
        this.phno = phno;
    }

    public Menu1(String a, String b, int p, String addon, String coke, String payvia, long phno) {
        super(a, b, p);
        this.addon = addon;
        this.coke = coke;
        this.payvia = payvia;
        this.phno = phno;
    }

    public Menu1(Menu reorder, String addon, String coke, String payvia, long phno) {
        super(reorder);
        this.addon = addon;
        this.coke = coke;
        this.payvia = payvia;
        this.phno = phno;
    }

    void display(){

        System.out.println("Details of the order");
        System.out.println("Default or choosed order type:" + this.user +" "+this.type + " " + this.food1 + " " + this.food2 + " " + this.food3 + " " +this.price);
        System.out.println("Add on choosed:" + this.addon);
        System.out.println("Coke on choosed:" + this.coke);
        System.out.println("payment option choosed:" + this.payvia);
        System.out.println("phone numer enterd:" + this.phno);
    }
    


    }





