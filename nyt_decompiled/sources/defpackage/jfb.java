package defpackage;

/* loaded from: classes3.dex */
final class jfb {
    private final Object a = new Object();
    private volatile int c = 1;
    private volatile long b = 0;

    /* synthetic */ jfb(ifb ifbVar) {
    }

    public final void a() {
        long currentTimeMillis = dyf.b().currentTimeMillis();
        synchronized (this.a) {
            try {
                if (this.c == 3) {
                    if (this.b + ((Long) pla.c().a(mpa.X5)).longValue() <= currentTimeMillis) {
                        this.c = 1;
                    }
                }
            } finally {
            }
        }
        long currentTimeMillis2 = dyf.b().currentTimeMillis();
        synchronized (this.a) {
            try {
                if (this.c != 2) {
                    return;
                }
                this.c = 3;
                if (this.c == 3) {
                    this.b = currentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
