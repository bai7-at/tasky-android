package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzla;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.a7g;
import defpackage.acd;
import defpackage.b0g;
import defpackage.bgf;
import defpackage.c7g;
import defpackage.dae;
import defpackage.e8f;
import defpackage.e9f;
import defpackage.ezd;
import defpackage.frb;
import defpackage.fyb;
import defpackage.ggf;
import defpackage.h8g;
import defpackage.hpf;
import defpackage.j9f;
import defpackage.jfd;
import defpackage.kff;
import defpackage.khe;
import defpackage.kod;
import defpackage.l0c;
import defpackage.l4d;
import defpackage.l6a;
import defpackage.mhc;
import defpackage.mmb;
import defpackage.n1c;
import defpackage.n9f;
import defpackage.ndf;
import defpackage.o6g;
import defpackage.off;
import defpackage.p0a;
import defpackage.q7g;
import defpackage.qff;
import defpackage.qgf;
import defpackage.qtd;
import defpackage.r5g;
import defpackage.rkb;
import defpackage.rnb;
import defpackage.s2g;
import defpackage.sq9;
import defpackage.srd;
import defpackage.uvd;
import defpackage.w5b;
import defpackage.wad;
import defpackage.waf;
import defpackage.wff;
import defpackage.wmc;
import defpackage.xgf;
import defpackage.yzf;
import defpackage.z2g;
import defpackage.zza;
import defpackage.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class wn extends kff implements n9f {
    public static final /* synthetic */ int g0 = 0;
    private final long A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private ggf F;
    private mmb G;
    private w5b H;
    private w5b I;
    private l6a J;
    private l6a K;
    private Object L;
    private Surface M;
    private int N;
    private dae O;
    private e8f P;
    private e8f Q;
    private int R;
    private waf S;
    private float T;
    private boolean U;
    private l4d V;
    private boolean W;
    private boolean X;
    private sq9 Y;
    private wmc Z;
    private w5b a0;
    final c7g b;
    private xo b0;
    final mmb c;
    private int c0;
    private final jfd d;
    private long d0;
    private final Context e;
    private final ym e0;
    private final frb f;
    private s2g f0;
    private final wff[] g;
    private final a7g h;
    private final kod i;
    private final fo j;
    private final uvd k;
    private final CopyOnWriteArraySet l;
    private final fyb m;
    private final List n;
    private final boolean o;
    private final yzf p;
    private final qgf q;
    private final Looper r;
    private final q7g s;
    private final acd t;
    private final tn u;
    private final un v;
    private final qm w;
    private final tm x;
    private final cp y;
    private final dp z;

    static {
        zza.b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, o7g, qgf] */
    public wn(xm xmVar, frb frbVar) {
        jfd jfdVar = new jfd(acd.a);
        this.d = jfdVar;
        try {
            ezd.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + khe.e + "]");
            Context applicationContext = xmVar.a.getApplicationContext();
            this.e = applicationContext;
            ?? apply = xmVar.h.apply(xmVar.b);
            this.q = apply;
            this.S = xmVar.j;
            this.N = xmVar.k;
            this.U = false;
            this.A = xmVar.o;
            tn tnVar = new tn(this, null);
            this.u = tnVar;
            un unVar = new un(null);
            this.v = unVar;
            Handler handler = new Handler(xmVar.i);
            wff[] a = ((e9f) xmVar.c).a.a(handler, tnVar, tnVar, tnVar, tnVar);
            this.g = a;
            int length = a.length;
            a7g a7gVar = (a7g) xmVar.e.zza();
            this.h = a7gVar;
            this.p = xm.a(((wm) xmVar.d).a);
            h8g d = h8g.d(((j9f) xmVar.g).a);
            this.s = d;
            this.o = xmVar.l;
            this.F = xmVar.m;
            Looper looper = xmVar.i;
            this.r = looper;
            acd acdVar = xmVar.b;
            this.t = acdVar;
            this.f = frbVar;
            uvd uvdVar = new uvd(looper, acdVar, new qtd() { // from class: com.google.android.gms.internal.ads.rn
                @Override // defpackage.qtd
                public final void a(Object obj, p0a p0aVar) {
                }
            });
            this.k = uvdVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.l = copyOnWriteArraySet;
            this.n = new ArrayList();
            this.f0 = new s2g(0);
            int length2 = a.length;
            c7g c7gVar = new c7g(new bgf[2], new o6g[2], mhc.b, null);
            this.b = c7gVar;
            this.m = new fyb();
            rkb rkbVar = new rkb();
            rkbVar.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            a7gVar.d();
            rkbVar.d(29, true);
            rkbVar.d(23, false);
            rkbVar.d(25, false);
            rkbVar.d(33, false);
            rkbVar.d(26, false);
            rkbVar.d(34, false);
            mmb e = rkbVar.e();
            this.c = e;
            rkb rkbVar2 = new rkb();
            rkbVar2.b(e);
            rkbVar2.a(4);
            rkbVar2.a(10);
            this.G = rkbVar2.e();
            this.i = acdVar.a(looper, null);
            ym ymVar = new ym(this);
            this.e0 = ymVar;
            this.b0 = xo.g(c7gVar);
            apply.q(frbVar, looper);
            this.j = new fo(a, a7gVar, c7gVar, (ndf) xmVar.f.zza(), d, 0, false, apply, this.F, xmVar.r, xmVar.n, false, looper, acdVar, ymVar, khe.a < 31 ? new hpf() : sn.a(applicationContext, this, xmVar.p), null);
            this.T = 1.0f;
            w5b w5bVar = w5b.y;
            this.H = w5bVar;
            this.I = w5bVar;
            this.a0 = w5bVar;
            int i = -1;
            this.c0 = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService(AssetConstants.AUDIO_TYPE);
            if (audioManager != null) {
                i = audioManager.generateAudioSessionId();
            }
            this.R = i;
            this.V = l4d.b;
            this.W = true;
            if (apply == 0) {
                throw null;
            }
            uvdVar.b(apply);
            d.c(new Handler(looper), apply);
            copyOnWriteArraySet.add(tnVar);
            this.w = new qm(xmVar.a, handler, tnVar);
            this.x = new tm(xmVar.a, handler, tnVar);
            khe.f(null, null);
            this.y = new cp(xmVar.a);
            this.z = new dp(xmVar.a);
            this.Y = new r5g(0).a();
            this.Z = wmc.e;
            this.O = dae.c;
            a7gVar.c(this.S);
            Q(1, 10, Integer.valueOf(this.R));
            Q(2, 10, Integer.valueOf(this.R));
            Q(1, 3, this.S);
            Q(2, 4, Integer.valueOf(this.N));
            Q(2, 5, 0);
            Q(1, 9, Boolean.valueOf(this.U));
            Q(2, 7, unVar);
            Q(6, 8, unVar);
            jfdVar.e();
        } catch (Throwable th) {
            this.d.e();
            throw th;
        }
    }

    private final int G(xo xoVar) {
        return xoVar.a.o() ? this.c0 : xoVar.a.n(xoVar.b.a, this.m).c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long I(xo xoVar) {
        if (!xoVar.b.b()) {
            return khe.I(J(xoVar));
        }
        xoVar.a.n(xoVar.b.a, this.m);
        long j = xoVar.c;
        if (j != -9223372036854775807L) {
            return khe.I(j) + khe.I(0L);
        }
        long j2 = xoVar.a.e(G(xoVar), this.a, 0L).l;
        return khe.I(0L);
    }

    private final long J(xo xoVar) {
        if (xoVar.a.o()) {
            return khe.F(this.d0);
        }
        long j = xoVar.r;
        if (xoVar.b.b()) {
            return j;
        }
        L(xoVar.a, xoVar.b, j);
        return j;
    }

    private static long K(xo xoVar) {
        l0c l0cVar = new l0c();
        fyb fybVar = new fyb();
        xoVar.a.n(xoVar.b.a, fybVar);
        long j = xoVar.c;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = xoVar.a.e(fybVar.c, l0cVar, 0L).l;
        return 0L;
    }

    private final long L(n1c n1cVar, zzf zzfVar, long j) {
        n1cVar.n(zzfVar.a, this.m);
        return j;
    }

    private final Pair M(n1c n1cVar, int i, long j) {
        if (n1cVar.o()) {
            this.c0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.d0 = j;
            return null;
        }
        if (i == -1 || i >= n1cVar.c()) {
            i = n1cVar.g(false);
            long j2 = n1cVar.e(i, this.a, 0L).l;
            j = khe.I(0L);
        }
        return n1cVar.l(this.a, this.m, i, khe.F(j));
    }

    private final xo N(xo xoVar, n1c n1cVar, Pair pair) {
        wad.d(n1cVar.o() || pair != null);
        n1c n1cVar2 = xoVar.a;
        long I = I(xoVar);
        xo f = xoVar.f(n1cVar);
        if (n1cVar.o()) {
            zzf h = xo.h();
            long F = khe.F(this.d0);
            xo a = f.b(h, F, F, F, 0L, z2g.d, this.b, zzgaa.t()).a(h);
            a.p = a.r;
            return a;
        }
        Object obj = f.b.a;
        int i = khe.a;
        boolean equals = obj.equals(pair.first);
        zzf zzfVar = !equals ? new zzf(pair.first, -1L) : f.b;
        long longValue = ((Long) pair.second).longValue();
        long F2 = khe.F(I);
        if (!n1cVar2.o()) {
            n1cVar2.n(obj, this.m);
        }
        if (!equals || longValue < F2) {
            wad.f(!zzfVar.b());
            xo a2 = f.b(zzfVar, longValue, longValue, longValue, 0L, !equals ? z2g.d : f.h, !equals ? this.b : f.i, !equals ? zzgaa.t() : f.j).a(zzfVar);
            a2.p = longValue;
            return a2;
        }
        if (longValue != F2) {
            wad.f(!zzfVar.b());
            long max = Math.max(0L, f.q - (longValue - F2));
            long j = f.p;
            if (f.k.equals(f.b)) {
                j = longValue + max;
            }
            xo b = f.b(zzfVar, longValue, longValue, longValue, max, f.h, f.i, f.j);
            b.p = j;
            return b;
        }
        int a3 = n1cVar.a(f.k.a);
        if (a3 != -1 && n1cVar.d(a3, this.m, false).c == n1cVar.n(zzfVar.a, this.m).c) {
            return f;
        }
        n1cVar.n(zzfVar.a, this.m);
        long h2 = zzfVar.b() ? this.m.h(zzfVar.b, zzfVar.c) : this.m.d;
        xo a4 = f.b(zzfVar, f.r, f.r, f.d, h2 - f.r, f.h, f.i, f.j).a(zzfVar);
        a4.p = h2;
        return a4;
    }

    private final qff O(off offVar) {
        int G = G(this.b0);
        n1c n1cVar = this.b0.a;
        if (G == -1) {
            G = 0;
        }
        acd acdVar = this.t;
        fo foVar = this.j;
        return new qff(foVar, offVar, n1cVar, G, acdVar, foVar.S());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(final int i, final int i2) {
        if (i == this.O.b() && i2 == this.O.a()) {
            return;
        }
        this.O = new dae(i, i2);
        uvd uvdVar = this.k;
        uvdVar.d(24, new srd() { // from class: com.google.android.gms.internal.ads.pn
            @Override // defpackage.srd
            public final void zza(Object obj) {
                int i3 = wn.g0;
                ((rnb) obj).M(i, i2);
            }
        });
        uvdVar.c();
        Q(2, 14, new dae(i, i2));
    }

    private final void Q(int i, int i2, Object obj) {
        wff[] wffVarArr = this.g;
        int length = wffVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            wff wffVar = wffVarArr[i3];
            if (wffVar.b() == i) {
                qff O = O(wffVar);
                O.f(i2);
                O.e(obj);
                O.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        Q(1, 2, Float.valueOf(this.T * this.x.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Object obj) {
        ArrayList arrayList = new ArrayList();
        wff[] wffVarArr = this.g;
        int length = wffVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            wff wffVar = wffVarArr[i];
            if (wffVar.b() == 2) {
                qff O = O(wffVar);
                O.f(1);
                O.e(obj);
                O.d();
                arrayList.add(O);
            }
        }
        Object obj2 = this.L;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((qff) it2.next()).i(this.A);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.L;
            Surface surface = this.M;
            if (obj3 == surface) {
                surface.release();
                this.M = null;
            }
        }
        this.L = obj;
        if (z) {
            T(zziz.d(new zzla(3), ContentMediaFormat.FULL_CONTENT_MOVIE));
        }
    }

    private final void T(zziz zzizVar) {
        xo xoVar = this.b0;
        xo a = xoVar.a(xoVar.b);
        a.p = a.r;
        a.q = 0L;
        xo e = a.e(1);
        if (zzizVar != null) {
            e = e.d(zzizVar);
        }
        this.B++;
        this.j.a0();
        V(e, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        xo xoVar = this.b0;
        if (xoVar.l == z2 && xoVar.m == i3) {
            return;
        }
        this.B++;
        xo c = xoVar.c(z2, i3);
        this.j.Z(z2, i3);
        V(c, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x046f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0498 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ea  */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void V(final com.google.android.gms.internal.ads.xo r43, final int r44, final int r45, boolean r46, int r47, long r48, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wn.V(com.google.android.gms.internal.ads.xo, int, int, boolean, int, long, int, boolean):void");
    }

    private final void W() {
        int zzf = zzf();
        if (zzf == 2 || zzf == 3) {
            X();
            boolean z = this.b0.o;
            a();
            a();
        }
    }

    private final void X() {
        this.d.b();
        if (Thread.currentThread() != this.r.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.r.getThread().getName());
            if (this.W) {
                throw new IllegalStateException(format);
            }
            ezd.g("ExoPlayerImpl", format, this.X ? null : new IllegalStateException());
            this.X = true;
        }
    }

    static /* bridge */ /* synthetic */ void z(wn wnVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        wnVar.S(surface);
        wnVar.M = surface;
    }

    final /* synthetic */ void C(co coVar) {
        long j;
        int i = this.B - coVar.c;
        this.B = i;
        boolean z = true;
        if (coVar.d) {
            this.C = coVar.e;
            this.D = true;
        }
        if (coVar.f) {
            this.E = coVar.g;
        }
        if (i == 0) {
            n1c n1cVar = coVar.b.a;
            if (!this.b0.a.o() && n1cVar.o()) {
                this.c0 = -1;
                this.d0 = 0L;
            }
            if (!n1cVar.o()) {
                List y = ((zo) n1cVar).y();
                wad.f(y.size() == this.n.size());
                for (int i2 = 0; i2 < y.size(); i2++) {
                    ((vn) this.n.get(i2)).a((n1c) y.get(i2));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.D) {
                if (coVar.b.b.equals(this.b0.b) && coVar.b.d == this.b0.r) {
                    z = false;
                }
                if (z) {
                    if (n1cVar.o() || coVar.b.b.b()) {
                        j = coVar.b.d;
                    } else {
                        xo xoVar = coVar.b;
                        zzf zzfVar = xoVar.b;
                        j = xoVar.d;
                        L(n1cVar, zzfVar, j);
                    }
                    j2 = j;
                }
            } else {
                z = false;
            }
            this.D = false;
            V(coVar.b, 1, this.E, z, this.C, j2, -1, false);
        }
    }

    final /* synthetic */ void D(final co coVar) {
        this.i.e(new Runnable() { // from class: com.google.android.gms.internal.ads.qn
            @Override // java.lang.Runnable
            public final void run() {
                wn.this.C(coVar);
            }
        });
    }

    final /* synthetic */ void E(rnb rnbVar) {
        rnbVar.x(this.G);
    }

    @Override // defpackage.frb
    public final boolean a() {
        X();
        return this.b0.l;
    }

    @Override // defpackage.frb
    public final void b(float f) {
        X();
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.T == max) {
            return;
        }
        this.T = max;
        R();
        uvd uvdVar = this.k;
        uvdVar.d(22, new srd() { // from class: com.google.android.gms.internal.ads.gn
            @Override // defpackage.srd
            public final void zza(Object obj) {
                int i = wn.g0;
                ((rnb) obj).O(max);
            }
        });
        uvdVar.c();
    }

    @Override // defpackage.frb
    public final void c() {
        X();
        this.x.b(a(), 1);
        T(null);
        this.V = new l4d(zzgaa.t(), this.b0.r);
    }

    @Override // defpackage.frb
    public final void d(Surface surface) {
        X();
        S(surface);
        int i = surface == null ? 0 : -1;
        P(i, i);
    }

    @Override // defpackage.frb
    public final boolean e() {
        X();
        return this.b0.b.b();
    }

    @Override // defpackage.n9f
    public final void f(xgf xgfVar) {
        X();
        this.q.n(xgfVar);
    }

    @Override // defpackage.n9f
    public final void g(b0g b0gVar) {
        X();
        List singletonList = Collections.singletonList(b0gVar);
        X();
        X();
        G(this.b0);
        zzk();
        this.B++;
        boolean z = false;
        if (!this.n.isEmpty()) {
            int size = this.n.size();
            for (int i = size - 1; i >= 0; i--) {
                this.n.remove(i);
            }
            this.f0 = this.f0.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            vo voVar = new vo((b0g) singletonList.get(i2), this.o);
            arrayList.add(voVar);
            this.n.add(i2, new vn(voVar.b, voVar.a));
        }
        this.f0 = this.f0.g(0, arrayList.size());
        zo zoVar = new zo(this.n, this.f0);
        if (!zoVar.o() && zoVar.c() < 0) {
            throw new zzan(zoVar, -1, -9223372036854775807L);
        }
        int g = zoVar.g(false);
        xo N = N(this.b0, zoVar, M(zoVar, g, -9223372036854775807L));
        int i3 = N.e;
        if (g != -1 && i3 != 1) {
            i3 = 4;
            if (!zoVar.o() && g < zoVar.c()) {
                i3 = 2;
            }
        }
        xo e = N.e(i3);
        this.j.c0(arrayList, g, khe.F(-9223372036854775807L), this.f0);
        if (!this.b0.b.a.equals(e.b.a) && !this.b0.a.o()) {
            z = true;
        }
        V(e, 0, 1, z, 4, J(e), -1, false);
    }

    @Override // defpackage.frb
    public final void h(boolean z) {
        X();
        int b = this.x.b(z, zzf());
        U(z, b, H(z, b));
    }

    @Override // defpackage.n9f
    public final void i(xgf xgfVar) {
        this.q.s(xgfVar);
    }

    @Override // defpackage.kff
    public final void j(int i, long j, int i2, boolean z) {
        X();
        wad.d(i >= 0);
        this.q.c();
        n1c n1cVar = this.b0.a;
        if (n1cVar.o() || i < n1cVar.c()) {
            this.B++;
            if (e()) {
                ezd.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                co coVar = new co(this.b0);
                coVar.a(1);
                this.e0.a.D(coVar);
                return;
            }
            xo xoVar = this.b0;
            int i3 = xoVar.e;
            if (i3 == 3 || (i3 == 4 && !n1cVar.o())) {
                xoVar = this.b0.e(2);
            }
            int zzd = zzd();
            xo N = N(xoVar, n1cVar, M(n1cVar, i, j));
            this.j.Y(n1cVar, i, khe.F(j));
            V(N, 0, 1, true, 1, J(N), zzd, false);
        }
    }

    @Override // defpackage.n9f
    public final int k() {
        X();
        int length = this.g.length;
        return 2;
    }

    @Override // defpackage.frb
    public final boolean l() {
        X();
        return false;
    }

    public final zziz o() {
        X();
        return this.b0.f;
    }

    @Override // defpackage.frb
    public final int zzb() {
        X();
        if (e()) {
            return this.b0.b.b;
        }
        return -1;
    }

    @Override // defpackage.frb
    public final int zzc() {
        X();
        if (e()) {
            return this.b0.b.c;
        }
        return -1;
    }

    @Override // defpackage.frb
    public final int zzd() {
        X();
        int G = G(this.b0);
        if (G == -1) {
            return 0;
        }
        return G;
    }

    @Override // defpackage.frb
    public final int zze() {
        X();
        if (this.b0.a.o()) {
            return 0;
        }
        xo xoVar = this.b0;
        return xoVar.a.a(xoVar.b.a);
    }

    @Override // defpackage.frb
    public final int zzf() {
        X();
        return this.b0.e;
    }

    @Override // defpackage.frb
    public final int zzg() {
        X();
        return this.b0.m;
    }

    @Override // defpackage.frb
    public final int zzh() {
        X();
        return 0;
    }

    @Override // defpackage.frb
    public final long zzi() {
        X();
        if (e()) {
            xo xoVar = this.b0;
            return xoVar.k.equals(xoVar.b) ? khe.I(this.b0.p) : zzl();
        }
        X();
        if (this.b0.a.o()) {
            return this.d0;
        }
        xo xoVar2 = this.b0;
        long j = 0;
        if (xoVar2.k.d != xoVar2.b.d) {
            return khe.I(xoVar2.a.e(zzd(), this.a, 0L).m);
        }
        long j2 = xoVar2.p;
        if (this.b0.k.b()) {
            xo xoVar3 = this.b0;
            xoVar3.a.n(xoVar3.k.a, this.m).i(this.b0.k.b);
        } else {
            j = j2;
        }
        xo xoVar4 = this.b0;
        L(xoVar4.a, xoVar4.k, j);
        return khe.I(j);
    }

    @Override // defpackage.frb
    public final long zzj() {
        X();
        return I(this.b0);
    }

    @Override // defpackage.frb
    public final long zzk() {
        X();
        return khe.I(J(this.b0));
    }

    @Override // defpackage.frb
    public final long zzl() {
        X();
        if (e()) {
            xo xoVar = this.b0;
            zzf zzfVar = xoVar.b;
            xoVar.a.n(zzfVar.a, this.m);
            return khe.I(this.m.h(zzfVar.b, zzfVar.c));
        }
        n1c zzn = zzn();
        if (zzn.o()) {
            return -9223372036854775807L;
        }
        return khe.I(zzn.e(zzd(), this.a, 0L).m);
    }

    @Override // defpackage.frb
    public final long zzm() {
        X();
        return khe.I(this.b0.q);
    }

    @Override // defpackage.frb
    public final n1c zzn() {
        X();
        return this.b0.a;
    }

    @Override // defpackage.frb
    public final mhc zzo() {
        X();
        return this.b0.i.d;
    }

    @Override // defpackage.frb
    public final void zzp() {
        X();
        tm tmVar = this.x;
        boolean a = a();
        int b = tmVar.b(a, 2);
        U(a, b, H(a, b));
        xo xoVar = this.b0;
        if (xoVar.e != 1) {
            return;
        }
        xo d = xoVar.d(null);
        xo e = d.e(true == d.a.o() ? 4 : 2);
        this.B++;
        this.j.X();
        V(e, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.frb
    public final void zzq() {
        ezd.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + khe.e + "] [" + zza.a() + "]");
        X();
        this.x.d();
        if (!this.j.b0()) {
            uvd uvdVar = this.k;
            uvdVar.d(10, new srd() { // from class: gbf
                @Override // defpackage.srd
                public final void zza(Object obj) {
                    ((rnb) obj).J(zziz.d(new zzla(1), ContentMediaFormat.FULL_CONTENT_MOVIE));
                }
            });
            uvdVar.c();
        }
        this.k.e();
        this.i.a(null);
        this.s.a(this.q);
        xo xoVar = this.b0;
        boolean z = xoVar.o;
        xo e = xoVar.e(1);
        this.b0 = e;
        xo a = e.a(e.b);
        this.b0 = a;
        a.p = a.r;
        this.b0.q = 0L;
        this.q.j();
        this.h.b();
        Surface surface = this.M;
        if (surface != null) {
            surface.release();
            this.M = null;
        }
        this.V = l4d.b;
    }
}
