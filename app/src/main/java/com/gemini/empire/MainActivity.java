package com.gemini.empire;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Creamos el botón directamente para que no dependa de archivos externos
        Button btn = new Button(this);
        btn.setText("ACTIVAR IMPERIO COSMO");
        btn.setBackgroundColor(Color.BLUE);
        btn.setTextColor(Color.WHITE);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "¡BOTÓN FUNCIONANDO: ACCESO CONCEDIDO!", Toast.LENGTH_LONG).show();
            }
        });
        
        setContentView(btn);
    }
}
