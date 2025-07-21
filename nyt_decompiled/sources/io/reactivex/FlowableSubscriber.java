package io.reactivex;

import defpackage.hb8;
import defpackage.va8;
import io.reactivex.annotations.NonNull;

/* loaded from: classes5.dex */
public interface FlowableSubscriber<T> extends va8 {
    @Override // defpackage.va8
    /* synthetic */ void onComplete();

    @Override // defpackage.va8
    /* synthetic */ void onError(Throwable th);

    @Override // defpackage.va8
    /* synthetic */ void onNext(Object obj);

    @Override // defpackage.va8
    void onSubscribe(@NonNull hb8 hb8Var);
}
