package defpackage;

/* loaded from: classes3.dex */
public final class u7a implements m7a {
    private static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private tx9 b;
    private final p9a c;
    private final b9e d;
    private final h8a e;
    private final boolean[] f = new boolean[4];
    private final n7a g = new n7a(128);
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;

    u7a(p9a p9aVar) {
        b9e b9eVar;
        this.c = p9aVar;
        if (p9aVar != null) {
            this.e = new h8a(178, 128);
            b9eVar = new b9e();
        } else {
            b9eVar = null;
            this.e = null;
        }
        this.d = b9eVar;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.m7a
    public final void a(boolean z) {
        wad.b(this.b);
        if (z) {
            boolean z2 = this.o;
            long j = this.h - this.m;
            this.b.c(this.n, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01da  */
    @Override // defpackage.m7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.b9e r28) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7a.b(b9e):void");
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        m9aVar.c();
        this.a = m9aVar.b();
        this.b = sv9Var.zzw(m9aVar.a(), 2);
        p9a p9aVar = this.c;
        if (p9aVar != null) {
            p9aVar.b(sv9Var, m9aVar);
        }
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.m7a
    public final void zze() {
        kre.f(this.f);
        this.g.b();
        h8a h8aVar = this.e;
        if (h8aVar != null) {
            h8aVar.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
}
