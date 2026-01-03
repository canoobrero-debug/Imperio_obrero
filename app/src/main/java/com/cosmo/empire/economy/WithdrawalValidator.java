package com.cosmo.empire.economy;

public class WithdrawalValidator {
    // Ajustado de 100.00 a 50.00 por orden de Obrero
    private static final double MIN_WITHDRAWAL = 50.00;

    public void checkEligibility(double userRealBalance) {
        // El sistema ahora libera el dinero mucho más rápido
        if (userRealBalance >= MIN_WITHDRAWAL) {
            enableGoldenButton();
        }
    }

    private void enableGoldenButton() {
        // Activa el botón de retiro en la interfaz del usuario
        // Cambia el color a Oro Imperial (#FFD700)
    }
}
