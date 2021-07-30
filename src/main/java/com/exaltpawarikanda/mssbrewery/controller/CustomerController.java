package com.exaltpawarikanda.mssbrewery.controller;

import com.exaltpawarikanda.mssbrewery.model.CustomerDto;
import com.exaltpawarikanda.mssbrewery.service.api.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/25/21
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId")UUID customerId){
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto createdCustomer = customerService.createCustomer(customerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/v1/customers/" + createdCustomer.getCustomerId().toString());

        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity updateCustomer(@PathVariable("customerId") UUID customerId,@RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerId,customerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{customerId}")
    public void deleteById(@PathVariable("customerId") UUID customerId){
        customerService.deleteById(customerId);
    }

}
