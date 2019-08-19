package com.supermiware.officialblackbusinessdirectory.signin_signup_package;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.supermiware.officialblackbusinessdirectory.main_packages.IntroSlidingActivity;
import com.supermiware.officialblackbusinessdirectory.main_packages.MainActivity;
import com.supermiware.officialblackbusinessdirectory.main_packages.RegisterBizActivity;


public class classSignIn extends MainActivity {

    // this class will handle firebase signin authentication


    public void firstSignIn(){

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser == null){

            Intent toIntro = new Intent(classSignIn.this, IntroSlidingActivity.class);
            startActivity(toIntro);

        }else{

            Intent toAccount = new Intent(classSignIn.this, RegisterBizActivity.class);
            startActivity(toAccount);

        }

    }

    private FirebaseAuth mAuth;
    public void signInMethod(String email, String password) {

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("Signin Successful", "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("Signin Failed", "signInWithEmail:failure", task.getException());
                            Toast.makeText(classSignIn.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });

    }

}
