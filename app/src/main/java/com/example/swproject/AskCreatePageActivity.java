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


public class AskCreatePageActivity extends AppCompatActivity {

    private EditText numberInputEditText;
    private Button submitButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ask_create_page);

        TextView ask_button =  findViewById(R.id.ask_create_button);

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AskCreatePageActivity.this, AskPageActivity.class);
                startActivity(intent);
            }
        });

    }
}