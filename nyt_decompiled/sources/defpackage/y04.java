package defpackage;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: classes.dex */
public abstract class y04 {

    public static final class a implements w04 {
        final /* synthetic */ LazyListState a;
        final /* synthetic */ boolean b;

        a(LazyListState lazyListState, boolean z) {
            this.a = lazyListState;
            this.b = z;
        }

        @Override // defpackage.w04
        public boolean a() {
            return this.a.a();
        }

        @Override // defpackage.w04
        public int b() {
            return this.a.t();
        }

        @Override // defpackage.w04
        public int c() {
            return this.a.s();
        }

        @Override // defpackage.w04
        public hn0 e() {
            return this.b ? new hn0(-1, 1) : new hn0(1, -1);
        }

        @Override // defpackage.w04
        public Object f(int i, by0 by0Var) {
            Object L = LazyListState.L(this.a, i, 0, by0Var, 2, null);
            return L == kotlin.coroutines.intrinsics.a.h() ? L : ww8.a;
        }

        @Override // defpackage.w04
        public Object g(float f, by0 by0Var) {
            Object b = ScrollExtensionsKt.b(this.a, f, null, by0Var, 2, null);
            return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
        }
    }

    public static final w04 a(LazyListState lazyListState, boolean z) {
        return new a(lazyListState, z);
    }
}
