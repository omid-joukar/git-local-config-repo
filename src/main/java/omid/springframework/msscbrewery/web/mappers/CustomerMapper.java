package omid.springframework.msscbrewery.web.mappers;

import omid.springframework.msscbrewery.domain.Customer;
import omid.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}