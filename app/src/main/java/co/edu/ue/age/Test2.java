package co.edu.ue.age;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Test2 extends AppCompatActivity {
    private Button btnSgt2;
    private Boolean check;
    private RadioButton btnPrgt3;
    private RadioButton btnPrgt3_3;
    private RadioButton btnPrgt3_2;
    private RadioButton btnPrgt4;
    private RadioButton btnPrgt4_2;
    private RadioButton btnPrgt4_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        begin();
        goTest3();

    }
    private void goTest3(){
        btnSgt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnPrgt3.isChecked()){
                    check=true;
                } else if (btnPrgt3_2.isChecked()) {
                    check=true;
                } else if (btnPrgt3_3.isChecked()) {
                    check=true;
                }if (btnPrgt4.isChecked()) {
                    check=true;
                } else if (btnPrgt4_2.isChecked()) {
                    check=true;
                } else if (btnPrgt4_3.isChecked()) {
                    check=true;
                }
                if (check){
                    Intent go = new Intent(getApplicationContext(), Test3.class);
                    startActivity(go);
                }
            }
        }
        );
    }

    private void begin() {
        btnPrgt3 = findViewById(R.id.btnPrgt3);
        btnPrgt3_2 = findViewById(R.id.btnPrgt3_2);
        btnPrgt3_3 = findViewById(R.id.btnPrgt3_3);
        btnPrgt4 = findViewById(R.id.btnPrgt4);
        btnPrgt4_2 = findViewById(R.id.btnPrgt4_2);
        btnPrgt4_3 = findViewById(R.id.btnPrgt4_3);
        btnSgt2=findViewById(R.id.btnSgt2);
    }
}


