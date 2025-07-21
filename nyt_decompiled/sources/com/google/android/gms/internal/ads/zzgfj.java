package com.google.android.gms.internal.ads;

import defpackage.mke;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zzgfj extends TimeoutException {
    /* synthetic */ zzgfj(String str, mke mkeVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
