package com.cosmo.empire.notifications;

public class GlobalNotificationSystem {
    // Esta función se activa cuando la Piscina recibe un regalo Imperial
    public void broadcastImperialGift(String senderName, double amount) {
        if (amount >= 50000) {
            // Activa el banner en TODAS las sesiones activas de Cosmo
            String msg = "¡" + senderName + " HA ENVIADO UN REGALO IMPERIAL!";
            showBannerGlobally(msg);
        }
    }

    private void showBannerGlobally(String message) {
        // Código que conecta con el servidor en la nube para bajar el banner
        // a todos los teléfonos de los usuarios al mismo tiempo.
    }
}
