package com.amanda.ecommerce.backend.service;

import com.amanda.ecommerce.backend.dto.PaymentInfo;
import com.amanda.ecommerce.backend.dto.Purchase;
import com.amanda.ecommerce.backend.dto.PurchaseResponse;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
	
    PurchaseResponse placeOrder(Purchase purchase);
    
    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
