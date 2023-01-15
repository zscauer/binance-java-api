package com.binance.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Time of the server running Binance's REST API.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServerTime {
  private Long serverTime;

  @Override
  public String toString() {
    return String.valueOf(serverTime);
  }
}
