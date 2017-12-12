package com.boris.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserInfoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }

    public void ok(View view) {
        EditText edname = findViewById(R.id.ed_name);
        EditText edphonenumber = findViewById(R.id.ed_phonenumber);
        String name = edname.getText().toString();
        String phonenumber = edphonenumber.getText().toString();
        getIntent().putExtra("EXTRA_NAME", name);
        getIntent().putExtra("EXTRA_PHONE", phonenumber);
        setResult(RESULT_OK, getIntent());
        finish();
    }
}
