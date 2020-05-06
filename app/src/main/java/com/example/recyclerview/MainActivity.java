package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Movies";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<MovieEntity> movies = SampleData.getMovies();
        
        for(MovieEntity movie : movies) {
            Log.i(TAG, movie.toString());
        }
    }
}
