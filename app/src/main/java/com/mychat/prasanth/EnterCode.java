package com.mychat.prasanth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EnterCode extends AppCompatActivity {

    private EditText mEnterCode;
    private String mEnteredCode;
    private Button mPairButton;
    private DatabaseReference mDatabase;
    private String mGeneratedCode;
    private String mEmail;
    private String mEmailCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_code);

        Intent myIntent = getIntent();
        mEmail = myIntent.getExtras().get("email").toString();

        mEnterCode = (EditText) findViewById(R.id.enterCode);
        mPairButton = (Button) findViewById(R.id.pairButton);


        mDatabase = FirebaseDatabase.getInstance().getReference();

        // for pairing after entring the code
        mEnteredCode = mEnterCode.getText().toString();

    }

//    private void getCodeAndEmail(){
//
//        ValueEventListener postListener = new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // Get Post object and use the values to update the UI
//                CodeAndEmail post = dataSnapshot.getValue(CodeAndEmail.class);
//                // ...
//                mGeneratedCode = post.getmGeneratedcode();
//                mEmailCode = post.getmEmailCode();
//                Log.d("chat",mEmailCode+ " , " +mGeneratedCode + " , "+mEmail);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                // Getting Post failed, log a message
//                Log.w("chat", "loadPost:onCancelled", databaseError.toException());
//                // ...
//            }
//        };
//        mDatabase.addValueEventListener(postListener);
//    }
}
