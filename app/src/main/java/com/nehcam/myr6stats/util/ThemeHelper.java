package com.nehcam.myr6stats.util;

import android.content.Context;

import com.nehcam.myr6stats.R;

public class ThemeHelper {

    /**
     * Apply the selected theme(@TODO will be added in settings)
     * in the context with the styles
     *
     * @param context context that the themes will be applied
     */
    public static void setTheme(Context context) {
        context.setTheme(R.style.DarkTheme);
    }
}
