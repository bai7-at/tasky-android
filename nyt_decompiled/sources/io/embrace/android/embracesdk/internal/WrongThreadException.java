package io.embrace.android.embracesdk.internal;

import defpackage.zq3;

/* loaded from: classes5.dex */
public final class WrongThreadException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongThreadException(String str) {
        super(str);
        zq3.h(str, "message");
    }
}
