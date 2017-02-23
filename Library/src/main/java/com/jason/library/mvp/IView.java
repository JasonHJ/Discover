package com.jason.library.mvp;

import android.os.Bundle;
import android.view.View;


public interface IView<P> {
    int getLayoutId();

    int getOptionsMenuId();

    void bindUI(View rootView);

    void bindEvent();

    void initData(Bundle savedInstanceState);

    boolean useEventBus();

    P newP();
}
