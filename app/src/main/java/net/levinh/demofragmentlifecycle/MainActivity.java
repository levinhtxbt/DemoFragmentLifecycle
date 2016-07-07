package net.levinh.demofragmentlifecycle;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Activity: ";

    public MainActivity() {
        super();
        Log.d(TAG, this + ": this()");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        Log.d(TAG, this + ": finalize()");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, this + ": onCreate()");

        TextView tv = (TextView) findViewById(R.id.tvHello);
        tv.setText("Hello world");

        if (getFragmentManager().findFragmentByTag("test_fragment") == null) {
            Log.d(TAG, this + ": Existing fragment not found.");
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(R.id.fragment_container, new DemoFragment(), "test_fragment").commit();
        } else {
            Log.d(TAG, this + ": Existing fragment found.");
        }
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.d(TAG, this + ": onAttachFragment()");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.d(TAG, this + ": onContentChanged()");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, this + ": onActivityResult()");
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, this + ": onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, this + ": onRestoreInstanceState()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, this + ": onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, this + ": onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, this + ": onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, this + ": onRestart()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(TAG, this + ": onSaveInstanceState()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, this + ": onDestroy()");
    }

}
