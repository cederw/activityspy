package edu.washington.cederw.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.content.Intent;
import android.widget.Button;
import android.view.View;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate event fired");
        if(savedInstanceState != null){
            Log.i(TAG,savedInstanceState.toString());
        }
        Log.i(TAG,"onCreate event fired");
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });


    }

    @Override
    protected void onStart() {
        Log.i(TAG,"onStart event fired");
        super.onStart();


    }

    @Override
     protected void onResume() {
        Log.i(TAG,"onResume event fired");
        super.onResume();


    }

    @Override
    protected void onPause() {
        Log.i(TAG,"onPause event fired");
        super.onPause();


    }

    @Override
    protected void onStop() {
        Log.i(TAG,"onStop event fired");
        super.onStop();

    }

    @Override
    protected void onRestart() {
        Log.i(TAG,"onRestart event fired");
        super.onRestart();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

     @Override
    protected void onDestroy(){
         Log.i(TAG,"onDestroy event fired");
         Log.e(TAG, "We’re going down, Captain!");
         super.onDestroy();
    }
}
