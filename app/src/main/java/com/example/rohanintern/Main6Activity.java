package com.example.rohanintern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    public EditText et;
    public Button bu;
    public ListView li;
    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        et = (EditText)findViewById(R.id.editText6);
        bu = (Button) findViewById(R.id.button5);
        li = (ListView) findViewById(R.id.list);
        items = helper.read(this);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        li.setAdapter(adapter);
        li.setOnItemClickListener(this);



        bu.setOnClickListener( this);

    }
    public  void onClick(View view) {
        switch (view.getId()){
            case R.id.button5:
                String it = et.getText().toString();
                adapter.add(it);
                et.setText("");
                helper.Write(items,this);
                Toast.makeText(Main6Activity.this,"Item added",Toast.LENGTH_SHORT);
                break;


        }
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        items.remove(i);
        adapter.notifyDataSetChanged();
        Toast.makeText(Main6Activity.this,"Delete",Toast.LENGTH_SHORT);
    }
}
