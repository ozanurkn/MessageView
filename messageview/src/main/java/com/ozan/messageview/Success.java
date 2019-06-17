package com.ozan.messageview;

public enum Success {
    success_not_bad("success_not_bad",R.raw.success_not_bad),
    success_quite_impressed("success_quite_impressed",R.raw.success_quite_impressed),
    success_slow_spring_board("success_slow_spring_board",R.raw.success_slow_spring_board),
    success_slow_spring_board_longer_tail("success_slow_spring_board_longer_tail",R.raw.success_slow_spring_board_longer_tail),
    success_to_the_point("success_to_the_point",R.raw.success_to_the_point);

    private String stringValue;
    private int intValue;
    private Success(String toString,int value){
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }


}
