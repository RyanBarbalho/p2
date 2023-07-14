package br.ufal.ic.p2.entities;

public class Customer {
    private int ID;
    private String name;
    private String address;

    private ShoppingCart shoppingCart;

    public Customer(int ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        this.address = address;

        this.shoppingCart = new ShoppingCart(this);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
