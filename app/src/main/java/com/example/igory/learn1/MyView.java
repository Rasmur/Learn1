package com.example.igory.learn1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by igory on 16.03.2018.
 */

public class MyView extends android.support.v7.widget.AppCompatTextView  {

    public  static  final  String TAG = "Main";

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyView(Context context)
    {
        super(context);
    }

    @Override
    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Log.d(TAG,"onAttachedToWindow");
    }


    protected void onLayout(boolean changed,int left,int top,int right, int bottom)
    {
        super.onLayout(changed,left,top,right,bottom);
        Log.d(TAG,"onLayout");
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        Log.d(TAG,"onDraw");
    }
}
