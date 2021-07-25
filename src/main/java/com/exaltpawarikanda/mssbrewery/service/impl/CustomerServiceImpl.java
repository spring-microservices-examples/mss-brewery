package com.exaltpawarikanda.mssbrewery.service.impl;

import com.exaltpawarikanda.mssbrewery.model.CustomerDto;
import com.exaltpawarikanda.mssbrewery.service.api.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/25/21
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(customerId)
                .name("Exalt Pawarikanda")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
       //TODO will impl real Customer update
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("deleting a customer.....");
    }
}
