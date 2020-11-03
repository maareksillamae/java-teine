package com.company;
//pärilus
public class Hamburger extends MenuItem {
  //kapseldus

    private String meat;
    private String bun;



    public Hamburger(int id, String name, double price, String meat, String bun) {
    //pärilus
        super(id, name, price);

    }

    public String getMeat() {
        return meat;
    }

    public String getBun() {
        return bun;
    }
}


