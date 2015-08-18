package hu.bme.aut.androidforprof.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    public static final String ACTIITY_LIFECYCLE = "ACTIITY_LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logMethodName();
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        logMethodName();
    }

    @Override
    protected void onResume() {
        super.onResume();
        logMethodName();
    }

    @Override
    protected void onPause() {
        super.onPause();
        logMethodName();
    }

    @Override
    protected void onStop() {
        super.onStop();
        logMethodName();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logMethodName();
    }

    public static void logMethodName() {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        Log.d(ACTIITY_LIFECYCLE, ste[3].getMethodName()+" method called.");
    }
}
