package com.e.marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    MediaPlayer m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        m = MediaPlayer.create(MainActivity.this, R.raw.kgf);

    }

    public void datpcr(View view) {
        m.start();
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
    }

    public void pau(View view) {
        m.pause();
    }

    public void stp(View view) {
        m.stop();
        m = MediaPlayer.create(MainActivity.this, R.raw.kgf);

    }
}