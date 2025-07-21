package com.nytimes.android.internal.pushmessaging.util;

import defpackage.by0;
import defpackage.ss2;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;

/* loaded from: classes4.dex */
public final class ControlledRunner {
    private final AtomicReference a = new AtomicReference(null);

    public final Object b(ss2 ss2Var, by0 by0Var) {
        Deferred deferred = (Deferred) this.a.get();
        return deferred != null ? deferred.await(by0Var) : CoroutineScopeKt.coroutineScope(new ControlledRunner$joinPreviousOrRun$3(this, ss2Var, null), by0Var);
    }
}
