package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.account.AssetBalance;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Account update event which will reflect the current position/balances of the account.
 *
 * This event is embedded as part of a user data update event.
 *
 * @see UserDataUpdateEvent
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountUpdateEvent {

  @JsonProperty("e")
  private String eventType;

  @JsonProperty("E")
  private long eventTime;

  @JsonProperty("B")
  @JsonDeserialize(contentUsing = AssetBalanceDeserializer.class)
  private List<AssetBalance> balances;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime)
        .append("balances", balances)
        .toString();
  }
}
