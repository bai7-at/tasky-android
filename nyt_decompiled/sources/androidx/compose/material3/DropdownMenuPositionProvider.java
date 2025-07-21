package androidx.compose.material3;

import androidx.compose.material3.e;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bn3;
import defpackage.cn3;
import defpackage.eu1;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.hn3;
import defpackage.vm3;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.xz5;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class DropdownMenuPositionProvider implements xz5 {
    private final long a;
    private final fm1 b;
    private final int c;
    private final gt2 d;
    private final e.a e;
    private final e.a f;
    private final e.a g;
    private final e.a h;
    private final e.b i;
    private final e.b j;
    private final e.b k;
    private final e.b l;
    private final e.b m;

    public /* synthetic */ DropdownMenuPositionProvider(long j, fm1 fm1Var, int i, gt2 gt2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, fm1Var, i, gt2Var);
    }

    @Override // defpackage.xz5
    public long a(bn3 bn3Var, long j, LayoutDirection layoutDirection, long j2) {
        Object obj;
        Object obj2;
        int i = 0;
        List o = kotlin.collections.i.o(this.e, this.f, vm3.j(bn3Var.b()) < hn3.g(j) / 2 ? this.g : this.h);
        ArrayList arrayList = new ArrayList(o.size());
        int size = o.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(((e.a) o.get(i2)).a(bn3Var, j, hn3.g(j2), layoutDirection)));
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i3);
            int intValue = ((Number) obj2).intValue();
            if (intValue >= 0 && intValue + hn3.g(j2) <= hn3.g(j)) {
                break;
            }
            i3++;
        }
        Integer num = (Integer) obj2;
        int intValue2 = num != null ? num.intValue() : ((Number) kotlin.collections.i.w0(arrayList)).intValue();
        List o2 = kotlin.collections.i.o(this.i, this.j, this.k, vm3.k(bn3Var.b()) < hn3.f(j) / 2 ? this.l : this.m);
        ArrayList arrayList2 = new ArrayList(o2.size());
        int size3 = o2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList2.add(Integer.valueOf(((e.b) o2.get(i4)).a(bn3Var, j, hn3.f(j2))));
        }
        int size4 = arrayList2.size();
        while (true) {
            if (i >= size4) {
                break;
            }
            Object obj3 = arrayList2.get(i);
            int intValue3 = ((Number) obj3).intValue();
            if (intValue3 >= this.c && intValue3 + hn3.f(j2) <= hn3.f(j) - this.c) {
                obj = obj3;
                break;
            }
            i++;
        }
        Integer num2 = (Integer) obj;
        long a = wm3.a(intValue2, num2 != null ? num2.intValue() : ((Number) kotlin.collections.i.w0(arrayList2)).intValue());
        this.d.invoke(bn3Var, cn3.a(a, j2));
        return a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return eu1.f(this.a, dropdownMenuPositionProvider.a) && zq3.c(this.b, dropdownMenuPositionProvider.b) && this.c == dropdownMenuPositionProvider.c && zq3.c(this.d, dropdownMenuPositionProvider.d);
    }

    public int hashCode() {
        return (((((eu1.i(this.a) * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) eu1.j(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }

    private DropdownMenuPositionProvider(long j, fm1 fm1Var, int i, gt2 gt2Var) {
        this.a = j;
        this.b = fm1Var;
        this.c = i;
        this.d = gt2Var;
        int l0 = fm1Var.l0(eu1.g(j));
        e eVar = e.a;
        this.e = eVar.g(l0);
        this.f = eVar.d(l0);
        this.g = eVar.e(0);
        this.h = eVar.f(0);
        int l02 = fm1Var.l0(eu1.h(j));
        this.i = eVar.h(l02);
        this.j = eVar.a(l02);
        this.k = eVar.c(l02);
        this.l = eVar.i(i);
        this.m = eVar.b(i);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, fm1 fm1Var, int i, gt2 gt2Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, fm1Var, (i2 & 4) != 0 ? fm1Var.l0(MenuKt.j()) : i, (i2 & 8) != 0 ? new gt2() { // from class: androidx.compose.material3.DropdownMenuPositionProvider.2
            public final void b(bn3 bn3Var, bn3 bn3Var2) {
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((bn3) obj, (bn3) obj2);
                return ww8.a;
            }
        } : gt2Var, null);
    }
}
