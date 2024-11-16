package com.helloshop.order;

import com.helloshop.Product.Product;
import com.helloshop.User.User;

public class Order {

    User user;
    Product product;

    public Order() {
    }

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
