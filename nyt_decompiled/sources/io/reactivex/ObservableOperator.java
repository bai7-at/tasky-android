package io.reactivex;

import io.reactivex.annotations.NonNull;

/* loaded from: classes5.dex */
public interface ObservableOperator<Downstream, Upstream> {
    @NonNull
    Observer<? super Upstream> apply(@NonNull Observer<? super Downstream> observer) throws Exception;
}
