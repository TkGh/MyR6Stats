package com.nehcam.myr6stats;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.nehcam.myr6stats.fragment.SearchFragment;
import com.nehcam.myr6stats.util.NavigationHelper;
import com.nehcam.myr6stats.util.ThemeHelper;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final boolean DEBUG = !BuildConfig.BUILD_TYPE.equals("release");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (DEBUG)
            Log.d(TAG, "onCreate() called with savedInstanceState = [" + savedInstanceState + "]");

        ThemeHelper.setTheme(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (DEBUG) Log.d(TAG, "opOptionsItemSelected() called with: item = [" + item + "]");

        switch (item.getItemId()) {
            case android.R.id.home:
                onHomeButtonPressed();
                return true;
            case R.id.action_search:
                NavigationHelper.openSearch(getSupportFragmentManager());
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void onHomeButtonPressed() {

    }
}
