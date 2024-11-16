package com.helloshop.order;

import com.helloshop.Product.Product;
import com.helloshop.User.User;

public class OrderService {

    public void order() {
        System.out.println("Order Service");
        User user = new User();
        Product product = new Product();
        Order order = new Order();
    }

}
