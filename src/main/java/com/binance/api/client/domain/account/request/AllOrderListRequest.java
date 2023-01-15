package com.binance.api.client.domain.account.request;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllOrderListRequest {

    private static final Integer DEFAULT_LIMIT = 500;

    private Long fromId;

    private Long startTime;

    private Long endTime;

    private Integer limit;

    private Long recvWindow;

    private Long timestamp;

    public AllOrderListRequest() {
        this.limit = DEFAULT_LIMIT;
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }

}