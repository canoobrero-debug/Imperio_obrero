package com.cosmo.empire.actors;

public class GiftActor {
    // Identifica el tipo de regalo y su valor en la Piscina
    public void onGiftReceived(String giftId, double marketValue) {
        // 1. Activa la animación visual para el Host
        triggerImperialAnimation(giftId);
        
        // 2. Envía el valor bruto a la Piscina de Liquidez para limpieza
        // Aquí se aplica tu 40% y el 10% de reserva
        processToCloudPool(marketValue);
    }

    private void triggerImperialAnimation(String id) {
        // Lógica para mostrar coronas, autos o diamantes en pantalla
    }

    private void processToCloudPool(double val) {
        // Conexión directa con el CloudLiquidityPool que creamos antes
    }
}
