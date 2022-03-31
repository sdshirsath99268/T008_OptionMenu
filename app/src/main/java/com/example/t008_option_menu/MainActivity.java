package com.example.t008_option_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Show Option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.call:
                Toast.makeText(getApplicationContext(), "Option Selected 'Call'", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sms:
                Toast.makeText(getApplicationContext(), "Option Selected 'SMS'", Toast.LENGTH_SHORT).show();
                break;
            case R.id.email:
                Toast.makeText(getApplicationContext(), "Option Selected 'Email'", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fax:
                Toast.makeText(getApplicationContext(), "Option Selected 'Fax'", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}