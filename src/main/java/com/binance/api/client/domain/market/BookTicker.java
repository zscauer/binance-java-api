package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Represents the best price/qty on the order book for a given symbol.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookTicker {

  /**
   * Ticker symbol.
   */
  private String symbol;

  /**
   * Bid price.
   */
  private String bidPrice;

  /**
   * Bid quantity
   */
  private String bidQty;

  /**
   * Ask price.
   */
  private String askPrice;

  /**
   * Ask quantity.
   */
  private String askQty;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("symbol", symbol)
        .append("bidPrice", bidPrice)
        .append("bidQty", bidQty)
        .append("askPrice", askPrice)
        .append("askQty", askQty)
        .toString();
  }
}
