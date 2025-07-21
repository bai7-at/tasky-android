package defpackage;

/* loaded from: classes3.dex */
public final class szf extends n1c {
    private final cza f;

    public szf(cza czaVar) {
        this.f = czaVar;
    }

    @Override // defpackage.n1c
    public final int a(Object obj) {
        return obj == qzf.i ? 0 : -1;
    }

    @Override // defpackage.n1c
    public final int b() {
        return 1;
    }

    @Override // defpackage.n1c
    public final int c() {
        return 1;
    }

    @Override // defpackage.n1c
    public final fyb d(int i, fyb fybVar, boolean z) {
        fybVar.l(z ? 0 : null, z ? qzf.i : null, 0, -9223372036854775807L, 0L, z4c.e, true);
        return fybVar;
    }

    @Override // defpackage.n1c
    public final l0c e(int i, l0c l0cVar, long j) {
        l0cVar.a(l0c.p, this.f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        l0cVar.k = true;
        return l0cVar;
    }

    @Override // defpackage.n1c
    public final Object f(int i) {
        return qzf.i;
    }
}
