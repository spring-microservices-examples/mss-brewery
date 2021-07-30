package com.exaltpawarikanda.mssbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/30/21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

   // protected LocalDate dateOfBirth;
    protected Timestamp createdDate;
    protected Timestamp lastUpdatedDate;
}
