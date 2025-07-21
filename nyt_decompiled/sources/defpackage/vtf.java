package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes3.dex */
abstract class vtf {
    public static void a(AudioTrack audioTrack, hpf hpfVar) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId a = hpfVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = a.equals(logSessionId);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(a);
    }
}
