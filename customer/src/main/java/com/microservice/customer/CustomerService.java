package com.microservice.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.fistName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // store customer in db
        customerRepository.save(customer);
    }
}
