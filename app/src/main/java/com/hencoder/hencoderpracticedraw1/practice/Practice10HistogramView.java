package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint mPaint = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方
        //画线
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(4);
        canvas.drawLine(180, 200, 180, 600, mPaint);
        canvas.drawLine(180, 600, 1200, 600, mPaint);
        //柱形
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(200, 590, 280, 600, mPaint);
        canvas.drawRect(300, 570, 380, 600, mPaint);
        canvas.drawRect(400, 580, 480, 600, mPaint);
        canvas.drawRect(500, 500, 580, 600, mPaint);
        canvas.drawRect(600, 450, 680, 600, mPaint);
        canvas.drawRect(700, 400, 780, 600, mPaint);
        canvas.drawRect(800, 550, 880, 600, mPaint);
        //文字
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(3);
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(30);
        canvas.drawText("Froyo",200,640,mPaint);
        canvas.drawText("GB",340,640,mPaint);
        canvas.drawText("ICS",430,640,mPaint);
        canvas.drawText("JB",530,640,mPaint);
        canvas.drawText("KitKat",600,640,mPaint);
        canvas.drawText("L",740,640,mPaint);
        canvas.drawText("M",840,640,mPaint);
        mPaint.setTextSize(50);
        canvas.drawText("直方图",500,300,mPaint);

    }
}
