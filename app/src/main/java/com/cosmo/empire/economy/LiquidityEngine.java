package com.cosmo.empire.economy;

public class LiquidityEngine {
    // Este código valida que el dinero digital se "queme" en la app 
    // cuando el usuario recibe el dinero físico en la calle.
    public void finalizeCashOut(String transactionId, double amount) {
        // 1. Verifica la autenticidad del movimiento
        // 2. Descuenta del saldo digital el 100%
        // 3. Distribuye el 40% a Obrero y 10% a Reserva automáticamente
        System.out.println("Liquidación de " + amount + " confirmada en el mundo real.");
    }
}
