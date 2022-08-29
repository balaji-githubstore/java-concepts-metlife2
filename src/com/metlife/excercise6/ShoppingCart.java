package com.metlife.excercise6;

public class ShoppingCart {

    public static void main(String[] args) {
        Item item1=new Item();
        Item item2=new Item();

        item1.descr="Laptop";

        item2.descr="Mobile";

       // item1=item2;

        System.out.println(item1);
        System.out.println(item1.descr);

        System.out.println(item2);
        System.out.println(item2.descr);

//        Item.printItemDetail(item2);
        item2.printItemDetail();
    }
}
