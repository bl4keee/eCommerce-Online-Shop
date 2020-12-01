package com.bartek.ecommerce.service;

import com.bartek.ecommerce.dao.CustomerRepository;
import com.bartek.ecommerce.dto.Purchase;
import com.bartek.ecommerce.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {
        return null;
    }
}
