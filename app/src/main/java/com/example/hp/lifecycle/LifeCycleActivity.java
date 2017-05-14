package com.example.hp.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class LifeCycleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Toast.makeText(LifeCycleActivity.this,"CREATE HUA", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(LifeCycleActivity.this,"START HO GAYA", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(LifeCycleActivity.this," AB RESUME", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(LifeCycleActivity.this,"PAUSE HO GAYA", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(LifeCycleActivity.this,"DOBARA CHALA-RESTART", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(LifeCycleActivity.this,"AB STOP HUA", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(LifeCycleActivity.this,"KHATAM KHALLAAS.... BYE", Toast.LENGTH_SHORT).show();
    }
}
