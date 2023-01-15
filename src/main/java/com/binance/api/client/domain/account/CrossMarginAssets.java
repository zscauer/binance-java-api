package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossMarginAssets {

    public String assetFullName;
    public String assetName;
    public boolean isBorrowable;
    public boolean isMortgageable;
    public String userMinBorrow;
    public String userMinRepay;

    public boolean isBorrowable() {
        return isBorrowable;
    }

    public void setBorrowable(boolean borrowable) {
        isBorrowable = borrowable;
    }

    public boolean isMortgageable() {
        return isMortgageable;
    }

    public void setMortgageable(boolean mortgageable) {
        isMortgageable = mortgageable;
    }

    @Override
    public String toString() {
        return "CrossMarginAssets{" +
                "assetFullName='" + assetFullName + '\'' +
                ", assetName='" + assetName + '\'' +
                ", isBorrowable=" + isBorrowable +
                ", isMortgageable=" + isMortgageable +
                ", userMinBorrow='" + userMinBorrow + '\'' +
                ", userMinRepay='" + userMinRepay + '\'' +
                '}';
    }
}
