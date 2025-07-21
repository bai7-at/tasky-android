package com.nytimes.subauth.ui.purr.tcf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class TCFException extends Exception {
    private final Throwable cause;
    private final String message;

    public /* synthetic */ TCFException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public TCFException(String str, Throwable th) {
        this.message = str;
        this.cause = th;
    }
}
