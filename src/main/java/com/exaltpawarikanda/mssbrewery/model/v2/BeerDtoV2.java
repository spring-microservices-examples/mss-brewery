package com.exaltpawarikanda.mssbrewery.model.v2;

import com.exaltpawarikanda.mssbrewery.enums.BeerStyle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/26/21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID id;
    private String beerName;
    private BeerStyle beerStyle;
    private Long upc;


}
