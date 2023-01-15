package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Account update event which will reflect the balance changes of the account.
 * <p>
 * This event is embedded as part of a user data update event.
 *
 * @see UserDataUpdateEvent
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceUpdateEvent {

  @JsonProperty("e")
  private String eventType;

  @JsonProperty("E")
  private long eventTime;

  @JsonProperty("a")
  private String asset;

  @JsonProperty("d")
  private String balanceDelta;

  @JsonProperty("T")
  private Long clearTime;

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("eventType", eventType)
        .append("eventTime", eventTime)
        .append("balances", asset)
        .append("balanceDelta", balanceDelta)
        .append("clearTime", clearTime)
        .toString();
  }
}
