package com.digitalbrain.eletronicCash;


import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class MoneyAmount {

    private Map<MoneyBillEnum, Integer> amountMap = new HashMap<MoneyBillEnum, Integer>();

    public MoneyAmount() {
        amountMap.put(MoneyBillEnum.FIVE, new Integer(0));
        amountMap.put(MoneyBillEnum.TEN, new Integer(0));
        amountMap.put(MoneyBillEnum.TWENTY, new Integer(0));
        amountMap.put(MoneyBillEnum.FIFTY, new Integer(0));
        amountMap.put(MoneyBillEnum.HUNDRED, new Integer(0));
    }

    public MoneyAmount(List<MoneyBill> amountList) {
        for (int i = 0; i < amountList.size(); i++) {
            amountMap.put(amountList.get(i).getBillType(), amountList.get(i).getAmount());
        }
    }
}
