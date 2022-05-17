package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //كود سبلاش سكرين
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),first_page.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        thread.start();









//        @Override
//        public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//
//            switch (requestCode) {
//                case WRITE_EX_REQ_CODE:
//                    if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//
//                        Toast.makeText(this, "تم الحصول على الصلاحية ", Toast.LENGTH_SHORT).show();
//                    }
//                    return;
//            }
//        }
    }
    }
