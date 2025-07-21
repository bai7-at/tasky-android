package defpackage;

import androidx.compose.material.MenuKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.d;

/* loaded from: classes.dex */
public final class mw1 implements xz5 {
    private final long a;
    private final fm1 b;
    private final gt2 c;

    public /* synthetic */ mw1(long j, fm1 fm1Var, gt2 gt2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, fm1Var, gt2Var);
    }

    @Override // defpackage.xz5
    public long a(bn3 bn3Var, long j, LayoutDirection layoutDirection, long j2) {
        ak7 g;
        Object obj;
        Object obj2;
        int l0 = this.b.l0(MenuKt.j());
        int l02 = this.b.l0(eu1.g(this.a));
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int i = l02 * (layoutDirection == layoutDirection2 ? 1 : -1);
        int l03 = this.b.l0(eu1.h(this.a));
        int d = bn3Var.d() + i;
        int e = (bn3Var.e() - hn3.g(j2)) + i;
        int g2 = hn3.g(j) - hn3.g(j2);
        if (layoutDirection == layoutDirection2) {
            Integer valueOf = Integer.valueOf(d);
            Integer valueOf2 = Integer.valueOf(e);
            if (bn3Var.d() < 0) {
                g2 = 0;
            }
            g = d.g(valueOf, valueOf2, Integer.valueOf(g2));
        } else {
            Integer valueOf3 = Integer.valueOf(e);
            Integer valueOf4 = Integer.valueOf(d);
            if (bn3Var.e() <= hn3.g(j)) {
                g2 = 0;
            }
            g = d.g(valueOf3, valueOf4, Integer.valueOf(g2));
        }
        Iterator it2 = g.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue >= 0 && intValue + hn3.g(j2) <= hn3.g(j)) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            e = num.intValue();
        }
        int max = Math.max(bn3Var.a() + l03, l0);
        int g3 = (bn3Var.g() - hn3.f(j2)) + l03;
        Iterator it3 = d.g(Integer.valueOf(max), Integer.valueOf(g3), Integer.valueOf((bn3Var.g() - (hn3.f(j2) / 2)) + l03), Integer.valueOf((hn3.f(j) - hn3.f(j2)) - l0)).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= l0 && intValue2 + hn3.f(j2) <= hn3.f(j) - l0) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            g3 = num2.intValue();
        }
        this.c.invoke(bn3Var, new bn3(e, g3, hn3.g(j2) + e, hn3.f(j2) + g3));
        return wm3.a(e, g3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw1)) {
            return false;
        }
        mw1 mw1Var = (mw1) obj;
        return eu1.f(this.a, mw1Var.a) && zq3.c(this.b, mw1Var.b) && zq3.c(this.c, mw1Var.c);
    }

    public int hashCode() {
        return (((eu1.i(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) eu1.j(this.a)) + ", density=" + this.b + ", onPositionCalculated=" + this.c + ')';
    }

    private mw1(long j, fm1 fm1Var, gt2 gt2Var) {
        this.a = j;
        this.b = fm1Var;
        this.c = gt2Var;
    }
}
