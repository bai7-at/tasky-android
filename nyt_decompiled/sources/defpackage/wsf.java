package defpackage;

import android.media.AudioTrack;

/* loaded from: classes3.dex */
final class wsf {
    private final tsf a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;

    public wsf(AudioTrack audioTrack) {
        int i = khe.a;
        this.a = new tsf(audioTrack);
        h(0);
    }

    private final void h(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.d = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }

    public final long a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final void c() {
        if (this.b == 4) {
            h(0);
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.b == 2;
    }

    public final boolean g(long j) {
        if (j - this.e < this.d) {
            return false;
        }
        tsf tsfVar = this.a;
        this.e = j;
        boolean c = tsfVar.c();
        int i = this.b;
        if (i == 0) {
            if (!c) {
                if (j - this.c <= 500000) {
                    return false;
                }
                h(3);
                return false;
            }
            if (this.a.b() < this.c) {
                return false;
            }
            this.f = this.a.a();
            h(1);
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c;
                }
                if (!c) {
                    return false;
                }
                h(0);
                return true;
            }
            if (!c) {
                h(0);
                return false;
            }
        } else {
            if (!c) {
                h(0);
                return false;
            }
            if (this.a.a() > this.f) {
                h(2);
                return true;
            }
        }
        return true;
    }
}
