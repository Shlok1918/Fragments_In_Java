package com.shlok.blackcoffer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Refine_Page extends AppCompatActivity {

    Toolbar toolbar2;

    String[] item =  {"Available | Hey Let Us Connect","Away | Stay Discrete And Watch","Busy | Do Not Dsiturb | Will CatchUp Later","SOS | Emergency! Need Assistance! HELP" };
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_page);

        autoCompleteTextView = findViewById(R.id.autoComplete_text);
        adapterItems =  new ArrayAdapter<String>(this,R.layout.dropdown_list,item);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
            }
        });

        toolbar2 = findViewById(R.id.toolbar2);

        setSupportActionBar(toolbar2);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            getSupportActionBar().setHomeAsUpIndicator(R.drawable.back_arrow);
        }

        toolbar2.setTitle("Refine");

        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the home button click, e.g., go back or perform some other action
                onBackPressed();
            }
        });
    }

    // Handle the back button press
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
