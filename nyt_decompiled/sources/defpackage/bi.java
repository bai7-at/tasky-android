package defpackage;

import androidx.compose.runtime.b0;

/* loaded from: classes.dex */
public final class bi {
    private final hu8 a;
    private final Object b;
    private final long c;
    private final qs2 d;
    private final sy4 e;
    private mi f;
    private long g;
    private long h = Long.MIN_VALUE;
    private final sy4 i;

    public bi(Object obj, hu8 hu8Var, mi miVar, long j, Object obj2, long j2, boolean z, qs2 qs2Var) {
        this.a = hu8Var;
        this.b = obj2;
        this.c = j2;
        this.d = qs2Var;
        this.e = b0.e(obj, null, 2, null);
        this.f = ni.e(miVar);
        this.g = j;
        this.i = b0.e(Boolean.valueOf(z), null, 2, null);
    }

    public final void a() {
        k(false);
        this.d.mo865invoke();
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final long d() {
        return this.c;
    }

    public final Object e() {
        return this.e.getValue();
    }

    public final Object f() {
        return this.a.b().invoke(this.f);
    }

    public final mi g() {
        return this.f;
    }

    public final boolean h() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final void i(long j) {
        this.h = j;
    }

    public final void j(long j) {
        this.g = j;
    }

    public final void k(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void l(Object obj) {
        this.e.setValue(obj);
    }

    public final void m(mi miVar) {
        this.f = miVar;
    }
}
