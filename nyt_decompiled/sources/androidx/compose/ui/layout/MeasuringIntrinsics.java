package androidx.compose.ui.layout;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.fb;
import defpackage.fv0;
import defpackage.in3;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.ss2;
import defpackage.xq3;
import defpackage.yq3;

/* loaded from: classes.dex */
final class MeasuringIntrinsics {
    public static final MeasuringIntrinsics a = new MeasuringIntrinsics();

    private enum IntrinsicMinMax {
        Min,
        Max
    }

    private enum IntrinsicWidthHeight {
        Width,
        Height
    }

    private static final class a implements qg4 {
        private final xq3 a;
        private final IntrinsicMinMax b;
        private final IntrinsicWidthHeight c;

        public a(xq3 xq3Var, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
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
                return new b(this.b == IntrinsicMinMax.Max ? this.a.V(fv0.m(j)) : this.a.S(fv0.m(j)), fv0.i(j) ? fv0.m(j) : 32767);
            }
            return new b(fv0.j(j) ? fv0.n(j) : 32767, this.b == IntrinsicMinMax.Max ? this.a.i(fv0.n(j)) : this.a.H(fv0.n(j)));
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

    private static final class b extends l {
        public b(int i, int i2) {
            P0(in3.a(i, i2));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.l
        public void L0(long j, float f, ss2 ss2Var) {
        }

        @Override // defpackage.tg4
        public int c0(fb fbVar) {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private MeasuringIntrinsics() {
    }

    public final int a(c cVar, yq3 yq3Var, xq3 xq3Var, int i) {
        return cVar.d(new androidx.compose.ui.layout.a(yq3Var, yq3Var.getLayoutDirection()), new a(xq3Var, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), iv0.b(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int b(c cVar, yq3 yq3Var, xq3 xq3Var, int i) {
        return cVar.d(new androidx.compose.ui.layout.a(yq3Var, yq3Var.getLayoutDirection()), new a(xq3Var, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), iv0.b(0, 0, 0, i, 7, null)).getWidth();
    }

    public final int c(c cVar, yq3 yq3Var, xq3 xq3Var, int i) {
        return cVar.d(new androidx.compose.ui.layout.a(yq3Var, yq3Var.getLayoutDirection()), new a(xq3Var, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), iv0.b(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int d(c cVar, yq3 yq3Var, xq3 xq3Var, int i) {
        return cVar.d(new androidx.compose.ui.layout.a(yq3Var, yq3Var.getLayoutDirection()), new a(xq3Var, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), iv0.b(0, 0, 0, i, 7, null)).getWidth();
    }
}
