package defpackage;

import com.google.android.gms.internal.ads.ga;

/* loaded from: classes3.dex */
final class i6g extends c6g {
    private final boolean e;
    private final d5g f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final int n;
    private final boolean r;
    private final boolean s;
    private final int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i6g(int r5, defpackage.v3c r6, int r7, defpackage.d5g r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6g.<init>(int, v3c, int, d5g, int, int, boolean):void");
    }

    public static /* synthetic */ int c(i6g i6gVar, i6g i6gVar2) {
        ga gaVar;
        ga a;
        ga gaVar2;
        if (i6gVar.e && i6gVar.h) {
            a = k6g.k;
        } else {
            gaVar = k6g.k;
            a = gaVar.a();
        }
        she j = she.j();
        Integer valueOf = Integer.valueOf(i6gVar.i);
        Integer valueOf2 = Integer.valueOf(i6gVar2.i);
        boolean z = i6gVar.f.y;
        gaVar2 = k6g.l;
        return j.d(valueOf, valueOf2, gaVar2).d(Integer.valueOf(i6gVar.j), Integer.valueOf(i6gVar2.j), a).d(Integer.valueOf(i6gVar.i), Integer.valueOf(i6gVar2.i), a).a();
    }

    public static /* synthetic */ int d(i6g i6gVar, i6g i6gVar2) {
        she d = she.j().e(i6gVar.h, i6gVar2.h).b(i6gVar.l, i6gVar2.l).e(i6gVar.m, i6gVar2.m).e(i6gVar.e, i6gVar2.e).e(i6gVar.g, i6gVar2.g).d(Integer.valueOf(i6gVar.k), Integer.valueOf(i6gVar2.k), ga.c().a());
        boolean z = i6gVar.r;
        she e = d.e(z, i6gVar2.r);
        boolean z2 = i6gVar.s;
        she e2 = e.e(z2, i6gVar2.s);
        if (z && z2) {
            e2 = e2.b(i6gVar.t, i6gVar2.t);
        }
        return e2.a();
    }

    @Override // defpackage.c6g
    public final int a() {
        return this.n;
    }

    @Override // defpackage.c6g
    public final /* bridge */ /* synthetic */ boolean b(c6g c6gVar) {
        i6g i6gVar = (i6g) c6gVar;
        if (!khe.f(this.d.l, i6gVar.d.l)) {
            return false;
        }
        boolean z = this.f.n0;
        return this.r == i6gVar.r && this.s == i6gVar.s;
    }
}
