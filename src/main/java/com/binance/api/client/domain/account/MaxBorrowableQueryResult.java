package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Max Borrow Query Result
 *
 * @see Withdraw
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaxBorrowableQueryResult {

  private String amount;

  @Override
  public String toString() {
    return "MaxBorrowQueryResult{" +
            "amount='" + amount + '\'' +
            '}';
  }
}
