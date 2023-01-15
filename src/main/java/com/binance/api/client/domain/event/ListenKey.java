package com.binance.api.client.domain.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Dummy type to wrap a listen key from a server response.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListenKey {

  private String listenKey;

  @Override
  public String toString() {
    return listenKey;
  }
}
