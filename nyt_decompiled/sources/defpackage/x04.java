package defpackage;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.pager.PagerState;

/* loaded from: classes.dex */
public abstract class x04 {

    public static final class a implements w04 {
        final /* synthetic */ PagerState a;
        final /* synthetic */ boolean b;

        a(PagerState pagerState, boolean z) {
            this.a = pagerState;
            this.b = z;
        }

        @Override // defpackage.w04
        public boolean a() {
            return this.a.a();
        }

        @Override // defpackage.w04
        public int b() {
            return this.a.A();
        }

        @Override // defpackage.w04
        public int c() {
            return this.a.z();
        }

        @Override // defpackage.w04
        public hn0 e() {
            return this.b ? new hn0(this.a.E(), 1) : new hn0(1, this.a.E());
        }

        @Override // defpackage.w04
        public Object f(int i, by0 by0Var) {
            Object b0 = PagerState.b0(this.a, i, 0.0f, by0Var, 2, null);
            return b0 == kotlin.coroutines.intrinsics.a.h() ? b0 : ww8.a;
        }

        @Override // defpackage.w04
        public Object g(float f, by0 by0Var) {
            Object b = ScrollExtensionsKt.b(this.a, f, null, by0Var, 2, null);
            return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
        }
    }

    public static final w04 a(PagerState pagerState, boolean z) {
        return new a(pagerState, z);
    }
}
