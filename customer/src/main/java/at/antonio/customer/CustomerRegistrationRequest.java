package at.antonio.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {}
