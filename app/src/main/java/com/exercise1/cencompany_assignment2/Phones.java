package com.exercise1.cencompany_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Phones extends AppCompatActivity {
    private ListView listViewPhones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        listViewPhones = findViewById(R.id.listview_phones);

        String deviceType = getIntent().getStringExtra("device_type");

        if (deviceType.equals("Apple")) {
            String[] appleData = getResources().getStringArray(R.array.Apple);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, appleData);
            listViewPhones.setAdapter(adapter);

            listViewPhones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent =new Intent(Phones.this,Apple.class);
                    intent.putExtra("phone_model",appleData[position]);
                    startActivity(intent);
                }
            });

        } else if (deviceType.equals("Samsung")) {
            String[] samsungData = getResources().getStringArray(R.array.Samsung);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, samsungData);
            listViewPhones.setAdapter(adapter);

            listViewPhones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(Phones.this, Samsung.class);
                    intent.putExtra("phone_model", samsungData[position]);
                    startActivity(intent);
                }
            });


        } else if (deviceType.equals("Pixel")) {
            String[] pixelData = getResources().getStringArray(R.array.Pixel);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pixelData);
            listViewPhones.setAdapter(adapter);

            listViewPhones.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Phones.this, Pixel.class);
                intent.putExtra("phone_model", pixelData[position]);
                startActivity(intent);
            }
        });



        } else if (deviceType.equals("Oppo")) {
            String[] oppoData = getResources().getStringArray(R.array.Oppo);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, oppoData);
            listViewPhones.setAdapter(adapter);

            listViewPhones.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(Phones.this, Oppo.class);
                    intent.putExtra("phone_model", oppoData[position]);
                    startActivity(intent);
                }
            });

        }else {

        }



}}