package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.TimeInForce;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A trade order to enter or exit a position.
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewOrder {

  /**
   * Symbol to place the order on.
   */
  private String symbol;

  /**
   * Buy/Sell order side.
   */
  private OrderSide side;

  /**
   * Type of order.
   */
  private OrderType type;

  /**
   * Time in force to indicate how long will the order remain active.
   */
  private TimeInForce timeInForce;

  /**
   * Quantity.
   */
  private String quantity;

  /**
   * Quote quantity.
   */
  private String quoteOrderQty;

  /**
   * Price.
   */
  private String price;

  /**
   * A unique id for the order. Automatically generated if not sent.
   */
  private String newClientOrderId;

  /**
   * A unique id of the strategy.
   */
  private int strategyId;

  /**
   * The value cannot be less than 1000000.
   */
  private int strategyType;

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
   * Set the response JSON. ACK, RESULT, or FULL; default: RESULT.
   */
  private NewOrderResponseType newOrderRespType;

  /**
   * Receiving window.
   */
  private Long recvWindow;

  /**
   * Order timestamp.
   */
  private long timestamp;

  /**
   * Creates a new order with all required parameters.
   */
  public NewOrder(String symbol, OrderSide side, OrderType type, TimeInForce timeInForce, String quantity, int strategyId) {
    this.symbol = symbol;
    this.side = side;
    this.type = type;
    this.timeInForce = timeInForce;
    this.quantity = quantity;
    this.newOrderRespType = NewOrderResponseType.RESULT;
    this.strategyId = strategyId;
    this.timestamp = System.currentTimeMillis();
    this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
  }

  /**
   * Creates a new order with all required parameters plus price, which is optional for MARKET orders.
   */
  public NewOrder(String symbol, OrderSide side, OrderType type, TimeInForce timeInForce, String quantity, String price, int strategyId) {
    this(symbol, side, type, timeInForce, quantity, strategyId);
    this.price = price;
  }

  public NewOrder symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  public NewOrder side(OrderSide side) {
    this.side = side;
    return this;
  }

  public NewOrder type(OrderType type) {
    this.type = type;
    return this;
  }

  public NewOrder timeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

  public NewOrder quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  public NewOrder quoteOrderQty(String quoteOrderQty) {
    this.quoteOrderQty = quoteOrderQty;
    return this;
  }

  public NewOrder price(String price) {
    this.price = price;
    return this;
  }

  public NewOrder newClientOrderId(String newClientOrderId) {
    this.newClientOrderId = newClientOrderId;
    return this;
  }

  public NewOrder strategyId(int strategyId) {
    this.strategyId = strategyId;
    return this;
  }

  public NewOrder strategyType(int strategyType) {
    this.strategyType = strategyType;
    return this;
  }

  public NewOrder stopPrice(String stopPrice) {
    this.stopPrice = stopPrice;
    return this;
  }

  public NewOrder stopLimitPrice(String stopLimitPrice) {
    this.stopLimitPrice = stopLimitPrice;
    return this;
  }

  public NewOrder icebergQty(String icebergQty) {
    this.icebergQty = icebergQty;
    return this;
  }

  public NewOrder newOrderRespType(NewOrderResponseType newOrderRespType) {
    this.newOrderRespType = newOrderRespType;
    return this;
  }

  public NewOrder recvWindow(Long recvWindow) {
    this.recvWindow = recvWindow;
    return this;
  }

  public NewOrder timestamp(long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Places a MARKET buy order for the given <code>quantity</code>.
   *
   * @return a new order which is pre-configured with MARKET as the order type and BUY as the order side.
   */
  public static NewOrder marketBuy(String symbol, String quantity, int strategyId) {
    return new NewOrder(symbol, OrderSide.BUY, OrderType.MARKET, null, quantity, strategyId);
  }

  /**
   * Places a MARKET sell order for the given <code>quantity</code>.
   *
   * @return a new order which is pre-configured with MARKET as the order type and SELL as the order side.
   */
  public static NewOrder marketSell(String symbol, String quantity, int strategyId) {
    return new NewOrder(symbol, OrderSide.SELL, OrderType.MARKET, null, quantity, strategyId);
  }

  /**
   * Places a LIMIT buy order for the given <code>quantity</code> and <code>price</code>.
   *
   * @return a new order which is pre-configured with LIMIT as the order type and BUY as the order side.
   */
  public static NewOrder limitBuy(String symbol, TimeInForce timeInForce, String quantity, String price, int strategyId) {
    return new NewOrder(symbol, OrderSide.BUY, OrderType.LIMIT, timeInForce, quantity, price, strategyId);
  }

  /**
   * Places a LIMIT sell order for the given <code>quantity</code> and <code>price</code>.
   *
   * @return a new order which is pre-configured with LIMIT as the order type and SELL as the order side.
   */
  public static NewOrder limitSell(String symbol, TimeInForce timeInForce, String quantity, String price, int strategyId) {
    return new NewOrder(symbol, OrderSide.SELL, OrderType.LIMIT, timeInForce, quantity, price, strategyId);
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("symbol", symbol)
            .append("side", side)
            .append("type", type)
            .append("timeInForce", timeInForce)
            .append("quantity", quantity)
            .append("quoteOrderQty", quoteOrderQty)
            .append("price", price)
            .append("newClientOrderId", newClientOrderId)
            .append("stopPrice", stopPrice)
            .append("stopLimitPrice", stopLimitPrice)
            .append("icebergQty", icebergQty)
            .append("newOrderRespType", newOrderRespType)
            .append("recvWindow", recvWindow)
            .append("timestamp", timestamp)
            .toString();
  }
}
