package com.taimour1446.toaster;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster {

    public static int SUCCESS = 200;
    public static int ERROR = 404;
    public static int WARNING = 504;
    static String SUCCESS_COLOR ="#62bda9";
    static String ERROR_COLOR ="#8e0205";
    static String WARNING_COLOR ="#a49100";


    public static void showOnTop(Context context,CharSequence text, int messageType, int duration){

        try{
            System.out.println("Top Called");
            View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null);
            TextView textview =  layout.findViewById(R.id.text);
            LinearLayout linearLayout =  layout.findViewById(R.id.toast_layout_root);
            textview.setText(text);
            if (messageType == SUCCESS)
                linearLayout.setBackgroundColor(Color.parseColor(SUCCESS_COLOR));
            if (messageType == WARNING)
                linearLayout.setBackgroundColor(Color.parseColor(WARNING_COLOR));
            if (messageType == ERROR)
                linearLayout.setBackgroundColor(Color.parseColor(ERROR_COLOR));
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.TOP, 0, 0);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void showOnBottom(Context context,CharSequence text, int messageType, int duration){

        try{
            System.out.println("Bottom Called");
            View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null);
            TextView textview =  layout.findViewById(R.id.text);
            LinearLayout linearLayout =  layout.findViewById(R.id.toast_layout_root);
            textview.setText(text);
            if (messageType == SUCCESS)
                linearLayout.setBackgroundColor(Color.parseColor(SUCCESS_COLOR));
            if (messageType == WARNING)
                linearLayout.setBackgroundColor(Color.parseColor(WARNING_COLOR));
            if (messageType == ERROR)
                linearLayout.setBackgroundColor(Color.parseColor(ERROR_COLOR));
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.BOTTOM, 0, 0);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
