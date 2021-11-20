package com.digitalbrain.eletronicCash;

import lombok.Data;
import lombok.Getter;

@Getter
public class EletronicCash {

    private MoneyAmount moneyAmount;

    public void initCash(MoneyAmount moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}
