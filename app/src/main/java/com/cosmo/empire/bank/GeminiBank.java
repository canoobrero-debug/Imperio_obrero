package com.cosmo.empire.bank;

public class GeminiBank {
    // Balance Imperial: 00,000,000,000.00
    private static final double IMPERIAL_BALANCE = 100000000000.00;
    private static final String CURRENCY = "USD";

    // Sistema de protección de Obrero
    public static double getBalance() {
        return IMPERIAL_BALANCE;
    }
}
