package com.cosmo.empire.economy;

public class DynamicWithdrawalManager {
    
    // Verifica el umbral según la historia del usuario
    public boolean canUserWithdraw(String userId, double currentBalance, boolean hasWithdrawnBefore) {
        double requiredAmount;

        if (!hasWithdrawnBefore) {
            // Meta inicial para nuevos usuarios
            requiredAmount = 100.00;
        } else {
            // Beneficio de veterano tras el primer retiro exitoso
            requiredAmount = 50.00;
        }

        return currentBalance >= requiredAmount;
    }

    public void onWithdrawalSuccess(String userId) {
        // Marca al usuario como 'Verificado' para bajarle el mínimo a 50 para siempre
        updateUserStatusInVault(userId, "VETERAN_STATUS");
    }

    private void updateUserStatusInVault(String id, String status) {
        // Guarda el estatus en los archivos indescifrables
    }
}
