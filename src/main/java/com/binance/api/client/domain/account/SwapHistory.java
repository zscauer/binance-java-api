package com.binance.api.client.domain.account;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SwapHistory {

    private String quoteQty;
    private Long swapTime;
    private String swapId;
    private String price;
    private String fee;
    private String baseQty;
    private String baseAsset;
    private String quoteAsset;
    private SwapStatus status;

    @Override
    public String toString() {
        return "SwapHistory{" +
                "quoteQty='" + quoteQty + '\'' +
                ", swapTime=" + swapTime +
                ", swapId='" + swapId + '\'' +
                ", price='" + price + '\'' +
                ", fee='" + fee + '\'' +
                ", baseQty='" + baseQty + '\'' +
                ", baseAsset='" + baseAsset + '\'' +
                ", quoteAsset='" + quoteAsset + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
