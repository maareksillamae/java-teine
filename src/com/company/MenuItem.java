package com.company;

public class MenuItem {
    private int id;
    private String name;
    private double price;


    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public static MenuItem createHamburger(String meat, String bun) {
        return new Hamburger(1000, "Hamburger", 7.0, meat, bun);
    }

    public static MenuItem createNYBurger(String meat) {
        return new NYBurger(1001, "New York Burger", 12.0, meat);
    }

    public static MenuItem createChickenBurger(String meat, String bun) {
        return new ChickenBurger(1002, "Chicken Burger", 14.0, meat, bun);
    }

    public static MenuItem createSideItem(int id) {
        if (id == 1) {
            return new Sides(id, "Cheese", 2.0);
        }

        if (id == 2) {
            return new Sides(id, "Lettuce", 0.5);

        }
        if (id == 3) {
            return new Sides(id, "Tomato", 0.5);

        }
        if (id == 4) {
            return new Sides(id, "Extra Secret Sauce", 1.0);

        }
        if (id == 5) {
            return new Sides(id, "Pickles", 0.5);

        }
        if (id == 6) {
            return new Sides(id, "Onion", 0.5);

        }

        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}