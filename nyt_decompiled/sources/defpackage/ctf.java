package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class ctf {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;
    private boolean G;
    private long H;
    private acd I;
    private final zsf a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private wsf e;
    private int f;
    private boolean g;
    private long h;
    private float i;
    private boolean j;
    private long k;
    private long l;
    private Method m;
    private long n;
    private boolean o;
    private boolean p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public ctf(zsf zsfVar) {
        this.a = zsfVar;
        int i = khe.a;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.I = acd.a;
    }

    private final long l() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (this.x != -9223372036854775807L) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.z;
            }
            return Math.min(this.A, this.z + khe.C(khe.D(khe.F(elapsedRealtime) - this.x, this.i), this.f));
        }
        if (elapsedRealtime - this.r >= 5) {
            AudioTrack audioTrack2 = this.c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j = 0;
                if (this.g) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.u = this.s;
                    }
                    playbackHeadPosition += this.u;
                    playState = i;
                }
                if (khe.a <= 29) {
                    if (playbackHeadPosition != 0) {
                        j = playbackHeadPosition;
                    } else if (this.s > 0 && playState == 3) {
                        if (this.y == -9223372036854775807L) {
                            this.y = elapsedRealtime;
                        }
                    }
                    this.y = -9223372036854775807L;
                    playbackHeadPosition = j;
                }
                if (this.s > playbackHeadPosition) {
                    this.t++;
                }
                this.s = playbackHeadPosition;
            }
            this.r = elapsedRealtime;
        }
        return this.s + this.H + (this.t << 32);
    }

    private final long m() {
        return khe.G(l(), this.f);
    }

    private final void n() {
        this.k = 0L;
        this.w = 0;
        this.v = 0;
        this.l = 0L;
        this.C = 0L;
        this.F = 0L;
        this.j = false;
    }

    public final long a(boolean z) {
        long m;
        wrf wrfVar;
        wrf wrfVar2;
        jrf jrfVar;
        Method method;
        AudioTrack audioTrack;
        long B;
        long C;
        long B2;
        long C2;
        ctf ctfVar = this;
        AudioTrack audioTrack2 = ctfVar.c;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - ctfVar.l >= 30000) {
                long m2 = m();
                if (m2 != 0) {
                    ctfVar.b[ctfVar.v] = khe.E(m2, ctfVar.i) - nanoTime;
                    ctfVar.v = (ctfVar.v + 1) % 10;
                    int i = ctfVar.w;
                    if (i < 10) {
                        ctfVar.w = i + 1;
                    }
                    ctfVar.l = nanoTime;
                    ctfVar.k = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = ctfVar.w;
                        if (i2 >= i3) {
                            break;
                        }
                        ctfVar.k += ctfVar.b[i2] / i3;
                        i2++;
                    }
                }
            }
            if (!ctfVar.g) {
                wsf wsfVar = ctfVar.e;
                wsfVar.getClass();
                if (wsfVar.g(nanoTime)) {
                    long b = wsfVar.b();
                    long a = wsfVar.a();
                    long m3 = m();
                    if (Math.abs(b - nanoTime) > 5000000) {
                        lvf lvfVar = ((puf) ctfVar.a).a;
                        B2 = lvfVar.B();
                        C2 = lvfVar.C();
                        ezd.f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + a + ", " + b + ", " + nanoTime + ", " + m3 + ", " + B2 + ", " + C2);
                        wsfVar.d();
                        nanoTime = nanoTime;
                    } else {
                        if (Math.abs(khe.G(a, ctfVar.f) - m3) > 5000000) {
                            lvf lvfVar2 = ((puf) ctfVar.a).a;
                            B = lvfVar2.B();
                            C = lvfVar2.C();
                            ezd.f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + a + ", " + b + ", " + nanoTime + ", " + m3 + ", " + B + ", " + C);
                            wsfVar.d();
                        } else {
                            wsfVar.c();
                        }
                        ctfVar = this;
                    }
                }
                if (ctfVar.p && (method = ctfVar.m) != null && nanoTime - ctfVar.q >= 500000) {
                    try {
                        audioTrack = ctfVar.c;
                    } catch (Exception unused) {
                        ctfVar.m = null;
                    }
                    if (audioTrack == null) {
                        throw null;
                    }
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    int i4 = khe.a;
                    long intValue = (num.intValue() * 1000) - ctfVar.h;
                    ctfVar.n = intValue;
                    long max = Math.max(intValue, 0L);
                    ctfVar.n = max;
                    if (max > 5000000) {
                        ezd.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                        ctfVar.n = 0L;
                    }
                    ctfVar.q = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        wsf wsfVar2 = ctfVar.e;
        wsfVar2.getClass();
        boolean f = wsfVar2.f();
        if (f) {
            m = khe.G(wsfVar2.a(), ctfVar.f) + khe.D(nanoTime2 - wsfVar2.b(), ctfVar.i);
        } else {
            m = ctfVar.w == 0 ? m() : khe.D(ctfVar.k + nanoTime2, ctfVar.i);
            if (!z) {
                m = Math.max(0L, m - ctfVar.n);
            }
        }
        if (ctfVar.D != f) {
            ctfVar.F = ctfVar.C;
            ctfVar.E = ctfVar.B;
        }
        long j = nanoTime2 - ctfVar.F;
        if (j < 1000000) {
            long D = ctfVar.E + khe.D(j, ctfVar.i);
            long j2 = (j * 1000) / 1000000;
            m = ((m * j2) + ((1000 - j2) * D)) / 1000;
        }
        if (!ctfVar.j) {
            long j3 = ctfVar.B;
            if (m > j3) {
                ctfVar.j = true;
                int i5 = khe.a;
                long currentTimeMillis = System.currentTimeMillis() - khe.I(khe.E(khe.I(m - j3), ctfVar.i));
                lvf lvfVar3 = ((puf) ctfVar.a).a;
                wrfVar = lvfVar3.m;
                if (wrfVar != null) {
                    wrfVar2 = lvfVar3.m;
                    jrfVar = ((vvf) wrfVar2).a.z0;
                    jrfVar.v(currentTimeMillis);
                }
            }
        }
        ctfVar.C = nanoTime2;
        ctfVar.B = m;
        ctfVar.D = f;
        return m;
    }

    public final void b(long j) {
        this.z = l();
        this.x = khe.F(SystemClock.elapsedRealtime());
        this.A = j;
    }

    public final void c() {
        n();
        this.c = null;
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.c = r3
            r2.d = r7
            wsf r0 = new wsf
            r0.<init>(r3)
            r2.e = r0
            int r3 = r3.getSampleRate()
            r2.f = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = defpackage.khe.a
            r0 = 23
            if (r4 >= r0) goto L23
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L24
            r4 = 6
            if (r5 != r4) goto L23
            r5 = r4
            goto L24
        L23:
            r0 = r3
        L24:
            r2.g = r0
            boolean r4 = defpackage.khe.h(r5)
            r2.p = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.f
            long r4 = defpackage.khe.G(r4, r6)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.h = r4
            r4 = 0
            r2.s = r4
            r2.t = r4
            r2.G = r3
            r2.H = r4
            r2.u = r4
            r2.o = r3
            r2.x = r0
            r2.y = r0
            r2.q = r4
            r2.n = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctf.d(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void e(acd acdVar) {
        this.I = acdVar;
    }

    public final void f() {
        if (this.x != -9223372036854775807L) {
            this.x = khe.F(SystemClock.elapsedRealtime());
        }
        wsf wsfVar = this.e;
        wsfVar.getClass();
        wsfVar.e();
    }

    public final boolean g(long j) {
        if (j > khe.C(a(false), this.f)) {
            return true;
        }
        if (this.g) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && l() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean i(long j) {
        return this.y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public final boolean j(long j) {
        wrf wrfVar;
        long j2;
        wrf wrfVar2;
        jrf jrfVar;
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.g) {
            if (playState == 2) {
                this.o = false;
                return false;
            }
            if (playState == 1) {
                if (l() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.o;
        boolean g = g(j);
        this.o = g;
        if (z && !g && playState != 1) {
            zsf zsfVar = this.a;
            int i = this.d;
            long I = khe.I(this.h);
            puf pufVar = (puf) zsfVar;
            lvf lvfVar = pufVar.a;
            wrfVar = lvfVar.m;
            if (wrfVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j2 = lvfVar.P;
                wrfVar2 = pufVar.a.m;
                jrfVar = ((vvf) wrfVar2).a.z0;
                jrfVar.x(i, I, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean k() {
        n();
        if (this.x != -9223372036854775807L) {
            this.z = l();
            return false;
        }
        wsf wsfVar = this.e;
        wsfVar.getClass();
        wsfVar.e();
        return true;
    }
}
