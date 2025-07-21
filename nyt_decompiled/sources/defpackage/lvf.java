package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.gms.internal.ads.zzqa;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class lvf implements rsf {
    private static final Object X = new Object();
    private static ExecutorService Y;
    private static int Z;
    private long A;
    private int B;
    private boolean C;
    private boolean D;
    private long E;
    private float F;
    private ByteBuffer G;
    private int H;
    private ByteBuffer I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private ddf N;
    private xtf O;
    private long P;
    private boolean Q;
    private boolean R;
    private long S;
    private long T;
    private Handler U;
    private final fuf V;
    private final ltf W;
    private final ftf a;
    private final bwf b;
    private final zzgaa c;
    private final zzgaa d;
    private final jfd e;
    private final ctf f;
    private final ArrayDeque g;
    private hvf h;
    private final luf i;
    private final luf j;
    private final ztf k;
    private hpf l;
    private wrf m;
    private duf n;
    private duf o;
    private xnc p;
    private AudioTrack q;
    private npf r;
    private waf s = waf.b;
    private juf t;
    private juf u;
    private hib v;
    private boolean w;
    private long x;
    private long y;
    private long z;

    /* synthetic */ lvf(buf bufVar, jvf jvfVar) {
        npf npfVar;
        fuf fufVar;
        ztf ztfVar;
        ltf ltfVar;
        npfVar = bufVar.a;
        this.r = npfVar;
        fufVar = bufVar.d;
        this.V = fufVar;
        int i = khe.a;
        ztfVar = bufVar.c;
        this.k = ztfVar;
        ltfVar = bufVar.e;
        ltfVar.getClass();
        this.W = ltfVar;
        jfd jfdVar = new jfd(acd.a);
        this.e = jfdVar;
        jfdVar.e();
        this.f = new ctf(new puf(this, null));
        ftf ftfVar = new ftf();
        this.a = ftfVar;
        bwf bwfVar = new bwf();
        this.b = bwfVar;
        this.c = zzgaa.w(new uvc(), ftfVar, bwfVar);
        this.d = zzgaa.u(new awf());
        this.F = 1.0f;
        this.M = 0;
        this.N = new ddf(0, 0.0f);
        hib hibVar = hib.d;
        this.u = new juf(hibVar, 0L, 0L, null);
        this.v = hibVar;
        this.w = false;
        this.g = new ArrayDeque();
        this.i = new luf(100L);
        this.j = new luf(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long B() {
        return this.o.c == 0 ? this.x / r0.b : this.y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long C() {
        duf dufVar = this.o;
        if (dufVar.c != 0) {
            return this.A;
        }
        long j = this.z;
        long j2 = dufVar.d;
        int i = khe.a;
        return ((j + j2) - 1) / j2;
    }

    private final AudioTrack D(duf dufVar) {
        try {
            return dufVar.a(this.s, this.M);
        } catch (zzpx e) {
            wrf wrfVar = this.m;
            if (wrfVar != null) {
                wrfVar.b(e);
            }
            throw e;
        }
    }

    private final void E(long j) {
        hib hibVar;
        boolean z;
        jrf jrfVar;
        if (P()) {
            fuf fufVar = this.V;
            hibVar = this.v;
            fufVar.c(hibVar);
        } else {
            hibVar = hib.d;
        }
        hib hibVar2 = hibVar;
        this.v = hibVar2;
        if (P()) {
            fuf fufVar2 = this.V;
            z = this.w;
            fufVar2.d(z);
        } else {
            z = false;
        }
        this.w = z;
        this.g.add(new juf(hibVar2, Math.max(0L, j), khe.G(C(), this.o.e), null));
        K();
        wrf wrfVar = this.m;
        if (wrfVar != null) {
            boolean z2 = this.w;
            jrfVar = ((vvf) wrfVar).a.z0;
            jrfVar.w(z2);
        }
    }

    private final void F() {
        if (this.o.c()) {
            this.Q = true;
        }
    }

    private final void G() {
        if (this.K) {
            return;
        }
        this.K = true;
        this.f.b(C());
        this.q.stop();
    }

    private final void H(long j) {
        ByteBuffer b;
        if (!this.p.h()) {
            ByteBuffer byteBuffer = this.G;
            if (byteBuffer == null) {
                byteBuffer = grc.a;
            }
            L(byteBuffer, j);
            return;
        }
        while (!this.p.g()) {
            do {
                b = this.p.b();
                if (b.hasRemaining()) {
                    L(b, j);
                } else {
                    ByteBuffer byteBuffer2 = this.G;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.p.e(this.G);
                    }
                }
            } while (!b.hasRemaining());
            return;
        }
    }

    private final void I(hib hibVar) {
        juf jufVar = new juf(hibVar, -9223372036854775807L, -9223372036854775807L, null);
        if (N()) {
            this.t = jufVar;
        } else {
            this.u = jufVar;
        }
    }

    private final void J() {
        if (N()) {
            int i = khe.a;
            this.q.setVolume(this.F);
        }
    }

    private final void K() {
        xnc xncVar = this.o.i;
        this.p = xncVar;
        xncVar.c();
    }

    private final void L(ByteBuffer byteBuffer, long j) {
        wrf wrfVar;
        uff uffVar;
        uff uffVar2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                wad.d(byteBuffer2 == byteBuffer);
            } else {
                this.I = byteBuffer;
                int i = khe.a;
            }
            int remaining = byteBuffer.remaining();
            int i2 = khe.a;
            int write = this.q.write(byteBuffer, remaining, 1);
            this.P = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((khe.a >= 24 && write == -6) || write == -32) {
                    if (C() <= 0) {
                        if (O(this.q)) {
                            F();
                        }
                    }
                    r10 = true;
                }
                zzqa zzqaVar = new zzqa(write, this.o.a, r10);
                wrf wrfVar2 = this.m;
                if (wrfVar2 != null) {
                    wrfVar2.b(zzqaVar);
                }
                if (zzqaVar.zzb) {
                    this.r = npf.c;
                    throw zzqaVar;
                }
                this.j.b(zzqaVar);
                return;
            }
            this.j.a();
            if (O(this.q)) {
                if (this.A > 0) {
                    this.R = false;
                }
                if (this.L && (wrfVar = this.m) != null && write < remaining) {
                    xvf xvfVar = ((vvf) wrfVar).a;
                    uffVar = xvfVar.J0;
                    if (uffVar != null) {
                        uffVar2 = xvfVar.J0;
                        uffVar2.zza();
                    }
                }
            }
            int i3 = this.o.c;
            if (i3 == 0) {
                this.z += write;
            }
            if (write == remaining) {
                if (i3 != 0) {
                    wad.f(byteBuffer == this.G);
                    this.A += this.B * this.H;
                }
                this.I = null;
            }
        }
    }

    private final boolean M() {
        if (!this.p.h()) {
            ByteBuffer byteBuffer = this.I;
            if (byteBuffer == null) {
                return true;
            }
            L(byteBuffer, Long.MIN_VALUE);
            return this.I == null;
        }
        this.p.d();
        H(Long.MIN_VALUE);
        if (!this.p.g()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.I;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean N() {
        return this.q != null;
    }

    private static boolean O(AudioTrack audioTrack) {
        return khe.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean P() {
        duf dufVar = this.o;
        if (dufVar.c != 0) {
            return false;
        }
        int i = dufVar.a.A;
        return true;
    }

    public static /* synthetic */ void y(lvf lvfVar) {
        if (lvfVar.T >= 1000000) {
            ((vvf) lvfVar.m).a.K0 = true;
        }
        lvfVar.T = 0L;
    }

    static /* synthetic */ void z(AudioTrack audioTrack, final wrf wrfVar, Handler handler, final prf prfVar, jfd jfdVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (wrfVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: ptf
                    @Override // java.lang.Runnable
                    public final void run() {
                        jrf jrfVar;
                        jrfVar = ((vvf) wrf.this).a.z0;
                        jrfVar.d(prfVar);
                    }
                });
            }
            jfdVar.e();
            synchronized (X) {
                try {
                    int i = Z - 1;
                    Z = i;
                    if (i == 0) {
                        Y.shutdown();
                        Y = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (wrfVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: ptf
                    @Override // java.lang.Runnable
                    public final void run() {
                        jrf jrfVar;
                        jrfVar = ((vvf) wrf.this).a.z0;
                        jrfVar.d(prfVar);
                    }
                });
            }
            jfdVar.e();
            synchronized (X) {
                try {
                    int i2 = Z - 1;
                    Z = i2;
                    if (i2 == 0) {
                        Y.shutdown();
                        Y = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    @Override // defpackage.rsf
    public final int a(l6a l6aVar) {
        if (!"audio/raw".equals(l6aVar.l)) {
            return this.r.a(l6aVar, this.s) != null ? 2 : 0;
        }
        if (khe.h(l6aVar.A)) {
            return l6aVar.A != 2 ? 1 : 2;
        }
        ezd.f("DefaultAudioSink", "Invalid PCM encoding: " + l6aVar.A);
        return 0;
    }

    @Override // defpackage.rsf
    public final long b(boolean z) {
        long D;
        if (!N() || this.D) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f.a(z), khe.G(C(), this.o.e));
        while (!this.g.isEmpty() && min >= ((juf) this.g.getFirst()).c) {
            this.u = (juf) this.g.remove();
        }
        juf jufVar = this.u;
        long j = min - jufVar.c;
        if (jufVar.a.equals(hib.d)) {
            D = this.u.b + j;
        } else if (this.g.isEmpty()) {
            D = this.V.a(j) + this.u.b;
        } else {
            juf jufVar2 = (juf) this.g.getFirst();
            D = jufVar2.b - khe.D(jufVar2.c - min, this.u.a.a);
        }
        long b = this.V.b();
        long G = D + khe.G(b, this.o.e);
        long j2 = this.S;
        if (b > j2) {
            long G2 = khe.G(b - j2, this.o.e);
            this.S = b;
            this.T += G2;
            if (this.U == null) {
                this.U = new Handler(Looper.myLooper());
            }
            this.U.removeCallbacksAndMessages(null);
            this.U.postDelayed(new Runnable() { // from class: rtf
                @Override // java.lang.Runnable
                public final void run() {
                    lvf.y(lvf.this);
                }
            }, 100L);
        }
        return G;
    }

    @Override // defpackage.rsf
    public final void c(int i) {
        if (this.M != i) {
            this.M = i;
            zzf();
        }
    }

    @Override // defpackage.rsf
    public final wpf d(l6a l6aVar) {
        return this.Q ? wpf.d : this.W.a(l6aVar, this.s);
    }

    @Override // defpackage.rsf
    public final boolean e() {
        return N() && this.f.g(C());
    }

    @Override // defpackage.rsf
    public final void f(boolean z) {
        this.w = z;
        I(this.v);
    }

    @Override // defpackage.rsf
    public final void g(float f) {
        if (this.F != f) {
            this.F = f;
            J();
        }
    }

    @Override // defpackage.rsf
    public final void h(acd acdVar) {
        this.f.e(acdVar);
    }

    @Override // defpackage.rsf
    public final void i(waf wafVar) {
        if (this.s.equals(wafVar)) {
            return;
        }
        this.s = wafVar;
        zzf();
    }

    @Override // defpackage.rsf
    public final void j(ddf ddfVar) {
        if (this.N.equals(ddfVar)) {
            return;
        }
        if (this.q != null) {
            int i = this.N.a;
        }
        this.N = ddfVar;
    }

    @Override // defpackage.rsf
    public final boolean k() {
        if (N()) {
            return this.J && !e();
        }
        return true;
    }

    @Override // defpackage.rsf
    public final void l(int i, int i2) {
        AudioTrack audioTrack = this.q;
        if (audioTrack != null) {
            O(audioTrack);
        }
    }

    @Override // defpackage.rsf
    public final void m(l6a l6aVar, int i, int[] iArr) {
        int i2;
        xnc xncVar;
        int intValue;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int max;
        if ("audio/raw".equals(l6aVar.l)) {
            wad.d(khe.h(l6aVar.A));
            int A = khe.A(l6aVar.A, l6aVar.y);
            h9 h9Var = new h9();
            h9Var.i(this.c);
            h9Var.h(this.V.e());
            xnc xncVar2 = new xnc(h9Var.j());
            if (xncVar2.equals(this.p)) {
                xncVar2 = this.p;
            }
            this.b.k(l6aVar.B, l6aVar.C);
            this.a.i(iArr);
            try {
                cpc a = xncVar2.a(new cpc(l6aVar.z, l6aVar.y, l6aVar.A));
                int i8 = a.c;
                int i9 = a.a;
                int i10 = a.b;
                intValue = khe.v(i10);
                xncVar = xncVar2;
                i4 = khe.A(i8, i10);
                i6 = A;
                i3 = i8;
                i5 = i9;
                i2 = 0;
            } catch (zzds e) {
                throw new zzpw(e, l6aVar);
            }
        } else {
            xnc xncVar3 = new xnc(zzgaa.t());
            int i11 = l6aVar.z;
            wpf wpfVar = wpf.d;
            Pair a2 = this.r.a(l6aVar, this.s);
            if (a2 == null) {
                throw new zzpw("Unable to configure passthrough for: ".concat(String.valueOf(l6aVar)), l6aVar);
            }
            int intValue2 = ((Integer) a2.first).intValue();
            i2 = 2;
            xncVar = xncVar3;
            intValue = ((Integer) a2.second).intValue();
            i3 = intValue2;
            i4 = -1;
            i5 = i11;
            i6 = -1;
        }
        if (i3 == 0) {
            throw new zzpw("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(l6aVar), l6aVar);
        }
        if (intValue == 0) {
            throw new zzpw("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(l6aVar), l6aVar);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, intValue, i3);
        wad.f(minBufferSize != -2);
        int i12 = i4 != -1 ? i4 : 1;
        int i13 = l6aVar.h;
        int i14 = 250000;
        if (i2 == 0) {
            i7 = i6;
            max = Math.max(pvf.a(250000, i5, i12), Math.min(minBufferSize * 4, pvf.a(750000, i5, i12)));
        } else if (i2 != 1) {
            if (i3 == 5) {
                i14 = 500000;
            } else if (i3 == 8) {
                i14 = 1000000;
                i3 = 8;
            }
            i7 = i6;
            max = oje.a((i14 * (i13 != -1 ? ije.a(i13, 8, RoundingMode.CEILING) : pvf.b(i3))) / 1000000);
        } else {
            i7 = i6;
            max = oje.a((pvf.b(i3) * 50000000) / 1000000);
        }
        int i15 = i3;
        this.Q = false;
        duf dufVar = new duf(l6aVar, i7, i2, i4, i5, intValue, i15, (((Math.max(minBufferSize, max) + i12) - 1) / i12) * i12, xncVar, false, false, false);
        if (N()) {
            this.n = dufVar;
        } else {
            this.o = dufVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d3 A[RETURN] */
    @Override // defpackage.rsf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.nio.ByteBuffer r28, long r29, int r31) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvf.n(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // defpackage.rsf
    public final void o(wrf wrfVar) {
        this.m = wrfVar;
    }

    @Override // defpackage.rsf
    public final void p(hib hibVar) {
        this.v = new hib(Math.max(0.1f, Math.min(hibVar.a, 8.0f)), Math.max(0.1f, Math.min(hibVar.b, 8.0f)));
        I(hibVar);
    }

    @Override // defpackage.rsf
    public final void q(AudioDeviceInfo audioDeviceInfo) {
        xtf xtfVar = audioDeviceInfo == null ? null : new xtf(audioDeviceInfo);
        this.O = xtfVar;
        AudioTrack audioTrack = this.q;
        if (audioTrack != null) {
            ttf.a(audioTrack, xtfVar);
        }
    }

    @Override // defpackage.rsf
    public final void r(hpf hpfVar) {
        this.l = hpfVar;
    }

    @Override // defpackage.rsf
    public final boolean s(l6a l6aVar) {
        return a(l6aVar) != 0;
    }

    @Override // defpackage.rsf
    public final hib zzc() {
        return this.v;
    }

    @Override // defpackage.rsf
    public final void zzf() {
        if (N()) {
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.R = false;
            this.B = 0;
            this.u = new juf(this.v, 0L, 0L, null);
            this.E = 0L;
            this.t = null;
            this.g.clear();
            this.G = null;
            this.H = 0;
            this.I = null;
            this.K = false;
            this.J = false;
            this.b.j();
            K();
            if (this.f.h()) {
                this.q.pause();
            }
            if (O(this.q)) {
                hvf hvfVar = this.h;
                hvfVar.getClass();
                hvfVar.b(this.q);
            }
            int i = khe.a;
            final prf b = this.o.b();
            duf dufVar = this.n;
            if (dufVar != null) {
                this.o = dufVar;
                this.n = null;
            }
            this.f.c();
            final AudioTrack audioTrack = this.q;
            final jfd jfdVar = this.e;
            final wrf wrfVar = this.m;
            jfdVar.c();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (X) {
                try {
                    if (Y == null) {
                        Y = khe.d("ExoPlayer:AudioTrackReleaseThread");
                    }
                    Z++;
                    Y.execute(new Runnable() { // from class: ntf
                        @Override // java.lang.Runnable
                        public final void run() {
                            lvf.z(audioTrack, wrfVar, handler, b, jfdVar);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.q = null;
        }
        this.j.a();
        this.i.a();
        this.S = 0L;
        this.T = 0L;
        Handler handler2 = this.U;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.rsf
    public final void zzg() {
        this.C = true;
    }

    @Override // defpackage.rsf
    public final void zzh() {
        this.L = false;
        if (N()) {
            if (this.f.k() || O(this.q)) {
                this.q.pause();
            }
        }
    }

    @Override // defpackage.rsf
    public final void zzi() {
        this.L = true;
        if (N()) {
            this.f.f();
            this.q.play();
        }
    }

    @Override // defpackage.rsf
    public final void zzj() {
        if (!this.J && N() && M()) {
            G();
            this.J = true;
        }
    }

    @Override // defpackage.rsf
    public final void zzk() {
        zzf();
        zzgaa zzgaaVar = this.c;
        int size = zzgaaVar.size();
        for (int i = 0; i < size; i++) {
            ((grc) zzgaaVar.get(i)).zzf();
        }
        zzgaa zzgaaVar2 = this.d;
        int size2 = zzgaaVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((grc) zzgaaVar2.get(i2)).zzf();
        }
        xnc xncVar = this.p;
        if (xncVar != null) {
            xncVar.f();
        }
        this.L = false;
        this.Q = false;
    }
}
