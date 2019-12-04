package com.keapps.textNumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText editText;
    private Button sendBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText= findViewById(R.id.inputText1);
        sendBtn= findViewById(R.id.buttonSend1);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sender();
            }
        });
    }

    private void Sender() {
        String y = "https://wa.me/";
        String x =editText.getText().toString();
        String z =y+x;
        Uri webPage = Uri.parse(z);
        Intent intent = new Intent(Intent.ACTION_VIEW,webPage);
        startActivity(intent);




    }
}
