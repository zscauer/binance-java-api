package com.binance.api.client.domain.account;

import com.binance.api.client.domain.LoanStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Repay {

    private String amount;
    private String asset;
    private String interest;
    private String principal;
    LoanStatus status;
    private long timestamp;
    private String txId;

    @Override
    public String toString() {
        return "Repay{" +
                "amount='" + amount + '\'' +
                ", asset='" + asset + '\'' +
                ", interest='" + interest + '\'' +
                ", principal='" + principal + '\'' +
                ", status=" + status +
                ", timestamp=" + timestamp +
                ", txId='" + txId + '\'' +
                '}';
    }
}
