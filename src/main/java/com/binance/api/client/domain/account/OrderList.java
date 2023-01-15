package com.binance.api.client.domain.account;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.ContingencyType;
import com.binance.api.client.domain.OCOOrderStatus;
import com.binance.api.client.domain.OCOStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderList {

    /**
     * Order id.
     */
    private Long orderListId;

    private ContingencyType contingencyType;

    private OCOStatus listStatusType;

    private OCOOrderStatus listOrderStatus;

    private String listClientOrderId;

    private Long transactionTime;

    private String symbol;

    private List<Order> orders;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("orderListId", orderListId)
                .append("contingencyType", contingencyType)
                .append("listStatusType", listStatusType)
                .append("listOrderStatus", listOrderStatus)
                .append("listClientOrderId", listClientOrderId)
                .append("transactionTime", transactionTime)
                .append("symbol", symbol)
                .append("orders", orders)
                .toString();
    }

}