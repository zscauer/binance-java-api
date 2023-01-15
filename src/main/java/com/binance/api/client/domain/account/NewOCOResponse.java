package com.binance.api.client.domain.account;

import java.util.List;

import com.binance.api.client.domain.ContingencyType;
import com.binance.api.client.domain.OCOOrderStatus;
import com.binance.api.client.domain.OCOStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewOCOResponse extends OrderList {

    private Long orderListId;
    private ContingencyType contingencyType;
    private OCOStatus listStatusType;
    private OCOOrderStatus listOrderStatus;
    private String listClientOrderId;
    private Long transactionTime;
    private String symbol;
    private List<OrderReport> orderReports;

}
