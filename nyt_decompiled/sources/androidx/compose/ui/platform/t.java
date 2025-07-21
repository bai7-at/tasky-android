package androidx.compose.ui.platform;

import defpackage.km5;
import defpackage.nc7;
import java.util.List;

/* loaded from: classes.dex */
final class t implements km5 {
    private final int a;
    private final List b;
    private Float c;
    private Float d;
    private nc7 e;
    private nc7 f;

    public t(int i, List list, Float f, Float f2, nc7 nc7Var, nc7 nc7Var2) {
        this.a = i;
        this.b = list;
        this.c = f;
        this.d = f2;
        this.e = nc7Var;
        this.f = nc7Var2;
    }

    @Override // defpackage.km5
    public boolean M0() {
        return this.b.contains(this);
    }

    public final nc7 a() {
        return this.e;
    }

    public final Float b() {
        return this.c;
    }

    public final Float c() {
        return this.d;
    }

    public final int d() {
        return this.a;
    }

    public final nc7 e() {
        return this.f;
    }

    public final void f(nc7 nc7Var) {
        this.e = nc7Var;
    }

    public final void g(Float f) {
        this.c = f;
    }

    public final void h(Float f) {
        this.d = f;
    }

    public final void i(nc7 nc7Var) {
        this.f = nc7Var;
    }
}
