package kr.anima.xd.s.missiontask;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static kr.anima.xd.s.missiontask.R.layout.dialog_new_mission;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickBtn(View view) {
        switch (view.getId()){
            case R.id.btn_new_mission:

                new AlertDialog.Builder(this)
                        .setPositiveButton("save", this)
                        .setNegativeButton("cancel", this)
                        .setView(dialog_new_mission)
                        .create().show();
                break;
            case R.id.btn_add_task:
                new AlertDialog.Builder(this)
                        .setPositiveButton("save", this)
                        .setNegativeButton("cancel", this)
                        .setView(R.layout.dialog_add_task)
                        .create().show();
                break;
        }
    }


    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

    }

    public void checkElements(View v){

        // TODO : Toast 가능. color은 왜 안되죠
//        switch (v.getId()){
//            case R.id.IV_icon:
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    v.setBackgroundColor(getResources().getColor(R.color.colorAccent, null));
//                }
//                break;
//            case R.id.TV_name:
//                break;
//        }
//
//        ImageView icon=v.findViewById(R.id.IV_icon);
//        icon.setColorFilter(R.color.colorAccent);
//        TextView name=v.findViewById(R.id.TV_name);
//        name.setTextColor(R.color.colorAccent);

    }
}
