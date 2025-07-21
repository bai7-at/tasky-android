package defpackage;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.l;

/* loaded from: classes.dex */
public final class bi1 implements qg4 {
    private final xq3 a;
    private final IntrinsicMinMax b;
    private final IntrinsicWidthHeight c;

    public bi1(xq3 xq3Var, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.a = xq3Var;
        this.b = intrinsicMinMax;
        this.c = intrinsicWidthHeight;
    }

    @Override // defpackage.xq3
    public int H(int i) {
        return this.a.H(i);
    }

    @Override // defpackage.xq3
    public int S(int i) {
        return this.a.S(i);
    }

    @Override // defpackage.xq3
    public int V(int i) {
        return this.a.V(i);
    }

    @Override // defpackage.qg4
    public l W(long j) {
        if (this.c == IntrinsicWidthHeight.Width) {
            return new vj2(this.b == IntrinsicMinMax.Max ? this.a.V(fv0.m(j)) : this.a.S(fv0.m(j)), fv0.i(j) ? fv0.m(j) : 32767);
        }
        return new vj2(fv0.j(j) ? fv0.n(j) : 32767, this.b == IntrinsicMinMax.Max ? this.a.i(fv0.n(j)) : this.a.H(fv0.n(j)));
    }

    @Override // defpackage.xq3
    public Object d() {
        return this.a.d();
    }

    @Override // defpackage.xq3
    public int i(int i) {
        return this.a.i(i);
    }
}
