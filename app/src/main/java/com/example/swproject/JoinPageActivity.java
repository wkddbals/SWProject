package com.example.swproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.graphics.Color;
import android.widget.TextView;


import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class JoinPageActivity extends AppCompatActivity {
    EditText name,id,pw,pw2,email,birthyear,birthdate,birthday;
    Button pwcheck, submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_page);

        name = findViewById(R.id.userName);
        id=findViewById(R.id.userID);
        pw=findViewById(R.id.userPW);
        pw2=findViewById(R.id.userPW2);
        email=findViewById(R.id.email);
        birthyear=findViewById(R.id.userBirth);
        birthdate=findViewById(R.id.userBirth2);
        birthday=findViewById(R.id.userBirth3);

        //비밀번호 확인 버튼
        pwcheck = findViewById(R.id.PWcheck_button);
        pwcheck.setOnClickListener(v -> {
            if(pw.getText().toString().equals(pw2.getText().toString())){
                pwcheck.setText("일치");
            }else{
                Toast.makeText(JoinPageActivity.this, "비밀번호가 다릅니다.", Toast.LENGTH_LONG).show();
            }
        });

        TextView join =  findViewById(R.id.join_button);

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JoinPageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}