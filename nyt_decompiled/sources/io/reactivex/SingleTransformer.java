package io.reactivex;

import io.reactivex.annotations.NonNull;

/* loaded from: classes5.dex */
public interface SingleTransformer<Upstream, Downstream> {
    @NonNull
    SingleSource<Downstream> apply(@NonNull Single<Upstream> single);
}
