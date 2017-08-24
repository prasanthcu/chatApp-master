package com.mychat.prasanth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EnterCode extends AppCompatActivity {

    private EditText mEnterCode;
    private String mEnteredCode;
    private Button mPairButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.i_have_a_code);

        mEnterCode = (EditText) findViewById(R.id.enterCode);
        mPairButton = (Button) findViewById(R.id.pairButton);


        // for pairing after entring the code
        mEnteredCode = mEnterCode.getText().toString();



    }
}
