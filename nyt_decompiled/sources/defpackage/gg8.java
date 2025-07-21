package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class gg8 implements yh {
    private final i49 a;
    private final hu8 b;
    private final Object c;
    private final Object d;
    private final mi e;
    private final mi f;
    private final mi g;
    private final long h;
    private final mi i;

    public gg8(i49 i49Var, hu8 hu8Var, Object obj, Object obj2, mi miVar) {
        this.a = i49Var;
        this.b = hu8Var;
        this.c = obj;
        this.d = obj2;
        mi miVar2 = (mi) e().a().invoke(obj);
        this.e = miVar2;
        mi miVar3 = (mi) e().a().invoke(g());
        this.f = miVar3;
        mi g = (miVar == null || (g = ni.e(miVar)) == null) ? ni.g((mi) e().a().invoke(obj)) : g;
        this.g = g;
        this.h = i49Var.b(miVar2, miVar3, g);
        this.i = i49Var.e(miVar2, miVar3, g);
    }

    @Override // defpackage.yh
    public boolean a() {
        return this.a.a();
    }

    @Override // defpackage.yh
    public mi b(long j) {
        return !c(j) ? this.a.f(j, this.e, this.f, this.g) : this.i;
    }

    @Override // defpackage.yh
    public long d() {
        return this.h;
    }

    @Override // defpackage.yh
    public hu8 e() {
        return this.b;
    }

    @Override // defpackage.yh
    public Object f(long j) {
        if (c(j)) {
            return g();
        }
        mi g = this.a.g(j, this.e, this.f, this.g);
        int b = g.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(g.a(i))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + g + ". Animation: " + this + ", playTimeNanos: " + j).toString());
            }
        }
        return e().b().invoke(g);
    }

    @Override // defpackage.yh
    public Object g() {
        return this.d;
    }

    public final Object h() {
        return this.c;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.c + " -> " + g() + ",initial velocity: " + this.g + ", duration: " + zh.b(this) + " ms,animationSpec: " + this.a;
    }

    public /* synthetic */ gg8(ci ciVar, hu8 hu8Var, Object obj, Object obj2, mi miVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ciVar, hu8Var, obj, obj2, (i & 16) != 0 ? null : miVar);
    }

    public gg8(ci ciVar, hu8 hu8Var, Object obj, Object obj2, mi miVar) {
        this(ciVar.a(hu8Var), hu8Var, obj, obj2, miVar);
    }
}
