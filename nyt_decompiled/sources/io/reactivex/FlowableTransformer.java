package io.reactivex;

import defpackage.g86;
import io.reactivex.annotations.NonNull;

/* loaded from: classes5.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    g86 apply(@NonNull Flowable<Upstream> flowable);
}
