package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import defpackage.ur;
import defpackage.z19;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class g {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private final a a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private int e;
    private f f;
    private int g;
    private boolean h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;
    private Method n;
    private long o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private int w;
    private int x;
    private long y;
    private long z;

    public interface a {
        void a(int i, long j);

        void b(long j);

        void c(long j);

        void d(long j, long j2, long j3, long j4);

        void e(long j, long j2, long j3, long j4);
    }

    public g(a aVar) {
        this.a = (a) ur.e(aVar);
        if (z19.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    private boolean a() {
        return this.h && ((AudioTrack) ur.e(this.c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.y;
        if (j != -9223372036854775807L) {
            return Math.min(this.B, this.A + z19.B(z19.c0((elapsedRealtime * 1000) - j, this.j), this.g));
        }
        if (elapsedRealtime - this.s >= 5) {
            u(elapsedRealtime);
            this.s = elapsedRealtime;
        }
        return this.t + (this.u << 32);
    }

    private long e() {
        return z19.P0(d(), this.g);
    }

    private void k(long j) {
        f fVar = (f) ur.e(this.f);
        if (fVar.e(j)) {
            long c = fVar.c();
            long b = fVar.b();
            long e = e();
            if (Math.abs(c - j) > 5000000) {
                this.a.e(b, c, j, e);
                fVar.f();
            } else if (Math.abs(z19.P0(b, this.g) - e) <= 5000000) {
                fVar.a();
            } else {
                this.a.d(b, c, j, e);
                fVar.f();
            }
        }
    }

    private void l() {
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.m >= 30000) {
            long e = e();
            if (e != 0) {
                this.b[this.w] = z19.h0(e, this.j) - nanoTime;
                this.w = (this.w + 1) % 10;
                int i = this.x;
                if (i < 10) {
                    this.x = i + 1;
                }
                this.m = nanoTime;
                this.l = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.x;
                    if (i2 >= i3) {
                        break;
                    }
                    this.l += this.b[i2] / i3;
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.h) {
            return;
        }
        k(nanoTime);
        m(nanoTime);
    }

    private void m(long j) {
        Method method;
        if (!this.q || (method = this.n) == null || j - this.r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) z19.j((Integer) method.invoke(ur.e(this.c), null))).intValue() * 1000) - this.i;
            this.o = intValue;
            long max = Math.max(intValue, 0L);
            this.o = max;
            if (max > 5000000) {
                this.a.b(max);
                this.o = 0L;
            }
        } catch (Exception unused) {
            this.n = null;
        }
        this.r = j;
    }

    private static boolean n(int i) {
        return z19.a < 23 && (i == 5 || i == 6);
    }

    private void q() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }

    private void u(long j) {
        int playState = ((AudioTrack) ur.e(this.c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.v = this.t;
            }
            playbackHeadPosition += this.v;
        }
        if (z19.a <= 29) {
            if (playbackHeadPosition == 0 && this.t > 0 && playState == 3) {
                if (this.z == -9223372036854775807L) {
                    this.z = j;
                    return;
                }
                return;
            }
            this.z = -9223372036854775807L;
        }
        if (this.t > playbackHeadPosition) {
            this.u++;
        }
        this.t = playbackHeadPosition;
    }

    public int b(long j) {
        return this.e - ((int) (j - (d() * this.d)));
    }

    public long c(boolean z) {
        long e;
        if (((AudioTrack) ur.e(this.c)).getPlayState() == 3) {
            l();
        }
        long nanoTime = System.nanoTime() / 1000;
        f fVar = (f) ur.e(this.f);
        boolean d = fVar.d();
        if (d) {
            e = z19.P0(fVar.b(), this.g) + z19.c0(nanoTime - fVar.c(), this.j);
        } else {
            e = this.x == 0 ? e() : z19.c0(this.l + nanoTime, this.j);
            if (!z) {
                e = Math.max(0L, e - this.o);
            }
        }
        if (this.E != d) {
            this.G = this.D;
            this.F = this.C;
        }
        long j = nanoTime - this.G;
        if (j < 1000000) {
            long c0 = this.F + z19.c0(j, this.j);
            long j2 = (j * 1000) / 1000000;
            e = ((e * j2) + ((1000 - j2) * c0)) / 1000;
        }
        if (!this.k) {
            long j3 = this.C;
            if (e > j3) {
                this.k = true;
                this.a.c(System.currentTimeMillis() - z19.h1(z19.h0(z19.h1(e - j3), this.j)));
            }
        }
        this.D = nanoTime;
        this.C = e;
        this.E = d;
        return e;
    }

    public void f(long j) {
        this.A = d();
        this.y = SystemClock.elapsedRealtime() * 1000;
        this.B = j;
    }

    public boolean g(long j) {
        return j > z19.B(c(false), this.g) || a();
    }

    public boolean h() {
        return ((AudioTrack) ur.e(this.c)).getPlayState() == 3;
    }

    public boolean i(long j) {
        return this.z != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.z >= 200;
    }

    public boolean j(long j) {
        int playState = ((AudioTrack) ur.e(this.c)).getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean g = g(j);
        this.p = g;
        if (z && !g && playState != 1) {
            this.a.a(this.e, z19.h1(this.i));
        }
        return true;
    }

    public boolean o() {
        q();
        if (this.y != -9223372036854775807L) {
            return false;
        }
        ((f) ur.e(this.f)).g();
        return true;
    }

    public void p() {
        q();
        this.c = null;
        this.f = null;
    }

    public void r(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new f(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && n(i);
        boolean w0 = z19.w0(i);
        this.q = w0;
        this.i = w0 ? z19.P0(i3 / i2, this.g) : -9223372036854775807L;
        this.t = 0L;
        this.u = 0L;
        this.v = 0L;
        this.p = false;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public void s(float f) {
        this.j = f;
        f fVar = this.f;
        if (fVar != null) {
            fVar.g();
        }
        q();
    }

    public void t() {
        ((f) ur.e(this.f)).g();
    }
}
