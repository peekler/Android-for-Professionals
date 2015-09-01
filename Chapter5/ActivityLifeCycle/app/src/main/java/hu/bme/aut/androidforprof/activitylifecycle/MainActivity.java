package hu.bme.aut.androidforprof.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    public static final String ACTIVITY_LIFECYCLE = "ACTIVITY_LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Activity is being created.
        Log.i(ACTIVITY_LIFECYCLE, "onCreate() called.");
        logMethodName();
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Activity becomes visible.
        Log.i(ACTIVITY_LIFECYCLE, "onStart() called.");
        logMethodName();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Activity is visible and has focus.
        Log.i(ACTIVITY_LIFECYCLE, "onResume() called.");
        logMethodName();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Another Activity gets focus,
        // this Activity will go into pause state.
        Log.i(ACTIVITY_LIFECYCLE, "onPause() called.");
        logMethodName();
    }

    @Override
    protected void onStop() {
        super.onStop();
        // The Activity is not visible,
        // the Activity is in stopped state.
        Log.i(ACTIVITY_LIFECYCLE, "onStop() called.");
        logMethodName();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The Activity will destroy.
        Log.i(ACTIVITY_LIFECYCLE, "onDestroy() called.");
        logMethodName();
    }

    public static void logMethodName() {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        Log.i(ACTIVITY_LIFECYCLE, ste[3].getMethodName()+" method called.");
    }
}
