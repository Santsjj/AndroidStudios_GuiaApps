package co.edu.ue.age;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Shop extends AppCompatActivity {
    private Button btnCliente;
    private EditText edName;
    private EditText edLastname;
    private EditText edAdress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        begin();
        btnCliente.setOnClickListener(this::createClient);
    }
    private void irResultado(Client cliente) {
        Intent result = new Intent(getApplicationContext(),Shop1.class);
        result.putExtra("objeto",cliente);
        startActivity(result);
    }
    private void createClient(View view){
        Client cliente = new Client(edName.getText().toString(),edLastname.getText().toString(),edAdress.getText().toString());
        irResultado(cliente);
    }
    private void begin(){
        btnCliente = findViewById(R.id.btnCliente);
        edName = findViewById(R.id.edName);
        edLastname = findViewById(R.id.edLastname);
        edAdress = findViewById(R.id.edAdress);
    }
}
