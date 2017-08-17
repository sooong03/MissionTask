package kr.anima.xd.s.missiontask;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alfo6-10 on 8/17/2017.
 */

public class MyCheckBox extends android.support.v7.widget.AppCompatCheckBox {


    public MyCheckBox(Context context) {
        super(context);

    }

    public MyCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setChecked(boolean checked) {
        super.setChecked(checked);
    }





    class Boxs{
        CheckBox cb;
        TextView tv;
        int symbol;
        int color;
        String name;
        Boolean isChecked;

        public Boxs(int symbol, String name, int color) {
            this.symbol=symbol;
            this.name=name;
            this.color = color;
            setBox(symbol, name, color);
        }

        public void setBox(int symbol, String name, int color){
            cb.setBackgroundResource(symbol);
            tv.setText(name);
        }
    }


}
