package io.embrace.android.embracesdk.internal.utils;

import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.InternalApi;

/* loaded from: classes5.dex */
public final class ThrowableUtilsKt {
    @InternalApi
    public static final StackTraceElement[] getSafeStackTrace(Throwable th) {
        zq3.h(th, "$this$getSafeStackTrace");
        try {
            return th.getStackTrace();
        } catch (Exception unused) {
            return null;
        }
    }
}
