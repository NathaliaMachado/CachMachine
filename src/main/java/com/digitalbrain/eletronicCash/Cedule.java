package com.digitalbrain.eletronicCash;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Cedule {

    FIVE (5),
    TEN (10),
    TWENTY (20),
    FIFTY (50),
    HUNDRED (100);

    private final int value;
}
