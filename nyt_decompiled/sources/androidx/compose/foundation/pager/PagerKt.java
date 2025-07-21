package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.c;
import androidx.compose.foundation.gestures.snapping.e;
import defpackage.du8;
import defpackage.dw7;
import defpackage.fd5;
import defpackage.fw7;
import defpackage.ln5;
import defpackage.mn5;
import defpackage.oc1;
import defpackage.qc1;
import defpackage.un5;
import defpackage.uo6;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class PagerKt {

    public static final class a implements dw7 {
        final /* synthetic */ PagerState a;
        final /* synthetic */ float b;
        final /* synthetic */ oc1 c;
        final /* synthetic */ un5 d;

        a(PagerState pagerState, float f, oc1 oc1Var, un5 un5Var) {
            this.a = pagerState;
            this.b = f;
            this.c = oc1Var;
            this.d = un5Var;
        }

        private final Pair e() {
            int F = this.a.F() + this.a.H();
            int w = this.a.w();
            int a = PagerMeasurePolicyKt.a(this.a, F);
            int size = c().i().size() / 2;
            int i = a;
            float f = Float.NEGATIVE_INFINITY;
            float f2 = Float.POSITIVE_INFINITY;
            for (int i2 = w; i2 >= uo6.d(w - size, 0); i2--) {
                float a2 = fw7.a(mn5.a(c()), c().d(), c().b(), c().g(), i, i2, PagerStateKt.i());
                if (a2 <= 0.0f && a2 > f) {
                    f = a2;
                }
                if (a2 >= 0.0f && a2 < f2) {
                    f2 = a2;
                }
                i -= F;
            }
            int i3 = a + F;
            for (int i4 = w + 1; i4 <= uo6.i(w + size, this.a.E() - 1); i4++) {
                float a3 = fw7.a(mn5.a(c()), c().d(), c().b(), c().g(), i3, i4, PagerStateKt.i());
                if (a3 >= 0.0f && a3 < f2) {
                    f2 = a3;
                }
                if (a3 <= 0.0f && a3 > f) {
                    f = a3;
                }
                i3 += F;
            }
            if (f == Float.NEGATIVE_INFINITY) {
                f = f2;
            }
            if (f2 == Float.POSITIVE_INFINITY) {
                f2 = f;
            }
            return du8.a(Float.valueOf(f), Float.valueOf(f2));
        }

        @Override // defpackage.dw7
        public float a(float f) {
            Pair e = e();
            float floatValue = ((Number) e.a()).floatValue();
            float floatValue2 = ((Number) e.b()).floatValue();
            boolean g = PagerKt.g(this.a);
            float f2 = (PagerKt.f(this.a) / c().g()) - ((int) r3);
            int c = e.c(this.a.y(), f);
            c.a aVar = androidx.compose.foundation.gestures.snapping.c.a;
            if (androidx.compose.foundation.gestures.snapping.c.e(c, aVar.a())) {
                floatValue = Math.abs(f2) > this.b ? floatValue2 : floatValue2;
            } else {
                if (!androidx.compose.foundation.gestures.snapping.c.e(c, aVar.b())) {
                    if (!androidx.compose.foundation.gestures.snapping.c.e(c, aVar.c())) {
                        floatValue = 0.0f;
                    }
                }
            }
            if (d(floatValue)) {
                return floatValue;
            }
            return 0.0f;
        }

        @Override // defpackage.dw7
        public float b(float f) {
            int F = this.a.F() + this.a.H();
            float a = qc1.a(this.c, 0.0f, f);
            int z = f < 0.0f ? this.a.z() + 1 : this.a.z();
            int d = uo6.d(Math.abs((uo6.m(this.d.a(z, uo6.m(((int) (a / F)) + z, 0, this.a.E()), f, this.a.F(), this.a.H()), 0, this.a.E()) - z) * F) - F, 0);
            return d == 0 ? d : d * Math.signum(f);
        }

        public final ln5 c() {
            return this.a.C();
        }

        public final boolean d(float f) {
            return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final androidx.compose.foundation.pager.PagerState r36, androidx.compose.ui.Modifier r37, defpackage.ym5 r38, androidx.compose.foundation.pager.a r39, int r40, float r41, androidx.compose.ui.Alignment.c r42, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r43, boolean r44, boolean r45, defpackage.ss2 r46, defpackage.d35 r47, final defpackage.kt2 r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.a(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, ym5, androidx.compose.foundation.pager.a, int, float, androidx.compose.ui.Alignment$c, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, ss2, d35, kt2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw7 b(PagerState pagerState, un5 un5Var, oc1 oc1Var, float f) {
        return new a(pagerState, f, oc1Var, un5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(PagerState pagerState) {
        return pagerState.C().c() == Orientation.Horizontal ? fd5.o(pagerState.S()) : fd5.p(pagerState.S());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(PagerState pagerState) {
        return f(pagerState) < 0.0f;
    }
}
