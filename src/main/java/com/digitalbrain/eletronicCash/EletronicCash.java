package com.digitalbrain.eletronicCash;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class EletronicCash {

    private List<MoneyAmount> amountList = new ArrayList<>();

    public void initCash(MoneyAmount moneyAmount) {
        add(Arrays.asList(moneyAmount));
    }


    public void initCash(List<MoneyAmount> amountList) {
        add(amountList);
    }

    public MoneyAmount findCedule(Cedule cedule) {
        for (int i = 0; i < amountList.size(); i++) {
            if (amountList.get(i).getCedule() == cedule) {
                return amountList.get(i);
            }
        }
        return null;
    }

    private void add(List<MoneyAmount> list) {
        list.stream().forEach(amount -> {
            MoneyAmount found = findCedule(amount.getCedule());

            if (found != null) {
                int sum = amount.getAmount() + found.getAmount();
                found.setAmount(sum);
            } else {
                this.amountList.add(amount);
            }
        });
    }



    public void initCash(int valueToDeposit, MoneyAmount amount) {

        int change;
        if (valueToDeposit > amount.getCedule().getValue()) {
            change = valueToDeposit - amount.getCedule().getValue();
       //     cash(change);
            this.initCash(amount);
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
