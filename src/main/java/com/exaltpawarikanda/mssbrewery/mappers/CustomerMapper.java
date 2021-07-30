package com.exaltpawarikanda.mssbrewery.mappers;

import com.exaltpawarikanda.mssbrewery.domain.Customer;
import com.exaltpawarikanda.mssbrewery.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by Exalt Pawarikanda on 7/30/21
 */
@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
