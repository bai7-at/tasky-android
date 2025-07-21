package defpackage;

import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.zzgaa;

/* loaded from: classes3.dex */
final class y5g extends c6g implements Comparable {
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public y5g(int i, v3c v3cVar, int i2, d5g d5gVar, int i3, String str) {
        super(i, v3cVar, i2);
        int i4;
        int i5 = 0;
        this.f = k6g.t(i3, false);
        int i6 = this.d.d;
        int i7 = d5gVar.v;
        this.g = 1 == (i6 & 1);
        this.h = (i6 & 2) != 0;
        zzgaa u = d5gVar.t.isEmpty() ? zzgaa.u("") : d5gVar.t;
        int i8 = 0;
        while (true) {
            if (i8 >= u.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            } else {
                i4 = k6g.l(this.d, (String) u.get(i8), false);
                if (i4 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.i = i8;
        this.j = i4;
        int k = k6g.k(this.d.e, d5gVar.u);
        this.k = k;
        this.m = (this.d.e & 1088) != 0;
        int l = k6g.l(this.d, str, k6g.p(str) == null);
        this.l = l;
        boolean z = i4 > 0 || (d5gVar.t.isEmpty() && k > 0) || this.g || (this.h && l > 0);
        if (k6g.t(i3, d5gVar.v0) && z) {
            i5 = 1;
        }
        this.e = i5;
    }

    @Override // defpackage.c6g
    public final int a() {
        return this.e;
    }

    @Override // defpackage.c6g
    public final /* bridge */ /* synthetic */ boolean b(c6g c6gVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(y5g y5gVar) {
        she b = she.j().e(this.f, y5gVar.f).d(Integer.valueOf(this.i), Integer.valueOf(y5gVar.i), ga.c().a()).b(this.j, y5gVar.j).b(this.k, y5gVar.k).e(this.g, y5gVar.g).d(Boolean.valueOf(this.h), Boolean.valueOf(y5gVar.h), this.j == 0 ? ga.c() : ga.c().a()).b(this.l, y5gVar.l);
        if (this.k == 0) {
            b = b.f(this.m, y5gVar.m);
        }
        return b.a();
    }
}
