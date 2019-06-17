package com.ozan.messageview;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MessageView {

    public static void showErrorMessage(Context context,String message,boolean sound){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View view = toast.getView();
        view.setBackgroundResource(R.drawable.drw_toast_error);
        TextView text = (TextView) view.findViewById(android.R.id.message);
        text.setPadding(10, 10, 10, 10);
        text.setText(message);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

        if (sound){
            MediaPlayer ring = MediaPlayer.create(context,R.raw.error_system_fault);
            ring.start();
        }
    }

    public static void showSuccessMessage(Context context,String message,boolean sound){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View view = toast.getView();
        view.setBackgroundResource(R.drawable.drw_toast_success);
        TextView text = (TextView) view.findViewById(android.R.id.message);
        text.setPadding(10, 10, 10, 10);
        text.setText(message);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

        if (sound){
            MediaPlayer ring = MediaPlayer.create(context,R.raw.success_quite_impressed);
            ring.start();
        }
    }
}
