package com.amanda.ecommerce.backend.service;

import com.amanda.ecommerce.backend.dto.Purchase;
import com.amanda.ecommerce.backend.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
