package com.nehcam.myr6stats.util;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;

import com.nehcam.myr6stats.R;
import com.nehcam.myr6stats.fragment.SearchFragment;

public class NavigationHelper {

    /*//////////////////////////////////////////////////////////////////////////
    // Through FragmentManager
    //////////////////////////////////////////////////////////////////////////*/
    public static void openSearch(FragmentManager fragmentManager) {
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_holder, new SearchFragment())
                .commit();
    }
}
