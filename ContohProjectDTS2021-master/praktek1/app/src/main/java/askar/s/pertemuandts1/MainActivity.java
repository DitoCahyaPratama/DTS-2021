package askar.s.pertemuandts1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextJari;
    TextView textViewKeliling, textViewJari, textViewLuas;
    Button buttonHitung, buttonChange;
    float  inputJarijari;
    double keliling;
    double luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextJari =  findViewById(R.id.editTextjari);
        textViewJari = findViewById(R.id.textViewJari);
        textViewKeliling = findViewById(R.id.textViewKeliling);
        textViewLuas = findViewById(R.id.textViewLuas);
        buttonHitung = findViewById(R.id.buttonHitung);
        buttonChange = findViewById(R.id.buttonChange);


        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputJarijari = Float.parseFloat(editTextJari.getText().toString()) ;

                textViewJari.setText("Jari-jari : "+String.valueOf(inputJarijari));

                keliling  =  inputJarijari*2* Math.PI;
                textViewKeliling.setText( "Keliling : "+String.valueOf(keliling) );

                luas  =  Math.pow(inputJarijari,2)* Math.PI;
                textViewLuas.setText( "Luas : "+String.valueOf(luas) );
            }
        });

        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Soal no 2!", Toast.LENGTH_SHORT).show();
                Intent MainActivity = new Intent(getApplicationContext(), CekBilanganActivity.class);
                MainActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(MainActivity);
                finish();
            }
        });
    }
}
