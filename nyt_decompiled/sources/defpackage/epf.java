package defpackage;

import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
final class epf {
    public static final epf b;
    public final LogSessionId a;

    static {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        b = new epf(logSessionId);
    }

    public epf(LogSessionId logSessionId) {
        this.a = logSessionId;
    }
}
