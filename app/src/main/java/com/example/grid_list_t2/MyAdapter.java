package com.example.grid_list_t2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    int layout;
    List<BanHang> banHangList;

    public MyAdapter(Context context, int layout, List<BanHang> banHangList) {
        this.context = context;
        this.layout = layout;
        this.banHangList = banHangList;
    }

    @Override
    public int getCount() {
        return banHangList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(layout,null);

        TextView txtName=(TextView) view.findViewById(R.id.textviewTen);
        ImageView imgImage=(ImageView) view.findViewById(R.id.imageviewHinh);

        BanHang banHang = banHangList.get(i);

        txtName.setText(banHang.getName());
        imgImage.setImageResource(banHang.getImage());

        return view;
    }
}
