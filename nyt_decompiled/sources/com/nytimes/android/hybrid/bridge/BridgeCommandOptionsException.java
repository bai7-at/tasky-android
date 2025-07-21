package com.nytimes.android.hybrid.bridge;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class BridgeCommandOptionsException extends Exception {
    private final String errorDetails;
    private final String message;

    public /* synthetic */ BridgeCommandOptionsException(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String a() {
        return this.errorDetails;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public BridgeCommandOptionsException(String str, String str2) {
        zq3.h(str, "message");
        this.message = str;
        this.errorDetails = str2;
    }
}
