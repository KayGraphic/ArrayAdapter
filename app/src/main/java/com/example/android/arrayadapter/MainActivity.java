package com.example.android.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       listView = (ListView) findViewById(R.id.movies_list);
        ArrayList<Movie> moviesList = new ArrayList<>();



        moviesList.add(new Movie(R.drawable.photo1, "BoomBox1" , "2013"));
        moviesList.add(new Movie(R.drawable.photo2, "Outdated Tech" , "2017"));
        moviesList.add(new Movie(R.drawable.photo3 ,"Not New" , "2016"));
        moviesList.add(new Movie(R.drawable.photo4, "Unicorn Leather" , "2014"));
        moviesList.add(new Movie(R.drawable.photo5, "Fight Nub" , "1999"));
        moviesList.add(new Movie(R.drawable.photo6, "Ring Ring Banana Phone" , "1975"));
        moviesList.add(new Movie(R.drawable.photo7, "So Lonely" , "2011"));
        moviesList.add(new Movie(R.drawable.photo8, "Obsolete and Gone" , "2016"));
        moviesList.add(new Movie(R.drawable.photo9, "Abandoned" , "2011"));
        moviesList.add(new Movie(R.drawable.photo10, "Abandoned Part 2" , "2013"));
        moviesList.add(new Movie(R.drawable.photo11, "Abandoned Part 3" , "2015"));

        mAdapter = new MovieAdapter(this,moviesList);
        listView.setAdapter(mAdapter);

    }
}