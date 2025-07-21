package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.collect.ImmutableMap;
import defpackage.cy6;
import defpackage.f8;
import defpackage.fi7;
import defpackage.i60;
import defpackage.k60;
import defpackage.mm0;
import defpackage.nm0;
import defpackage.ok0;
import defpackage.ph4;
import defpackage.pk0;
import defpackage.q72;
import defpackage.re0;
import defpackage.rk0;
import defpackage.sj3;
import defpackage.sq8;
import defpackage.st7;
import defpackage.sv0;
import defpackage.sv5;
import defpackage.t50;
import defpackage.t81;
import defpackage.to6;
import defpackage.x64;
import defpackage.x81;
import defpackage.y81;
import defpackage.z19;
import defpackage.z81;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {
    private final x64 a;
    private final k60 b;
    private final int[] c;
    private final int d;
    private final com.google.android.exoplayer2.upstream.a e;
    private final long f;
    private final int g;
    private final e.c h;
    protected final b[] i;
    private q72 j;
    private t81 k;
    private int l;
    private IOException m;
    private boolean n;

    public static final class a implements a.InterfaceC0184a {
        private final a.InterfaceC0194a a;
        private final int b;
        private final pk0.a c;

        public a(a.InterfaceC0194a interfaceC0194a) {
            this(interfaceC0194a, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0184a
        public com.google.android.exoplayer2.source.dash.a a(x64 x64Var, t81 t81Var, k60 k60Var, int i, int[] iArr, q72 q72Var, int i2, long j, boolean z, List list, e.c cVar, sq8 sq8Var, sv5 sv5Var, mm0 mm0Var) {
            com.google.android.exoplayer2.upstream.a a = this.a.a();
            if (sq8Var != null) {
                a.i(sq8Var);
            }
            return new c(this.c, x64Var, t81Var, k60Var, i, iArr, q72Var, i2, a, j, this.b, z, list, cVar, sv5Var, mm0Var);
        }

        public a(a.InterfaceC0194a interfaceC0194a, int i) {
            this(re0.j, interfaceC0194a, i);
        }

        public a(pk0.a aVar, a.InterfaceC0194a interfaceC0194a, int i) {
            this.c = aVar;
            this.a = interfaceC0194a;
            this.b = i;
        }
    }

    protected static final class b {
        final pk0 a;
        public final cy6 b;
        public final i60 c;
        public final x81 d;
        private final long e;
        private final long f;

        b(long j, cy6 cy6Var, i60 i60Var, pk0 pk0Var, long j2, x81 x81Var) {
            this.e = j;
            this.b = cy6Var;
            this.c = i60Var;
            this.f = j2;
            this.a = pk0Var;
            this.d = x81Var;
        }

        b b(long j, cy6 cy6Var) {
            long g;
            x81 l = this.b.l();
            x81 l2 = cy6Var.l();
            if (l == null) {
                return new b(j, cy6Var, this.c, this.a, this.f, l);
            }
            if (!l.i()) {
                return new b(j, cy6Var, this.c, this.a, this.f, l2);
            }
            long h = l.h(j);
            if (h == 0) {
                return new b(j, cy6Var, this.c, this.a, this.f, l2);
            }
            long j2 = l.j();
            long b = l.b(j2);
            long j3 = h + j2;
            long j4 = j3 - 1;
            long b2 = l.b(j4) + l.c(j4, j);
            long j5 = l2.j();
            long b3 = l2.b(j5);
            long j6 = this.f;
            if (b2 != b3) {
                if (b2 < b3) {
                    throw new BehindLiveWindowException();
                }
                if (b3 < b) {
                    g = j6 - (l2.g(b, j) - j2);
                    return new b(j, cy6Var, this.c, this.a, g, l2);
                }
                j3 = l.g(b3, j);
            }
            g = j6 + (j3 - j5);
            return new b(j, cy6Var, this.c, this.a, g, l2);
        }

        b c(x81 x81Var) {
            return new b(this.e, this.b, this.c, this.a, this.f, x81Var);
        }

        b d(i60 i60Var) {
            return new b(this.e, this.b, i60Var, this.a, this.f, this.d);
        }

        public long e(long j) {
            return this.d.d(this.e, j) + this.f;
        }

        public long f() {
            return this.d.j() + this.f;
        }

        public long g(long j) {
            return (e(j) + this.d.k(this.e, j)) - 1;
        }

        public long h() {
            return this.d.h(this.e);
        }

        public long i(long j) {
            return k(j) + this.d.c(j - this.f, this.e);
        }

        public long j(long j) {
            return this.d.g(j, this.e) + this.f;
        }

        public long k(long j) {
            return this.d.b(j - this.f);
        }

        public to6 l(long j) {
            return this.d.f(j - this.f);
        }

        public boolean m(long j, long j2) {
            return this.d.i() || j2 == -9223372036854775807L || i(j) <= j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c, reason: collision with other inner class name */
    protected static final class C0185c extends t50 {
        private final b e;
        private final long f;

        public C0185c(b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.e = bVar;
            this.f = j3;
        }

        @Override // defpackage.qh4
        public long a() {
            c();
            return this.e.k(d());
        }

        @Override // defpackage.qh4
        public long b() {
            c();
            return this.e.i(d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(pk0.a aVar, x64 x64Var, t81 t81Var, k60 k60Var, int i, int[] iArr, q72 q72Var, int i2, com.google.android.exoplayer2.upstream.a aVar2, long j, int i3, boolean z, List list, e.c cVar, sv5 sv5Var, mm0 mm0Var) {
        this.a = x64Var;
        this.k = t81Var;
        this.b = k60Var;
        this.c = iArr;
        this.j = q72Var;
        this.d = i2;
        this.e = aVar2;
        this.l = i;
        this.f = j;
        this.g = i3;
        this.h = cVar;
        long g = t81Var.g(i);
        ArrayList n = n();
        this.i = new b[q72Var.length()];
        int i4 = 0;
        while (i4 < this.i.length) {
            cy6 cy6Var = (cy6) n.get(q72Var.g(i4));
            i60 j2 = k60Var.j(cy6Var.c);
            int i5 = i4;
            this.i[i5] = new b(g, cy6Var, j2 == null ? (i60) cy6Var.c.get(0) : j2, aVar.a(i2, cy6Var.b, z, list, cVar, sv5Var), 0L, cy6Var.l());
            i4 = i5 + 1;
        }
    }

    private h.a k(q72 q72Var, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = q72Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (q72Var.a(i2, elapsedRealtime)) {
                i++;
            }
        }
        int f = k60.f(list);
        return new h.a(f, f - this.b.g(list), length, i);
    }

    private long l(long j, long j2) {
        if (!this.k.d || this.i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m(j), this.i[0].i(this.i[0].g(j))) - j2);
    }

    private long m(long j) {
        t81 t81Var = this.k;
        long j2 = t81Var.a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - z19.D0(j2 + t81Var.d(this.l).b);
    }

    private ArrayList n() {
        List list = this.k.d(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((f8) list.get(i)).c);
        }
        return arrayList;
    }

    private long o(b bVar, ph4 ph4Var, long j, long j2, long j3) {
        return ph4Var != null ? ph4Var.g() : z19.r(bVar.j(j), j2, j3);
    }

    private b r(int i) {
        b bVar = this.i[i];
        i60 j = this.b.j(bVar.b.c);
        if (j == null || j.equals(bVar.c)) {
            return bVar;
        }
        b d = bVar.d(j);
        this.i[i] = d;
        return d;
    }

    @Override // defpackage.uk0
    public void a() {
        IOException iOException = this.m;
        if (iOException != null) {
            throw iOException;
        }
        this.a.a();
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void b(q72 q72Var) {
        this.j = q72Var;
    }

    @Override // defpackage.uk0
    public long d(long j, fi7 fi7Var) {
        for (b bVar : this.i) {
            if (bVar.d != null) {
                long h = bVar.h();
                if (h != 0) {
                    long j2 = bVar.j(j);
                    long k = bVar.k(j2);
                    return fi7Var.a(j, k, (k >= j || (h != -1 && j2 >= (bVar.f() + h) - 1)) ? k : bVar.k(j2 + 1));
                }
            }
        }
        return j;
    }

    @Override // defpackage.uk0
    public void e(ok0 ok0Var) {
        rk0 d;
        if (ok0Var instanceof sj3) {
            int q = this.j.q(((sj3) ok0Var).d);
            b bVar = this.i[q];
            if (bVar.d == null && (d = bVar.a.d()) != null) {
                this.i[q] = bVar.c(new z81(d, bVar.b.d));
            }
        }
        e.c cVar = this.h;
        if (cVar != null) {
            cVar.i(ok0Var);
        }
    }

    @Override // defpackage.uk0
    public boolean f(long j, ok0 ok0Var, List list) {
        if (this.m != null) {
            return false;
        }
        return this.j.e(j, ok0Var, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void g(t81 t81Var, int i) {
        try {
            this.k = t81Var;
            this.l = i;
            long g = t81Var.g(i);
            ArrayList n = n();
            for (int i2 = 0; i2 < this.i.length; i2++) {
                cy6 cy6Var = (cy6) n.get(this.j.g(i2));
                b[] bVarArr = this.i;
                bVarArr[i2] = bVarArr[i2].b(g, cy6Var);
            }
        } catch (BehindLiveWindowException e) {
            this.m = e;
        }
    }

    @Override // defpackage.uk0
    public boolean h(ok0 ok0Var, boolean z, h.c cVar, h hVar) {
        h.b c;
        if (!z) {
            return false;
        }
        e.c cVar2 = this.h;
        if (cVar2 != null && cVar2.j(ok0Var)) {
            return true;
        }
        if (!this.k.d && (ok0Var instanceof ph4)) {
            IOException iOException = cVar.c;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
                b bVar = this.i[this.j.q(ok0Var.d)];
                long h = bVar.h();
                if (h != -1 && h != 0) {
                    if (((ph4) ok0Var).g() > (bVar.f() + h) - 1) {
                        this.n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.i[this.j.q(ok0Var.d)];
        i60 j = this.b.j(bVar2.b.c);
        if (j != null && !bVar2.c.equals(j)) {
            return true;
        }
        h.a k = k(this.j, bVar2.b.c);
        if ((!k.a(2) && !k.a(1)) || (c = hVar.c(k, cVar)) == null || !k.a(c.a)) {
            return false;
        }
        int i = c.a;
        if (i == 2) {
            q72 q72Var = this.j;
            return q72Var.h(q72Var.q(ok0Var.d), c.b);
        }
        if (i != 1) {
            return false;
        }
        this.b.e(bVar2.c, c.b);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0158  */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // defpackage.uk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(long r33, long r35, java.util.List r37, defpackage.qk0 r38) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.c.i(long, long, java.util.List, qk0):void");
    }

    @Override // defpackage.uk0
    public int j(long j, List list) {
        return (this.m != null || this.j.length() < 2) ? list.size() : this.j.p(j, list);
    }

    protected ok0 p(b bVar, com.google.android.exoplayer2.upstream.a aVar, t0 t0Var, int i, Object obj, to6 to6Var, to6 to6Var2, nm0 nm0Var) {
        to6 to6Var3 = to6Var;
        cy6 cy6Var = bVar.b;
        if (to6Var3 != null) {
            to6 a2 = to6Var3.a(to6Var2, bVar.c.a);
            if (a2 != null) {
                to6Var3 = a2;
            }
        } else {
            to6Var3 = to6Var2;
        }
        return new sj3(aVar, y81.a(cy6Var, bVar.c.a, to6Var3, 0, ImmutableMap.o()), t0Var, i, obj, bVar.a);
    }

    protected ok0 q(b bVar, com.google.android.exoplayer2.upstream.a aVar, int i, t0 t0Var, int i2, Object obj, long j, int i3, long j2, long j3, nm0 nm0Var) {
        cy6 cy6Var = bVar.b;
        long k = bVar.k(j);
        to6 l = bVar.l(j);
        if (bVar.a == null) {
            return new st7(aVar, y81.a(cy6Var, bVar.c.a, l, bVar.m(j, j3) ? 0 : 8, ImmutableMap.o()), t0Var, i2, obj, k, bVar.i(j), j, i, t0Var);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            to6 a2 = l.a(bVar.l(i4 + j), bVar.c.a);
            if (a2 == null) {
                break;
            }
            i5++;
            i4++;
            l = a2;
        }
        long j4 = (i5 + j) - 1;
        long i6 = bVar.i(j4);
        long j5 = bVar.e;
        return new sv0(aVar, y81.a(cy6Var, bVar.c.a, l, bVar.m(j4, j3) ? 0 : 8, ImmutableMap.o()), t0Var, i2, obj, k, i6, j2, (j5 == -9223372036854775807L || j5 > i6) ? -9223372036854775807L : j5, j, i5, -cy6Var.d, bVar.a);
    }

    @Override // defpackage.uk0
    public void release() {
        for (b bVar : this.i) {
            pk0 pk0Var = bVar.a;
            if (pk0Var != null) {
                pk0Var.release();
            }
        }
    }
}
