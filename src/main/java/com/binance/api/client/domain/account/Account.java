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
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

  /**
   * Maker commission.
   */
  private int makerCommission;

  /**
   * Taker commission.
   */
  private int takerCommission;

  /**
   * Buyer commission.
   */
  private int buyerCommission;

  /**
   * Seller commission.
   */
  private int sellerCommission;

  /**
   * Whether or not this account can trade.
   */
  private boolean canTrade;

  /**
   * Whether or not it is possible to withdraw from this account.
   */
  private boolean canWithdraw;

  /**
   * Whether or not it is possible to deposit into this account.
   */
  private boolean canDeposit;

  /**
   * Last account update time.
   */
  private long updateTime;

  /**
   * List of asset balances of this account.
   */
  private List<AssetBalance> balances;

  /**
   * Returns the asset balance for a given symbol.
   *
   * @param symbol asset symbol to obtain the balances from
   * @return an asset balance for the given symbol which can be 0 in case the symbol has no balance in the account
   */
  public AssetBalance getAssetBalance(String symbol) {
    for (AssetBalance assetBalance : balances) {
      if (symbol.equals(assetBalance.getAsset())) {
        return assetBalance;
      }
    }
    AssetBalance emptyBalance = new AssetBalance();
    emptyBalance.setAsset(symbol);
    emptyBalance.setFree("0");
    emptyBalance.setLocked("0");
    return emptyBalance;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("makerCommission", makerCommission)
        .append("takerCommission", takerCommission)
        .append("buyerCommission", buyerCommission)
        .append("sellerCommission", sellerCommission)
        .append("canTrade", canTrade)
        .append("canWithdraw", canWithdraw)
        .append("canDeposit", canDeposit)
        .append("updateTime", updateTime)
        .append("balances", balances)
        .toString();
  }
}
