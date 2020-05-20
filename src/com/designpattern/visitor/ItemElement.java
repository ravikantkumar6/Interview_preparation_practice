package com.designpattern.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor shoppingCartVisitor);
}
