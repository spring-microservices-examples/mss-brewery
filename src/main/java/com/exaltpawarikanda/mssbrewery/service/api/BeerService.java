package com.exaltpawarikanda.mssbrewery.service.api;

import com.exaltpawarikanda.mssbrewery.model.BeerDto;

import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/25/21
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto createBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
