package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An order book entry consisting of price and quantity.
 */
@Setter
@Getter
@JsonDeserialize(using = OrderBookEntryDeserializer.class)
@JsonSerialize(using = OrderBookEntrySerializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBookEntry {

  private String price;
  private String qty;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("price", price)
        .append("qty", qty)
        .toString();
  }
}
