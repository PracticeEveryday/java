package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;  // 주문을 어떤 유저가 했는지 알아야한다.
    Product product; // 어떤 제품을 주문했는 지 알아야 한다.

    Order (User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
