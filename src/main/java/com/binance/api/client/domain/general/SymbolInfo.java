package com.binance.api.client.domain.general;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.OrderType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Symbol information (base/quote).
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SymbolInfo {

  private String symbol;

  private SymbolStatus status;

  private String baseAsset;

  private Integer baseAssetPrecision;

  private String quoteAsset;

  private Integer quotePrecision;

  private List<OrderType> orderTypes;

  private boolean icebergAllowed;

  private boolean ocoAllowed;

  private boolean quoteOrderQtyMarketAllowed;

  private boolean isSpotTradingAllowed;

  private boolean isMarginTradingAllowed;

  private boolean allowTrailingStop;

  private List<SymbolFilter> filters;

  public boolean isSpotTradingAllowed() {
    return isSpotTradingAllowed;
  }

  public boolean isMarginTradingAllowed() {
    return isMarginTradingAllowed;
  }

  public boolean trailingStopIsAllowed() {
    return allowTrailingStop;
  }

  /**
   * @param filterType filter type to filter for.
   * @return symbol filter information for the provided filter type.
   */
  public SymbolFilter getSymbolFilter(FilterType filterType) {
    return filters.stream()
        .filter(symbolFilter -> symbolFilter.getFilterType() == filterType)
        .findFirst()
        .get();
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("symbol", symbol)
        .append("status", status)
        .append("baseAsset", baseAsset)
        .append("baseAssetPrecision", baseAssetPrecision)
        .append("quoteAsset", quoteAsset)
        .append("quotePrecision", quotePrecision)
        .append("orderTypes", orderTypes)
        .append("icebergAllowed", icebergAllowed)
        .append("filters", filters)
        .toString();
  }
}
