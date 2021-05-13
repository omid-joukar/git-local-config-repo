package omid.springframework.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import omid.springframework.msscbrewery.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServieImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl
        log.debug("Updating....");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting.... ");
    }
}
