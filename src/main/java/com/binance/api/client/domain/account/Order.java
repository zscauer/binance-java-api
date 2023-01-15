package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderStatus;
import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.TimeInForce;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Trade order information.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

  /**
   * Symbol that the order was put on.
   */
  private String symbol;

  /**
   * Order id.
   */
  private Long orderId;

  /**
   * Client order id.
   */
  private String clientOrderId;

  /**
   * Price.
   */
  private String price;

  /**
   * Original quantity.
   */
  private String origQty;

  /**
   * Original quantity.
   */
  private String executedQty;

  /**
   * Order status.
   */
  private OrderStatus status;

  /**
   * Time in force to indicate how long will the order remain active.
   */
  private TimeInForce timeInForce;

  /**
   * Type of order.
   */
  private OrderType type;

  /**
   * Buy/Sell order side.
   */
  private OrderSide side;

  /**
   * Used with stop orders.
   */
  private String stopPrice;

  /**
   * Used with stop orders.
   */
  private String stopLimitPrice;

  /**
   * Used with iceberg orders.
   */
  private String icebergQty;

  /**
   * Order timestamp.
   */
  private long time;

  /**
   * Used to calculate the average price
   */
  private String cummulativeQuoteQty;

  /**
   * Update timestamp.
   */
  private long updateTime;

  /**
   * Is working.
   */
  @JsonProperty("isWorking")
  private boolean working;

  /**
   * Original quote order quantity.
   */
  private String origQuoteOrderQty;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("symbol", symbol)
            .append("orderId", orderId)
            .append("clientOrderId", clientOrderId)
            .append("price", price)
            .append("origQty", origQty)
            .append("executedQty", executedQty)
            .append("status", status)
            .append("timeInForce", timeInForce)
            .append("type", type)
            .append("side", side)
            .append("stopPrice", stopPrice)
            .append("stopLimitPrice", stopLimitPrice)
            .append("icebergQty", icebergQty)
            .append("time", time)
            .append("cummulativeQuoteQty", cummulativeQuoteQty)
            .append("updateTime", updateTime)
            .append("isWorking", working)
            .append("origQuoteOrderQty", origQuoteOrderQty)
            .toString();
  }
}
