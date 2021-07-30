package com.exaltpawarikanda.mssbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/30/21
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Customer {
    private UUID customerId;
    private String name;
}
