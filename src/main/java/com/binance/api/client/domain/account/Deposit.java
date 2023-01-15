package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A deposit that was done to a Binance account.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Deposit {

  /**
   * Amount deposited.
   */
  private String amount;

  /**
   * Symbol.
   */
  private String asset;

  /**
   * Deposit time.
   */
  private String insertTime;

  /**
   * Transaction id
   */
  private String txId;

  /**
   * (0:pending,1:success)
   */
  private int status;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("amount", amount)
        .append("asset", asset)
        .append("insertTime", insertTime)
        .append("txId", txId)
        .append("status", status)
        .toString();
  }
}
