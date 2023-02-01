package com.binance.api.client.domain;

public interface Candle {

    String getOpen();

    String getHigh();

    String getLow();

    String getClose();

    Long getOpenTime();

    Long getCloseTime();

    String getVolume();

    String getQuoteAssetVolume();

    Long getNumberOfTrades();

}
