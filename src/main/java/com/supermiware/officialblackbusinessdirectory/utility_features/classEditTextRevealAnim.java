package com.supermiware.officialblackbusinessdirectory.utility_features;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Arrays;

import com.supermiware.officialblackbusinessdirectory.R;
import com.supermiware.officialblackbusinessdirectory.main_packages.RegisterBizActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class classEditTextRevealAnim extends RegisterBizActivity {

    // The EditText Fields below will need to be revealed one after the other
    EditText emailField;
    EditText userNameField;
    EditText bizNameField;
    EditText bizDescField;

    // These objects will need to be animated and revealed together
    TextView introText;
    ImageButton bizImageLeft;
    ImageButton bizImageMid;
    ImageButton bizImageRight;

    // Activity DoneButton
    Button doneButton;

    // Boolean Values
    boolean isEmailFieldOc    = false;
    boolean isUserNameFieldOc = false;
    boolean isBizNameFieldOc  = false;
    boolean isBizDescFieldOc  = false;

    // Are EditTextFields empty
    boolean emailEmpty         = true;
    boolean userNameFieldEmpty = true;
    boolean biznameFieldEmpty  = true;
    boolean bizDescFieldEmpty  = true;

    // IntroText and 3 Biz Images
    boolean introTextIsNeeded      = false;
    boolean bizImageLeftIsNeeded   = false;
    boolean bizImageMidIsNeeded    = false;
    boolean bizImageRightIsNeeded  = false;

    public void gatherFields(){

        emailField    = findViewById(R.id.emailField);
        userNameField = findViewById(R.id.usersNameField);
        bizNameField  = findViewById(R.id.bizNameField);
        bizDescField  = findViewById(R.id.bizDescriptionField);

        introText     = findViewById(R.id.imageIntroText);
        bizImageLeft  = findViewById(R.id.bizImageLeft);
        bizImageMid   = findViewById(R.id.bizImageMid);
        bizImageRight = findViewById(R.id.bizImageRight);

        // Activity DoneButton
        doneButton    = findViewById(R.id.bizRegDoneButton);
    }

    public void animFields(){

        gatherFields();

    }

    // TODO: Will return to this, want to get started on the fragment activity for the first time intro users.
    public void onClickMethod(){

        // This for loop will check the values of each of the booleans in the list
        // if any value is still false condition will fail and
        boolean list[] = new boolean[] {isEmailFieldOc, isUserNameFieldOc, isBizNameFieldOc, isBizDescFieldOc};
        for(boolean x : list){

            if(x == false){

                // do not proceed.
                // but if x == true animate and unhide lower EditTextField

            }

        }
    }

    public void animeAction(){



    }


}
