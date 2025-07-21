package defpackage;

/* loaded from: classes2.dex */
public final class pcb {
    private long a;
    private long b = Long.MIN_VALUE;
    private final Object c = new Object();

    public pcb(long j) {
        this.a = j;
    }

    public final void a(long j) {
        synchronized (this.c) {
            this.a = j;
        }
    }

    public final boolean b() {
        synchronized (this.c) {
            try {
                long elapsedRealtime = dyf.b().elapsedRealtime();
                if (this.b + this.a > elapsedRealtime) {
                    return false;
                }
                this.b = elapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
