package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Wraps a symbol and its corresponding latest price.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TickerPrice {

  /**
   * Ticker symbol.
   */
  private String symbol;

  /**
   * Latest price.
   */
  private String price;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("symbol", symbol)
        .append("price", price)
        .toString();
  }
}
