package com.exaltpawarikanda.mssbrewery.service.impl.v2;

import com.exaltpawarikanda.mssbrewery.enums.BeerStyle;
import com.exaltpawarikanda.mssbrewery.model.BeerDto;
import com.exaltpawarikanda.mssbrewery.model.v2.BeerDtoV2;
import com.exaltpawarikanda.mssbrewery.service.api.BeerService;
import com.exaltpawarikanda.mssbrewery.service.api.v2.BeerServiceV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/25/21
 */
@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 createBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        //TODO would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
       log.debug("Deleting a beer......");
    }
}
