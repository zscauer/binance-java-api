package com.binance.api.client.domain.account;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Pool {

    private String poolId;
    private String poolName;
    private List<String> assets;

    @Override
    public String toString() {
        return "Pool{" +
                "poolId='" + poolId + '\'' +
                ", poolName='" + poolName + '\'' +
                ", assets=" + assets +
                '}';
    }
}
