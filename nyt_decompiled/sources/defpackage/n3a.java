package defpackage;

/* loaded from: classes3.dex */
final class n3a implements u3a {
    private final t3a a;
    private final long b;
    private final long c;
    private final h4a d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public n3a(h4a h4aVar, long j, long j2, long j3, long j4, boolean z) {
        wad.d(j >= 0 && j2 > j);
        this.d = h4aVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new t3a();
    }

    @Override // defpackage.u3a
    public final void a(long j) {
        this.h = Math.max(0L, Math.min(j, this.f - 1));
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    @Override // defpackage.u3a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.ov9 r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3a.b(ov9):long");
    }

    @Override // defpackage.u3a
    public final /* bridge */ /* synthetic */ gx9 zze() {
        l3a l3aVar = null;
        if (this.f != 0) {
            return new m3a(this, l3aVar);
        }
        return null;
    }
}
