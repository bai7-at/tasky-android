package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import defpackage.hpf;
import defpackage.kxf;

/* loaded from: classes3.dex */
abstract class fp {
    public static void a(kxf kxfVar, hpf hpfVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        LogSessionId a = hpfVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = a.equals(logSessionId);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = kxfVar.b;
        stringId = a.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
