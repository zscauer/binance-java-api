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

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public void setStatus(SymbolStatus status) {
    this.status = status;
  }

  public void setBaseAsset(String baseAsset) {
    this.baseAsset = baseAsset;
  }

  public void setBaseAssetPrecision(Integer baseAssetPrecision) {
    this.baseAssetPrecision = baseAssetPrecision;
  }

  public void setQuoteAsset(String quoteAsset) {
    this.quoteAsset = quoteAsset;
  }

  public void setQuotePrecision(Integer quotePrecision) {
    this.quotePrecision = quotePrecision;
  }

  public void setOrderTypes(List<OrderType> orderTypes) {
    this.orderTypes = orderTypes;
  }

  public void setIcebergAllowed(boolean icebergAllowed) {
    this.icebergAllowed = icebergAllowed;
  }

  public void setOcoAllowed(boolean ocoAllowed) {
    this.ocoAllowed = ocoAllowed;
  }

  public void setQuoteOrderQtyMarketAllowed(boolean quoteOrderQtyMarketAllowed) {
    this.quoteOrderQtyMarketAllowed = quoteOrderQtyMarketAllowed;
  }

  public void setIsSpotTradingAllowed(boolean isSpotTradingAllowed) {
    this.isSpotTradingAllowed = isSpotTradingAllowed;
  }

  public boolean isMarginTradingAllowed() {
    return isMarginTradingAllowed;
  }

  public void setAllowTrailingStop(boolean allowTrailingStop) {
    this.allowTrailingStop = allowTrailingStop;
  }

  public List<SymbolFilter> getFilters() {
    return filters;
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
        .append("ocoAllowed", ocoAllowed)
        .append("quoteOrderQtyMarketAllowed", quoteOrderQtyMarketAllowed)
        .append("isSpotTradingAllowed", isSpotTradingAllowed)
        .append("isMarginTradingAllowed", isMarginTradingAllowed)
        .append("allowTrailingStop", allowTrailingStop)
        .append("filters", filters)
        .toString();
  }
}
