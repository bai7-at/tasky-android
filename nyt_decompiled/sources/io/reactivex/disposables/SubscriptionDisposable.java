package io.reactivex.disposables;

import defpackage.hb8;
import io.reactivex.annotations.NonNull;

/* loaded from: classes5.dex */
final class SubscriptionDisposable extends ReferenceDisposable<hb8> {
    private static final long serialVersionUID = -707001650852963139L;

    SubscriptionDisposable(hb8 hb8Var) {
        super(hb8Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull hb8 hb8Var) {
        hb8Var.cancel();
    }
}
