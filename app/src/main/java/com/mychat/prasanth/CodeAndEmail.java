package com.mychat.prasanth;

/**
 * Created by prasantu on 22-Aug-17.
 */

public class CodeAndEmail {

    String mGeneratedcode;
    String mEmailCode;

    public CodeAndEmail(String mInternalCode, String mEmailCode){
        this.mGeneratedcode = mInternalCode;
        this.mEmailCode =  mEmailCode;
    }

    public CodeAndEmail(){

    }

    public String getmGeneratedcode() {
        return mGeneratedcode;
    }
    public String getmEmailCode(){
        return mEmailCode;
    }
}
