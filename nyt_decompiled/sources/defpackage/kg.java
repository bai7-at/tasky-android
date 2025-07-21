package defpackage;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class kg implements xl0 {
    @Override // defpackage.xl0
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.xl0
    public long c() {
        return SystemClock.elapsedRealtime();
    }
}
