package com.ozan.messageview;

public enum Error {
    error_gets_in_the_way("error_gets_in_the_way",R.raw.error_gets_in_the_way),
    error_just_like_magic("error_just_like_magic",R.raw.error_just_like_magic),
    error_served("error_saved",R.raw.error_served),
    error_surprise_on_a_spring("error_suprise_on_a_spring",R.raw.error_surprise_on_a_spring),
    error_system_fault("error_system_fault",R.raw.error_system_fault),
    error_you_wouldnt_believe("error_you_wouldny_believe",R.raw.error_you_wouldnt_believe);

    private String stringValue;
    private int intValue;
    private Error(String toString,int value){
        this.stringValue = toString;
        this.intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}
