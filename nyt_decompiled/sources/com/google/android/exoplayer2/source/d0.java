package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.h;
import defpackage.a84;
import defpackage.aa1;
import defpackage.ep2;
import defpackage.fi7;
import defpackage.ku4;
import defpackage.pi4;
import defpackage.q72;
import defpackage.sq8;
import defpackage.t18;
import defpackage.up8;
import defpackage.ur;
import defpackage.v64;
import defpackage.wp8;
import defpackage.y77;
import defpackage.z19;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class d0 implements n, Loader.b {
    private final com.google.android.exoplayer2.upstream.b a;
    private final a.InterfaceC0194a b;
    private final sq8 c;
    private final com.google.android.exoplayer2.upstream.h d;
    private final p.a e;
    private final wp8 f;
    private final long h;
    final t0 j;
    final boolean k;
    boolean l;
    byte[] m;
    int n;
    private final ArrayList g = new ArrayList();
    final Loader i = new Loader("SingleSampleMediaPeriod");

    private final class b implements y77 {
        private int a;
        private boolean b;

        private b() {
        }

        private void b() {
            if (this.b) {
                return;
            }
            d0.this.e.h(ku4.k(d0.this.j.l), d0.this.j, 0, null, 0L);
            this.b = true;
        }

        @Override // defpackage.y77
        public void a() {
            d0 d0Var = d0.this;
            if (d0Var.k) {
                return;
            }
            d0Var.i.a();
        }

        public void c() {
            if (this.a == 2) {
                this.a = 1;
            }
        }

        @Override // defpackage.y77
        public boolean g() {
            return d0.this.l;
        }

        @Override // defpackage.y77
        public int p(ep2 ep2Var, DecoderInputBuffer decoderInputBuffer, int i) {
            b();
            d0 d0Var = d0.this;
            boolean z = d0Var.l;
            if (z && d0Var.m == null) {
                this.a = 2;
            }
            int i2 = this.a;
            if (i2 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                ep2Var.b = d0Var.j;
                this.a = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            ur.e(d0Var.m);
            decoderInputBuffer.e(1);
            decoderInputBuffer.e = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.t(d0.this.n);
                ByteBuffer byteBuffer = decoderInputBuffer.c;
                d0 d0Var2 = d0.this;
                byteBuffer.put(d0Var2.m, 0, d0Var2.n);
            }
            if ((i & 1) == 0) {
                this.a = 2;
            }
            return -4;
        }

        @Override // defpackage.y77
        public int s(long j) {
            b();
            if (j <= 0 || this.a == 2) {
                return 0;
            }
            this.a = 2;
            return 1;
        }
    }

    static final class c implements Loader.e {
        public final long a = v64.a();
        public final com.google.android.exoplayer2.upstream.b b;
        private final t18 c;
        private byte[] d;

        public c(com.google.android.exoplayer2.upstream.b bVar, com.google.android.exoplayer2.upstream.a aVar) {
            this.b = bVar;
            this.c = new t18(aVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            this.c.u();
            try {
                this.c.b(this.b);
                int i = 0;
                while (i != -1) {
                    int k = (int) this.c.k();
                    byte[] bArr = this.d;
                    if (bArr == null) {
                        this.d = new byte[1024];
                    } else if (k == bArr.length) {
                        this.d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    t18 t18Var = this.c;
                    byte[] bArr2 = this.d;
                    i = t18Var.read(bArr2, k, bArr2.length - k);
                }
                aa1.a(this.c);
            } catch (Throwable th) {
                aa1.a(this.c);
                throw th;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void c() {
        }
    }

    public d0(com.google.android.exoplayer2.upstream.b bVar, a.InterfaceC0194a interfaceC0194a, sq8 sq8Var, t0 t0Var, long j, com.google.android.exoplayer2.upstream.h hVar, p.a aVar, boolean z) {
        this.a = bVar;
        this.b = interfaceC0194a;
        this.c = sq8Var;
        this.j = t0Var;
        this.h = j;
        this.d = hVar;
        this.e = aVar;
        this.k = z;
        this.f = new wp8(new up8(t0Var));
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean b() {
        return this.i.j();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long c() {
        return (this.l || this.i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long d(long j, fi7 fi7Var) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        if (this.l || this.i.j() || this.i.i()) {
            return false;
        }
        com.google.android.exoplayer2.upstream.a a2 = this.b.a();
        sq8 sq8Var = this.c;
        if (sq8Var != null) {
            a2.i(sq8Var);
        }
        c cVar = new c(this.a, a2);
        this.e.z(new v64(cVar.a, this.a, this.i.n(cVar, this, this.d.b(1))), 1, -1, this.j, 0, null, 0L, this.h);
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(c cVar, long j, long j2, boolean z) {
        t18 t18Var = cVar.c;
        v64 v64Var = new v64(cVar.a, cVar.b, t18Var.s(), t18Var.t(), j, j2, t18Var.k());
        this.d.d(cVar.a);
        this.e.q(v64Var, 1, -1, null, 0, null, 0L, this.h);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long h() {
        return this.l ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void i(long j) {
    }

    @Override // com.google.android.exoplayer2.source.n
    public long j(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < q72VarArr.length; i++) {
            y77 y77Var = y77VarArr[i];
            if (y77Var != null && (q72VarArr[i] == null || !zArr[i])) {
                this.g.remove(y77Var);
                y77VarArr[i] = null;
            }
            if (y77VarArr[i] == null && q72VarArr[i] != null) {
                b bVar = new b();
                this.g.add(bVar);
                y77VarArr[i] = bVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j) {
        for (int i = 0; i < this.g.size(); i++) {
            ((b) this.g.get(i)).c();
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long m() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n(n.a aVar, long j) {
        aVar.o(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(c cVar, long j, long j2) {
        this.n = (int) cVar.c.k();
        this.m = (byte[]) ur.e(cVar.d);
        this.l = true;
        t18 t18Var = cVar.c;
        v64 v64Var = new v64(cVar.a, cVar.b, t18Var.s(), t18Var.t(), j, j2, this.n);
        this.d.d(cVar.a);
        this.e.t(v64Var, 1, -1, this.j, 0, null, 0L, this.h);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Loader.c o(c cVar, long j, long j2, IOException iOException, int i) {
        Loader.c h;
        t18 t18Var = cVar.c;
        v64 v64Var = new v64(cVar.a, cVar.b, t18Var.s(), t18Var.t(), j, j2, t18Var.k());
        long a2 = this.d.a(new h.c(v64Var, new pi4(1, -1, this.j, 0, null, 0L, z19.h1(this.h)), iOException, i));
        boolean z = a2 == -9223372036854775807L || i >= this.d.b(1);
        if (this.k && z) {
            a84.k("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.l = true;
            h = Loader.f;
        } else {
            h = a2 != -9223372036854775807L ? Loader.h(false, a2) : Loader.g;
        }
        Loader.c cVar2 = h;
        boolean c2 = cVar2.c();
        this.e.v(v64Var, 1, -1, this.j, 0, null, 0L, this.h, iOException, !c2);
        if (!c2) {
            this.d.d(cVar.a);
        }
        return cVar2;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void r() {
    }

    public void s() {
        this.i.l();
    }

    @Override // com.google.android.exoplayer2.source.n
    public wp8 t() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void u(long j, boolean z) {
    }
}
