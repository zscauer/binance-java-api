package com.binance.api.client.domain.general;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An asset Binance supports.
 */
 @Getter
 @JsonIgnoreProperties(ignoreUnknown = true)
 public class Asset {

   @JsonProperty("id")
   private String id;

   @JsonProperty("assetCode")
   private String assetCode;

   @JsonProperty("assetName")
   private String assetName;

   @JsonProperty("unit")
   private String unit;

   @JsonProperty("transactionFee")
   private String transactionFee;

   @JsonProperty("commissionRate")
   private String commissionRate;

   @JsonProperty("freeAuditWithdrawAmt")
   private String freeAuditWithdrawAmount;

   @JsonProperty("freeUserChargeAmount")
   private String freeUserChargeAmount;

   @JsonProperty("minProductWithdraw")
   private String minProductWithdraw;

   @JsonProperty("withdrawIntegerMultiple")
   private String withdrawIntegerMultiple;

   @JsonProperty("confirmTimes")
   private long confirmTimes;

   @JsonProperty("enableWithdraw")
   private boolean enableWithdraw;

   @JsonProperty("isLegalMoney")
   private boolean isLegalMoney;

  public String minProductWithdraw() {
     return minProductWithdraw;
   }

  public boolean canWithraw() {
     return enableWithdraw;
   }

   public boolean isLegalMoney() {
     return isLegalMoney;
   }

   @Override
   public String toString() {
     return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
         .append("id", id)
         .append("assetCode", assetCode)
         .append("assetName", assetName)
         .append("unit", unit)
         .append("transactionFee", transactionFee)
         .append("commissionRate", commissionRate)
         .append("freeAuditWithdrawAmount", freeAuditWithdrawAmount)
         .append("freeUserChargeAmount", freeUserChargeAmount)
         .append("minProductWithdraw", minProductWithdraw)
         .append("withdrawIntegerMultiple", withdrawIntegerMultiple)
         .append("confirmTimes", confirmTimes)
         .append("enableWithdraw", enableWithdraw)
         .append("isLegalMoney", isLegalMoney)
         .toString();
   }
 }
