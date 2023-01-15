package com.binance.api.client.domain.account;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubAccountTransfer {

    /**
     * Counter party name
     */
    private String counterParty;

    /**
     * Counter party email
     */
    private String email;

    /**
     * Transfer in or transfer out
     */
    private Integer type; // 1 for transfer in, 2 for transfer out

    /**
     * Transfer asset
     */
    private String asset;

    /**
     * Quantity of transfer asset
     */
    private String qty;

    /**
     * Type of from account
     */
    private String fromAccountType;

    /**
     * Type of to account
     */
    private String toAccountType;

    /**
     * Transfer status
     */
    private String status;

    /**
     * Transfer ID
     */
    private Long tranId;

    /**
     * Transfer time
     */
    private Long time;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("counterParty", this.counterParty)
                .append("email", this.email)
                .append("type", this.type)
                .append("asset", this.asset)
                .append("qty", this.qty)
                .append("fromAccountType", this.fromAccountType)
                .append("toAccountType", this.toAccountType)
                .append("status", this.status)
                .append("tranId", this.tranId)
                .append("time", this.time)
                .toString();
    }

}