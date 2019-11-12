package com.company;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

class Main {

    @NotNull
    @Contract(pure = true)
    static String goodbye() {
        return("Goodbye, world!");
    }
}
