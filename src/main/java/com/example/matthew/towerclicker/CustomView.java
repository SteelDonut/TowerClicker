package com.example.matthew.towerclicker;

/**
 * Created by Matthew on 12/8/2016.
 */

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CustomView extends SurfaceView implements SurfaceHolder.Callback {

    protected Context context;
    private Bitmap tower1;
    private Bitmap tower2;
    private Bitmap tower3;
    private Bitmap tower4;
    private Bitmap bTower1;
    private Bitmap bTower2;
    private Bitmap bTower3;
    private Bitmap bTower4;
    DrawingThread thread;
    Praint text;
    int x,y;
    int maxCost;
    int maxBCost;
    int money;

    public CustomView(Context ctx, AttributeSet attrs) {
        super(ctx,attrs);
        context = ctx;

        tower1 = BitmapFactory.decodeResource(context.getResources(),R.drawable.tower1);
        tower2 = BitmapFactory.decodeResource(context.getResources(),R.drawable.tower2);
        tower3 = BitmapFactory.decodeResource(context.getResources(),R.drawable.tower3);
        tower4 = BitmapFactory.decodeResource(context.getResources(),R.drawable.tower4);
        bTower1 = BitmapFactory.decodeResource(context.getResources(),R.drawable.btower1);
        bTower2 = BitmapFactory.decodeResource(context.getResources(),R.drawable.btower2);
        bTower3 = BitmapFactory.decodeResource(context.getResources(),R.drawable.btower3);
        bTower4 = BitmapFactory.decodeResource(context.getResources(),R.drawable.btower4);


    }
}
