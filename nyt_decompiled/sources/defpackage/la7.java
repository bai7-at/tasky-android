package defpackage;

import androidx.compose.ui.graphics.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class la7 {
    private final float a;
    private final long b;
    private final ph2 c;

    public /* synthetic */ la7(float f, long j, ph2 ph2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, ph2Var);
    }

    public final ph2 a() {
        return this.c;
    }

    public final float b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la7)) {
            return false;
        }
        la7 la7Var = (la7) obj;
        return Float.compare(this.a, la7Var.a) == 0 && e.e(this.b, la7Var.b) && zq3.c(this.c, la7Var.c);
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + e.h(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) e.i(this.b)) + ", animationSpec=" + this.c + ')';
    }

    private la7(float f, long j, ph2 ph2Var) {
        this.a = f;
        this.b = j;
        this.c = ph2Var;
    }
}
