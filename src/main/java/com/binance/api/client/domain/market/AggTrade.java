package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An aggregated trade event for a symbol.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AggTrade {

  @JsonProperty("a")
  private long aggregatedTradeId;

  @JsonProperty("p")
  private String price;

  @JsonProperty("q")
  private String quantity;

  @JsonProperty("f")
  private long firstBreakdownTradeId;

  @JsonProperty("l")
  private long lastBreakdownTradeId;

  @JsonProperty("T")
  private long tradeTime;

  @JsonProperty("m")
  private boolean isBuyerMaker;

  public boolean isBuyerMaker() {
    return isBuyerMaker;
  }

  public void setBuyerMaker(boolean buyerMaker) {
    isBuyerMaker = buyerMaker;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("aggregatedTradeId", aggregatedTradeId)
        .append("price", price)
        .append("quantity", quantity)
        .append("firstBreakdownTradeId", firstBreakdownTradeId)
        .append("lastBreakdownTradeId", lastBreakdownTradeId)
        .append("tradeTime", tradeTime)
        .append("isBuyerMaker", isBuyerMaker)
        .toString();
  }
}
