package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * A withdraw result that was done to a Binance account.
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WithdrawResult {

    /**
     * Withdraw message.
     */
    private String msg;

    /**
     * Withdraw success.
     */
    private boolean success;

    /**
     * Withdraw id.
     */
    private String id;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("msg", msg)
                .append("success", success)
                .append("id", id)
                .toString();
    }


}
