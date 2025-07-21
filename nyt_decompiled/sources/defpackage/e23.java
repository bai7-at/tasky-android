package defpackage;

import com.nytimes.android.api.cms.Asset;
import defpackage.vi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e23 implements rs {
    private final rf3 a;
    private final b69 b;
    private final iv7 c;
    private final so3 d;
    private final t24 e;
    private final sp f;
    private final j56 g;
    private final zv h;
    private final hc2 i;

    public e23() {
        rf3 rf3Var = new rf3();
        this.a = rf3Var;
        b69 b69Var = new b69(rf3Var);
        this.b = b69Var;
        iv7 iv7Var = new iv7(rf3Var, b69Var);
        this.c = iv7Var;
        so3 so3Var = new so3(rf3Var, iv7Var, b69Var);
        this.d = so3Var;
        this.e = new t24(rf3Var, iv7Var, b69Var);
        this.f = new sp(rf3Var, so3Var, iv7Var, b69Var);
        this.g = new j56(rf3Var, so3Var, iv7Var, b69Var);
        this.h = new zv(rf3Var);
        this.i = new hc2(rf3Var, iv7Var, b69Var);
    }

    private final Asset c(rp2 rp2Var) {
        if (rp2Var instanceof gp) {
            return this.f.c((gp) rp2Var);
        }
        if (rp2Var instanceof tp) {
            return this.f.d((tp) rp2Var);
        }
        if (rp2Var instanceof ho3) {
            return this.d.b((ho3) rp2Var);
        }
        if (rp2Var instanceof d24) {
            return this.e.b((d24) rp2Var);
        }
        if (rp2Var instanceof n59) {
            return this.b.b((n59) rp2Var);
        }
        if (rp2Var instanceof kf3) {
            return this.a.a((kf3) rp2Var);
        }
        if (rp2Var instanceof uu7) {
            return this.c.b((uu7) rp2Var);
        }
        if (rp2Var instanceof lv) {
            return this.h.b((lv) rp2Var);
        }
        if (rp2Var instanceof wb2) {
            return this.i.b((wb2) rp2Var);
        }
        if (rp2Var instanceof g56) {
            return this.g.f((g56) rp2Var);
        }
        if (rp2Var instanceof pu) {
            return this.g.c((pu) rp2Var);
        }
        if (rp2Var instanceof bi0) {
            return this.g.e((bi0) rp2Var);
        }
        if (rp2Var instanceof dt6) {
            return this.g.g((dt6) rp2Var);
        }
        if (rp2Var instanceof ci9) {
            return this.g.h((ci9) rp2Var);
        }
        if (rp2Var instanceof uu) {
            return this.g.d((uu) rp2Var);
        }
        return null;
    }

    @Override // defpackage.rs
    public Asset a(vi.a aVar) {
        zq3.h(aVar, "anyWork");
        rp2 a = aVar.a();
        if (a == null && (a = aVar.h()) == null && (a = aVar.i()) == null && (a = aVar.l()) == null && (a = aVar.g()) == null && (a = aVar.k()) == null && (a = aVar.d()) == null && (a = aVar.b()) == null && (a = aVar.e()) == null && (a = aVar.j()) == null && (a = aVar.m()) == null) {
            a = aVar.c();
        }
        if (a != null) {
            return c(a);
        }
        return null;
    }

    public List b(List list) {
        zq3.h(list, "fragments");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Asset c = c((rp2) it2.next());
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }
}
