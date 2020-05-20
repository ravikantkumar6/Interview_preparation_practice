package com.designpattern.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor shoppingCartVisitor);
}
