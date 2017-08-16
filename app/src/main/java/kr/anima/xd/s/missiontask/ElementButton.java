package kr.anima.xd.s.missiontask;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by alfo6-10 on 8/16/2017.
 */

public class ElementButton extends LinearLayout {

    private Context context;

    private LinearLayout background;
    private ImageView icon;
    private TextView name;

    public ElementButton(Context context) {
        super(context);
        this.context=context;
        initView();
    }

    public ElementButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView();
        getAttrs(attrs);
    }

    public ElementButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
        getAttrs(attrs, defStyleAttr);
    }

    private void initView(){
//        String infService=Context.LAYOUT_INFLATER_SERVICE;
        View v= LayoutInflater.from(context).inflate(R.layout.btn_element, this, false);
        addView(v);

        background=findViewById(R.id.LL_bg);
        icon=findViewById(R.id.IV_icon);
        name=findViewById(R.id.TV_name);

    } // initView

    private void getAttrs(AttributeSet attrs){

        TypedArray typedArray=context.obtainStyledAttributes(attrs, R.styleable.BtnElement);
        setTypeArray(typedArray);

    } // getAttrs

    private void getAttrs(AttributeSet attrs, int defStyle){
        TypedArray typedArray=context.obtainStyledAttributes(attrs, R.styleable.BtnElement, defStyle, 0);
        setTypeArray(typedArray);
    }

    private void setTypeArray(TypedArray typeArray){
        int iconId=typeArray.getResourceId(R.styleable.BtnElement_symbol, R.drawable.ic_element_appearance);
        icon.setImageResource(iconId);

        String text=typeArray.getString(R.styleable.BtnElement_text);
        name.setText(text);

        typeArray.recycle();

    } // set Type Array



    void setIcon(int iconId){
        icon.setImageResource(iconId);
    }

    void setTextColor(int color){
        name.setTextColor(color);
    }

    void setText(String elementName){
        name.setText(elementName);
    }

    void setText(int nameId){
        name.setText(nameId);
    }


} // class Element Button

