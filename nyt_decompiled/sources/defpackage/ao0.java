package defpackage;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ao0 extends Painter {
    private final long g;
    private float h;
    private qn0 i;
    private final long j;

    public /* synthetic */ ao0(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        this.h = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(qn0 qn0Var) {
        this.i = qn0Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao0) && nn0.t(this.g, ((ao0) obj).g);
    }

    public int hashCode() {
        return nn0.z(this.g);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long k() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void m(fv1 fv1Var) {
        fv1.a0(fv1Var, this.g, 0L, 0L, this.h, null, this.i, 0, 86, null);
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) nn0.A(this.g)) + ')';
    }

    private ao0(long j) {
        this.g = j;
        this.h = 1.0f;
        this.j = zt7.b.a();
    }
}
