package com.binance.api.client.domain.account;

import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderStatus;
import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.TimeInForce;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderReport {

    /**
     * Order symbol.
     */
    private String symbol;

    /**
     * Order id.
     */
    private Long orderId;

    private Long orderListId;

    /**
     * This will be either a generated one, or the newClientOrderId parameter
     * which was passed when creating the new order.
     */
    private String clientOrderId;

    private String origClientOrderId;

    private Long transactTime;

    private String price;

    private String origQty;

    private String executedQty;

    private String cummulativeQuoteQty;

    private OrderStatus status;

    private TimeInForce timeInForce;

    private OrderType type;

    private OrderSide side;

    private String stopPrice;

}