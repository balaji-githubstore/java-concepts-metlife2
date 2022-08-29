package com.metlife.excercise6;

public class Item {

    public int id;
    public String descr;
    public int quanity;
    public double price;

    public static void printItemDetail(Item item) {
        System.out.println(item.id);
        System.out.println(item.descr);
        System.out.println(item.quanity);
        System.out.println(item.price);
    }

    public void printItemDetail() {
        System.out.println(id);
        System.out.println(descr);
        System.out.println(quanity);
        System.out.println(price);
    }

}
