package com.metlife.oops;

class Father {
    public int fAge;

    public Father(int fAge)
    {
        this.fAge=fAge;
        System.out.println("Father Constructor");
    }

    public void fatherStyle() {
        System.out.println("Father Style!!");
    }
}

class Son extends Father {
    public int sAge = 20;
    public Son(int fAge,int sAge)
    {
        super(fAge);
        this.sAge=sAge;
        System.out.println("Son Constructor");
    }


    public void sonStyle() {
        System.out.println(super.fAge);
        System.out.println("Son Style");
    }
}

//class GrandSon extends Son
//{
//    public int gAge = 20;
//    public GrandSon()
//    {
//        System.out.println("GrandSon Constructor");
//    }
//    public void grandSonStyle() {
//        System.out.println("Grand Son Style");
//    }
//}

public class InheritanceDemo {
    public static void main(String[] args) {



        Son s = new Son(60,20);
        System.out.println(s.fAge);
        System.out.println(s.sAge);

        s.fatherStyle();
        s.sonStyle();

//        GrandSon g=new GrandSon();
//        System.out.println(g.fAge);
//        System.out.println(g.sAge);
//        System.out.println(g.gAge);
//
//        g.fatherStyle();
//        g.sonStyle();
//        g.grandSonStyle();
    }
}

