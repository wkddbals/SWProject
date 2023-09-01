package com.example.swproject;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.widget.TextView;


public class AskPageActivity extends AppCompatActivity {

    private EditText numberInputEditText;
    private Button submitButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ask_page);

        // 배경색을 설정할 레이아웃 요소를 가져옴
        ConstraintLayout layout = findViewById(R.id.root); // 루트 레이아웃의 ID로 바꿔주세요

        // 배경색을 설정
        layout.setBackgroundColor(Color.parseColor("#D8D8D8"));

        TextView ask_button =  findViewById(R.id.ask_button);

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AskPageActivity.this, AskCreatePageActivity.class);
                startActivity(intent);
            }
        });

    }
}