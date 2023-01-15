package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A deposit address for a given asset.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepositAddress {

  private String address;

  private boolean success;

  private String addressTag;

  private String asset;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("address", address)
        .append("success", success)
        .append("addressTag", addressTag)
        .append("asset", asset)
        .toString();
  }
}