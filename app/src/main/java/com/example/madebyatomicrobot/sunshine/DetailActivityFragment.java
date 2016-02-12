package com.example.madebyatomicrobot.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Intent intent = getActivity().getIntent();
        View rootview =  inflater.inflate(R.layout.fragment_detail, container, false);
        if (intent!=null && intent.hasExtra(Intent.EXTRA_TEXT)){
            String forecastStr = intent.getStringExtra(Intent.EXTRA_TEXT);
            ((TextView) rootview.findViewById(R.id.detail_text)).setText(forecastStr);
        }
    return rootview;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    @Override
    public void onCreateOptionsMenu(Menu menu,MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();
//        if(id==R.id.action_refresh){
//            FetchWeatherTask weatherTask = new FetchWeatherTask();
//            weatherTask.execute("45219");
// }
        if(id==R.id.action_settings){
            Intent settingsIntent = new Intent(getActivity(),SettingsActivity.class);
            startActivity(settingsIntent);
        }
        return true;


    }
}
