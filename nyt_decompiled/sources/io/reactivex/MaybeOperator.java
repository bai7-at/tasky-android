package io.reactivex;

import io.reactivex.annotations.NonNull;

/* loaded from: classes5.dex */
public interface MaybeOperator<Downstream, Upstream> {
    @NonNull
    MaybeObserver<? super Upstream> apply(@NonNull MaybeObserver<? super Downstream> maybeObserver) throws Exception;
}
