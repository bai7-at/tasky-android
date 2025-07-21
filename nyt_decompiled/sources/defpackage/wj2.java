package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class wj2 implements il8 {
    private final float a;

    public /* synthetic */ wj2(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    @Override // defpackage.il8
    public float a(fm1 fm1Var, float f, float f2) {
        return f + (fm1Var.f1(this.a) * Math.signum(f2 - f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wj2) && bu1.j(this.a, ((wj2) obj).a);
    }

    public int hashCode() {
        return bu1.k(this.a);
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) bu1.l(this.a)) + ')';
    }

    private wj2(float f) {
        this.a = f;
    }
}
