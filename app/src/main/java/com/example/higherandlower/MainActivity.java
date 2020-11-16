package com.example.higherandlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int randomNum = (int) (Math.random() * 20);
    public void guessNumber(View view){

        Log.i("info", "number is" + randomNum);

        TextView number = findViewById(R.id.numberGuess);

        int convertedInput = Integer.parseInt(number.getText().toString());

        if (convertedInput > randomNum){
            Toast.makeText(this,"Too high", Toast.LENGTH_LONG).show();
        }else if (convertedInput < randomNum) {
            Toast.makeText(this, "Too low", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Hit!", Toast.LENGTH_LONG).show();
            randomNum = (int) (Math.random() * 20);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}