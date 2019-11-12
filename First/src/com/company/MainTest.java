package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    @Test
    void main_outputsToCommandLine_String(){
        Main main = new Main();

        assertEquals("Goodbye, world!", Main.goodbye());
    }
}
