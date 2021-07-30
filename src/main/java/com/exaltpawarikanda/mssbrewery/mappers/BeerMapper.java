package com.exaltpawarikanda.mssbrewery.mappers;

import com.exaltpawarikanda.mssbrewery.domain.Beer;
import com.exaltpawarikanda.mssbrewery.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Exalt Pawarikanda on 7/30/21
 */
@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
