package com.ozan.messageview;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RawRes;

public class MessageView {

    public static void showErrorMessage(Context context, String message, boolean isOpenSound, Error sound, State state) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View view = toast.getView();
        view.setBackgroundResource(R.drawable.drw_toast_error);
        TextView text = (TextView) view.findViewById(android.R.id.message);
        text.setPadding(30, 10, 30, 10);
        text.setGravity(Gravity.CENTER);
        text.setText(message);
        if (state.getStateKey().equals("CENTER"))
            toast.setGravity(state.getStateValue() | state.getStateValue(), 0, 0);
        else
            toast.setGravity(state.getStateValue() | state.getStateValue(), 0, 200);
        toast.show();

        if (isOpenSound) {
            int sound_way = sound.getIntValue();
            MediaPlayer ring = MediaPlayer.create(context, sound_way);
            ring.start();
        }
    }

    public static void showSuccessMessage(Context context, String message, boolean isOpenSound, Success sound,State state) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        View view = toast.getView();
        view.setBackgroundResource(R.drawable.drw_toast_success);
        TextView text = (TextView) view.findViewById(android.R.id.message);
        text.setPadding(30, 10, 30, 10);
        text.setGravity(Gravity.CENTER);
        text.setText(message);
        if (state.getStateKey().equals("CENTER"))
            toast.setGravity(state.getStateValue() | state.getStateValue(), 0, 0);
        else
            toast.setGravity(state.getStateValue() | state.getStateValue(), 0, 200);
        toast.show();

        if (isOpenSound) {
            int sound_way = sound.getIntValue();
            MediaPlayer ring = MediaPlayer.create(context, sound_way);
            ring.start();
        }
    }
}
