package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.source.ads.b;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.w0;
import defpackage.c8;
import defpackage.ob;
import defpackage.qt7;
import defpackage.sq8;
import defpackage.ur;
import defpackage.v64;
import defpackage.z19;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class AdsMediaSource extends com.google.android.exoplayer2.source.c {
    private static final o.b L = new o.b(new Object());
    private com.google.android.exoplayer2.source.ads.a B;
    private final o k;
    final w0.f l;
    private final o.a m;
    private final com.google.android.exoplayer2.source.ads.b n;
    private final c8 r;
    private final com.google.android.exoplayer2.upstream.b s;
    private final Object t;
    private c x;
    private g2 y;
    private final Handler u = new Handler(Looper.getMainLooper());
    private final g2.b w = new g2.b();
    private a[][] H = new a[0][];

    public static final class AdLoadException extends IOException {

        /* renamed from: type, reason: collision with root package name */
        public final int f46type;

        private AdLoadException(int i, Exception exc) {
            super(exc);
            this.f46type = i;
        }

        public static AdLoadException a(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException b(Exception exc, int i) {
            return new AdLoadException(1, new IOException("Failed to load ad group " + i, exc));
        }

        public static AdLoadException c(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException d(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }
    }

    private final class a {
        private final o.b a;
        private final List b = new ArrayList();
        private Uri c;
        private o d;
        private g2 e;

        public a(o.b bVar) {
            this.a = bVar;
        }

        public n a(o.b bVar, ob obVar, long j) {
            l lVar = new l(bVar, obVar, j);
            this.b.add(lVar);
            o oVar = this.d;
            if (oVar != null) {
                lVar.y(oVar);
                lVar.z(AdsMediaSource.this.new b((Uri) ur.e(this.c)));
            }
            g2 g2Var = this.e;
            if (g2Var != null) {
                lVar.a(new o.b(g2Var.r(0), bVar.d));
            }
            return lVar;
        }

        public long b() {
            g2 g2Var = this.e;
            if (g2Var == null) {
                return -9223372036854775807L;
            }
            return g2Var.k(0, AdsMediaSource.this.w).o();
        }

        public void c(g2 g2Var) {
            ur.a(g2Var.n() == 1);
            if (this.e == null) {
                Object r = g2Var.r(0);
                for (int i = 0; i < this.b.size(); i++) {
                    l lVar = (l) this.b.get(i);
                    lVar.a(new o.b(r, lVar.a.d));
                }
            }
            this.e = g2Var;
        }

        public boolean d() {
            return this.d != null;
        }

        public void e(o oVar, Uri uri) {
            this.d = oVar;
            this.c = uri;
            for (int i = 0; i < this.b.size(); i++) {
                l lVar = (l) this.b.get(i);
                lVar.y(oVar);
                lVar.z(AdsMediaSource.this.new b(uri));
            }
            AdsMediaSource.this.K(this.a, oVar);
        }

        public boolean f() {
            return this.b.isEmpty();
        }

        public void g() {
            if (d()) {
                AdsMediaSource.this.L(this.a);
            }
        }

        public void h(l lVar) {
            this.b.remove(lVar);
            lVar.x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements l.a {
        private final Uri a;

        public b(Uri uri) {
            this.a = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(o.b bVar) {
            AdsMediaSource.this.n.a(AdsMediaSource.this, bVar.b, bVar.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(o.b bVar, IOException iOException) {
            AdsMediaSource.this.n.c(AdsMediaSource.this, bVar.b, bVar.c, iOException);
        }

        @Override // com.google.android.exoplayer2.source.l.a
        public void a(final o.b bVar) {
            AdsMediaSource.this.u.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.b.this.e(bVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.l.a
        public void b(final o.b bVar, final IOException iOException) {
            AdsMediaSource.this.w(bVar).w(new v64(v64.a(), new com.google.android.exoplayer2.upstream.b(this.a), SystemClock.elapsedRealtime()), 6, AdLoadException.a(iOException), true);
            AdsMediaSource.this.u.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.e
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.b.this.f(bVar, iOException);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements b.a {
        private final Handler a = z19.w();
        private volatile boolean b;

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.google.android.exoplayer2.source.ads.a aVar) {
            if (this.b) {
                return;
            }
            AdsMediaSource.this.c0(aVar);
        }

        public void c() {
            this.b = true;
            this.a.removeCallbacksAndMessages(null);
        }

        @Override // com.google.android.exoplayer2.source.ads.b.a
        public void w(final com.google.android.exoplayer2.source.ads.a aVar) {
            if (this.b) {
                return;
            }
            this.a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.g
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.c.this.b(aVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.ads.b.a
        public void y(AdLoadException adLoadException, com.google.android.exoplayer2.upstream.b bVar) {
            if (this.b) {
                return;
            }
            AdsMediaSource.this.w(null).w(new v64(v64.a(), bVar, SystemClock.elapsedRealtime()), 6, adLoadException, true);
        }
    }

    public AdsMediaSource(o oVar, com.google.android.exoplayer2.upstream.b bVar, Object obj, o.a aVar, com.google.android.exoplayer2.source.ads.b bVar2, c8 c8Var) {
        this.k = oVar;
        this.l = ((w0.h) ur.e(oVar.f().b)).c;
        this.m = aVar;
        this.n = bVar2;
        this.r = c8Var;
        this.s = bVar;
        this.t = obj;
        bVar2.e(aVar.b());
    }

    private long[][] W() {
        long[][] jArr = new long[this.H.length][];
        int i = 0;
        while (true) {
            a[][] aVarArr = this.H;
            if (i >= aVarArr.length) {
                return jArr;
            }
            jArr[i] = new long[aVarArr[i].length];
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.H[i];
                if (i2 < aVarArr2.length) {
                    a aVar = aVarArr2[i2];
                    jArr[i][i2] = aVar == null ? -9223372036854775807L : aVar.b();
                    i2++;
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(c cVar) {
        this.n.b(this, this.s, this.t, this.r, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(c cVar) {
        this.n.d(this, cVar);
    }

    private void a0() {
        Uri uri;
        com.google.android.exoplayer2.source.ads.a aVar = this.B;
        if (aVar == null) {
            return;
        }
        for (int i = 0; i < this.H.length; i++) {
            int i2 = 0;
            while (true) {
                a[] aVarArr = this.H[i];
                if (i2 < aVarArr.length) {
                    a aVar2 = aVarArr[i2];
                    a.C0183a e = aVar.e(i);
                    if (aVar2 != null && !aVar2.d()) {
                        Uri[] uriArr = e.d;
                        if (i2 < uriArr.length && (uri = uriArr[i2]) != null) {
                            w0.c g = new w0.c().g(uri);
                            w0.f fVar = this.l;
                            if (fVar != null) {
                                g.b(fVar);
                            }
                            aVar2.e(this.m.a(g.a()), uri);
                        }
                    }
                    i2++;
                }
            }
        }
    }

    private void b0() {
        g2 g2Var = this.y;
        com.google.android.exoplayer2.source.ads.a aVar = this.B;
        if (aVar == null || g2Var == null) {
            return;
        }
        if (aVar.b == 0) {
            C(g2Var);
        } else {
            this.B = aVar.l(W());
            C(new qt7(g2Var, this.B));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(com.google.android.exoplayer2.source.ads.a aVar) {
        com.google.android.exoplayer2.source.ads.a aVar2 = this.B;
        if (aVar2 == null) {
            a[][] aVarArr = new a[aVar.b][];
            this.H = aVarArr;
            Arrays.fill(aVarArr, new a[0]);
        } else {
            ur.g(aVar.b == aVar2.b);
        }
        this.B = aVar;
        a0();
        b0();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void B(sq8 sq8Var) {
        super.B(sq8Var);
        final c cVar = new c();
        this.x = cVar;
        K(L, this.k);
        this.u.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource.this.Y(cVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void D() {
        super.D();
        final c cVar = (c) ur.e(this.x);
        this.x = null;
        cVar.c();
        this.y = null;
        this.B = null;
        this.H = new a[0][];
        this.u.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource.this.Z(cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public o.b F(o.b bVar, o.b bVar2) {
        return bVar.b() ? bVar : bVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void I(o.b bVar, o oVar, g2 g2Var) {
        if (bVar.b()) {
            ((a) ur.e(this.H[bVar.b][bVar.c])).c(g2Var);
        } else {
            ur.a(g2Var.n() == 1);
            this.y = g2Var;
        }
        b0();
    }

    @Override // com.google.android.exoplayer2.source.o
    public w0 f() {
        return this.k.f();
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ob obVar, long j) {
        if (((com.google.android.exoplayer2.source.ads.a) ur.e(this.B)).b <= 0 || !bVar.b()) {
            l lVar = new l(bVar, obVar, j);
            lVar.y(this.k);
            lVar.a(bVar);
            return lVar;
        }
        int i = bVar.b;
        int i2 = bVar.c;
        a[][] aVarArr = this.H;
        a[] aVarArr2 = aVarArr[i];
        if (aVarArr2.length <= i2) {
            aVarArr[i] = (a[]) Arrays.copyOf(aVarArr2, i2 + 1);
        }
        a aVar = this.H[i][i2];
        if (aVar == null) {
            aVar = new a(bVar);
            this.H[i][i2] = aVar;
            a0();
        }
        return aVar.a(bVar, obVar, j);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(n nVar) {
        l lVar = (l) nVar;
        o.b bVar = lVar.a;
        if (!bVar.b()) {
            lVar.x();
            return;
        }
        a aVar = (a) ur.e(this.H[bVar.b][bVar.c]);
        aVar.h(lVar);
        if (aVar.f()) {
            aVar.g();
            this.H[bVar.b][bVar.c] = null;
        }
    }
}
