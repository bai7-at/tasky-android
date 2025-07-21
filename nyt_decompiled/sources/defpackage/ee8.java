package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public class ee8 implements vl0 {
    protected ee8() {
    }

    @Override // defpackage.vl0
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // defpackage.vl0
    public r63 b(Looper looper, Handler.Callback callback) {
        return new je8(new Handler(looper, callback));
    }

    @Override // defpackage.vl0
    public void c() {
    }

    @Override // defpackage.vl0
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
