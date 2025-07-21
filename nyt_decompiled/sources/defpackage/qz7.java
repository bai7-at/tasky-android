package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class qz7 implements ph2 {
    private final float a;
    private final float b;
    private final Object c;

    public qz7(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qz7)) {
            return false;
        }
        qz7 qz7Var = (qz7) obj;
        return qz7Var.a == this.a && qz7Var.b == this.b && zq3.c(qz7Var.c, this.c);
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    public final Object h() {
        return this.c;
    }

    public int hashCode() {
        Object obj = this.c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.hashCode(this.a)) * 31) + Float.hashCode(this.b);
    }

    @Override // defpackage.ci
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public s49 a(hu8 hu8Var) {
        mi b;
        float f = this.a;
        float f2 = this.b;
        b = di.b(hu8Var, this.c);
        return new s49(f, f2, b);
    }

    public /* synthetic */ qz7(float f, float f2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
