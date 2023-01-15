package com.binance.api.client.domain.account;

import com.binance.api.client.domain.LiquidityOperationRecordStatus;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LiquidityOperationRecord {

    private String poolId;
    private String operationId;
    private String updateTime;
    private String operation;
    private String shareAmount;
    private String poolName;
    private LiquidityOperationRecordStatus status;

    @Override
    public String toString() {
        return "LiquidityOperationRecord{" +
                "poolId='" + poolId + '\'' +
                ", operationId='" + operationId + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", operation='" + operation + '\'' +
                ", shareAmount='" + shareAmount + '\'' +
                ", poolName='" + poolName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
