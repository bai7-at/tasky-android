package com.nytimes.android.view.mvp;

import defpackage.lz4;

/* loaded from: classes4.dex */
public abstract class BasePresenter {
    lz4 a;

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please save Presenter.attachView(MvpView) before requesting data to the Presenter");
        }
    }

    public void L() {
        this.a = null;
    }

    public lz4 M() {
        return this.a;
    }

    public boolean O() {
        return this.a != null;
    }

    public void q(lz4 lz4Var) {
        this.a = lz4Var;
    }
}
