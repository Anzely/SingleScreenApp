package com.example.edit.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public void onClick(View view) {

    switch (view.getId()) {
        case R.id.ImagePhone:
        case R.id.TextPhone:
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + getString(R.string.campanyTelephone)));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
            break;

        case R.id.ImageMail:
        case R.id.TextMail:
            Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
            mailIntent.setData(Uri.parse("mailto:" + getString(R.string.email)));
            if (mailIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mailIntent);
            }
            break;

    }
}



}


