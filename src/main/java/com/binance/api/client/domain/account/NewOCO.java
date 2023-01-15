package com.binance.api.client.domain.account;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.TimeInForce;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewOCO {

    /**
     * Symbol to place the order on.
     */
    private String symbol;

    /**
     * A unique Id for the entire orderList
     */
    private String listClientOrderId;

    /**
     * Buy/Sell order side.
     */
    private OrderSide side;

    /**
     * Quantity.
     */
    private String quantity;

    /**
     * A unique Id for the limit order
     */
    private String limitClientOrderId;

    /**
     * Price.
     */
    private String price;

    /**
     * Used to make the LIMIT_MAKER leg an iceberg order.
     */
    private String limitIcebergQty;

    /**
     * A unique Id for the stop loss/stop loss limit leg
     */
    private String stopClientOrderId;

    /**
     * Stop Price.
     */
    private String stopPrice;

    /**
     * If provided, stopLimitTimeInForce is required.
     */
    private String stopLimitPrice;

    /**
     * Used with STOP_LOSS_LIMIT leg to make an iceberg order.
     */
    private String stopIcebergQty;

    /**
     * Valid values are GTC/FOK/IOC
     */
    private TimeInForce stopLimitTimeInForce;

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
     * Creates a new OCO with all required parameters.
     */
    public NewOCO(String symbol, OrderSide side, String quantity, String price, String stopPrice) {
        this.symbol = symbol;
        this.side = side;
        this.quantity = quantity;
        this.price = price;
        this.stopPrice = stopPrice;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("symbol", symbol)
                .append("listClientOrderId", listClientOrderId)
                .append("side", side)
                .append("quantity", quantity)
                .append("limitClientOrderId", limitClientOrderId)
                .append("price", price)
                .append("limitIcebergQty", limitIcebergQty)
                .append("stopClientOrderId", stopClientOrderId)
                .append("stopPrice", stopPrice)
                .append("stopLimitPrice", stopLimitPrice)
                .append("stopIcebergQty", stopIcebergQty)
                .append("stopLimitTimeInForce", stopLimitTimeInForce)
                .append("newOrderRespType", newOrderRespType)
                .append("recvWindow", recvWindow)
                .append("timestamp", timestamp)
                .toString();
    }

}