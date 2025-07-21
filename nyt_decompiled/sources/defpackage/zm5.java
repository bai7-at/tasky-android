package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class zm5 implements ym5 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public /* synthetic */ zm5(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    @Override // defpackage.ym5
    public float a() {
        return this.d;
    }

    @Override // defpackage.ym5
    public float b(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.a : this.c;
    }

    @Override // defpackage.ym5
    public float c(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.c : this.a;
    }

    @Override // defpackage.ym5
    public float d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zm5)) {
            return false;
        }
        zm5 zm5Var = (zm5) obj;
        return bu1.j(this.a, zm5Var.a) && bu1.j(this.b, zm5Var.b) && bu1.j(this.c, zm5Var.c) && bu1.j(this.d, zm5Var.d);
    }

    public int hashCode() {
        return (((((bu1.k(this.a) * 31) + bu1.k(this.b)) * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) bu1.l(this.a)) + ", top=" + ((Object) bu1.l(this.b)) + ", end=" + ((Object) bu1.l(this.c)) + ", bottom=" + ((Object) bu1.l(this.d)) + ')';
    }

    private zm5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }
}
