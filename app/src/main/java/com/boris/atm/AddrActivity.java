package com.boris.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {
private Spinner spcity;
private Spinner sparea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        spcity = findViewById(R.id.sp_city);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.addr,android.R.layout.simple_list_item_1);
        //R.array用srting的內容
        spcity.setAdapter(adapter);
        spcity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String text = spcity.getSelectedItem().toString();
                if("基隆市".equals(text)){
                    sparea = findViewById(R.id.sp_area);
                    ArrayAdapter adapter = ArrayAdapter.createFromResource(AddrActivity.this,R.array.sibe,android.R.layout.simple_list_item_1);
                    sparea.setAdapter(adapter);
                }
                if("新北市".equals(text)){
                    sparea = findViewById(R.id.sp_area);
                    ArrayAdapter adapter = ArrayAdapter.createFromResource(AddrActivity.this,R.array.sibe,android.R.layout.simple_list_item_1);
                    sparea.setAdapter(adapter);
                }
                if("台北市".equals(text)){
                    sparea = findViewById(R.id.sp_area);
                    ArrayAdapter adapter = ArrayAdapter.createFromResource(AddrActivity.this,R.array.taipei,android.R.layout.simple_list_item_1);
                    sparea.setAdapter(adapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
