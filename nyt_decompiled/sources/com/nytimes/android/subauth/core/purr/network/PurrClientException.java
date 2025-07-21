package com.nytimes.android.subauth.core.purr.network;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrClientException extends Exception {
    private final Throwable cause;
    private final boolean isNetworkConnectivityError;
    private final String message;

    public /* synthetic */ PurrClientException(String str, Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? false : z);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public PurrClientException(String str, Throwable th, boolean z) {
        this.message = str;
        this.cause = th;
        this.isNetworkConnectivityError = z;
    }
}
