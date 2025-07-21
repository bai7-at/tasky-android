package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ga;

/* loaded from: classes3.dex */
final class p4g extends c6g implements Comparable {
    private final boolean B;
    private final int e;
    private final boolean f;
    private final String g;
    private final d5g h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final int n;
    private final int r;
    private final boolean s;
    private final int t;
    private final int u;
    private final int w;
    private final int x;
    private final boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public p4g(int i, v3c v3cVar, int i2, d5g d5gVar, int i3, boolean z, uge ugeVar, int i4) {
        super(i, v3cVar, i2);
        int i5;
        int i6;
        int i7;
        boolean z2;
        this.h = d5gVar;
        int i8 = 1;
        int i9 = true != d5gVar.t0 ? 16 : 24;
        this.g = k6g.p(this.d.c);
        this.i = k6g.t(i3, false);
        int i10 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i10 >= d5gVar.n.size()) {
                i6 = 0;
                i10 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = k6g.l(this.d, (String) d5gVar.n.get(i10), false);
                if (i6 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.k = i10;
        this.j = i6;
        this.l = k6g.k(this.d.e, 0);
        l6a l6aVar = this.d;
        int i11 = l6aVar.e;
        this.m = i11 == 0 || (i11 & 1) != 0;
        this.s = 1 == (l6aVar.d & 1);
        this.t = l6aVar.y;
        this.u = l6aVar.z;
        this.w = l6aVar.h;
        this.f = ugeVar.zza(l6aVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = khe.a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i12 = 0; i12 < split.length; i12++) {
            split[i12] = khe.c(split[i12]);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= split.length) {
                i7 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                i7 = k6g.l(this.d, split[i13], false);
                if (i7 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.n = i13;
        this.r = i7;
        int i14 = 0;
        while (true) {
            if (i14 >= d5gVar.r.size()) {
                break;
            }
            String str = this.d.l;
            if (str != null && str.equals(d5gVar.r.get(i14))) {
                i5 = i14;
                break;
            }
            i14++;
        }
        this.x = i5;
        this.y = (i3 & 384) == 128;
        this.B = (i3 & 64) == 64;
        d5g d5gVar2 = this.h;
        if (!k6g.t(i3, d5gVar2.v0) || (!(z2 = this.f) && !d5gVar2.o0)) {
            i8 = 0;
        } else if (k6g.t(i3, false) && z2 && this.d.h != -1 && ((d5gVar2.x0 || !z) && (i9 & i3) != 0)) {
            i8 = 2;
        }
        this.e = i8;
    }

    @Override // defpackage.c6g
    public final int a() {
        return this.e;
    }

    @Override // defpackage.c6g
    public final /* bridge */ /* synthetic */ boolean b(c6g c6gVar) {
        String str;
        p4g p4gVar = (p4g) c6gVar;
        boolean z = this.h.r0;
        l6a l6aVar = this.d;
        int i = l6aVar.y;
        if (i == -1) {
            return false;
        }
        l6a l6aVar2 = p4gVar.d;
        if (i != l6aVar2.y || (str = l6aVar.l) == null || !TextUtils.equals(str, l6aVar2.l)) {
            return false;
        }
        boolean z2 = this.h.q0;
        int i2 = this.d.z;
        return i2 != -1 && i2 == p4gVar.d.z && this.y == p4gVar.y && this.B == p4gVar.B;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p4g p4gVar) {
        ga gaVar;
        ga a;
        ga gaVar2;
        if (this.f && this.i) {
            a = k6g.k;
        } else {
            gaVar = k6g.k;
            a = gaVar.a();
        }
        she d = she.j().e(this.i, p4gVar.i).d(Integer.valueOf(this.k), Integer.valueOf(p4gVar.k), ga.c().a()).b(this.j, p4gVar.j).b(this.l, p4gVar.l).e(this.s, p4gVar.s).e(this.m, p4gVar.m).d(Integer.valueOf(this.n), Integer.valueOf(p4gVar.n), ga.c().a()).b(this.r, p4gVar.r).e(this.f, p4gVar.f).d(Integer.valueOf(this.x), Integer.valueOf(p4gVar.x), ga.c().a());
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(p4gVar.w);
        boolean z = this.h.y;
        gaVar2 = k6g.l;
        she d2 = d.d(valueOf, valueOf2, gaVar2).e(this.y, p4gVar.y).e(this.B, p4gVar.B).d(Integer.valueOf(this.t), Integer.valueOf(p4gVar.t), a).d(Integer.valueOf(this.u), Integer.valueOf(p4gVar.u), a);
        Integer valueOf3 = Integer.valueOf(this.w);
        Integer valueOf4 = Integer.valueOf(p4gVar.w);
        if (!khe.f(this.g, p4gVar.g)) {
            a = k6g.l;
        }
        return d2.d(valueOf3, valueOf4, a).a();
    }
}
