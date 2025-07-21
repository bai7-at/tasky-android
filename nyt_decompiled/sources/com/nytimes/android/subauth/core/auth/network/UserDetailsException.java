package com.nytimes.android.subauth.core.auth.network;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class UserDetailsException extends RuntimeException {
    private final Throwable cause;
    private final boolean isNetworkConnectivityError;
    private final String message;

    public /* synthetic */ UserDetailsException(String str, Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? false : z);
    }

    public final boolean a() {
        return this.isNetworkConnectivityError;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public UserDetailsException(String str, Throwable th, boolean z) {
        super(str, th);
        this.message = str;
        this.cause = th;
        this.isNetworkConnectivityError = z;
    }
}
