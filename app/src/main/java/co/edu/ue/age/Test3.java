package co.edu.ue.age;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Test3 extends AppCompatActivity {
    private Boolean check;
    private Button btnFin;
    private RadioButton btnPrgt1;
    private TextView resultado;
    private RadioButton btnPrgt2;
    private RadioButton btnPrgt3_3;
    private RadioButton btnPrgt4_3;
    private RadioButton btnPrgt5;
    private RadioButton btnPrgt5_2;
    private RadioButton btnPrgt5_3;
    private RadioButton btnPrgt6;
    private RadioButton btnPrgt6_2;
    private RadioButton btnPrgt6_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test3);
        begin();
        finTest();

    }
    private void finTest(){
        btnFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnPrgt1.isChecked()&& btnPrgt2.isChecked()&&btnPrgt3_3.isChecked()&&btnPrgt4_3.isChecked()&&btnPrgt5.isChecked()&&btnPrgt6_2.isChecked()) {
                    resultado.setText("Todas las respuetsas están correctas :)");

                }else {
                    resultado.setText("Quedo una o más respuestas mal");

                }

            }
        }
        );
    }

    private void begin() {
        btnPrgt1=findViewById(R.id.btnPrgt1);
        btnPrgt2=findViewById(R.id.btnPrgt2);
        btnPrgt3_3=findViewById(R.id.btnPrgt3_3);
        btnPrgt4_3=findViewById(R.id.btnPrgt4_3);
        resultado =findViewById(R.id.txresultado);
        btnPrgt5=findViewById(R.id.btnPrgt5);
        btnPrgt5_2=findViewById(R.id.btnPrgt5_2);
        btnPrgt5_3=findViewById(R.id.btnPrgt5_3);
        btnPrgt6=findViewById(R.id.btnPrgt6);
        btnPrgt6_2=findViewById(R.id.btnPrgt6_2);
        btnPrgt6_3=findViewById(R.id.btnPrgt6_3);
        btnFin=findViewById(R.id.btnFin);
    }



}
