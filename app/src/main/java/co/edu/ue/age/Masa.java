package co.edu.ue.age;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Masa extends AppCompatActivity {
    private Button btnCalculoIngles;
    private  Button btnCalculoMetrico;
    private EditText edEstatura1;
    private EditText edEstatura2;
    private EditText edPeso1;
    private EditText edPeso2;
    private TextView resultMasa;
    private TextView resultMasa2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masa);
        begin();
        btnCalculoIngles.setOnClickListener(this::CalculoIngles);
        btnCalculoMetrico.setOnClickListener(this::CalculoMetrico);

    }
    private void CalculoIngles(View view){
        int estatura1 = Integer.parseInt(edEstatura1.getText().toString());
        int peso1 = Integer.parseInt(edPeso1.getText().toString());
        int total1= ((estatura1/peso1));
        resultMasa.setText("Su masa corporal en el sistema ingles es: "+total1);

    }
    private void CalculoMetrico(View view){
        int estatura2 = Integer.parseInt(edEstatura2.getText().toString());
        int peso2 = Integer.parseInt(edPeso2.getText().toString());
        int total2= ((estatura2/peso2));
        resultMasa2.setText("Su masa corporal en el sistema métrico es: "+total2);
    }
    private void begin(){
        btnCalculoIngles=findViewById(R.id.btnCalculoIngles);
        btnCalculoMetrico=findViewById(R.id.btnCalculoMetrico);
        edEstatura1=findViewById(R.id.edEstatura1);
        edEstatura2=findViewById(R.id.edEstatura2);
        edPeso1=findViewById(R.id.edPeso1);
        edPeso2=findViewById(R.id.edPeso2);
        resultMasa=findViewById(R.id.resultMasa);
        resultMasa2=findViewById(R.id.resultMasa2);

    }
}
