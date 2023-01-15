package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * History of account withdrawals.
 *
 * @see Withdraw
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WithdrawHistory {

  private List<Withdraw> withdrawList;

  private boolean success;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("withdrawList", withdrawList)
        .append("success", success)
        .toString();
  }
}
