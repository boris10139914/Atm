package com.boris.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserInfoActivity extends AppCompatActivity {


    private EditText edName;
    private EditText edPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        String name = getSharedPreferences("atm", MODE_PRIVATE)
                .getString("NickName", "");
        String phone = getSharedPreferences("atm", MODE_PRIVATE)
                .getString("Phone", "");

        edName = findViewById(R.id.ed_name);
        edPhoneNumber = findViewById(R.id.ed_phonenumber);
        edName.setText(name);
        edPhoneNumber.setText(phone);
    }

    public void ok(View view) {

        String name = edName.getText().toString();
        String phone = edPhoneNumber.getText().toString();
        getIntent().putExtra("EXTRA_NAME", name);
        getIntent().putExtra("EXTRA_PHONE", phone);
        setResult(RESULT_OK, getIntent());

        finish();
    }
}
