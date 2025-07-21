package com.lyft.kronos.internal.ntp;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class NTPSyncException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTPSyncException(String str) {
        super(str);
        zq3.h(str, "message");
    }
}
