package com.example.benjamin.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> adArrayAdapter;



    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
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

        adArrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,sWeather);
        ListView lView = (ListView) rootView.findViewById(R.id.listViewForeCast);
        lView.setAdapter(adArrayAdapter);
        return rootView;
       // return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
