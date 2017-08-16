package kr.anima.xd.s.missiontask;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static kr.anima.xd.s.missiontask.R.layout.dialog_new_mission;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    View.OnClickListener listener_positive=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    View.OnClickListener listener_negative =new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_new_mission:

                // TODO : 다이얼로그가 왜 안떠
                new AlertDialog.Builder(this)
                        .setPositiveButton("save", (DialogInterface.OnClickListener) listener_positive)
                        .setNegativeButton("cancel", (DialogInterface.OnClickListener) listener_negative)
                        .setView(dialog_new_mission)
                        .create().show();
                break;
            case R.id.btn_add_task:
                new AlertDialog.Builder(this)
                        .setPositiveButton("save", (DialogInterface.OnClickListener) listener_positive)
                        .setNegativeButton("cancel", (DialogInterface.OnClickListener) listener_negative)
                        .setView(R.layout.dialog_add_task)
                        .create().show();
                break;
        }
    }



}
