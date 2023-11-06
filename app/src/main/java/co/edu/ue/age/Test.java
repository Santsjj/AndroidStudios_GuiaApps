package co.edu.ue.age;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity {

    private Boolean check;
    private Button btnSgt;
    private RadioButton btnPrgt1;
    private RadioButton btnPrgt1_2;
    private RadioButton btnPrgt1_3;
    private RadioButton btnPrgt2;
    private RadioButton btnPrgt2_2;
    private RadioButton btnPrgt2_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        begin();
        goTest2();

    }
    private void goTest2(){
        btnSgt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(btnPrgt1.isChecked()){
                        check=true;
                    } else if (btnPrgt1_2.isChecked()) {
                        check=true;

                    } else if (btnPrgt1_3.isChecked()) {
                        check=true;

                    }if (btnPrgt2.isChecked()) {
                        check=true;

                    } else if (btnPrgt2_2.isChecked()) {
                        check=true;

                    } else if (btnPrgt2_3.isChecked()) {
                        check=true;
                    }
                    if (check){
                        Intent go = new Intent(getApplicationContext(), Test2.class);
                        startActivity(go);
                    }
                }
            }
        );
    }
    private void begin(){
        btnSgt=findViewById(R.id.btnSgt);
        btnPrgt1=findViewById(R.id.btnPrgt1);
        btnPrgt1_2=findViewById(R.id.btnPrgt1_2);
        btnPrgt1_3=findViewById(R.id.btnPrgt1_3);
        btnPrgt2=findViewById(R.id.btnPrgt2);
        btnPrgt2_2=findViewById(R.id.btnPrgt2_2);
        btnPrgt2_3=findViewById(R.id.btnPrgt2_3);
    }
}
