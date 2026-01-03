package com.cosmo.empire.ranking;

import java.util.List;

public class RankingManager {
    // Registra la donación y actualiza la posición en el ranking global
    public void updateDonationRecord(String userId, double amount) {
        // 1. Suma el monto al registro del usuario
        // 2. Si entra al Top 10, se prepara para el Banner Global
        checkIfTopDonator(userId, amount);
    }

    private void checkIfTopDonator(String id, double total) {
        // Lógica para comparar con los líderes actuales
        // Si el usuario llega al puesto #1, se dispara una notificación
        System.out.println("Actualizando posición de: " + id);
    }
}
