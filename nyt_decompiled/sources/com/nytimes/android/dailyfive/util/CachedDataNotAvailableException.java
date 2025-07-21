package com.nytimes.android.dailyfive.util;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CachedDataNotAvailableException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public CachedDataNotAvailableException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CachedDataNotAvailableException(String str) {
        super(str);
    }

    public /* synthetic */ CachedDataNotAvailableException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
