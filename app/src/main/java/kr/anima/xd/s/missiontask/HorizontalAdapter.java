package kr.anima.xd.s.missiontask;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * Created by alfo6-10 on 8/17/2017.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    Activity context;
    ArrayList<DialogNewMissionFragment.Element> list;

    public HorizontalAdapter(Activity context, ArrayList<DialogNewMissionFragment.Element> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public HorizontalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.cb_element, parent, false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(HorizontalAdapter.ViewHolder holder, int position) {
//        Drawable drawable=Drawable.createFromPath(String.valueOf(list.get(position)));
//        Drawable drawable=context.getResources().getDrawable(list.get(position).symbol, null);
//        holder.cb.setCompoundDrawables(null, drawable, null, null);
////        holder.cb.setButtonDrawable(list.get(position).symbol);
////        holder.cb.setCompoundDrawables(null, drawable, null, null);
//        holder.cb.setText(list.get(position).name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        CheckBox cb;
        public ViewHolder(View itemView) {
            super(itemView);
            cb=itemView.findViewById(R.id.CB);
        }
    }

}
