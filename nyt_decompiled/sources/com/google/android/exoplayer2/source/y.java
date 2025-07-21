package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.x;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.w0;
import defpackage.d82;
import defpackage.fw1;
import defpackage.kh1;
import defpackage.ob;
import defpackage.rt7;
import defpackage.se0;
import defpackage.sq8;
import defpackage.sv5;
import defpackage.ur;

/* loaded from: classes2.dex */
public final class y extends com.google.android.exoplayer2.source.a implements x.b {
    private final w0 h;
    private final w0.h i;
    private final a.InterfaceC0194a j;
    private final s.a k;
    private final com.google.android.exoplayer2.drm.i l;
    private final com.google.android.exoplayer2.upstream.h m;
    private final int n;
    private boolean r;
    private long s;
    private boolean t;
    private boolean u;
    private sq8 w;

    class a extends j {
        a(g2 g2Var) {
            super(g2Var);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.b l(int i, g2.b bVar, boolean z) {
            super.l(i, bVar, z);
            bVar.f = true;
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.g2
        public g2.d t(int i, g2.d dVar, long j) {
            super.t(i, dVar, j);
            dVar.l = true;
            return dVar;
        }
    }

    public static final class b implements q {
        private final a.InterfaceC0194a c;
        private s.a d;
        private fw1 e;
        private com.google.android.exoplayer2.upstream.h f;
        private int g;

        public b(a.InterfaceC0194a interfaceC0194a) {
            this(interfaceC0194a, new kh1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ s g(d82 d82Var, sv5 sv5Var) {
            return new se0(d82Var);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        public int[] b() {
            return new int[]{4};
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public y a(w0 w0Var) {
            ur.e(w0Var.b);
            return new y(w0Var, this.c, this.d, this.e.a(w0Var), this.f, this.g, null);
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b c(fw1 fw1Var) {
            this.e = (fw1) ur.f(fw1Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.o.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b d(com.google.android.exoplayer2.upstream.h hVar) {
            this.f = (com.google.android.exoplayer2.upstream.h) ur.f(hVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(a.InterfaceC0194a interfaceC0194a, final d82 d82Var) {
            this(interfaceC0194a, new s.a() { // from class: z46
                @Override // com.google.android.exoplayer2.source.s.a
                public final s a(sv5 sv5Var) {
                    s g;
                    g = y.b.g(d82.this, sv5Var);
                    return g;
                }
            });
        }

        public b(a.InterfaceC0194a interfaceC0194a, s.a aVar) {
            this(interfaceC0194a, aVar, new com.google.android.exoplayer2.drm.g(), new com.google.android.exoplayer2.upstream.g(), Constants.MB);
        }

        public b(a.InterfaceC0194a interfaceC0194a, s.a aVar, fw1 fw1Var, com.google.android.exoplayer2.upstream.h hVar, int i) {
            this.c = interfaceC0194a;
            this.d = aVar;
            this.e = fw1Var;
            this.f = hVar;
            this.g = i;
        }
    }

    /* synthetic */ y(w0 w0Var, a.InterfaceC0194a interfaceC0194a, s.a aVar, com.google.android.exoplayer2.drm.i iVar, com.google.android.exoplayer2.upstream.h hVar, int i, a aVar2) {
        this(w0Var, interfaceC0194a, aVar, iVar, hVar, i);
    }

    private void E() {
        g2 rt7Var = new rt7(this.s, this.t, false, this.u, null, this.h);
        if (this.r) {
            rt7Var = new a(rt7Var);
        }
        C(rt7Var);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void B(sq8 sq8Var) {
        this.w = sq8Var;
        this.l.b((Looper) ur.e(Looper.myLooper()), z());
        this.l.Z();
        E();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D() {
        this.l.release();
    }

    @Override // com.google.android.exoplayer2.source.o
    public w0 f() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ob obVar, long j) {
        com.google.android.exoplayer2.upstream.a a2 = this.j.a();
        sq8 sq8Var = this.w;
        if (sq8Var != null) {
            a2.i(sq8Var);
        }
        return new x(this.i.a, a2, this.k.a(z()), this.l, u(bVar), this.m, w(bVar), this, obVar, this.i.f, this.n);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(n nVar) {
        ((x) nVar).f0();
    }

    @Override // com.google.android.exoplayer2.source.x.b
    public void l(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.s;
        }
        if (!this.r && this.s == j && this.t == z && this.u == z2) {
            return;
        }
        this.s = j;
        this.t = z;
        this.u = z2;
        this.r = false;
        E();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void p() {
    }

    private y(w0 w0Var, a.InterfaceC0194a interfaceC0194a, s.a aVar, com.google.android.exoplayer2.drm.i iVar, com.google.android.exoplayer2.upstream.h hVar, int i) {
        this.i = (w0.h) ur.e(w0Var.b);
        this.h = w0Var;
        this.j = interfaceC0194a;
        this.k = aVar;
        this.l = iVar;
        this.m = hVar;
        this.n = i;
        this.r = true;
        this.s = -9223372036854775807L;
    }
}
