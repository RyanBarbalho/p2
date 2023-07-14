package br.ufal.ic.p2.entities;

import java.util.ArrayList;

public class ShoppingCart {
    private Customer customer;
    private ArrayList<Product> productList;

    public ShoppingCart(Customer customer) {
        this.customer = customer;

    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public void emptyCart() {
        productList.clear();
    }

    public double getItemCount() {
        return productList.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public String getContents() {
        String contents = "";
        for (Product product : productList) {
            contents += product.getName() + "\n";
        }
        return contents;
    }

    public Product findProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

}
