package dev.chrisbanes.snapper;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import defpackage.ak7;
import defpackage.dg4;
import defpackage.g14;
import defpackage.gt2;
import defpackage.iw7;
import defpackage.j14;
import defpackage.jw7;
import defpackage.oc1;
import defpackage.qc1;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.uo6;
import defpackage.x08;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.d;

/* loaded from: classes4.dex */
public final class LazyListSnapperLayoutInfo extends b {
    private final LazyListState a;
    private final gt2 b;
    private final int c;
    private final sy4 d;
    private final x08 e;

    public /* synthetic */ LazyListSnapperLayoutInfo(LazyListState lazyListState, gt2 gt2Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyListState, gt2Var, (i2 & 4) != 0 ? 0 : i);
    }

    private final int j() {
        j14 x = this.a.x();
        if (x.k().size() < 2) {
            return 0;
        }
        g14 g14Var = (g14) x.k().get(0);
        return ((g14) x.k().get(1)).b() - (g14Var.a() + g14Var.b());
    }

    private final float k() {
        Object next;
        j14 x = this.a.x();
        if (x.k().isEmpty()) {
            return -1.0f;
        }
        Iterator it2 = x.k().iterator();
        Object obj = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int b = ((g14) next).b();
                do {
                    Object next2 = it2.next();
                    int b2 = ((g14) next2).b();
                    if (b > b2) {
                        next = next2;
                        b = b2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        g14 g14Var = (g14) next;
        if (g14Var == null) {
            return -1.0f;
        }
        Iterator it3 = x.k().iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                g14 g14Var2 = (g14) obj;
                int b3 = g14Var2.b() + g14Var2.a();
                do {
                    Object next3 = it3.next();
                    g14 g14Var3 = (g14) next3;
                    int b4 = g14Var3.b() + g14Var3.a();
                    if (b3 < b4) {
                        obj = next3;
                        b3 = b4;
                    }
                } while (it3.hasNext());
            }
        }
        g14 g14Var4 = (g14) obj;
        if (g14Var4 == null) {
            return -1.0f;
        }
        if (Math.max(g14Var.b() + g14Var.a(), g14Var4.b() + g14Var4.a()) - Math.min(g14Var.b(), g14Var4.b()) == 0) {
            return -1.0f;
        }
        return (r3 + j()) / x.k().size();
    }

    private final int m() {
        return this.a.x().h();
    }

    @Override // dev.chrisbanes.snapper.b
    public boolean a() {
        g14 g14Var = (g14) i.y0(this.a.x().k());
        if (g14Var == null) {
            return false;
        }
        return g14Var.getIndex() < m() - 1 || g14Var.b() + g14Var.a() > f();
    }

    @Override // dev.chrisbanes.snapper.b
    public boolean b() {
        g14 g14Var = (g14) i.m0(this.a.x().k());
        if (g14Var == null) {
            return false;
        }
        return g14Var.getIndex() > 0 || g14Var.b() < g();
    }

    @Override // dev.chrisbanes.snapper.b
    public int c(float f, oc1 oc1Var, float f2) {
        zq3.h(oc1Var, "decayAnimationSpec");
        iw7 e = e();
        if (e == null) {
            return -1;
        }
        float k = k();
        if (k <= 0.0f) {
            return e.a();
        }
        int d = d(e.a());
        int d2 = d(e.a() + 1);
        if (Math.abs(f) < 0.5f) {
            return uo6.m(Math.abs(d) < Math.abs(d2) ? e.a() : e.a() + 1, 0, m() - 1);
        }
        float l = uo6.l(qc1.a(oc1Var, 0.0f, f), -f2, f2);
        double d3 = k;
        int m = uo6.m(e.a() + dg4.c(((f < 0.0f ? uo6.h(l + d2, 0.0f) : uo6.c(l + d, 0.0f)) / d3) - (d / d3)), 0, m() - 1);
        jw7 jw7Var = jw7.a;
        return m;
    }

    @Override // dev.chrisbanes.snapper.b
    public int d(int i) {
        Object obj;
        int d;
        int intValue;
        Iterator it2 = n().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((iw7) obj).a() == i) {
                break;
            }
        }
        iw7 iw7Var = (iw7) obj;
        if (iw7Var != null) {
            d = iw7Var.b();
            intValue = ((Number) this.b.invoke(this, iw7Var)).intValue();
        } else {
            iw7 e = e();
            if (e == null) {
                return 0;
            }
            d = dg4.d((i - e.a()) * k()) + e.b();
            intValue = ((Number) this.b.invoke(this, e)).intValue();
        }
        return d - intValue;
    }

    @Override // dev.chrisbanes.snapper.b
    public iw7 e() {
        return (iw7) this.e.getValue();
    }

    @Override // dev.chrisbanes.snapper.b
    public int f() {
        return this.a.x().g() - l();
    }

    @Override // dev.chrisbanes.snapper.b
    public int g() {
        return this.c;
    }

    @Override // dev.chrisbanes.snapper.b
    public int h() {
        return this.a.x().h();
    }

    public final int l() {
        return ((Number) this.d.getValue()).intValue();
    }

    public ak7 n() {
        return d.r(i.Z(this.a.x().k()), LazyListSnapperLayoutInfo$visibleItems$1.a);
    }

    public final void o(int i) {
        this.d.setValue(Integer.valueOf(i));
    }

    public LazyListSnapperLayoutInfo(LazyListState lazyListState, gt2 gt2Var, int i) {
        zq3.h(lazyListState, "lazyListState");
        zq3.h(gt2Var, "snapOffsetForItem");
        this.a = lazyListState;
        this.b = gt2Var;
        this.d = b0.e(Integer.valueOf(i), null, 2, null);
        this.e = y.d(new qs2() { // from class: dev.chrisbanes.snapper.LazyListSnapperLayoutInfo$currentItem$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final iw7 mo865invoke() {
                gt2 gt2Var2;
                ak7 n = LazyListSnapperLayoutInfo.this.n();
                LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo = LazyListSnapperLayoutInfo.this;
                Object obj = null;
                for (Object obj2 : n) {
                    iw7 iw7Var = (iw7) obj2;
                    int b = iw7Var.b();
                    gt2Var2 = lazyListSnapperLayoutInfo.b;
                    if (b <= ((Number) gt2Var2.invoke(lazyListSnapperLayoutInfo, iw7Var)).intValue()) {
                        obj = obj2;
                    }
                }
                return (iw7) obj;
            }
        });
    }
}
