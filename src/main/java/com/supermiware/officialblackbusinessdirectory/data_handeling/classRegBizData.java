package com.supermiware.officialblackbusinessdirectory.data_handeling;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.supermiware.officialblackbusinessdirectory.main_packages.RegisterBizActivity;

public class classRegBizData extends RegisterBizActivity {
    // This class will receive data from biz. register activity and send it to firebase
    public void bizRegisterData(String Key, String Value){

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue(Key, Value);

    }
}
