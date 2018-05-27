package com.nehcam.myr6stats.fragment.list;

import com.nehcam.myr6stats.fragment.ViewContract;

public interface ListViewContract<I, N> extends ViewContract<I> {
    void showListFooter(boolean show);

    void handleNextItems(N result);
}
