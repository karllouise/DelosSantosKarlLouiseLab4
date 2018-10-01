package com.DelosSantos.KarlLouise;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DebugKarl","onCreate() is working");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DebugKarl","onStart() is working");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DebugKarl","onResume() is working");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DebugKarl","onPause() is working");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DebugKarl","onStop is working");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DebugKarl","onRestart is working");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DebugKarl","onDestroy is working");
    }

    public void showBack (View v) {
        Toast.makeText(this, "Sorry! Cannot go back yet.", Toast.LENGTH_SHORT).show();
    }

    public void showNext (View v) {
        Snackbar.make(v, "Sorry! There's nothing more.", Snackbar.LENGTH_LONG).show();
    }

}

