package com.example.romanovalayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.EditText;

public class LogInActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        EditText Password = findViewById(R.id.etPassword);
        Drawable image = getResources().getDrawable(R.drawable.eyeslash);
        Password.setCompoundDrawablesWithIntrinsicBounds(null, null, image, null);
    }
}