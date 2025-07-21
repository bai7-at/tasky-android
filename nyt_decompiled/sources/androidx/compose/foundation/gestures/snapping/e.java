package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import defpackage.az7;
import defpackage.dw7;
import defpackage.fm1;
import defpackage.fw7;
import defpackage.g14;
import defpackage.hn3;
import defpackage.j14;
import defpackage.qc1;
import defpackage.qk2;
import defpackage.uo6;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {

    public static final class a implements dw7 {
        final /* synthetic */ LazyListState a;
        final /* synthetic */ g b;

        a(LazyListState lazyListState, g gVar) {
            this.a = lazyListState;
            this.b = gVar;
        }

        private final j14 d() {
            return this.a.x();
        }

        @Override // defpackage.dw7
        public float a(float f) {
            List k = d().k();
            g gVar = this.b;
            int size = k.size();
            float f2 = Float.NEGATIVE_INFINITY;
            float f3 = Float.POSITIVE_INFINITY;
            for (int i = 0; i < size; i++) {
                g14 g14Var = (g14) k.get(i);
                float a = fw7.a(e.d(d()), d().d(), d().b(), g14Var.a(), g14Var.b(), g14Var.getIndex(), gVar);
                if (a <= 0.0f && a > f2) {
                    f2 = a;
                }
                if (a >= 0.0f && a < f3) {
                    f3 = a;
                }
            }
            return SnapFlingBehaviorKt.j(e.c(this.a.r(), f), f2, f3);
        }

        @Override // defpackage.dw7
        public float b(float f) {
            float c = uo6.c((((float) Math.floor(Math.abs(Math.abs(qc1.a(az7.c(this.a.r()), 0.0f, f))) / c())) * c()) - c(), 0.0f);
            return c == 0.0f ? c : c * Math.signum(f);
        }

        public final float c() {
            j14 d = d();
            if (d.k().isEmpty()) {
                return 0.0f;
            }
            List k = d.k();
            int size = k.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((g14) k.get(i2)).a();
            }
            return i / d.k().size();
        }
    }

    public static final dw7 a(LazyListState lazyListState, g gVar) {
        return new a(lazyListState, gVar);
    }

    public static /* synthetic */ dw7 b(LazyListState lazyListState, g gVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = g.a.c();
        }
        return a(lazyListState, gVar);
    }

    public static final int c(fm1 fm1Var, float f) {
        return Math.abs(f) < fm1Var.f1(SnapFlingBehaviorKt.m()) ? c.a.a() : f > 0.0f ? c.a.b() : c.a.c();
    }

    public static final int d(j14 j14Var) {
        return j14Var.c() == Orientation.Vertical ? hn3.f(j14Var.a()) : hn3.g(j14Var.a());
    }

    public static final qk2 e(LazyListState lazyListState, Composer composer, int i) {
        composer.z(1148456277);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1148456277, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:125)");
        }
        composer.z(1157296644);
        boolean S = composer.S(lazyListState);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = b(lazyListState, null, 2, null);
            composer.q(A);
        }
        composer.R();
        SnapFlingBehavior n = SnapFlingBehaviorKt.n((dw7) A, composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return n;
    }
}
