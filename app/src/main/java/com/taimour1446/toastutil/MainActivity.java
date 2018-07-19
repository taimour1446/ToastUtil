package com.taimour1446.toastutil;

import android.animation.ArgbEvaluator;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.taimour1446.toaster.Toaster;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        context = this;

    }

    @OnClick({
            R.id.btn_bottom_warning,
            R.id.btn_bottom_error,
            R.id.btn_top_success,
            R.id.btn_bottom_success
    })
    public void onButtonClick(View view){
        System.out.println("onButtonClick Called");

        if (view.getId() == R.id.btn_bottom_success){
            Toaster.showOnBottom(context,"This is a success message",Toaster.SUCCESS, Toast.LENGTH_LONG);
        }
        if (view.getId() == R.id.btn_bottom_error){
            Toaster.showOnBottom(context,"This is a error message",Toaster.ERROR, Toast.LENGTH_LONG);
        }
        if (view.getId() == R.id.btn_bottom_warning){
            Toaster.showOnBottom(context,"This is a warning message",Toaster.WARNING, Toast.LENGTH_LONG);
        }
        if (view.getId() == R.id.btn_top_success){
            Toaster.showOnTop(context,"This is a success message",Toaster.SUCCESS, Toast.LENGTH_LONG);
        }

    }
}
