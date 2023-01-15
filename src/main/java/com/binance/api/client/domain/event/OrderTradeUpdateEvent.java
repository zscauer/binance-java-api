package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Order or trade report update event.
 * <p>
 * This event is embedded as part of a user data update event.
 *
 * @see UserDataUpdateEvent
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderTradeUpdateEvent {

  @JsonProperty("e")
  private String eventType;

  @JsonProperty("E")
  private Long eventTime;

  @JsonProperty("s")
  private String symbol;

  @JsonProperty("c")
  private String newClientOrderId;

  /**
   * Buy/Sell order side.
   */
  @JsonProperty("S")
  private OrderSide side;

  /**
   * Type of order.
   */
  @JsonProperty("o")
  private OrderType type;

  /**
   * Time in force to indicate how long will the order remain active.
   */
  @JsonProperty("f")
  private TimeInForce timeInForce;

  /**
   * Original quantity in the order.
   */
  @JsonProperty("q")
  private String originalQuantity;

  /**
   * Price.
   */
  @JsonProperty("p")
  private String price;

  /**
   * Type of execution.
   */
  @JsonProperty("x")
  private ExecutionType executionType;

  /**
   * Status of the order.
   */
  @JsonProperty("X")
  private OrderStatus orderStatus;

  /**
   * Reason why the order was rejected.
   */
  @JsonProperty("r")
  private OrderRejectReason orderRejectReason;

  /**
   * Order id.
   */
  @JsonProperty("i")
  private Long orderId;

  /**
   * Quantity of the last filled trade.
   */
  @JsonProperty("l")
  private String quantityLastFilledTrade;

  /**
   * Accumulated quantity of filled trades on this order.
   */
  @JsonProperty("z")
  private String accumulatedQuantity;

  /**
   * Price of last filled trade.
   */
  @JsonProperty("L")
  private String priceOfLastFilledTrade;

  /**
   * Commission.
   */
  @JsonProperty("n")
  private String commission;

  /**
   * Asset on which commission is taken
   */
  @JsonProperty("N")
  private String commissionAsset;

  /**
   * Order/trade time.
   */
  @JsonProperty("T")
  private Long orderTradeTime;

  /**
   * Trade id.
   */
  @JsonProperty("t")
  private Long tradeId;

  /**
   * Order creation time.
   */
  @JsonProperty("O")
  private Long orderCreationTime;

  /**
   * Cumulative quote asset transacted quantity.
   */
  @JsonProperty("Z")
  private String cumulativeQuoteQty;

  /**
   * Last quote asset transacted quantity (i.e. lastPrice * lastQty).
   */
  @JsonProperty("Y")
  private String lastQuoteQty;

  /**
   * Quote Order Qty.
   */
  @JsonProperty("Q")
  private String quoteOrderQty;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime)
        .append("symbol", symbol)
        .append("newClientOrderId", newClientOrderId)
        .append("side", side)
        .append("type", type)
        .append("timeInForce", timeInForce)
        .append("originalQuantity", originalQuantity)
        .append("price", price)
        .append("executionType", executionType)
        .append("orderStatus", orderStatus)
        .append("orderRejectReason", orderRejectReason)
        .append("orderId", orderId)
        .append("quantityLastFilledTrade", quantityLastFilledTrade)
        .append("accumulatedQuantity", accumulatedQuantity)
        .append("priceOfLastFilledTrade", priceOfLastFilledTrade)
        .append("commission", commission)
        .append("commissionAsset", commissionAsset)
        .append("orderTradeTime", orderTradeTime)
        .append("tradeId", tradeId)
        .append("orderCreationTime", orderCreationTime)
        .append("cumulativeQuoteQty", cumulativeQuoteQty)
        .append("lastQuoteQty", lastQuoteQty)
        .append("quoteOrderQty", quoteOrderQty)
        .toString();
  }
}
