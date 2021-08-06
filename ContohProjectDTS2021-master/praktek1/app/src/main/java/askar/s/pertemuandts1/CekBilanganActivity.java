package askar.s.pertemuandts1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CekBilanganActivity extends AppCompatActivity {

    EditText editTextBil1, editTextBil2;
    Button buttonCheck, buttonChange;
    TextView textDescription;

    int inputBil1, inputBil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_bilangan);

        editTextBil1 = findViewById(R.id.editTextBil1);
        editTextBil2 = findViewById(R.id.editTextBil2);
        buttonCheck = findViewById(R.id.buttonCheck);
        buttonChange = findViewById(R.id.buttonChange);
        textDescription = findViewById(R.id.textDescription);

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputBil1 = Integer.parseInt(editTextBil1.getText().toString());
                inputBil2 = Integer.parseInt(editTextBil2.getText().toString());

                if(inputBil1 > inputBil2){
                    textDescription.setText("Keterangan : Bilangan "+String.valueOf(inputBil1)+" lebih besar dari "+String.valueOf(inputBil2));
                }else if(inputBil1 < inputBil2){
                    textDescription.setText("Keterangan : Bilangan "+String.valueOf(inputBil1)+" lebih kecil dari "+String.valueOf(inputBil2));
                }else{
                    textDescription.setText("Keterangan : Bilangan "+String.valueOf(inputBil1)+" sama dengan "+String.valueOf(inputBil2));
                }
            }
        });

        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CekBilanganActivity.this, "Soal no 1!", Toast.LENGTH_SHORT).show();
                Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                MainActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(MainActivity);
                finish();
            }
        });
    }
}