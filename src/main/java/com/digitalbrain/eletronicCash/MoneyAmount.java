package com.digitalbrain.eletronicCash;

import lombok.Getter;

@Getter
public class MoneyAmount {

    private Cedule cedule;
    private int amount;

    public MoneyAmount(Cedule cedule, int amount) {
        this.cedule = cedule;
        this.amount = amount;
    }
}
