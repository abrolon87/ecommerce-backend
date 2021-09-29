package com.amanda.ecommerce.backend.dto;

import com.amanda.ecommerce.backend.entity.Address;
import com.amanda.ecommerce.backend.entity.Customer;
import com.amanda.ecommerce.backend.entity.Order;
import com.amanda.ecommerce.backend.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
