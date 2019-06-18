package com.ozan.messageview;

import android.view.Gravity;

public enum State {
    BOTTOM("BOTTOM", Gravity.BOTTOM),
    CENTER("CENTER",Gravity.CENTER),
    TOP("TOP",Gravity.TOP);


    private String stateKey;
    private int stateValue;

    private State(String stateKey,int stateValue){
        this.stateKey = stateKey;
        this.stateValue = stateValue;
    }

    public int getStateValue(){
        return stateValue;
    }
    public String getStateKey(){
        return stateKey;
    }
}
