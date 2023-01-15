package com.binance.api.client.domain.account;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Dust transfer result information.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransferResult {

    private String amount;

    private String fromAsset;

    /**
     * Order timestamp.
     */
    private long operateTime;

    private String serviceChargeAmount;

    private long tranId;

    private String transferedAmount;


    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("amount", amount)
                .append("fromAsset", fromAsset)
                .append("operateTime", operateTime)
                .append("serviceChargeAmount", serviceChargeAmount)
                .append("tranId", tranId)
                .append("transderedAmount", transferedAmount)
                .toString();
    }

}