package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class cu1 implements i01 {
    private final float a;

    public /* synthetic */ cu1(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    @Override // defpackage.i01
    public float a(long j, fm1 fm1Var) {
        return fm1Var.f1(this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cu1) && bu1.j(this.a, ((cu1) obj).a);
    }

    public int hashCode() {
        return bu1.k(this.a);
    }

    public String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }

    private cu1(float f) {
        this.a = f;
    }
}
