package com.exaltpawarikanda.mssbrewery.service.api;

import com.exaltpawarikanda.mssbrewery.model.CustomerDto;

import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/25/21
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto createCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
