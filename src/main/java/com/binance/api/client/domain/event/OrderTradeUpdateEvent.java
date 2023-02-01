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
   * Stop price.
   */
  @JsonProperty("P")
  private Double stopPrice;

  /**
   * Trailing Delta; This is only visible if the order was a trailing stop order.
   */
  @JsonProperty("d")
  private Integer trailingDelta;

  /**
   * Iceberg quantity.
   */
  @JsonProperty("F")
  private Double iceberqQuantity;

  /**
   * Original client order ID; This is the ID of the order being canceled.
   */
  @JsonProperty("C")
  private String originalClientOrderId;

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
   * Prevented Match Id; This is only visible if the order expire due to STP trigger.
   */
  @JsonProperty("v")
  private Integer preventMatchId;

  /**
   * Is the order on the book?
   */
  @JsonProperty("w")
  private boolean isOrderOnBook;

  /**
   * Is this trade the maker side?
   */
  @JsonProperty("m")
  private boolean isMakerSide;

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

  /**
   * Trailing Time; This is only visible if the trailing stop order has been activated.
   */
  @JsonProperty("D")
  private Long trailingTime;

  /**
   * Strategy ID; This is only visible if the strategyId parameter was provided upon order placement
   */
  @JsonProperty("j")
  private Integer strategyId;

  /**
   * Strategy Type; This is only visible if the strategyId parameter was provided upon order placement
   */
  @JsonProperty("J")
  private Integer strategyType;

  /**
   * Working Time; This is only visible if the order has been placed on the book.
   */
  @JsonProperty("W")
  private Long workingTime;

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
        .append("stopPrice", stopPrice)
        .append("trailingDelta", trailingDelta)
        .append("iceberqQuantity", iceberqQuantity)
        .append("originalClientOrderId", originalClientOrderId)
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
        .append("preventMatchId", preventMatchId)
        .append("isOrderOnBook", isOrderOnBook)
        .append("isMakerSide", isMakerSide)
        .append("orderCreationTime", orderCreationTime)
        .append("cumulativeQuoteQty", cumulativeQuoteQty)
        .append("lastQuoteQty", lastQuoteQty)
        .append("quoteOrderQty", quoteOrderQty)
        .append("trailingTime", quoteOrderQty)
        .append("strategyId", strategyId)
        .append("strategyType", strategyType)
        .append("workingTime", workingTime)
        .toString();
  }
}
