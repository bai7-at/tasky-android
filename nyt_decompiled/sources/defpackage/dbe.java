package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class dbe implements acd {
    protected dbe() {
    }

    @Override // defpackage.acd
    public final kod a(Looper looper, Handler.Callback callback) {
        return new kde(new Handler(looper, callback));
    }

    @Override // defpackage.acd
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }
}
