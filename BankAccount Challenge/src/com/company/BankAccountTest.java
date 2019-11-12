package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

//    @BeforeEach
//    void setup() throws Exception {
//        BankAccount account1 = new BankAccount();
//    }

    @Test
    void defaultBalance(){
        BankAccount account1 = new BankAccount();
        int balance = account1.balance;
        assertEquals(0, balance);
    }

    @Test
    void deposit(){
        BankAccount account1 = new BankAccount();
        assertEquals("Successfully Deposited", account1.deposit(10));
        assertEquals(10, account1.balance);
    }

    @Test
    void withdraw(){
        BankAccount account1 = new BankAccount();
        assertEquals("Successfully Withdrawn", account1.withdraw(10));
        assertEquals(-10, account1.balance);
    }

}