package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Order book of a symbol in Binance.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBook {

  /**
   * Last update id of this order book.
   */
  private long lastUpdateId;

  /**
   * List of bids (price/qty).
   */
  private List<OrderBookEntry> bids;

  /**
   * List of asks (price/qty).
   */
  private List<OrderBookEntry> asks;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("lastUpdateId", lastUpdateId)
        .append("bids", bids)
        .append("asks", asks)
        .toString();
  }
}
