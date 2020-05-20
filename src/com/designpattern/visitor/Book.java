package com.designpattern.visitor;

public class Book implements ItemElement {

    private final int price;
    private final String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int accept(ShoppingCartVisitor shoppingCartVisitor) {
        return shoppingCartVisitor.visit(this);
    }

}
