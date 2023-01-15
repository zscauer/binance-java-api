package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 24 hour price change statistics for a ticker.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TickerStatistics {

  /**
   * Ticker symbol.
   */
  private String symbol;

  /**
   * Price change during the last 24 hours.
   */
  private String priceChange;

  /**
   * Price change, in percentage, during the last 24 hours.
   */
  private String priceChangePercent;

  /**
   * Weighted average price.
   */
  private String weightedAvgPrice;

  /**
   * Previous close price.
   */
  private String prevClosePrice;

  /**
   * Last price.
   */
  private String lastPrice;

  /**
   * Bid price.
   */
  private String bidPrice;

  /**
   * Ask price.
   */
  private String askPrice;

  /**
   * Open price 24 hours ago.
   */
  private String openPrice;

  /**
   * Highest price during the past 24 hours.
   */
  private String highPrice;

  /**
   * Lowest price during the past 24 hours.
   */
  private String lowPrice;

  /**
   * Total volume during the past 24 hours.
   */
  private String volume;

  /**
   * Sum of (price * volume) for all trades.
   */
  private String quoteVolume;

  /**
   * Open time.
   */
  private long openTime;

  /**
   * Close time.
   */
  private long closeTime;

  /**
   * First trade id.
   */
  private long firstId;

  /**
   * Last trade id.
   */
  private long lastId;

  /**
   * Total number of trades during the last 24 hours.
   */
  private long count;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("symbol", symbol)
        .append("priceChange", priceChange)
        .append("priceChangePercent", priceChangePercent)
        .append("weightedAvgPrice", weightedAvgPrice)
        .append("prevClosePrice", prevClosePrice)
        .append("lastPrice", lastPrice)
        .append("bidPrice", bidPrice)
        .append("askPrice", askPrice)
        .append("openPrice", openPrice)
        .append("highPrice", highPrice)
        .append("lowPrice", lowPrice)
        .append("volume", volume)
        .append("openTime", openTime)
        .append("closeTime", closeTime)
        .append("firstId", firstId)
        .append("lastId", lastId)
        .append("count", count)
        .toString();
  }
}
