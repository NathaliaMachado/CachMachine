package com.digitalbrain.eletronicCash;

import lombok.Data;

@Data
public class MoneyAmount {

    private Cedule cedule;
    private int amount;

    public MoneyAmount(Cedule cedule, int amount) {
        this.cedule = cedule;
        this.amount = amount;
    }
}
