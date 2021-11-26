package com.digitalbrain.eletronicCash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EletronicCashTest {

    EletronicCash eletronicCash = new EletronicCash();
    List<MoneyBill> moneyBillList = new ArrayList<>();

    @Test
    void whenInitCash_havingOneCedule_thenDepositMoney() {

        MoneyBill moneyAmount = new MoneyBill(MoneyBillEnum.FIVE, 1);
        eletronicCash.initCash(moneyAmount);
        Assertions.assertEquals(1, eletronicCash.getMoneyAmount().getAmountMap().get(MoneyBillEnum.FIVE));
    }

//    @Test
//    void whenDepositCash_havingMoreThenOneCedule_thenDepositMoney() {
//
//        MoneyAmount d1 = new MoneyAmount(MoneyBillEnum.FIFTY, 2);
//        moneyBillList.add(d1);
//        MoneyAmount d2 = new MoneyAmount(MoneyBillEnum.TEN, 1);
//        moneyBillList.add(d2);
//        eletronicCash.initCash(moneyBillList);
//        Assertions.assertEquals(moneyBillList, eletronicCash.getAmountList());
//    }
//
//    @Test
//    void whenInitCash_havingTwoDeposits_thenDepositMoney() {
//        MoneyAmount d1 = new MoneyAmount(MoneyBillEnum.FIVE, 1);
//        MoneyAmount d2 = new MoneyAmount(MoneyBillEnum.FIVE, 2);
//        MoneyAmount d3 = new MoneyAmount(MoneyBillEnum.TEN, 1);
//
//        eletronicCash.initCash(d1);
//        moneyBillList.add(d2);
//        moneyBillList.add(d3);
//        eletronicCash.initCash(moneyBillList);
//        Assertions.assertEquals(3, eletronicCash.findCedule(MoneyBillEnum.FIVE).getAmount());
//    }
//
//   @Test
//    void whenDepositCash_havingToGiveChange_thenDepositMoneyAndReturnChange() {
//
//        MoneyAmount d1 = new MoneyAmount(MoneyBillEnum.FIFTY, 1);
//        MoneyBillEnum moneyBillEnum = eletronicCash.deposit(10d, d1);
//        Assertions.assertEquals(MoneyBillEnum.TWENTY.getValue(), moneyBillEnum.getValue());
//    }

}