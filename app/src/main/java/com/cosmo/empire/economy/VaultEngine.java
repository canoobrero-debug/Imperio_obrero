package com.cosmo.empire.economy;

public class VaultEngine {
    private double obreroBalance = 0.0;
    private double reserveBalance = 0.0;

    public void processTransaction(double amount) {
        this.obreroBalance += (amount * 0.40);
        this.reserveBalance += (amount * 0.10);
        // El resto va a la piscina de liquidez para pagos
    }

    public boolean validateWithdrawal(double balance, boolean isNew) {
        double limit = isNew ? 100.0 : 50.0;
        return balance >= limit;
    }
}
