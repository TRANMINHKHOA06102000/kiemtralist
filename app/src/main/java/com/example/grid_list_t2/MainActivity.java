package com.example.grid_list_t2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<BanHang> mangBanHang;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        adapter=new MyAdapter(this,R.layout.row, mangBanHang);
        listView.setAdapter(adapter);
       listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                xacnhanXoa(i);
                return false;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mh = new Intent(MainActivity.this,Detail.class);
                startActivity(mh);
            }
        });
    }
    private void xacnhanXoa(final int position)
    {
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        alertDialog.setTitle("Thông Báo!");
        //alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setMessage("Bạn có muốn xóa không");
        alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                mangBanHang.remove(position);
                adapter.notifyDataSetChanged();//cập nhật lại mảng
            }
        });
        alertDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }
    public  void Anhxa()
    {
        listView=(ListView) findViewById(R.id.listview);
        mangBanHang =new ArrayList<>();
        mangBanHang.add(new BanHang("Trần minh khoa",R.drawable.fbxml));
        mangBanHang.add(new BanHang("Thanh xuyến",R.drawable.fbxml));
        mangBanHang.add(new BanHang("Thành luân",R.drawable.fbxml));
        mangBanHang.add(new BanHang("duy long",R.drawable.fbxml));
        mangBanHang.add(new BanHang("Trần minh khoa",R.drawable.fbxml));
        mangBanHang.add(new BanHang("Thanh xuyến",R.drawable.fbxml));
        mangBanHang.add(new BanHang("Thành luân",R.drawable.fbxml));
        mangBanHang.add(new BanHang("duy long",R.drawable.fbxml));
        mangBanHang.add(new BanHang("Thành luân",R.drawable.fbxml));
        mangBanHang.add(new BanHang("duy long",R.drawable.fbxml));
        mangBanHang.add(new BanHang("Trần minh khoa",R.drawable.fbxml));
        mangBanHang.add(new BanHang("Thanh xuyến",R.drawable.fbxml));
        mangBanHang.add(new BanHang("Thành luân",R.drawable.fbxml));
        mangBanHang.add(new BanHang("duy long",R.drawable.fbxml));
    }


}