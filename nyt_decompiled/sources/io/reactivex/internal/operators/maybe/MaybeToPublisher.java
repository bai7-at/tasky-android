package io.reactivex.internal.operators.maybe;

import defpackage.g86;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;

/* loaded from: classes5.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, g86> {
    INSTANCE;

    public static <T> Function<MaybeSource<T>, g86> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public g86 apply(MaybeSource<Object> maybeSource) throws Exception {
        return new MaybeToFlowable(maybeSource);
    }
}
