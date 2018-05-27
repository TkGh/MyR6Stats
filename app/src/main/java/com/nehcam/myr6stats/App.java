package com.nehcam.myr6stats;

import android.app.Application;
import android.content.Context;
import android.support.annotation.Nullable;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class App extends Application {
    protected static final String TAG = App.class.toString();
    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

    @Nullable
    public static RefWatcher getRefWatcher(Context context) {
        final App application = (App) context.getApplicationContext();
        return application.refWatcher;
    }
}
