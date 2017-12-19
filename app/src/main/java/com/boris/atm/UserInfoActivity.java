package com.boris.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {


    private EditText edName;
    private EditText edPhoneNumber;
    private String TAG = UserInfoActivity.class.getSimpleName();
    private Spinner ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ages = findViewById(R.id.ages);
        // ArrayList<String> data = new ArrayList<>();
        //for(int i =15; i<=40;i++){
        //    data.add(i+" ");
        //}
        String[] data = getResources().getStringArray(R.array.ages);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.ages, android.R.layout.simple_list_item_1);
        //陣列字串打在res/values/strings
        ages.setAdapter(adapter);
        //以下為暫存暱稱和電話
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
        Log.d(TAG, "OK" + ages.getSelectedItem().toString());
        int age = Integer.parseInt(ages.getSelectedItem().toString());
        String name = edName.getText().toString();
        String phone = edPhoneNumber.getText().toString();
        getIntent().putExtra("EXTRA_NAME", name);
        getIntent().putExtra("EXTRA_PHONE", phone);
        setResult(RESULT_OK, getIntent());

        finish();
    }
}
