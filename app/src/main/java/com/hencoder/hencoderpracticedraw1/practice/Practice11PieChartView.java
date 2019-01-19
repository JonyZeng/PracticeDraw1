package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.net.CookieHandler;

public class Practice11PieChartView extends View {
    Paint mPaint = new Paint();
    Path mPath = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //startAngle -    开始角度（以时钟3点的方向为0°，逆时针为正方向）
            //　　sweepAngle -    扫过角度（以时钟3点的方向为0°，逆时针为正方向）
            //left：左边距
            //top :上边距
            //right:圆心左右移
            //bottom:圆心上下移
            mPaint.setColor(Color.RED);
            mPaint.setAntiAlias(true);
            canvas.drawArc(200, 100, 700, 600, 180, 120, true, mPaint);
            mPaint.setColor(Color.YELLOW);
            canvas.drawArc(200, 100, 740, 640, 300, 60, true, mPaint);
            mPaint.setColor(Color.GREEN);
            canvas.drawArc(200, 100, 740, 650, 0, 10, true, mPaint);
            mPaint.setColor(Color.GRAY);
            canvas.drawArc(200, 100, 740, 660, 10, 5, true, mPaint);
            mPaint.setColor(Color.BLUE);
            canvas.drawArc(200, 100, 740, 670, 15, 60, true, mPaint);
            mPaint.setColor(Color.CYAN);
            canvas.drawArc(200, 100, 730, 680, 75, 105, true, mPaint);

            mPaint.setColor(Color.WHITE);
            mPaint.setStrokeWidth(3);
            mPaint.setStyle(Paint.Style.STROKE);
            mPath.moveTo(100,50);
            mPath.lineTo(200, 50);
            mPath.lineTo(240, 80);
            mPath.lineTo(300,80);
            canvas.drawPath(mPath, mPaint);
        }
    }
}
