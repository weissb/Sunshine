package com.example.benjamin.sunshine;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends ActionBarActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        ArrayAdapter<String> adArrayAdapter;
        String[]sForeCastArray = {
                "Today - Sunny - 88 / 63",
                "Tommorow - Sunny - 88 / 63",
                "Weds - Sunny - 88 / 63",
                "Thurs - Froggy - 88 / 63",
                "Fri - Rainy - 88 / 63",
                "Sat - Sunny - 88 / 63",
                "Sun - Sunny - 88 / 63"};

        List<String> sWeather = new ArrayList<String>(Arrays.asList(sForeCastArray));

        adArrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item_forecast,R.id.list_item_forecast_textview,sWeather);
        ListView lView = (ListView) findViewById(R.id.listViewForeCast);
        lView.setAdapter(adArrayAdapter);




        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
