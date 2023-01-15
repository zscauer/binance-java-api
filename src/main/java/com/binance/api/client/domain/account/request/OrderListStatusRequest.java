package com.binance.api.client.domain.account.request;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderListStatusRequest {

    private Long orderListId;

    private String origClientOrderId;

    private Long recvWindow;

    private Long timestamp;

    public OrderListStatusRequest(Long orderListId) {
        this.orderListId = orderListId;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }

}