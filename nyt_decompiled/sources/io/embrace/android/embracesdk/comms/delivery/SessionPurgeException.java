package io.embrace.android.embracesdk.comms.delivery;

import defpackage.zq3;

/* loaded from: classes5.dex */
public final class SessionPurgeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionPurgeException(String str) {
        super(str);
        zq3.h(str, "message");
    }
}
