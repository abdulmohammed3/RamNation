package com.example.in_19;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.codepath.asynchttpclient.AsyncHttpClient;
import com.example.in_19.adapters.stateAdapter;
import com.example.in_19.models.State;
import com.loopj.android.http.FileAsyncHttpResponseHandler;

import org.apache.log4j.chainsaw.Main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import jxl.WorkbookSettings;

public class MainActivity extends AppCompatActivity {

    public static final String URL = "https://github.com/abdulmohammed3/RamNation/blob/main/CovidDashbords.xlsx?raw=true";
    List<State> states;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvStates = findViewById(R.id.rvStates);
        states = new ArrayList<>();

        final stateAdapter stAdapter = new stateAdapter(this,states);

        rvStates.setAdapter(stAdapter);

        rvStates.setLayoutManager(new LinearLayoutManager(this));

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(URL, new FileAsyncHttpResponseHandler(this) {
            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, File file) {
                Toast.makeText(MainActivity.this,"Download Failed",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, File file) {
                WorkbookSettings ws = new WorkbookSettings();
                ws.setGCDisabled(true);
                if(file!=null){

                }
            }
        })
    }
}