package kr.anima.xd.s.missiontask;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by alfo6-10 on 8/17/2017.
 */

public class MyDialog extends Dialog {

    String hint;
    String today;


    public MyDialog(@NonNull Context context) {
        super(context);
    }

    public MyDialog(Context context, String hint, String today, View.OnClickListener cancel, View.OnClickListener ok){
        super(context);
        this.hint=hint;
        this.today=today;
    }

    public MyDialog(Context context, String hint, String today){
        super(context);
        this.hint=hint;
        this.today=today;
    }

    public MyDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    public MyDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowManager.LayoutParams params=new WindowManager.LayoutParams(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        params.dimAmount=0.8f;
        getWindow().setAttributes(params);

        setContentView(R.layout.activity_dialog);

    }


}
