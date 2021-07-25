package com.exaltpawarikanda.mssbrewery.service.api.v2;

import com.exaltpawarikanda.mssbrewery.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/26/21
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 createBeer(BeerDtoV2 beerDtoV2);

    void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2);

    void deleteById(UUID beerId);
}
