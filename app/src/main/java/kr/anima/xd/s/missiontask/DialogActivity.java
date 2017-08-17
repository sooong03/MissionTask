package kr.anima.xd.s.missiontask;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jzxiang.pickerview.TimePickerDialog;
import com.jzxiang.pickerview.data.Type;
import com.jzxiang.pickerview.listener.OnDateSetListener;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DialogActivity extends AppCompatActivity implements OnDateSetListener, View.OnClickListener{

    private MyDialog myDialog;

    TimePickerDialog mDialogAll;
    TimePickerDialog startDialog;
    TimePickerDialog finishDialog;
    MyTimePickerDialog dialog;
    TextView tvDateOfStart;
    TextView tvDateofFinish;

    SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        initView();
        long tenYears = 10L * 365 * 1000 * 60 * 60 * 24L;
        mDialogAll = new TimePickerDialog.Builder()
                .setCallBack(this)
                .setCancelStringId("Cancel")
                .setSureStringId("Sure")
                .setYearText("Year")
                .setMonthText("Month")
                .setDayText("Day")
                .setHourText("Hour")
                .setMinuteText("Minute")
                .setCyclic(true)
                .setMinMillseconds(System.currentTimeMillis() - tenYears)
                .setMaxMillseconds(System.currentTimeMillis() + tenYears)
                .setCurrentMillseconds(System.currentTimeMillis())
                .setThemeColor(getResources().getColor(R.color.timepicker_dialog_bg))
                .setType(Type.ALL)
                .setWheelItemTextNormalColor(getResources().getColor(R.color.cardview_dark_background))
                .setWheelItemTextSelectorColor(getResources().getColor(R.color.colorAccent))
                .setWheelItemTextSize(13)
                .build();


        dialog=new MyTimePickerDialog.Builder().setTitleStringId("title").setId("start").build();
        startDialog=new TimePickerDialog.Builder().setTitleStringId("start date").setType(Type.ALL).setCallBack(this).build();
        finishDialog=new TimePickerDialog.Builder().setTitleStringId("finish date").setType(Type.ALL).setCallBack(this).build();
    }



    void initView() {
        tvDateOfStart= (TextView) findViewById(R.id.TV_dateOfStart);
        tvDateOfStart.setOnClickListener(this);
        tvDateOfStart.setText(sf.format(System.currentTimeMillis())); // 현재 시간
        tvDateofFinish= (TextView) findViewById(R.id.TV_dateOfFinish);
        tvDateofFinish.setOnClickListener(this);
        tvDateofFinish.setText(sf.format(System.currentTimeMillis()+ (1000 * 60 * 60 * 24L))); // 하루 뒤
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.TV_dateOfStart:
//                startDialog.show(getSupportFragmentManager(), "all");
                dialog.show(getSupportFragmentManager(), "all");
                break;
            case R.id.TV_dateOfFinish:
                finishDialog.show(getSupportFragmentManager(), "all");
                break;
        }
    }



    @Override
    public void onDateSet(TimePickerDialog timePickerDialog, long millseconds) {
        String text = getDateToString(millseconds);
        tvDateOfStart.setText(text);
        tvDateofFinish.setText(text);
    }

    public String getDateToString(long time) {
        Date d = new Date(time);
        return sf.format(d);
    }

}
