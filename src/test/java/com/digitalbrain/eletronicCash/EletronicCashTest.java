package com.digitalbrain.eletronicCash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EletronicCashTest {

    EletronicCash eletronicCash = new EletronicCash();
    List<MoneyAmount> amount = new ArrayList<>();

    @Test
    void whenInitCash_havingOneCedule_thenDepositMoney() {

        MoneyAmount moneyAmount = new MoneyAmount(Cedule.FIVE, 1);
        eletronicCash.initCash(moneyAmount);
        Assertions.assertEquals(Cedule.FIVE, eletronicCash.getAmountList().get(0).getCedule());
        Assertions.assertEquals(1, eletronicCash.getAmountList().get(0).getAmount());
    }

    @Test
    void whenDepositCash_havingMoreThenOneCedule_thenDepositMoney() {

        MoneyAmount d1 = new MoneyAmount(Cedule.FIFTY, 2);
        amount.add(d1);
        MoneyAmount d2 = new MoneyAmount(Cedule.TEN, 1);
        amount.add(d2);
        eletronicCash.initCash(amount);
        Assertions.assertEquals(amount, eletronicCash.getAmountList());
    }

    @Test
    void whenIinitCash_havingTwoDeposits_thenDepositMoney() {
        MoneyAmount d1 = new MoneyAmount(Cedule.FIVE, 1);
        MoneyAmount d2 = new MoneyAmount(Cedule.FIVE, 2);
        MoneyAmount d3 = new MoneyAmount(Cedule.TEN, 1);

        eletronicCash.initCash(d1);
        amount.add(d2);
        amount.add(d3);
        eletronicCash.initCash(amount);
        Assertions.assertEquals(3, eletronicCash.findCedule(Cedule.FIVE).getAmount());
    }

//    @Test
//    void whenDepositCash_havingToGiveChange_thenDepositMoneyAndReturnChange() {
//        //
//        MoneyAmount d1 = new MoneyAmount(Cedule.FIFTY, 1);
//        eletronicCash.initCash(30, d1);
//        Assertions.assertEquals(amount, eletronicCash.getAmountList());
//
//    }

}