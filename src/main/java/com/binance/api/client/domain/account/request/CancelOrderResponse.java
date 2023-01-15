package com.binance.api.client.domain.account.request;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response object returned when an order is canceled.
 *
 * @see CancelOrderRequest for the request
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelOrderResponse {

  private String symbol;

  private String origClientOrderId;

  private Long orderId;

  private String clientOrderId;

  private OrderStatus status;

  private String executedQty;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("symbol", symbol)
            .append("origClientOrderId", origClientOrderId)
            .append("orderId", orderId)
            .append("clientOrderId", clientOrderId)
            .toString();
  }
}