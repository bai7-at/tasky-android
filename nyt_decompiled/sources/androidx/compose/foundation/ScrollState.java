package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.y;
import defpackage.by0;
import defpackage.ci;
import defpackage.cy4;
import defpackage.dg4;
import defpackage.dy4;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.fo3;
import defpackage.gt2;
import defpackage.ow7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tc7;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ScrollState implements tc7 {
    public static final a i = new a(null);
    private static final ea7 j = SaverKt.a(new gt2() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(fa7 fa7Var, ScrollState scrollState) {
            return Integer.valueOf(scrollState.n());
        }
    }, new ss2() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        public final ScrollState b(int i2) {
            return new ScrollState(i2);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    });
    private final cy4 a;
    private float e;
    private final cy4 b = ow7.a(0);
    private final dy4 c = fo3.a();
    private cy4 d = ow7.a(Integer.MAX_VALUE);
    private final tc7 f = ScrollableStateKt.a(new ss2() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        public final Float b(float f) {
            float f2;
            f2 = ScrollState.this.e;
            float n = ScrollState.this.n() + f + f2;
            float l = uo6.l(n, 0.0f, ScrollState.this.m());
            boolean z = n == l;
            float n2 = l - ScrollState.this.n();
            int d = dg4.d(n2);
            ScrollState scrollState = ScrollState.this;
            scrollState.p(scrollState.n() + d);
            ScrollState.this.e = n2 - d;
            if (!z) {
                f = n2;
            }
            return Float.valueOf(f);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).floatValue());
        }
    });
    private final x08 g = y.d(new qs2() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return Boolean.valueOf(ScrollState.this.n() < ScrollState.this.m());
        }
    });
    private final x08 h = y.d(new qs2() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return Boolean.valueOf(ScrollState.this.n() > 0);
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a() {
            return ScrollState.j;
        }

        private a() {
        }
    }

    public ScrollState(int i2) {
        this.a = ow7.a(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(int i2) {
        this.a.f(i2);
    }

    @Override // defpackage.tc7
    public boolean a() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    @Override // defpackage.tc7
    public Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
        Object b = this.f.b(mutatePriority, gt2Var, by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    @Override // defpackage.tc7
    public boolean c() {
        return this.f.c();
    }

    @Override // defpackage.tc7
    public boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.tc7
    public float f(float f) {
        return this.f.f(f);
    }

    public final Object k(int i2, ci ciVar, by0 by0Var) {
        Object a2 = ScrollExtensionsKt.a(this, i2 - n(), ciVar, by0Var);
        return a2 == kotlin.coroutines.intrinsics.a.h() ? a2 : ww8.a;
    }

    public final dy4 l() {
        return this.c;
    }

    public final int m() {
        return this.d.d();
    }

    public final int n() {
        return this.a.d();
    }

    public final void o(int i2) {
        this.d.f(i2);
        androidx.compose.runtime.snapshots.e c = androidx.compose.runtime.snapshots.e.e.c();
        try {
            androidx.compose.runtime.snapshots.e l = c.l();
            try {
                if (n() > i2) {
                    p(i2);
                }
                ww8 ww8Var = ww8.a;
                c.s(l);
            } catch (Throwable th) {
                c.s(l);
                throw th;
            }
        } finally {
            c.d();
        }
    }

    public final void q(int i2) {
        this.b.f(i2);
    }
}
