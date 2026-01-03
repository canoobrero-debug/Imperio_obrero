// Shader para suavizado de piel y realce de tonos dorados
precision mediump float;
varying vec2 vTextureCoord;
uniform sampler2D sTexture;

void main() {
    vec4 color = texture2D(sTexture, vTextureCoord);
    // Ajuste de brillo para tono Oro Imperial
    color
#!/data/data/com.termux/files/usr/bin/bash

MIPMAP_ANY="/sdcard/Download/Cosmo_Zenith_Empire/app/src/main/res/mipmap-anydpi-v26"
DRAWABLE_DIR="/sdcard/Download/Cosmo_Zenith_Empire/app/src/main/res/drawable"

echo "--------------------------------------------------"
echo "INYECTANDO CÓDIGO DEL EMBLEMA TECNOLÓGICO COSMO"
echo "--------------------------------------------------"

# 1. El Fondo (Espacio Profundo con Gradiente)
cat <<EOT > "/sdcard/Download/Cosmo_Zenith_Empire/app/src/main/res/drawable/ic_launcher_background.xml"
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path
        android:fillColor="#050505"
        android:pathData="M0,0h108v108h-108z" />
</vector>
