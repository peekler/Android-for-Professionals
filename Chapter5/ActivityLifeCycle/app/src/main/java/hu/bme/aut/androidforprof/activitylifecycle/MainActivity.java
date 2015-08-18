package hu.bme.aut.androidforprof.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    public static final String ACTIVITY_LIFECYCLE = "ACTIVITY_LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(ACTIVITY_LIFECYCLE, "onCreate() called.");
        logMethodName();
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(ACTIVITY_LIFECYCLE, "onCreate() called.");
        logMethodName();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(ACTIVITY_LIFECYCLE, "onCreate() called.");
        logMethodName();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(ACTIVITY_LIFECYCLE, "onCreate() called.");
        logMethodName();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ACTIVITY_LIFECYCLE, "onCreate() called.");
        logMethodName();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ACTIVITY_LIFECYCLE, "onCreate() called.");
        logMethodName();
    }

    public static void logMethodName() {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        Log.d(ACTIVITY_LIFECYCLE, ste[3].getMethodName()+" method called.");
    }
}
