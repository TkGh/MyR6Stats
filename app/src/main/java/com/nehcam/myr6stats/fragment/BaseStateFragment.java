package com.nehcam.myr6stats.fragment;

import com.nehcam.myr6stats.BaseFragment;

public class BaseStateFragment<I> extends BaseFragment implements ViewContract<I> {

    @Override
    public void showLoading() {}

    @Override
    public void hideLoading() {}

    @Override
    public void showEmptyState() {}

    @Override
    public void showError(String msg, boolean showRetryButton) {}

    @Override
    public void handleResult(I result) {

    }
}
