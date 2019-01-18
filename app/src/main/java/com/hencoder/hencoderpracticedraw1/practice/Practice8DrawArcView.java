package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    Paint mPaint = new Paint();
    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawArc(200,200,400,400,90,90,true,mPaint);

            mPaint.setStrokeWidth(6);
            mPaint.setStyle(Paint.Style.STROKE);
            canvas.drawArc(300,300,600,500,120,90,false,mPaint);

            mPaint.setStyle(Paint.Style.FILL);
            canvas.drawArc(500,500,800,700,120,90,false,mPaint);
        }
    }
}
