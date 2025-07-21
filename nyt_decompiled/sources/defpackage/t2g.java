package defpackage;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class t2g extends n1c {
    private static final Object k = new Object();
    private static final cza l;
    private final long f;
    private final long g;
    private final boolean h;
    private final cza i;
    private final moa j;

    static {
        wba wbaVar = new wba();
        wbaVar.a("SinglePeriodTimeline");
        wbaVar.b(Uri.EMPTY);
        l = wbaVar.c();
    }

    public t2g(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, cza czaVar, moa moaVar) {
        this.f = j4;
        this.g = j5;
        this.h = z;
        czaVar.getClass();
        this.i = czaVar;
        this.j = moaVar;
    }

    @Override // defpackage.n1c
    public final int a(Object obj) {
        return k.equals(obj) ? 0 : -1;
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
        wad.a(i, 0, 1);
        fybVar.l(null, z ? k : null, 0, this.f, 0L, z4c.e, false);
        return fybVar;
    }

    @Override // defpackage.n1c
    public final l0c e(int i, l0c l0cVar, long j) {
        wad.a(i, 0, 1);
        Object obj = l0c.p;
        cza czaVar = this.i;
        long j2 = this.g;
        l0cVar.a(obj, czaVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.h, false, this.j, 0L, j2, 0, 0, 0L);
        return l0cVar;
    }

    @Override // defpackage.n1c
    public final Object f(int i) {
        wad.a(i, 0, 1);
        return k;
    }
}
