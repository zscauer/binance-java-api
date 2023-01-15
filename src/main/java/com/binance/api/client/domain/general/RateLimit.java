package com.binance.api.client.domain.general;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Rate limits.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class RateLimit {

  private RateLimitType rateLimitType;

  private RateLimitInterval interval;

  private Integer limit;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("rateLimitType", rateLimitType)
        .append("interval", interval)
        .append("limit", limit)
        .toString();
  }
}
