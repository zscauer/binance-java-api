package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TickerEvent {

    @JsonProperty("e")
    private String eventType;

    @JsonProperty("E")
    private long eventTime;

    @JsonProperty("s")
    private String symbol;

    @JsonProperty("p")
    private String priceChange;

    @JsonProperty("P")
    private String priceChangePercent;

    @JsonProperty("w")
    private String weightedAveragePrice;

    @JsonProperty("x")
    private String previousDaysClosePrice;

    @JsonProperty("c")
    private String currentDaysClosePrice;

    @JsonProperty("Q")
    private String closeTradesQuantity;

    @JsonProperty("b")
    private String bestBidPrice;

    @JsonProperty("B")
    private String bestBidQuantity;

    @JsonProperty("a")
    private String bestAskPrice;

    @JsonProperty("A")
    private String bestAskQuantity;

    @JsonProperty("o")
    private String openPrice;

    @JsonProperty("h")
    private String highPrice;

    @JsonProperty("l")
    private String lowPrice;

    @JsonProperty("v")
    private String totalTradedBaseAssetVolume;

    @JsonProperty("q")
    private String totalTradedQuoteAssetVolume;

    @JsonProperty("O")
    private long statisticsOpenTime;

    @JsonProperty("C")
    private long statisticsCloseTime;

    @JsonProperty("F")
    private long firstTradeId;

    @JsonProperty("L")
    private long lastTradeId;

    @JsonProperty("n")
    private long totalNumberOfTrades;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("eventType", eventType)
                .append("eventTime", eventTime)
                .append("symbol", symbol)
                .append("priceChange", priceChange)
                .append("priceChangePercent", priceChangePercent)
                .append("weightedAveragePrice", weightedAveragePrice)
                .append("previousDaysClosePrice", previousDaysClosePrice)
                .append("currentDaysClosePrice", currentDaysClosePrice)
                .append("closeTradesQuantity", closeTradesQuantity)
                .append("bestBidPrice", bestBidPrice)
                .append("bestBidQuantity", bestBidQuantity)
                .append("bestAskPrice", bestAskPrice)
                .append("bestAskQuantity", bestAskQuantity)
                .append("openPrice", openPrice)
                .append("highPrice", highPrice)
                .append("lowPrice", lowPrice)
                .append("totalTradedBaseAssetVolume", totalTradedBaseAssetVolume)
                .append("totalTradedQuoteAssetVolume", totalTradedQuoteAssetVolume)
                .append("statisticsOpenTime", statisticsOpenTime)
                .append("statisticsCloseTime", statisticsCloseTime)
                .append("firstTradeId", firstTradeId)
                .append("lastTradeId", lastTradeId)
                .append("totalNumberOfTrades", totalNumberOfTrades)
                .toString();
    }
}
