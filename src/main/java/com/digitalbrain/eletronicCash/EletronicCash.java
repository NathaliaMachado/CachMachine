package com.digitalbrain.eletronicCash;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
public class EletronicCash {

    private MoneyAmount moneyAmount;
    private List<MoneyAmount> amountList;

    public void initCash(MoneyAmount moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void depositCash(List<MoneyAmount> amountList) {
        this.amountList = amountList;
    }

    public void depositCash(MoneyAmount amount) {
        initCash(amount);
    }

    public void depositCash(int valueToDeposit, MoneyAmount amount) {

        int change;
        if (valueToDeposit > amount.getCedule().getValue()) {
            change = valueToDeposit - amount.getCedule().getValue();
            cash(change);
            depositCash(amount);
        }
    }


//    public StringBuilder balance() {
//        StringBuilder builder = new StringBuilder();
//        amountList.stream().forEach(i -> {
//            builder.append(i);
//        });
//        return builder;
//    }
}
