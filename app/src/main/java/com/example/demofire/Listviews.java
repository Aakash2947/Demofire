package com.example.demofire;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class Listviews extends AppCompatActivity {

    ListView listview;
    String subjectList[] = new String[]{ "Chemistry", "Physics","Biology"};
    int image[]={R.drawable.chemistry,R.drawable.physics,R.drawable.biology};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listviews, R.id.textView, subjectList);
        listview.setAdapter(arrayAdapter);
    }
}
