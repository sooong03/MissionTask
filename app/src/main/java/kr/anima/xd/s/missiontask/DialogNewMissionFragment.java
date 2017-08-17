package kr.anima.xd.s.missiontask;


import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.joda.time.DateTime;
import org.joda.time.JodaTimePermission;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class DialogNewMissionFragment extends Fragment {

    private EditText edMissionTitle;
    private RecyclerView recyclerView;
    private ArrayList<Element> list=new ArrayList<>();

    private DateTime dateTime;

    private TextView TV_dateOfStart;

    public DialogNewMissionFragment() {
        for(int i=0; i<9; i++){
            list.add(new Element(R.drawable.ic_sel_ele_appearance+i, R.string.element_appearance+i));
        }
        dateTime=new DateTime(2017, 1, 1, 0, 0, 0, 0);

        System.out.print(dateTime.toString("yyyyMMdd"));

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dialog_new_mission, container, false);
        findId(view);

        return view;
    }



    public void findId(View view){
        edMissionTitle=view.findViewById(R.id.edMissionTitle);
        recyclerView=view.findViewById(R.id.viewElement);
        recyclerView.setAdapter(new HorizontalAdapter(getActivity(), list));
        TV_dateOfStart=view.findViewById(R.id.TV_dateOfStart);
        TV_dateOfStart.setText(dateTime.toString("yyyyMMdd"));
        System.out.print(dateTime.toString("yyyyMMdd"));
    }

    class Element{
        int symbol;
        int name;

        public Element(int symbol, int name) {
            this.symbol = symbol;
            this.name = name;
        }
    }


}
