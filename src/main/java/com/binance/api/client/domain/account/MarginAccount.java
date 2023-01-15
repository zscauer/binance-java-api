package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Account information.
 */
@Setter
@Getter
@JsonIgnoreProperties
public class MarginAccount {

  private boolean borrowEnabled;

  private String marginLevel;

  private String totalAssetOfBtc;

  private String totalLiabilityOfBtc;

  private String totalNetAssetOfBtc;

  private boolean tradeEnabled;

  private boolean transferEnabled;

  private List<MarginAssetBalance> userAssets;

  /**
   * Returns the asset balance for a given symbol.
   *
   * @param symbol asset symbol to obtain the balances from
   * @return an asset balance for the given symbol which can be 0 in case the symbol has no balance in the account
   */
  public MarginAssetBalance getAssetBalance(final String symbol) {
    return userAssets.stream()
            .filter(marginAssetBalance -> marginAssetBalance.getAsset().equals(symbol))
            .findFirst()
            .orElse(MarginAssetBalance.of(symbol));
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("borrowEnabled", borrowEnabled)
        .append("marginLevel", marginLevel)
        .append("totalAssetOfBtc", totalAssetOfBtc)
        .append("totalLiabilityOfBtc", totalLiabilityOfBtc)
        .append("totalNetAssetOfBtc", totalNetAssetOfBtc)
        .append("tradeEnabled", tradeEnabled)
        .append("transferEnabled", transferEnabled)
        .append("userAssets", userAssets)
        .toString();
  }
}
