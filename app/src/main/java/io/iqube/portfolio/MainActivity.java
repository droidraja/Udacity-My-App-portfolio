package io.iqube.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button spotify,scores,library,buildIt,xyzReader,capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotify=(Button)findViewById(R.id.spotify);
        scores=(Button)findViewById(R.id.scores);
        library=(Button)findViewById(R.id.library);
        buildIt=(Button)findViewById(R.id.buildit);
        xyzReader=(Button)findViewById(R.id.xyzreader);
        capstone=(Button)findViewById(R.id.capstone);

        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        buildIt.setOnClickListener(this);
        xyzReader.setOnClickListener(this);
        capstone.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String ToastMessage;
        switch (v.getId())
        {
           case R.id.spotify:ToastMessage="This will launch my spotify streamer App";
            break;
            case R.id.scores:ToastMessage="This will launch my Scores App!";
                break;
            case R.id.library:ToastMessage="This will launch my Gradle library App!";
                break;
            case R.id.buildit:ToastMessage="This will launch my Build It Bigger App";
                break;
            case R.id.xyzreader:ToastMessage="This will launch my XYZ Reader App";
                break;
            case R.id.capstone:ToastMessage="This will launch My CAPSTONE project App!";
                break;
        }
    }
}
