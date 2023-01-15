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
public class RepayQueryResult {

  private int total;
  private List<Repay> rows;

  @Override
  public String toString() {
    return "RepayQueryResult{" +
            "total=" + total +
            ", rows=" + rows +
            '}';
  }
}
