package com.nytimes.android.analytics;

import defpackage.zq3;

/* loaded from: classes2.dex */
public final class SensitiveDataUseError extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SensitiveDataUseError(String str) {
        super(str);
        zq3.h(str, "message");
    }
}
