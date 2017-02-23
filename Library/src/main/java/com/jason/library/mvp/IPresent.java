package com.jason.library.mvp;


public interface IPresent<V> {
    void attachV(V view);

    void detachV();
}
