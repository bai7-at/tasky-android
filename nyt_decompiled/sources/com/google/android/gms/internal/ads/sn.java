package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import defpackage.ezd;
import defpackage.fof;
import defpackage.hpf;

/* loaded from: classes3.dex */
abstract class sn {
    public static hpf a(Context context, wn wnVar, boolean z) {
        LogSessionId logSessionId;
        fof i = fof.i(context);
        if (i == null) {
            ezd.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new hpf(logSessionId);
        }
        if (z) {
            wnVar.i(i);
        }
        return new hpf(i.f());
    }
}
