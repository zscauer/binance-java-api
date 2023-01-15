package com.binance.api.client.domain.account.request;

import com.binance.api.client.constant.BinanceApiConstants;
import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A specialized order request with additional filters.
 */
@Getter
public class AllOrdersRequest extends OrderRequest {

  private static final Integer DEFAULT_LIMIT = 500;

  private Long orderId;

  private Integer limit;

  public AllOrdersRequest(String symbol) {
    super(symbol);
    this.limit = DEFAULT_LIMIT;
  }

  public AllOrdersRequest orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public AllOrdersRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("orderId", orderId)
        .append("limit", limit)
        .toString();
  }
}
