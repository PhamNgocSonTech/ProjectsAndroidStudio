package com.android.learnandroidlifetime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainImplicitIntentExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_implicit_intent_example);
        Button btnURL = findViewById(R.id.btnURL);
        Button btnMail = findViewById(R.id.btnGMail);

        btnURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openURL();
            }
        });

        btnMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
    }

    public void openURL(){
        String url = "http://google.com";
        Intent intentURL = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intentURL);

    }

    public void sendEmail(){
        String [ ] recipients = new String[]{"friendemail@gmail.com"};
        String subject = "Hi, how are you";
        String content = "This my test email";
        Intent intentEmail = new Intent(Intent.ACTION_SEND, Uri.parse("mailto: "));
        intentEmail.putExtra(Intent.EXTRA_EMAIL, recipients);
        intentEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
        intentEmail.putExtra(Intent.EXTRA_TEXT, content);
        intentEmail.setType("text/plan");
        startActivity(Intent.createChooser(intentEmail, "Choose an Email Client From..."));
    }
}