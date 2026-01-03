package com.cosmo.empire.loyalty;

public class LoyaltyTracker {
    // Se ejecuta tras cada regalo enviado
    public void addDonationProgress(String userId, double amount) {
        double currentTotal = getUserAccumulatedDonations(userId) + amount;
        saveProgress(userId, currentTotal);

        if (currentTotal >= 30000 && !isUserNotified(userId)) {
            sendLoyaltyNotification(userId);
        }
    }

    private void sendLoyaltyNotification(String userId) {
        // Envía mensaje interno: "¿Qué prefieres: Monedas o Dinero Real?"
        System.out.println("Usuario " + userId + " elegible para sorteo semanal.");
    }
    
    // Métodos de persistencia en la base de datos cifrada de Cosmo
    private void saveProgress(String id, double total) { /* ... */ }
    private double getUserAccumulatedDonations(String id) { return 0.0; }
    private boolean isUserNotified(String id) { return false; }
}
