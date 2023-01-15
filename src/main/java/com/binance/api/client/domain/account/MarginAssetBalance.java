package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An asset balance in an Account.
 *
 * @see Account
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarginAssetBalance {

  public static MarginAssetBalance of(final String asset) {
    final MarginAssetBalance marginAssetBalance = new MarginAssetBalance();

    marginAssetBalance.setAsset(asset);

    return marginAssetBalance;
  }

  /**
   * Asset symbol.
   */
  private String asset;

  private String borrowed = "0";

  /**
   * Available balance.
   */
  private String free = "0";

  private String interest = "0";

  /**
   * Locked by open orders.
   */
  private String locked = "0";

  private String netAsset = "0";

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("asset", asset)
        .append("borrowed", borrowed)
        .append("free", free)
        .append("interest", interest)
        .append("locked", locked)
        .append("netAsset", netAsset)
        .toString();
  }
}
