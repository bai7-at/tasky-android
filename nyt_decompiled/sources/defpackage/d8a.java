package defpackage;

/* loaded from: classes3.dex */
public final class d8a implements m7a {
    private final t8a a;
    private String b;
    private tx9 c;
    private c8a d;
    private boolean e;
    private long l;
    private final boolean[] f = new boolean[3];
    private final h8a g = new h8a(32, 128);
    private final h8a h = new h8a(33, 128);
    private final h8a i = new h8a(34, 128);
    private final h8a j = new h8a(39, 128);
    private final h8a k = new h8a(40, 128);
    private long m = -9223372036854775807L;
    private final b9e n = new b9e();

    public d8a(t8a t8aVar) {
        this.a = t8aVar;
    }

    private final void e(byte[] bArr, int i, int i2) {
        this.d.c(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // defpackage.m7a
    public final void a(boolean z) {
        wad.b(this.c);
        int i = khe.a;
        if (z) {
            this.d.a(this.l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01aa  */
    @Override // defpackage.m7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.b9e r32) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d8a.b(b9e):void");
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        m9aVar.c();
        this.b = m9aVar.b();
        tx9 zzw = sv9Var.zzw(m9aVar.a(), 2);
        this.c = zzw;
        this.d = new c8a(zzw);
        this.a.b(sv9Var, m9aVar);
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.m7a
    public final void zze() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        kre.f(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        c8a c8aVar = this.d;
        if (c8aVar != null) {
            c8aVar.d();
        }
    }
}
