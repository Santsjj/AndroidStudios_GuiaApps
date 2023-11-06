package co.edu.ue.age;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Age extends AppCompatActivity {
private EditText edAño;
private EditText edAñoNac;
private TextView resultado;
private Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.age);
        begin();
        btnCalcular.setOnClickListener(this::CacularEdad);

    }
    private void CacularEdad(View view){
        int año = Integer.parseInt(edAño.getText().toString());
        int añoNac = Integer.parseInt(edAñoNac.getText().toString());
        int edad = ((año-añoNac));
        resultado.setText("Su edad es: "+edad);

    }
    private void begin(){
        edAño = findViewById(R.id.edAño);
        edAñoNac=findViewById(R.id.edAñoNac);
        resultado = findViewById(R.id.tvResultado);
        btnCalcular=findViewById(R.id.btnCalcular);
    }
}