package com.digitalbrain.eletronicCash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EletronicCashTest {

    @Test
    void whenInitCach_havingOneCedule_thenDepositMoney() {
        EletronicCash eletronicCash = new EletronicCash();
        MoneyAmount moneyAmount = new MoneyAmount(Cedule.FIVE, 1);
        eletronicCash.initCash(moneyAmount);
        Assertions.assertEquals(Cedule.FIVE, eletronicCash.getMoneyAmount().getCedule());
        Assertions.assertEquals(1, eletronicCash.getMoneyAmount().getAmount());
    }
}