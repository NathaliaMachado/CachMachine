package com.digitalbrain.eletronicCash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EletronicCashTest {

    EletronicCash eletronicCash = new EletronicCash();

    @Test
    void whenInitCash_havingOneCedule_thenDepositMoney() {

        MoneyAmount moneyAmount = new MoneyAmount(Cedule.FIVE, 1);
        eletronicCash.initCash(moneyAmount);
        Assertions.assertEquals(Cedule.FIVE, eletronicCash.getMoneyAmount().getCedule());
        Assertions.assertEquals(1, eletronicCash.getMoneyAmount().getAmount());
    }

    @Test
    void whenDepositCash_havingMoreThenOneCedule_thenDepositMoney() {
        List<MoneyAmount> amount = new ArrayList<>();
        MoneyAmount n1 = new MoneyAmount(Cedule.FIFTY, 2);
        amount.add(n1);
        MoneyAmount n2 = new MoneyAmount(Cedule.TEN, 1);
        amount.add(n2);
        eletronicCash.DepositCash(amount);
        Assertions.assertEquals(true, amount.contains(n1));
        Assertions.assertEquals(true, amount.contains(n2));
    }
}