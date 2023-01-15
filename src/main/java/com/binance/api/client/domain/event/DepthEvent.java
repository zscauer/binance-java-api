package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.market.OrderBookEntry;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Depth delta event for a symbol.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepthEvent {

  @JsonProperty("e")
  private String eventType;

  @JsonProperty("E")
  private long eventTime;

  @JsonProperty("s")
  private String symbol;

  @JsonProperty("U")
  private long firstUpdateId;

  /**
   * updateId to sync up with updateid in /api/v3/depth
   */
  @JsonProperty("u")
  private long finalUpdateId;

  /**
   * Bid depth delta.
   */
  @JsonProperty("b")
  private List<OrderBookEntry> bids;

  /**
   * Ask depth delta.
   */
  @JsonProperty("a")
  private List<OrderBookEntry> asks;

  /**
   * @deprecated Use {@link #getFinalUpdateId}
   */
  @Deprecated
  public long getUpdateId() {
    return finalUpdateId;
  }

  /**
   * @deprecated Use {@link #setFinalUpdateId}
   */
  @Deprecated
  public void setUpdateId(long updateId) {
    this.finalUpdateId = updateId;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime)
        .append("symbol", symbol)
        .append("firstUpdateId", firstUpdateId)
        .append("finalUpdateId", finalUpdateId)
        .append("bids", bids)
        .append("asks", asks)
        .toString();
  }
}
