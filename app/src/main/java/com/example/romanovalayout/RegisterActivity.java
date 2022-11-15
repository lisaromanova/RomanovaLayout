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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class RegisterActivity extends Activity {
    EditText password, confirmPassword, email, name;
    CheckBox check;
    Button reg;
    ImageButton btnPassword, btnConfirm;
    Drawable imageEyeSlash, imageEye;
    Boolean checkPassword = true, checkConfirm=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = findViewById(R.id.etNamePhoneReg);
        name = findViewById(R.id.etFullName);
        password = findViewById(R.id.etPasswordReg);
        confirmPassword = findViewById(R.id.etConfirmPassword);
        check = findViewById(R.id.checkAgree);
        reg = findViewById(R.id.btnRegister);
        btnPassword= findViewById(R.id.btnEyeReg);
        btnConfirm= findViewById(R.id.btnEyeConfirm);
        imageEyeSlash = getResources().getDrawable(R.drawable.eyeslash);
        imageEye = getResources().getDrawable(R.drawable.eye);

        TextView login = findViewById(R.id.txtLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LogInActivity.class));
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
        name.addTextChangedListener(new TextWatcher() {
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
        confirmPassword.addTextChangedListener(new TextWatcher() {
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
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                IsClear();
            }
        });
    }

    public void Click(View v) {
        if (!email.getText().toString().isEmpty() &&
                !password.getText().toString().isEmpty() &&
                !name.getText().toString().isEmpty() &&
                !confirmPassword.getText().toString().isEmpty() &&
                check.isChecked()) {
            startActivity(new Intent(RegisterActivity.this, RegisterFinishActivity.class));
        }
    }

    void IsClear(){
        if(!email.getText().toString().isEmpty()&&
                !password.getText().toString().isEmpty()&&
                !name.getText().toString().isEmpty()&&
                !confirmPassword.getText().toString().isEmpty()&&
        check.isChecked()){
            reg.setBackground(getResources().getDrawable(R.drawable.background_border_dark));
            reg.setTextColor(getResources().getColor(R.color.white));
        }
        else{
            reg.setBackground(getResources().getDrawable(R.drawable.background_border));
            reg.setTextColor(getResources().getColor(R.color.violetDark));
        }
    }

    public void ClickPassword(View v){
        if(checkPassword){
            btnPassword.setBackground(imageEye);
            password.setInputType(InputType.TYPE_CLASS_TEXT);
            password.setTypeface(null, Typeface.BOLD);
            checkPassword=false;
        }
        else{
            btnPassword.setBackground(imageEyeSlash);
            password.setInputType(129);
            password.setTypeface(null, Typeface.BOLD);
            checkPassword=true;
        }
    }

    public void ClickConfirm(View v){
        if(checkConfirm){
            btnConfirm.setBackground(imageEye);
            confirmPassword.setInputType(InputType.TYPE_CLASS_TEXT);
            confirmPassword.setTypeface(null, Typeface.BOLD);
            checkConfirm=false;
        }
        else{
            btnConfirm.setBackground(imageEyeSlash);
            confirmPassword.setInputType(129);
            confirmPassword.setTypeface(null, Typeface.BOLD);
            checkConfirm=true;
        }
    }
}