package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.collect.ImmutableMap;
import defpackage.fi7;
import defpackage.gq8;
import defpackage.mm0;
import defpackage.nm0;
import defpackage.ok0;
import defpackage.oq2;
import defpackage.ph4;
import defpackage.pk0;
import defpackage.q72;
import defpackage.qh4;
import defpackage.qk0;
import defpackage.qp8;
import defpackage.re0;
import defpackage.rp8;
import defpackage.sq8;
import defpackage.sv0;
import defpackage.t50;
import defpackage.ur;
import defpackage.x64;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {
    private final x64 a;
    private final int b;
    private final pk0[] c;
    private final com.google.android.exoplayer2.upstream.a d;
    private q72 e;
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a f;
    private int g;
    private IOException h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a, reason: collision with other inner class name */
    public static final class C0191a implements b.a {
        private final a.InterfaceC0194a a;

        public C0191a(a.InterfaceC0194a interfaceC0194a) {
            this.a = interfaceC0194a;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(x64 x64Var, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i, q72 q72Var, sq8 sq8Var, mm0 mm0Var) {
            com.google.android.exoplayer2.upstream.a a = this.a.a();
            if (sq8Var != null) {
                a.i(sq8Var);
            }
            return new a(x64Var, aVar, i, q72Var, a, mm0Var);
        }
    }

    private static final class b extends t50 {
        private final a.b e;
        private final int f;

        public b(a.b bVar, int i, int i2) {
            super(i2, bVar.k - 1);
            this.e = bVar;
            this.f = i;
        }

        @Override // defpackage.qh4
        public long a() {
            c();
            return this.e.e((int) d());
        }

        @Override // defpackage.qh4
        public long b() {
            return a() + this.e.c((int) d());
        }
    }

    public a(x64 x64Var, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i, q72 q72Var, com.google.android.exoplayer2.upstream.a aVar2, mm0 mm0Var) {
        this.a = x64Var;
        this.f = aVar;
        this.b = i;
        this.e = q72Var;
        this.d = aVar2;
        a.b bVar = aVar.f[i];
        this.c = new pk0[q72Var.length()];
        for (int i2 = 0; i2 < this.c.length; i2++) {
            int g = q72Var.g(i2);
            t0 t0Var = bVar.j[g];
            rp8[] rp8VarArr = t0Var.r != null ? ((a.C0192a) ur.e(aVar.e)).c : null;
            int i3 = bVar.a;
            this.c[i2] = new re0(new oq2(3, null, new qp8(g, i3, bVar.c, -9223372036854775807L, aVar.g, t0Var, 0, rp8VarArr, i3 == 2 ? 4 : 0, null, null)), bVar.a, t0Var);
        }
    }

    private static ph4 k(t0 t0Var, com.google.android.exoplayer2.upstream.a aVar, Uri uri, int i, long j, long j2, long j3, int i2, Object obj, pk0 pk0Var, nm0 nm0Var) {
        return new sv0(aVar, new b.C0195b().i(uri).e(ImmutableMap.o()).a(), t0Var, i2, obj, j, j2, j3, -9223372036854775807L, i, 1, j, pk0Var);
    }

    private long l(long j) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f;
        if (!aVar.d) {
            return -9223372036854775807L;
        }
        a.b bVar = aVar.f[this.b];
        int i = bVar.k - 1;
        return (bVar.e(i) + bVar.c(i)) - j;
    }

    @Override // defpackage.uk0
    public void a() {
        IOException iOException = this.h;
        if (iOException != null) {
            throw iOException;
        }
        this.a.a();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void b(q72 q72Var) {
        this.e = q72Var;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void c(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        a.b[] bVarArr = this.f.f;
        int i = this.b;
        a.b bVar = bVarArr[i];
        int i2 = bVar.k;
        a.b bVar2 = aVar.f[i];
        if (i2 == 0 || bVar2.k == 0) {
            this.g += i2;
        } else {
            int i3 = i2 - 1;
            long e = bVar.e(i3) + bVar.c(i3);
            long e2 = bVar2.e(0);
            if (e <= e2) {
                this.g += i2;
            } else {
                this.g += bVar.d(e2);
            }
        }
        this.f = aVar;
    }

    @Override // defpackage.uk0
    public long d(long j, fi7 fi7Var) {
        a.b bVar = this.f.f[this.b];
        int d = bVar.d(j);
        long e = bVar.e(d);
        return fi7Var.a(j, e, (e >= j || d >= bVar.k + (-1)) ? e : bVar.e(d + 1));
    }

    @Override // defpackage.uk0
    public void e(ok0 ok0Var) {
    }

    @Override // defpackage.uk0
    public boolean f(long j, ok0 ok0Var, List list) {
        if (this.h != null) {
            return false;
        }
        return this.e.e(j, ok0Var, list);
    }

    @Override // defpackage.uk0
    public boolean h(ok0 ok0Var, boolean z, h.c cVar, h hVar) {
        h.b c = hVar.c(gq8.c(this.e), cVar);
        if (z && c != null && c.a == 2) {
            q72 q72Var = this.e;
            if (q72Var.h(q72Var.q(ok0Var.d), c.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uk0
    public final void i(long j, long j2, List list, qk0 qk0Var) {
        int g;
        long j3 = j2;
        if (this.h != null) {
            return;
        }
        a.b bVar = this.f.f[this.b];
        if (bVar.k == 0) {
            qk0Var.b = !r4.d;
            return;
        }
        if (list.isEmpty()) {
            g = bVar.d(j3);
        } else {
            g = (int) (((ph4) list.get(list.size() - 1)).g() - this.g);
            if (g < 0) {
                this.h = new BehindLiveWindowException();
                return;
            }
        }
        if (g >= bVar.k) {
            qk0Var.b = !this.f.d;
            return;
        }
        long j4 = j3 - j;
        long l = l(j);
        int length = this.e.length();
        qh4[] qh4VarArr = new qh4[length];
        for (int i = 0; i < length; i++) {
            qh4VarArr[i] = new b(bVar, this.e.g(i), g);
        }
        this.e.m(j, j4, l, list, qh4VarArr);
        long e = bVar.e(g);
        long c = e + bVar.c(g);
        if (!list.isEmpty()) {
            j3 = -9223372036854775807L;
        }
        long j5 = j3;
        int i2 = g + this.g;
        int b2 = this.e.b();
        qk0Var.a = k(this.e.s(), this.d, bVar.a(this.e.g(b2), g), i2, e, c, j5, this.e.t(), this.e.j(), this.c[b2], null);
    }

    @Override // defpackage.uk0
    public int j(long j, List list) {
        return (this.h != null || this.e.length() < 2) ? list.size() : this.e.p(j, list);
    }

    @Override // defpackage.uk0
    public void release() {
        for (pk0 pk0Var : this.c) {
            pk0Var.release();
        }
    }
}
