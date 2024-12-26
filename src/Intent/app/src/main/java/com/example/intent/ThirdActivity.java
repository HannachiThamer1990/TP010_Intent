package com.example.intent;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);


        Button buttonOui = findViewById(R.id.buttonOui);
        buttonOui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result", "OUI sélectionné");
                setResult(RESULT_OK, returnIntent);
                finish(); // Terminer Activity3 et retourner à MainActivity
            }
        });


        Button buttonNon = findViewById(R.id.buttonNon);
        buttonNon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result", "NON sélectionné");
                setResult(RESULT_OK, returnIntent);
                finish(); // Terminer Activity3 et retourner à MainActivity
            }
        });
    }
}
