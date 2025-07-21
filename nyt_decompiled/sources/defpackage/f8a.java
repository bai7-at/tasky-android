package defpackage;

/* loaded from: classes3.dex */
public final class f8a implements m7a {
    private final String a;
    private final b9e b;
    private final g8e c;
    private tx9 d;
    private String e;
    private l6a f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    private String u;

    public f8a(String str) {
        this.a = str;
        b9e b9eVar = new b9e(1024);
        this.b = b9eVar;
        byte[] m = b9eVar.m();
        this.c = new g8e(m, m.length);
        this.k = -9223372036854775807L;
    }

    private final int e(g8e g8eVar) {
        int a = g8eVar.a();
        wt9 b = xt9.b(g8eVar, true);
        this.u = b.c;
        this.r = b.a;
        this.t = b.b;
        return a - g8eVar.a();
    }

    private static long f(g8e g8eVar) {
        return g8eVar.d((g8eVar.d(2) + 1) * 8);
    }

    @Override // defpackage.m7a
    public final void a(boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0154, code lost:
    
        if (r14.l == false) goto L89;
     */
    @Override // defpackage.m7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.b9e r15) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8a.b(b9e):void");
    }

    @Override // defpackage.m7a
    public final void c(sv9 sv9Var, m9a m9aVar) {
        m9aVar.c();
        this.d = sv9Var.zzw(m9aVar.a(), 1);
        this.e = m9aVar.b();
    }

    @Override // defpackage.m7a
    public final void d(long j, int i) {
        this.k = j;
    }

    @Override // defpackage.m7a
    public final void zze() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }
}
