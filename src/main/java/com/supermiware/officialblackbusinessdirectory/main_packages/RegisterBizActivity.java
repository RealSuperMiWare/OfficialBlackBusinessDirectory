package com.supermiware.officialblackbusinessdirectory.main_packages;

import android.content.DialogInterface;
import android.opengl.Visibility;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.supermiware.officialblackbusinessdirectory.R;
import com.supermiware.officialblackbusinessdirectory.data_handeling.classRegBizData;

public class RegisterBizActivity extends AppCompatActivity {

    EditText emailField;
    EditText usernameField;
    EditText biznameField;
    EditText bizdescriptionField;

    TextView imageIntroText;

    ImageButton imageLeft;
    ImageButton imageMid;
    ImageButton imageRight;

    Button bizRegDoneButton;
    boolean isClicked = false;

    String emailCheck    = emailField.getText().toString();
    String usernameCheck = usernameField.getText().toString();
    String biznameCheck  = biznameField.getText().toString();
    String bizDescCheck  = bizdescriptionField.getText().toString();

    boolean emailBool    = false;
    boolean usernameBool = false;
    boolean biznameBool  = false;
    boolean bizdescBool  = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_biz);

        // EditTexts init
        emailField           = findViewById(R.id.emailField);
        usernameField        = findViewById(R.id.usersNameField);
        biznameField         = findViewById(R.id.bizNameField);
        bizdescriptionField  = findViewById(R.id.bizDescriptionField);

        // TextView init
        imageIntroText       = findViewById(R.id.imageIntroText);

        // Images init
        imageLeft            = findViewById(R.id.bizImageLeft);
        imageMid             = findViewById(R.id.bizImageMid);
        imageRight           = findViewById(R.id.bizImageRight);

        // Buttons init
        bizRegDoneButton     = findViewById(R.id.bizRegDoneButton);

        //__________________________________________________________________________________________

        // Hide objects Section1
        emailField.setVisibility(View.VISIBLE);
        usernameField.setVisibility(View.INVISIBLE);
        biznameField.setVisibility(View.INVISIBLE);
        bizdescriptionField.setVisibility(View.INVISIBLE);

        // Hide Objects Section2
        imageIntroText.setVisibility(View.INVISIBLE);

        imageLeft.setVisibility(View.INVISIBLE);
        imageMid.setVisibility(View.INVISIBLE);
        imageRight.setVisibility(View.INVISIBLE);

        bizRegDoneButton.setVisibility(View.INVISIBLE);

    }

    @Override
    protected void onStart(){
        super.onStart();
        bizRegDoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void sendData(){

        String email       = emailField.getText().toString();
        String username    = usernameField.getText().toString();
        String bizName     = biznameField.getText().toString();
        String bizDesc     = bizdescriptionField.getText().toString();
        String imgIntroTxt = imageIntroText.getText().toString();

        classRegBizData regDataClass = new classRegBizData();
        regDataClass.bizRegisterData("users_email", " " + email);
        regDataClass.bizRegisterData("users_name", " " + username);
        regDataClass.bizRegisterData("biz_name", " " + bizName);
        regDataClass.bizRegisterData("biz_desc", " " + bizDesc);
        regDataClass.bizRegisterData("image_intro_text", " " + imgIntroTxt);
        Log.d("dataLog: ", "Data was logged successfully");
    }
}
