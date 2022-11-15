package com.example.romanovalayout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class LogInActivity extends Activity {
    EditText email, password;
    Button logIn;
    ImageButton btnImage;
    Drawable imageEyeSlash, imageEye;
    Boolean check=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        password = findViewById(R.id.etPassword);
        email = findViewById(R.id.etNamePhone);
        logIn = findViewById(R.id.btnLogin);
        btnImage= findViewById(R.id.btnEye);
        imageEyeSlash = getResources().getDrawable(R.drawable.eyeslash);
        imageEye = getResources().getDrawable(R.drawable.eye);
        TextView register = findViewById(R.id.txtRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogInActivity.this, RegisterActivity.class));
            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                IsClear();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                IsClear();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                IsClear();
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                IsClear();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                IsClear();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                IsClear();
            }
        });


    }

    void IsClear(){
        if(!email.getText().toString().isEmpty()&&!password.getText().toString().isEmpty()){
            logIn.setBackground(getResources().getDrawable(R.drawable.background_border_dark));
            logIn.setTextColor(getResources().getColor(R.color.white));
        }
        else{
            logIn.setBackground(getResources().getDrawable(R.drawable.background_border));
            logIn.setTextColor(getResources().getColor(R.color.violetDark));
        }
    }

    public void Click(View v){
        if(check){
            btnImage.setBackground(imageEye);
            password.setInputType(InputType.TYPE_CLASS_TEXT);
            password.setTypeface(null, Typeface.BOLD);
            check=false;
        }
        else{
            btnImage.setBackground(imageEyeSlash);
            password.setInputType(129);
            password.setTypeface(null, Typeface.BOLD);
            check=true;
        }
    }

}