package com.number7.udemycreatemessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    private TextView textViewReceivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);

        textViewReceivedMessage = findViewById(R.id.textViewReceivedMessage);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        textViewReceivedMessage.setText(message);
    }
}
