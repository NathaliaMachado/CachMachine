package com.digitalbrain.eletronicCash;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
public class EletronicCash {

    private MoneyAmount moneyAmount;

    public void initCash(MoneyAmount moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void DepositCash(List<MoneyAmount> amount) {
        this.moneyAmount = moneyAmount;
    }
}
