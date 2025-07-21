package defpackage;

import androidx.recyclerview.widget.f;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class au5 {

    public static final class a extends f.b {
        final /* synthetic */ zt5 a;
        final /* synthetic */ zt5 b;
        final /* synthetic */ f.AbstractC0113f c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        a(zt5 zt5Var, zt5 zt5Var2, f.AbstractC0113f abstractC0113f, int i, int i2) {
            this.a = zt5Var;
            this.b = zt5Var2;
            this.c = abstractC0113f;
            this.d = i;
            this.e = i2;
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean a(int i, int i2) {
            Object item = this.a.getItem(i);
            Object item2 = this.b.getItem(i2);
            if (item == item2) {
                return true;
            }
            return this.c.a(item, item2);
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean b(int i, int i2) {
            Object item = this.a.getItem(i);
            Object item2 = this.b.getItem(i2);
            if (item == item2) {
                return true;
            }
            return this.c.b(item, item2);
        }

        @Override // androidx.recyclerview.widget.f.b
        public Object c(int i, int i2) {
            Object item = this.a.getItem(i);
            Object item2 = this.b.getItem(i2);
            return item == item2 ? Boolean.TRUE : this.c.c(item, item2);
        }

        @Override // androidx.recyclerview.widget.f.b
        public int d() {
            return this.e;
        }

        @Override // androidx.recyclerview.widget.f.b
        public int e() {
            return this.d;
        }
    }

    public static final yt5 a(zt5 zt5Var, zt5 zt5Var2, f.AbstractC0113f abstractC0113f) {
        zq3.h(zt5Var, "<this>");
        zq3.h(zt5Var2, "newList");
        zq3.h(abstractC0113f, "diffCallback");
        a aVar = new a(zt5Var, zt5Var2, abstractC0113f, zt5Var.c(), zt5Var2.c());
        boolean z = true;
        f.e b = f.b(aVar, true);
        zq3.g(b, "PlaceholderPaddedList<T>…    },\n        true\n    )");
        Iterable u = uo6.u(0, zt5Var.c());
        if (!(u instanceof Collection) || !((Collection) u).isEmpty()) {
            Iterator it2 = u.iterator();
            while (it2.hasNext()) {
                if (b.b(((qm3) it2).c()) != -1) {
                    break;
                }
            }
        }
        z = false;
        return new yt5(b, z);
    }

    public static final void b(zt5 zt5Var, d64 d64Var, zt5 zt5Var2, yt5 yt5Var) {
        zq3.h(zt5Var, "<this>");
        zq3.h(d64Var, "callback");
        zq3.h(zt5Var2, "newList");
        zq3.h(yt5Var, "diffResult");
        if (yt5Var.b()) {
            jl5.a.a(zt5Var, zt5Var2, d64Var, yt5Var);
        } else {
            ss1.a.b(d64Var, zt5Var, zt5Var2);
        }
    }

    public static final int c(zt5 zt5Var, yt5 yt5Var, zt5 zt5Var2, int i) {
        int b;
        zq3.h(zt5Var, "<this>");
        zq3.h(yt5Var, "diffResult");
        zq3.h(zt5Var2, "newList");
        if (!yt5Var.b()) {
            return uo6.n(i, uo6.u(0, zt5Var2.a()));
        }
        int f = i - zt5Var.f();
        int c = zt5Var.c();
        if (f >= 0 && f < c) {
            for (int i2 = 0; i2 < 30; i2++) {
                int i3 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + f;
                if (i3 >= 0 && i3 < zt5Var.c() && (b = yt5Var.a().b(i3)) != -1) {
                    return b + zt5Var2.f();
                }
            }
        }
        return uo6.n(i, uo6.u(0, zt5Var2.a()));
    }
}
