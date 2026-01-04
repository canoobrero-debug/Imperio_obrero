package com.gemini.empire;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Creamos un botón por código para que no falle por el XML
        Button btnAccion = new Button(this);
        btnAccion.setText("BOTÓN DE ACCIÓN COSMO");
        
        btnAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "¡EL IMPERIO ESTÁ VIVO!", Toast.LENGTH_LONG).show();
            }
        });
        
        setContentView(btnAccion);
    }
}
