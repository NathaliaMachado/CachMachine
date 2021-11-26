package com.digitalbrain.eletronicCash;

import lombok.Data;

@Data
public class MoneyBill {

    private MoneyBillEnum billType;
    private Integer amount;

    public MoneyBill(MoneyBillEnum billType, Integer amount) {
        this.billType = billType;
        this.amount = amount;
    }
}
