package io.reactivex.rxkotlin;

import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/* loaded from: classes5.dex */
public final class DisposableKt {
    public static final Disposable addTo(Disposable disposable, CompositeDisposable compositeDisposable) {
        zq3.i(disposable, "$this$addTo");
        zq3.i(compositeDisposable, "compositeDisposable");
        compositeDisposable.add(disposable);
        return disposable;
    }

    public static final void plusAssign(CompositeDisposable compositeDisposable, Disposable disposable) {
        zq3.i(compositeDisposable, "$this$plusAssign");
        zq3.i(disposable, "disposable");
        compositeDisposable.add(disposable);
    }
}
