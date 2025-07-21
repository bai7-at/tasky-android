package defpackage;

import androidx.compose.foundation.layout.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class l37 {
    private float a;
    private boolean b;
    private f c;

    public l37(float f, boolean z, f fVar) {
        this.a = f;
        this.b = z;
        this.c = fVar;
    }

    public final f a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final float c() {
        return this.a;
    }

    public final void d(f fVar) {
        this.c = fVar;
    }

    public final void e(boolean z) {
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l37)) {
            return false;
        }
        l37 l37Var = (l37) obj;
        return Float.compare(this.a, l37Var.a) == 0 && this.b == l37Var.b && zq3.c(this.c, l37Var.c);
    }

    public final void f(float f) {
        this.a = f;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31;
        f fVar = this.c;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ')';
    }

    public /* synthetic */ l37(float f, boolean z, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : fVar);
    }
}
