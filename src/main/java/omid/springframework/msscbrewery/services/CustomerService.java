package omid.springframework.msscbrewery.services;

import omid.springframework.msscbrewery.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
