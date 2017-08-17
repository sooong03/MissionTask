package kr.anima.xd.s.missiontask;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.jzxiang.pickerview.TimePickerDialog;
import com.jzxiang.pickerview.config.PickerConfig;

/**
 * Created by alfo6-10 on 8/17/2017.
 */

public class MyTimePickerDialog extends TimePickerDialog {

    MyPickerConfig myPickerConfig;
    public MyTimePickerDialog() {
        super();
    }

    private static MyTimePickerDialog newIntance(MyPickerConfig pickerConfig) {
        MyTimePickerDialog timePickerDialog = new MyTimePickerDialog();
        timePickerDialog.initialize(pickerConfig);
        return timePickerDialog;
    }

    private void initialize(MyPickerConfig pickerConfig) {
        myPickerConfig = pickerConfig;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }

    @Override
    public long getCurrentMillSeconds() {
        return super.getCurrentMillSeconds();
    }



    public static class Builder{
        MyPickerConfig pickerConfig;

        public Builder() {
            pickerConfig = new MyPickerConfig();
        }

        public Builder setId(String id){
            pickerConfig.id=id;
            return this;
        }

        public Builder setTitleStringId(String title) {
            pickerConfig.mTitleString = title;
            return this;
        }

        public MyTimePickerDialog build(){
            return newIntance(pickerConfig);
        }

    }
}
