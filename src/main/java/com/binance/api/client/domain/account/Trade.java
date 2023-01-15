package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Represents an executed trade.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trade {

  @JsonSetter("id")
  /**
   * Trade id.
   */
  private Long id;

  /**
   * Price.
   */
  private String price;

  /**
   * Quantity.
   */
  private String qty;


  /**
   * Quote quantity for the trade (price * qty).
   */
  private String quoteQty;

  /**
   * Commission.
   */
  private String commission;

  /**
   * Asset on which commission is taken
   */
  private String commissionAsset;

  /**
   * Trade execution time.
   */
  private long time;

  /**
   * The symbol of the trade.
   */
  private String symbol;

  @JsonProperty("isBuyer")
  private boolean buyer;

  @JsonProperty("isMaker")
  private boolean maker;

  @JsonProperty("isBestMatch")
  private boolean bestMatch;

  private String orderId;

  @JsonSetter("tradeId")
  public void setTradeId(Long id) {
    if (this.id == null) {
      setId(id);
    }
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("id", id)
        .append("symbol", symbol)
        .append("price", price)
        .append("qty", qty)
        .append("quoteQty", quoteQty)
        .append("commission", commission)
        .append("commissionAsset", commissionAsset)
        .append("time", time)
        .append("buyer", buyer)
        .append("maker", maker)
        .append("bestMatch", bestMatch)
        .append("orderId", orderId)
        .toString();
  }
}
