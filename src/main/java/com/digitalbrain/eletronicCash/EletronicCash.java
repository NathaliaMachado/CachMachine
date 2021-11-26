package com.digitalbrain.eletronicCash;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class EletronicCash {

    MoneyAmount moneyAmount = new MoneyAmount();

    public void initCash(MoneyBill moneyBill) {
        add(Arrays.asList(moneyBill));
    }

    public void initCash(List<MoneyBill> moneyBillList) {
        add(moneyBillList);
    }

    private void add(List<MoneyBill> moneyBillList) {
        moneyBillList.stream().forEach(moneyBill -> {
            Integer found = moneyAmount.getAmountMap().get(moneyBill.getBillType());
            moneyAmount.getAmountMap().put(moneyBill.getBillType(), moneyBill.getAmount() + found);
        });
    }

//    public MoneyBillEnum deposit(Double valuePaid, MoneyAmount deposit) {
//        Double total = deposit.getMoneyBillType().getValue() - valuePaid;
//        MoneyAmount amount = findCedule(MoneyBillEnum.TWENTY);
//        if (amount != null) {
//            MoneyAmount change = amount;
//            amountList
//            return ;
//        }
//    }


//    public StringBuilder balance() {
//        StringBuilder builder = new StringBuilder();
//        amountList.stream().forEach(i -> {
//            builder.append(i);
//        });
//        return builder;
//    }
}
