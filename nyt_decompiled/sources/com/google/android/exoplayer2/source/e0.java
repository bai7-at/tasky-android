package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.w0;
import com.google.common.collect.ImmutableList;
import defpackage.ob;
import defpackage.rt7;
import defpackage.sq8;
import defpackage.sv4;
import defpackage.ur;

/* loaded from: classes2.dex */
public final class e0 extends com.google.android.exoplayer2.source.a {
    private final com.google.android.exoplayer2.upstream.b h;
    private final a.InterfaceC0194a i;
    private final t0 j;
    private final long k;
    private final com.google.android.exoplayer2.upstream.h l;
    private final boolean m;
    private final g2 n;
    private final w0 r;
    private sq8 s;

    public static final class b {
        private final a.InterfaceC0194a a;
        private com.google.android.exoplayer2.upstream.h b = new com.google.android.exoplayer2.upstream.g();
        private boolean c = true;
        private Object d;
        private String e;

        public b(a.InterfaceC0194a interfaceC0194a) {
            this.a = (a.InterfaceC0194a) ur.e(interfaceC0194a);
        }

        public e0 a(w0.k kVar, long j) {
            return new e0(this.e, kVar, this.a, j, this.b, this.c, this.d);
        }

        public b b(com.google.android.exoplayer2.upstream.h hVar) {
            if (hVar == null) {
                hVar = new com.google.android.exoplayer2.upstream.g();
            }
            this.b = hVar;
            return this;
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void B(sq8 sq8Var) {
        this.s = sq8Var;
        C(this.n);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D() {
    }

    @Override // com.google.android.exoplayer2.source.o
    public w0 f() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ob obVar, long j) {
        return new d0(this.h, this.i, this.s, this.j, this.k, this.l, w(bVar), this.m);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void h(n nVar) {
        ((d0) nVar).s();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void p() {
    }

    private e0(String str, w0.k kVar, a.InterfaceC0194a interfaceC0194a, long j, com.google.android.exoplayer2.upstream.h hVar, boolean z, Object obj) {
        this.i = interfaceC0194a;
        this.k = j;
        this.l = hVar;
        this.m = z;
        w0 a2 = new w0.c().g(Uri.EMPTY).d(kVar.a.toString()).e(ImmutableList.y(kVar)).f(obj).a();
        this.r = a2;
        t0.b W = new t0.b().g0((String) sv4.a(kVar.b, "text/x-unknown")).X(kVar.c).i0(kVar.d).e0(kVar.e).W(kVar.f);
        String str2 = kVar.g;
        this.j = W.U(str2 == null ? str : str2).G();
        this.h = new b.C0195b().i(kVar.a).b(1).a();
        this.n = new rt7(j, true, false, false, null, a2);
    }
}
