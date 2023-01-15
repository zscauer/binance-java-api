package com.binance.api.client.domain.account;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SwapRecord {

    private String swapId;

    @Override
    public String toString() {
        return "SwapRecord{" +
                "swapId='" + swapId + '\'' +
                '}';
    }
}
