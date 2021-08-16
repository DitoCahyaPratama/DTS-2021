package com.doyatama.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listing;
    String []list = new String[]{"Indonesia","Malaysia","Singapore","Italia","Inggris","Belanda","Argentina","Chile","Mesir","Uganda"};
    String []listIbukota = new String[]{"Jakarta","Kuala Lumpur","Singapore","Roma","London","Amsterdam","Buenos Aires","Santiago de Chile","Kairo","Kampala"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listing = (ListView) findViewById(R.id.listNegara);
        final ArrayAdapter<String> adapter= new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, android.R.id.text1,list);
        listing.setAdapter(adapter);
        listing.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Negara yang dipilih "+ adapter.getItem(position) + " ibukotanya "+listIbukota[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}