package com.binance.api.client.domain.account;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SwapQuote {
    private String quoteQty;
    private String price;
    private String fee;
    private String baseQty;
    private String baseAsset;
    private String slippage;
    private String quoteAsset;

    @Override
    public String toString() {
        return "SwapQuote{" +
                "quoteQty='" + quoteQty + '\'' +
                ", price='" + price + '\'' +
                ", fee='" + fee + '\'' +
                ", baseQty='" + baseQty + '\'' +
                ", baseAsset='" + baseAsset + '\'' +
                ", slippage='" + slippage + '\'' +
                ", quoteAsset='" + quoteAsset + '\'' +
                '}';
    }
}

