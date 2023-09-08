package com.example.swproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView modify =  findViewById(R.id.modify);

        modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModifyPageActivity.class);
                startActivity(intent);
            }
        });

        TextView user_order =  findViewById(R.id.user_order);
        TextView user_point =  findViewById(R.id.user_point);
        TextView user_coupon =  findViewById(R.id.user_coupon);

        user_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OrderPageActivity.class);
                startActivity(intent);
            }
        });
        user_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View p) {
                Intent intent = new Intent(MainActivity.this, PointPageActivity.class);
                startActivity(intent);
            }
        });
        user_coupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                Intent intent = new Intent(MainActivity.this, CouponPageActivity.class);
                startActivity(intent);
            }
        });



        TextView notice =  findViewById(R.id.notice);
        TextView ask =  findViewById(R.id.ask);

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                Intent intent = new Intent(MainActivity.this, NoticePageActivity.class);
                startActivity(intent);
            }
        });
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                Intent intent = new Intent(MainActivity.this, AskPageActivity.class);
                startActivity(intent);
            }
        });

        // 배경색을 설정할 레이아웃 요소를 가져옴
        ConstraintLayout layout = findViewById(R.id.root); // 루트 레이아웃의 ID로 바꿔주세요

        // 배경색을 설정
        layout.setBackgroundColor(Color.parseColor("#D8D8D8"));

    }
}