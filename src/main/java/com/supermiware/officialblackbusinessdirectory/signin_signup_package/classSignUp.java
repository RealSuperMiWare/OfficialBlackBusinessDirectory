package com.supermiware.officialblackbusinessdirectory.signin_signup_package;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.supermiware.officialblackbusinessdirectory.main_packages.MainActivity;
import com.supermiware.officialblackbusinessdirectory.main_packages.RegisterBizActivity;

// This class will handle firebase registration authentication

public class classSignUp extends MainActivity {

    private FirebaseAuth mAuth;
    // FirebaseUser currentUser  = mAuth.getCurrentUser();
    // public boolean isLoggedin = false;

    // This class will connect app to firebase and sign the user up for the service

    public void signUpMethod() {

        Log.d("isSignUpMethod", "signupMethod is being run");

    }

    public boolean checkIfAccount(){

        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null){

            Intent toAccount = new Intent(classSignUp.this, RegisterBizActivity.class);
            startActivity(toAccount);
        }

        return checkIfAccount();
    }

    public void createAccount(String email, String password){

        mAuth = FirebaseAuth.getInstance();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("SignUp Successful", "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                        } else {

                            // If sign in fails, display a message to the user.
                            Log.w("SignUp Failed", "createUserWithEmail:failure", task.getException());

                        }

                        // ...
                    }
                });

    }
}
