package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
final class gc implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ eb b;

    gc(Executor executor, eb ebVar) {
        this.a = executor;
        this.b = ebVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.g(e);
        }
    }
}
