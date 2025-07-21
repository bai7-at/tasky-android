package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* loaded from: classes3.dex */
final class v4 implements Thread.UncaughtExceptionHandler {
    private final String a;
    final /* synthetic */ y4 b;

    public v4(y4 y4Var, String str) {
        this.b = y4Var;
        Preconditions.checkNotNull(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.a.o().n().b(this.a, th);
    }
}
