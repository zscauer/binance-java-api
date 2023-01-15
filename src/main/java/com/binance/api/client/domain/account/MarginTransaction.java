package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MarginTransaction information.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginTransaction {

  private String tranId;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("transactionId", tranId)
        .toString();
  }
}
