package kr.anima.xd.s.missiontask;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import org.joda.time.DateTime;

import static kr.anima.xd.s.missiontask.R.layout.dialog_new_mission;

public class MainActivity extends AppCompatActivity{

    private MyDialog myDialog;
    DateTime dateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateTime=new DateTime();

    }


    public void clickBtn(View view) {
        switch (view.getId()){
            case R.id.btn_new_mission:
                Intent intent=new Intent(this, DialogActivity.class);
                startActivity(intent);
//                myDialog=new MyDialog(this, "Mission Title", dateTime.toString("yyyyMMdd"));
//                myDialog.show();
//                new AlertDialog.Builder(this)
//                        .setPositiveButton("save", this)
//                        .setNegativeButton("cancel", this)
//                        .setView(LayoutInflater.from(this).inflate(R.layout.dialog_new_mission, null))
//                        .create()
//                        .show();
                break;
//            case R.id.btn_add_task:
//                new AlertDialog.Builder(this)
//                        .setPositiveButton("save", this)
//                        .setNegativeButton("cancel", this)
//                        .setView(R.layout.dialog_add_task)
//                        .create().show();
//                break;
        }
    }





}
