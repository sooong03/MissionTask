package kr.anima.xd.s.missiontask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alfo6-10 on 8/16/2017.
 */

public class CheckElement extends View implements OnClickListener{

    ArrayList<String> element_string=new ArrayList<>();
    List<CharSequence> element_icon=new ArrayList<>();

    Boolean isChecked=false;

    public CheckElement(Context context) {
        super(context);
        element_string= (ArrayList<String>) Arrays.asList(context.getResources().getStringArray(R.array.element_string));
        element_icon=Arrays.asList(context.getResources().getTextArray(R.array.element_icon));
        LayoutInflater.from(context).inflate(R.layout.btn_element, null);
    }


    @Override
    public void onClick(View view) {

    }
}
