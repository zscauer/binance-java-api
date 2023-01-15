package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An interval candlestick for a symbol providing informations on price that can be used to produce candlestick charts.
 */
@Setter
@Getter
@JsonDeserialize(using = CandlestickEventDeserializer.class)
@JsonSerialize(using = CandlestickEventSerializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CandlestickEvent {

  private String eventType;

  private long eventTime;

  private String symbol;

  private Long openTime;

  private String open;

  private String high;

  private String low;

  private String close;

  private String volume;

  private Long closeTime;

  private String intervalId;

  private Long firstTradeId;

  private Long lastTradeId;

  private String quoteAssetVolume;

  private Long numberOfTrades;

  private String takerBuyBaseAssetVolume;

  private String takerBuyQuoteAssetVolume;

  private Boolean isBarFinal;

  public Boolean getBarFinal() {
    return isBarFinal;
  }

  public void setBarFinal(Boolean barFinal) {
    isBarFinal = barFinal;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime)
        .append("symbol", symbol)
        .append("openTime", openTime)
        .append("open", open)
        .append("high", high)
        .append("low", low)
        .append("close", close)
        .append("volume", volume)
        .append("closeTime", closeTime)
        .append("intervalId", intervalId)
        .append("firstTradeId", firstTradeId)
        .append("lastTradeId", lastTradeId)
        .append("quoteAssetVolume", quoteAssetVolume)
        .append("numberOfTrades", numberOfTrades)
        .append("takerBuyBaseAssetVolume", takerBuyBaseAssetVolume)
        .append("takerBuyQuoteAssetVolume", takerBuyQuoteAssetVolume)
        .append("isBarFinal", isBarFinal)
        .toString();
  }
}