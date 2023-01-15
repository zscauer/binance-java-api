package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A withdraw that was done to a Binance account.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Withdraw {

  /**
   * Amount withdrawn.
   */
  private String amount;

  /**
   * Destination address.
   */
  private String address;

  /**
   * Symbol.
   */
  private String asset;

  private String applyTime;

  private String successTime;

  /**
   * Transaction id.
   */
  private String txId;

  /**
   * Id.
   */
  private String id;

  /**
   * (0:Email Sent,1:Cancelled 2:Awaiting Approval 3:Rejected 4:Processing 5:Failure 6:Completed)
   */
  private int status;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("amount", amount)
        .append("address", address)
        .append("asset", asset)
        .append("applyTime", applyTime)
        .append("successTime", successTime)
        .append("txId", txId)
        .append("id", id)
        .append("status", status)
        .toString();
  }
}
