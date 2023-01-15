package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * History of account withdrawals.
 *
 * @see Withdraw
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanQueryResult {

  private int total;
  private List<Loan> rows;

}
