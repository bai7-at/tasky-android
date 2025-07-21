package defpackage;

/* loaded from: classes3.dex */
public final class b8a implements m7a {
    private final t8a a;
    private long e;
    private String g;
    private tx9 h;
    private a8a i;
    private boolean j;
    private boolean l;
    private final boolean[] f = new boolean[3];
    private final h8a b = new h8a(7, 128);
    private final h8a c = new h8a(8, 128);
    private final h8a d = new h8a(6, 128);
    private long k = -9223372036854775807L;
    private final b9e m = new b9e();

    public b8a(t8a t8aVar, boolean z, boolean z2) {
        this.a = t8aVar;
    }

    private final void e(byte[] bArr, int i, int i2) {
        if (!this.j) {
            this.b.a(bArr, i, i2);
            this.c.a(bArr, i, i2);
        }
        this.d.a(bArr, i, i2);
    }

    @Override // defpackage.m7a
    public final void a(boolean z) {
        wad.b(this.h);
        int i = khe.a;
        if (z) {
            this.i.a(this.e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a5 A[SYNTHETIC] */
    @Override // defpackage.m7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.b9e r19) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8a.b(b9e):void");
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        m9aVar.c();
        this.g = m9aVar.b();
        tx9 zzw = sv9Var.zzw(m9aVar.a(), 2);
        this.h = zzw;
        this.i = new a8a(zzw, false, false);
        this.a.b(sv9Var, m9aVar);
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        this.k = j;
        int i2 = i & 2;
        this.l = (i2 != 0) | this.l;
    }

    @Override // defpackage.m7a
    public final void zze() {
        this.e = 0L;
        this.l = false;
        this.k = -9223372036854775807L;
        kre.f(this.f);
        this.b.b();
        this.c.b();
        this.d.b();
        a8a a8aVar = this.i;
        if (a8aVar != null) {
            a8aVar.d();
        }
    }
}
