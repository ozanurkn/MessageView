package com.ozan.messageview;


import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);
        findViewById(R.id.deneme).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MessageView.showErrorMessage(getContext(),"text.setGravity(Gravity.CENTER);",true, Error.error_gets_in_the_way,State.CENTER);
            }
        });

    }
    public Context getContext(){
        return MainActivity.this;
    }
}
