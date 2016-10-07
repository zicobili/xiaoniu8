package com.example.administrator.xiaoniu;


import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.administrator.xiaoniu.Adapter.JobAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/29.
 */
public class FragmentHome extends Fragment implements AdapterView.OnItemClickListener,JobAdapter.Callback {
    private JobAdapter adapter;
    private List<Job> listJob= new ArrayList<Job>();
    ListView listView;
    ScrollView sv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for(int i = 0;i<30;i++){
            listJob.add(new Job("fff"+i,"1","1500-1800","楚香阁",null,"肖霞","","","","","","",""));
        }
        adapter = new JobAdapter(getActivity(),listJob,this);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,null);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        sv = (ScrollView) view.findViewById(R.id.scrollview);
        sv.smoothScrollTo(0, 0);
        return view;
    }


    @Override
    public void click(View v) {
        Toast.makeText(getActivity(), "you click button, normal", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(),ChatActivity.class);
        startActivity(intent);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "you click item, normal", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(),JdActivity.class);
        startActivity(intent);
    }
}
