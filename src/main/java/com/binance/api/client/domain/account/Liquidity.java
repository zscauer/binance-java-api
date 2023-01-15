package com.binance.api.client.domain.account;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Setter
@Getter
public class Liquidity {

    private String poolId;
    private String poolName;
    private Long updateTime;
    private Map<String, String> liquidity;
    private Share share;

    public static class Share {
        private double shareAmount;
        private double sharePercentage;
        private Map<String, String> asset;

        public double getShareAmount() {
            return shareAmount;
        }

        public void setShareAmount(double shareAmount) {
            this.shareAmount = shareAmount;
        }

        public double getSharePercentage() {
            return sharePercentage;
        }

        public void setSharePercentage(double sharePercentage) {
            this.sharePercentage = sharePercentage;
        }

        public Map<String, String> getAsset() {
            return asset;
        }

        public void setAsset(Map<String, String> asset) {
            this.asset = asset;
        }

        @Override
        public String toString() {
            return "Share{" +
                    "shareAmount=" + shareAmount +
                    ", sharePercentage=" + sharePercentage +
                    ", asset=" + asset +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Liquidity{" +
                "poolId=" + poolId +
                ", poolName='" + poolName + '\'' +
                ", updateTime=" + updateTime +
                ", liquidity=" + liquidity +
                ", share=" + share +
                '}';
    }
}