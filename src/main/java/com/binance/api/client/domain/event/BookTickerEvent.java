package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * BookTickerEvent event for a symbol. Pushes any update to the best bid or
 * ask's price or quantity in real-time for a specified symbol.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookTickerEvent {

    @JsonProperty("u")
    private long updateId;

    @JsonProperty("s")
    private String symbol;

    @JsonProperty("b")
    private String bidPrice;

    @JsonProperty("B")
    private String bidQuantity;

    @JsonProperty("a")
    private String askPrice;

    @JsonProperty("A")
    private String askQuantity;

    public BookTickerEvent() {
        super();
    }

    public BookTickerEvent(long updateId, String symbol, String bidPrice, String bidQuantity, String askPrice,
                           String askQuantity) {
        super();
        this.updateId = updateId;
        this.symbol = symbol;
        this.bidPrice = bidPrice;
        this.bidQuantity = bidQuantity;
        this.askPrice = askPrice;
        this.askQuantity = askQuantity;
    }

    public BookTickerEvent(String symbol, String bidPrice, String bidQuantity, String askPrice, String askQuantity) {
        super();
        this.symbol = symbol;
        this.bidPrice = bidPrice;
        this.bidQuantity = bidQuantity;
        this.askPrice = askPrice;
        this.askQuantity = askQuantity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("eventType", "BookTicker")
                .append("updateId", updateId).append("symbol", symbol).append("bidPrice", bidPrice)
                .append("bidQuantity", bidQuantity).append("askPrice", askPrice).append("askQuantity", askQuantity)
                .toString();
    }
}