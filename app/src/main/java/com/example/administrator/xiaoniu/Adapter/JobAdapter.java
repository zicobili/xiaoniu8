package com.example.administrator.xiaoniu.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.LauncherApps;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.xiaoniu.JdActivity;
import com.example.administrator.xiaoniu.Job;
import com.example.administrator.xiaoniu.R;

import java.util.List;

/**
 * Created by Administrator on 2016/10/1.
 */
public class JobAdapter extends BaseAdapter implements View.OnClickListener {
    private Context context;
    private LayoutInflater inflater;
    private List<Job> listJob;
    private Callback mCallback;

    public interface  Callback{
        public void click(View v);
    }

    public JobAdapter(Context context,List<Job> listJob,Callback callback){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.listJob = listJob;
        this.mCallback = callback;
    }


    @Override
    public int getCount() {
        return listJob.size();
    }

    @Override
    public Object getItem(int position) {
        return listJob.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void onClick(View v) {
        mCallback.click(v);

    }

    public class ViewHolder{
        public TextView title;
        public ImageView time;
        public TextView salary;
        public TextView storename;
        public TextView bossname;
         public ImageView header;
        public Button contact;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){

            holder = new ViewHolder();

            convertView = inflater.inflate(R.layout.item_home_content,null);

            holder.title = (TextView) convertView.findViewById(R.id.tv_title);
            holder.time = (ImageView) convertView.findViewById(R.id.iv_time);
            holder.salary = (TextView) convertView.findViewById(R.id.tv_salary);
            holder.storename = (TextView) convertView.findViewById(R.id.tv_storename);
            holder.bossname = (TextView) convertView.findViewById(R.id.tv_bossname);
            holder.header = (ImageView) convertView.findViewById(R.id.chead);
            holder.contact = (Button) convertView.findViewById(R.id.btn_contact);
            convertView.setTag(holder);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.title.setText(listJob.get(position).getTitle());
        holder.contact.setOnClickListener(this);
        holder.contact.setTag(position);
        return convertView;


    }
}
