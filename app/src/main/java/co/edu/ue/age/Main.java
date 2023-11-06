package co.edu.ue.age;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    private Button btnAge;
    private Button btnShop;
    private Button btnTest;
    private Button btnMasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        begin();
        goAge();
        goMasa();
        goTest();
        goShop();
    }
    private void goAge(){
        btnAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(getApplicationContext(), Age.class);
                startActivity(go);
            }
        }   //Primera forma de generar un click
      );
    }
    private void goShop(){
        //Primera forma de generar un click
        this.btnShop = findViewById(R.id.btnShop);
        btnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(getApplicationContext(), Shop.class);
                startActivity(go);
            }
        });
    }
    private void goTest(){
        //Primera forma de generar un click
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(getApplicationContext(), Test.class);
                startActivity(go);
            }
        });
    }
    private void goMasa(){
        //Primera forma de generar un click
        btnMasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(getApplicationContext(), Masa.class);
                startActivity(go);
            }
        });
    }
    private void begin(){
        btnAge = findViewById(R.id.btnAge);
        btnMasa = findViewById(R.id.btnMasa);
        btnTest = findViewById(R.id.btnTest);
    }
}
