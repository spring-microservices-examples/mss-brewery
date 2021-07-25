package com.exaltpawarikanda.mssbrewery.service.impl;

import com.exaltpawarikanda.mssbrewery.service.api.BeerService;
import com.exaltpawarikanda.mssbrewery.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/25/21
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //TODO would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
       log.debug("Deleting a beer......");
    }
}
