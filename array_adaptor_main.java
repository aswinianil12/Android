package com.example.arrayadapter;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView l;
    String tutorials[]={"Algorithms", "Data Structures", "Languages","dbms","java","python"};

    @Override
    protected void onCreate( Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.list);
        final ArrayAdapter<String>arr;
        arr=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tutorials);
        l.setAdapter(arr);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?>adapterView,View view,int position,long id){
                String value=arr.getItem(position);
            Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
        }
    });

    }
}
