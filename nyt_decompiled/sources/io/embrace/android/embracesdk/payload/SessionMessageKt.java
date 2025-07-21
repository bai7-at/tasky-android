package io.embrace.android.embracesdk.payload;

import defpackage.zq3;

/* loaded from: classes5.dex */
public final class SessionMessageKt {
    public static final boolean isV2Payload(SessionMessage sessionMessage) {
        zq3.h(sessionMessage, "$this$isV2Payload");
        return sessionMessage.getData() != null;
    }
}
