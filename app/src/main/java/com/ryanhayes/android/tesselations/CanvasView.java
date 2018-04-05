package com.ryanhayes.android.tesselations;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

import com.ryanhayes.android.tesselations.SafeLogging.SafeLog;

public class CanvasView extends View
{
    private class CanvasViewLog extends SafeLog{

        @Override
        protected String getTag() {
            return "CanvasView";
        }
    }

    public CanvasView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void onDraw(Canvas canvas)
    {
        //super.onDraw(canvas);
           /* int x=80;
            int y=80;
            int radius=40;
            Paint paint=new Paint();
            // Use Color.parseColor to define HTML colors
            paint.setColor(Color.parseColor("#CD5C5C"));
            canvas.drawCircle(x,x, radius, paint);*/
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        PointF current = new PointF(event.getX(), event.getY());
        String action = "";

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                action="ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                action="ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action="ACTION_UP";
                break;
            case MotionEvent.ACTION_CANCEL:
                action="ACTION_CANCEL";
                break;
        }

      new CanvasViewLog().info(action + " at x=" + current.x + ", y=" + current.y);

        return true;
    }

}