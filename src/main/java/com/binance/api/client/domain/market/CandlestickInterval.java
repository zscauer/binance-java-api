package com.binance.api.client.domain.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

/**
 * Kline/Candlestick intervals.
 * m -> minutes; h -> hours; d -> days; w -> weeks; M -> months
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public enum CandlestickInterval {
    ONE_MINUTE("1m"),
    THREE_MINUTES("3m"),
    FIVE_MINUTES("5m"),
    FIFTEEN_MINUTES("15m"),
    HALF_HOURLY("30m"),
    HOURLY("1h"),
    TWO_HOURLY("2h"),
    FOUR_HOURLY("4h"),
    SIX_HOURLY("6h"),
    EIGHT_HOURLY("8h"),
    TWELVE_HOURLY("12h"),
    DAILY("1d") {
        @Override
        String getDurationIntervalPrefix() {
            return "";
        }
    },
    THREE_DAILY("3d") {
        @Override
        String getDurationIntervalPrefix() {
            return "";
        }
    },
    WEEKLY("1w"),
    MONTHLY("1M");

    private final String intervalId;

    CandlestickInterval(String intervalId) {
        this.intervalId = intervalId;
    }

    String getDurationIntervalPrefix() {
        return "T";
    }

    public String getDurationIntervalId() {
        return "P" + getDurationIntervalPrefix() + intervalId;
    }

}
