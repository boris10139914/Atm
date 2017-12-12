package com.boris.atm;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText edUserid;//ctrl alt f 抽出
    private EditText edPasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String userid = getSharedPreferences("atm", MODE_PRIVATE)
                .getString("USERID", "");
        edUserid = findViewById(R.id.userid);
        edPasswd = findViewById(R.id.passwd);
        edUserid.setText(userid);//記住上次打的
    }

    public void login(View view) {
        String userid = edUserid.getText().toString();
        String password = edPasswd.getText().toString();
        if ("jack".equals(userid) && "1234".equals(password)) {
            Toast.makeText(this, "登入成功", Toast.LENGTH_SHORT).show();
            getIntent().putExtra("LOGIN_USERID", userid);
            getIntent().putExtra("LOGIN_PASSWD", password);
            setResult(RESULT_OK, getIntent());
            finish();

        } else {
            new AlertDialog.Builder(this)
                    .setTitle("登入")
                    .setMessage("登入失敗")
                    .setPositiveButton("ok", null)
                    .show();
        }

    }

    public void cancel(View view) {

    }
}
