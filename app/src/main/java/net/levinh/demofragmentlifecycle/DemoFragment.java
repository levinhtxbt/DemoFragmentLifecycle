package net.levinh.demofragmentlifecycle;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DemoFragment extends Fragment {

    private static final String TAG = "Fragment: ";

    public DemoFragment() {
        super();
        Log.d(TAG, this + ": this() " + this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, this + ": onCreate()");
        setRetainInstance(true);
    }

    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        Log.d(TAG, this + ": onAttach(" + activity + ")");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, this + ": onActivityCreated()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, this + ": onCreateView()");
        return inflater.inflate(R.layout.fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, this + ": onViewCreated()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, this + ": onDestroyView()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, this + ": onDetach()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, this + ": onStart()");
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
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, this + ": onDestroy()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, this + ": onSaveInstanceState()");
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG, this + ": onViewStateRestored()");
    }
}
