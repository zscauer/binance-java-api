package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Represents an executed trade history item.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TradeHistoryItem {
    /**
     * Trade id.
     */
    private long id;

    /**
     * Price.
     */
    private String price;

    /**
     * Quantity.
     */
    private String qty;

    /**
     * Trade execution time.
     */
    private long time;

    /**
     * Is buyer maker ?
     */
    @JsonProperty("isBuyerMaker")
    private boolean isBuyerMaker;

    /**
     * Is best match ?
     */
    @JsonProperty("isBestMatch")
    private boolean isBestMatch;

    public boolean isBuyerMaker() {
        return isBuyerMaker;
    }

    public void setBuyerMaker(boolean buyerMaker) {
        isBuyerMaker = buyerMaker;
    }

    public boolean isBestMatch() {
        return isBestMatch;
    }

    public void setBestMatch(boolean bestMatch) {
        isBestMatch = bestMatch;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("id", id)
            .append("price", price)
            .append("qty", qty)
            .append("time", time)
            .append("isBuyerMaker", isBuyerMaker)
            .append("isBestMatch", isBestMatch)
            .toString();
    }
}
