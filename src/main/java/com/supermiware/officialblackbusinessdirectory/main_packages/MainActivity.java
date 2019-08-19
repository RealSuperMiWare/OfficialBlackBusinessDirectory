package com.supermiware.officialblackbusinessdirectory.main_packages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.supermiware.officialblackbusinessdirectory.R;
import com.supermiware.officialblackbusinessdirectory.signin_signup_package.classSignIn;
import com.supermiware.officialblackbusinessdirectory.signin_signup_package.classSignUp;

public class MainActivity extends AppCompatActivity {
    classSignUp signUp;

    Button doneButton;

    EditText emailField;
    EditText passwordField;

    boolean isDoneButtonPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doneButton    = findViewById(R.id.logButton);
        emailField    = findViewById(R.id.usernameField);
        passwordField = findViewById(R.id.passwordField);
        signUp        = new classSignUp();

        signUp.signUpMethod();

    }

    @Override
    protected void onStart(){
        super.onStart();


        classSignIn checkUser = new classSignIn();
        checkUser.firstSignIn();

        classSignUp signUp = new classSignUp();
        signUp.checkIfAccount();

        // If there is not account signup using the doneButton
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isDoneButtonPressed = true;
                if(isDoneButtonPressed){

                    String email      = emailField.getText().toString();
                    String password    = passwordField.getText().toString();

                    classSignUp signUp = new classSignUp();
                    signUp.createAccount(email, password);

                }else{

                    Log.d("???: ", "I don't know what happened, but " +
                            "we didn't go to the next page.");

                }
            }
        });

    }
}
