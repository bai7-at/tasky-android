package defpackage;

import android.os.SystemClock;

/* loaded from: classes3.dex */
final class luf {
    private Exception a;
    private long b;

    public luf(long j) {
    }

    public final void a() {
        this.a = null;
    }

    public final void b(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
            this.b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.b) {
            Exception exc2 = this.a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.a;
            this.a = null;
            throw exc3;
        }
    }
}
