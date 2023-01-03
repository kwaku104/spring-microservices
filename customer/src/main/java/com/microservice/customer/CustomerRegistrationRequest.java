package com.microservice.customer;

public record CustomerRegistrationRequest(
        String fistName,
        String lastName,
        String email) {
}
