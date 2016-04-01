package com.shootr.knumbers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.KMNumbers;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.text_numbers) TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        text.setText("1.000 should be " + KMNumbers.formatNumbers(1000L) + " \n" +
                "10.000 should be " + KMNumbers.formatNumbers(10000L) + " \n" +
                "1.000.000 should be " + KMNumbers.formatNumbers(1000000L) + " \n" +
                "10.000.000 should be " + KMNumbers.formatNumbers(10000000L) + " \n");
    }
}
