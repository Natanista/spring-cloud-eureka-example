package com.sptech.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {}
