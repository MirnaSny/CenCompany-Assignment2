package com.exercise1.cencompany_assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.apple) {
            Intent intent=new Intent(MainActivity.this,Phones.class);
            intent.putExtra("device_type","Apple");
            startActivity(intent);
            return true;
        }
        if (id == R.id.samsung) {
            Intent intent=new Intent(MainActivity.this,Phones.class);
            intent.putExtra("device_type","Samsung");
            startActivity(intent);
            return true;
        }
        if (id == R.id.pixel) {
            Intent intent=new Intent(MainActivity.this,Phones.class);
            intent.putExtra("device_type","Pixel");
            startActivity(intent);
            return true;

        }
        if (id == R.id.oppo) {
            Intent intent=new Intent(MainActivity.this,Phones.class);
            intent.putExtra("device_type","Oppo");
            startActivity(intent);
            return true;
        }
        return true;
    }
}






