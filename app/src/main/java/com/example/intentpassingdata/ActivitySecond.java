package com.example.intentpassingdata;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tvData1 = (TextView) findViewById(R.id.tv_data1);
        TextView tvData2 = (TextView) findViewById(R.id.tv_data2);

        /**
         * Kita cek apakah ada Bundle atau tidak
         */
        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            tvData1.setText(bundle.getString("data1"));
            tvData2.setText(bundle.getString("data2"));
        }else{
            /**
             * Apabila Bundle tidak ada, ambil dari Intent
             */
            tvData1.setText(getIntent().getStringExtra("data1"));
            tvData2.setText(getIntent().getStringExtra("data2"));
        }
    }
}
