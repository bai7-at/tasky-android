package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.g;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import defpackage.bu1;
import defpackage.ea7;
import defpackage.fm1;
import defpackage.hn3;
import defpackage.ln5;
import defpackage.on5;
import defpackage.qs2;
import defpackage.sg4;
import defpackage.uo6;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class PagerStateKt {
    private static final float a = bu1.g(56);
    private static final on5 b = new on5(i.l(), 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, new a(), false);
    private static final b c = new b();
    private static final g d = new g() { // from class: wn5
        @Override // androidx.compose.foundation.gestures.snapping.g
        public final int a(int i, int i2, int i3, int i4, int i5) {
            int b2;
            b2 = PagerStateKt.b(i, i2, i3, i4, i5);
            return b2;
        }
    };

    public static final class a implements sg4 {
        private final int a;
        private final int b;
        private final Map c = t.i();

        a() {
        }

        @Override // defpackage.sg4
        public void e() {
        }

        @Override // defpackage.sg4
        public Map f() {
            return this.c;
        }

        @Override // defpackage.sg4
        public int getHeight() {
            return this.b;
        }

        @Override // defpackage.sg4
        public int getWidth() {
            return this.a;
        }
    }

    public static final class b implements fm1 {
        private final float a = 1.0f;
        private final float b = 1.0f;

        b() {
        }

        @Override // defpackage.an2
        public float c1() {
            return this.b;
        }

        @Override // defpackage.fm1
        public float getDensity() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(int i, int i2, int i3, int i4, int i5) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(on5 on5Var, int i) {
        return uo6.d((((on5Var.d() + (i * (on5Var.j() + on5Var.g()))) + on5Var.b()) - on5Var.j()) - h(on5Var), 0);
    }

    public static final float f() {
        return a;
    }

    public static final on5 g() {
        return b;
    }

    private static final int h(ln5 ln5Var) {
        return ln5Var.c() == Orientation.Vertical ? hn3.f(ln5Var.a()) : hn3.g(ln5Var.a());
    }

    public static final g i() {
        return d;
    }

    public static final PagerState j(final int i, final float f, final qs2 qs2Var, Composer composer, int i2, int i3) {
        composer.z(-1210768637);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:79)");
        }
        Object[] objArr = new Object[0];
        ea7 a2 = PagerStateImpl.I.a();
        composer.z(1614659192);
        boolean d2 = composer.d(i) | composer.b(f) | composer.C(qs2Var);
        Object A = composer.A();
        if (d2 || A == Composer.a.a()) {
            A = new qs2() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PagerStateImpl mo865invoke() {
                    return new PagerStateImpl(i, f, qs2Var);
                }
            };
            composer.q(A);
        }
        composer.R();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.b(objArr, a2, null, (qs2) A, composer, 72, 4);
        pagerStateImpl.q0().setValue(qs2Var);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return pagerStateImpl;
    }
}
