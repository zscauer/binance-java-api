package com.binance.api.client.domain.account;

import com.binance.api.client.domain.LoanStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents an executed trade history item.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Loan {

    private String asset;
    private String principal;
    private long timestamp;
    private LoanStatus status;

}
