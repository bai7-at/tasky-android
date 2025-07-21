package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.f;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.snapshots.e;
import androidx.compose.runtime.y;
import defpackage.an3;
import defpackage.by0;
import defpackage.dg4;
import defpackage.dy4;
import defpackage.e14;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.fi;
import defpackage.fm1;
import defpackage.fo3;
import defpackage.g14;
import defpackage.gi;
import defpackage.gt2;
import defpackage.h14;
import defpackage.hm1;
import defpackage.hu8;
import defpackage.iv0;
import defpackage.j14;
import defpackage.k04;
import defpackage.k14;
import defpackage.kv6;
import defpackage.lv6;
import defpackage.n14;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tc5;
import defpackage.tc7;
import defpackage.u04;
import defpackage.wk2;
import defpackage.ww8;
import defpackage.z04;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class LazyListState implements tc7 {
    public static final a B = new a(null);
    private static final ea7 C = ListSaverKt.a(new gt2() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(fa7 fa7Var, LazyListState lazyListState) {
            return i.o(Integer.valueOf(lazyListState.s()), Integer.valueOf(lazyListState.t()));
        }
    }, new ss2() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LazyListState invoke(List list) {
            return new LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    });
    private fi A;
    private boolean a;
    private k14 b;
    private final n14 c;
    private final z04 d;
    private final sy4 e;
    private final dy4 f;
    private float g;
    private fm1 h;
    private final tc7 i;
    private int j;
    private boolean k;
    private int l;
    private u04.a m;
    private boolean n;
    private kv6 o;
    private final lv6 p;
    private final AwaitFirstLayoutModifier q;
    private final e14 r;
    private final k04 s;
    private long t;
    private final f u;
    private final sy4 v;
    private final sy4 w;
    private final sy4 x;
    private final u04 y;
    private CoroutineScope z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a() {
            return LazyListState.C;
        }

        private a() {
        }
    }

    public static final class b implements lv6 {
        b() {
        }

        @Override // defpackage.lv6
        public void g(kv6 kv6Var) {
            LazyListState.this.o = kv6Var;
        }
    }

    public LazyListState(int i, int i2) {
        k14 k14Var;
        fi b2;
        n14 n14Var = new n14(i, i2);
        this.c = n14Var;
        this.d = new z04(this);
        k14Var = LazyListStateKt.b;
        this.e = y.i(k14Var, y.k());
        this.f = fo3.a();
        this.h = hm1.a(1.0f, 1.0f);
        this.i = ScrollableStateKt.a(new ss2() { // from class: androidx.compose.foundation.lazy.LazyListState$scrollableState$1
            {
                super(1);
            }

            public final Float b(float f) {
                return Float.valueOf(-LazyListState.this.J(-f));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).floatValue());
            }
        });
        this.k = true;
        this.l = -1;
        this.p = new b();
        this.q = new AwaitFirstLayoutModifier();
        this.r = new e14();
        this.s = new k04();
        this.t = iv0.b(0, 0, 0, 0, 15, null);
        this.u = new f();
        n14Var.b();
        Boolean bool = Boolean.FALSE;
        this.v = b0.e(bool, null, 2, null);
        this.w = b0.e(bool, null, 2, null);
        this.x = tc5.c(null, 1, null);
        this.y = new u04();
        hu8 d = VectorConvertersKt.d(wk2.a);
        Float valueOf = Float.valueOf(0.0f);
        b2 = gi.b(d, valueOf, valueOf, (r19 & 8) != 0 ? Long.MIN_VALUE : 0L, (r19 & 16) != 0 ? Long.MIN_VALUE : 0L, (r19 & 32) != 0 ? false : false);
        this.A = b2;
    }

    private final void H(float f, j14 j14Var) {
        u04.a aVar;
        if (this.k && !j14Var.k().isEmpty()) {
            boolean z = f < 0.0f;
            int index = z ? ((g14) i.w0(j14Var.k())).getIndex() + 1 : ((g14) i.k0(j14Var.k())).getIndex() - 1;
            if (index == this.l || index < 0 || index >= j14Var.h()) {
                return;
            }
            if (this.n != z && (aVar = this.m) != null) {
                aVar.cancel();
            }
            this.n = z;
            this.l = index;
            this.m = this.y.a(index, this.t);
        }
    }

    static /* synthetic */ void I(LazyListState lazyListState, float f, j14 j14Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j14Var = lazyListState.x();
        }
        lazyListState.H(f, j14Var);
    }

    public static /* synthetic */ Object L(LazyListState lazyListState, int i, int i2, by0 by0Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.K(i, i2, by0Var);
    }

    private void M(boolean z) {
        this.w.setValue(Boolean.valueOf(z));
    }

    private void N(boolean z) {
        this.v.setValue(Boolean.valueOf(z));
    }

    private final void S(float f) {
        float f2;
        fm1 fm1Var = this.h;
        f2 = LazyListStateKt.a;
        if (f <= fm1Var.f1(f2)) {
            return;
        }
        e c = e.e.c();
        try {
            e l = c.l();
            try {
                float floatValue = ((Number) this.A.getValue()).floatValue();
                if (this.A.B()) {
                    this.A = gi.g(this.A, floatValue - f, 0.0f, 0L, 0L, false, 30, null);
                    CoroutineScope coroutineScope = this.z;
                    if (coroutineScope != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LazyListState$updateScrollDeltaForPostLookahead$2$1(this, null), 3, null);
                    }
                } else {
                    this.A = new fi(VectorConvertersKt.d(wk2.a), Float.valueOf(-f), null, 0L, 0L, false, 60, null);
                    CoroutineScope coroutineScope2 = this.z;
                    if (coroutineScope2 != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new LazyListState$updateScrollDeltaForPostLookahead$2$2(this, null), 3, null);
                    }
                }
                c.s(l);
            } catch (Throwable th) {
                c.s(l);
                throw th;
            }
        } finally {
            c.d();
        }
    }

    public static /* synthetic */ Object k(LazyListState lazyListState, int i, int i2, by0 by0Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.j(i, i2, by0Var);
    }

    public static /* synthetic */ void m(LazyListState lazyListState, k14 k14Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyListState.l(k14Var, z, z2);
    }

    private final void n(j14 j14Var) {
        if (this.l == -1 || j14Var.k().isEmpty()) {
            return;
        }
        if (this.l != (this.n ? ((g14) i.w0(j14Var.k())).getIndex() + 1 : ((g14) i.k0(j14Var.k())).getIndex() - 1)) {
            this.l = -1;
            u04.a aVar = this.m;
            if (aVar != null) {
                aVar.cancel();
            }
            this.m = null;
        }
    }

    public final sy4 A() {
        return this.x;
    }

    public final k14 B() {
        return this.b;
    }

    public final u04 C() {
        return this.y;
    }

    public final kv6 D() {
        return this.o;
    }

    public final lv6 E() {
        return this.p;
    }

    public final float F() {
        return ((Number) this.A.getValue()).floatValue();
    }

    public final float G() {
        return this.g;
    }

    public final float J(float f) {
        if ((f < 0.0f && !a()) || (f > 0.0f && !d())) {
            return 0.0f;
        }
        if (Math.abs(this.g) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.g).toString());
        }
        float f2 = this.g + f;
        this.g = f2;
        if (Math.abs(f2) > 0.5f) {
            k14 k14Var = (k14) this.e.getValue();
            float f3 = this.g;
            int d = dg4.d(f3);
            k14 k14Var2 = this.b;
            boolean r = k14Var.r(d, !this.a);
            if (r && k14Var2 != null) {
                r = k14Var2.r(d, true);
            }
            if (r) {
                l(k14Var, this.a, true);
                tc5.d(this.x);
                H(f3 - this.g, k14Var);
            } else {
                kv6 kv6Var = this.o;
                if (kv6Var != null) {
                    kv6Var.f();
                }
                I(this, f3 - this.g, null, 2, null);
            }
        }
        if (Math.abs(this.g) <= 0.5f) {
            return f;
        }
        float f4 = f - this.g;
        this.g = 0.0f;
        return f4;
    }

    public final Object K(int i, int i2, by0 by0Var) {
        Object e = tc7.e(this, null, new LazyListState$scrollToItem$2(this, i, i2, null), by0Var, 1, null);
        return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
    }

    public final void O(CoroutineScope coroutineScope) {
        this.z = coroutineScope;
    }

    public final void P(fm1 fm1Var) {
        this.h = fm1Var;
    }

    public final void Q(long j) {
        this.t = j;
    }

    public final void R(int i, int i2) {
        this.c.d(i, i2);
        this.r.f();
        kv6 kv6Var = this.o;
        if (kv6Var != null) {
            kv6Var.f();
        }
    }

    public final int T(h14 h14Var, int i) {
        return this.c.j(h14Var, i);
    }

    @Override // defpackage.tc7
    public boolean a() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.tc7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(androidx.compose.foundation.MutatePriority r6, defpackage.gt2 r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            gt2 r7 = (defpackage.gt2) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.lazy.LazyListState r5 = (androidx.compose.foundation.lazy.LazyListState) r5
            kotlin.f.b(r8)
            goto L5a
        L46:
            kotlin.f.b(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.q
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.l(r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            tc7 r5 = r5.i
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r5 = r5.b(r6, r7, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.b(androidx.compose.foundation.MutatePriority, gt2, by0):java.lang.Object");
    }

    @Override // defpackage.tc7
    public boolean c() {
        return this.i.c();
    }

    @Override // defpackage.tc7
    public boolean d() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    @Override // defpackage.tc7
    public float f(float f) {
        return this.i.f(f);
    }

    public final Object j(int i, int i2, by0 by0Var) {
        Object d = LazyAnimateScrollKt.d(this.d, i, i2, 100, this.h, by0Var);
        return d == kotlin.coroutines.intrinsics.a.h() ? d : ww8.a;
    }

    public final void l(k14 k14Var, boolean z, boolean z2) {
        if (!z && this.a) {
            this.b = k14Var;
            return;
        }
        if (z) {
            this.a = true;
        }
        if (z2) {
            this.c.i(k14Var.p());
        } else {
            this.c.h(k14Var);
            n(k14Var);
        }
        M(k14Var.l());
        N(k14Var.m());
        this.g -= k14Var.n();
        this.e.setValue(k14Var);
        if (z) {
            S(k14Var.q());
        }
        this.j++;
    }

    public final AwaitFirstLayoutModifier o() {
        return this.q;
    }

    public final k04 p() {
        return this.s;
    }

    public final CoroutineScope q() {
        return this.z;
    }

    public final fm1 r() {
        return this.h;
    }

    public final int s() {
        return this.c.a();
    }

    public final int t() {
        return this.c.c();
    }

    public final boolean u() {
        return this.a;
    }

    public final dy4 v() {
        return this.f;
    }

    public final e14 w() {
        return this.r;
    }

    public final j14 x() {
        return (j14) this.e.getValue();
    }

    public final an3 y() {
        return (an3) this.c.b().getValue();
    }

    public final f z() {
        return this.u;
    }

    public /* synthetic */ LazyListState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
