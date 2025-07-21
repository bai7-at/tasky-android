package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ci;
import defpackage.du8;
import defpackage.fc1;
import defpackage.fd8;
import defpackage.gd8;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t26;
import defpackage.uo6;
import defpackage.vu1;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yx4;
import defpackage.yy6;
import defpackage.zq3;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public abstract class SwipeableState {
    public static final a q = new a(null);
    private final ci a;
    private final ss2 b;
    private final sy4 c;
    private final sy4 d;
    private final yx4 e;
    private final yx4 f;
    private final yx4 g;
    private final sy4 h;
    private final sy4 i;
    private final Flow j;
    private float k;
    private float l;
    private final sy4 m;
    private final yx4 n;
    private final sy4 o;
    private final vu1 p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements FlowCollector {
        final /* synthetic */ float b;

        b(float f) {
            this.b = f;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map map, by0 by0Var) {
            Float f;
            float d;
            f = SwipeableKt.f(map, SwipeableState.this.o());
            zq3.e(f);
            float floatValue = f.floatValue();
            d = SwipeableKt.d(((Number) SwipeableState.this.t().getValue()).floatValue(), floatValue, map.keySet(), SwipeableState.this.w(), this.b, SwipeableState.this.x());
            Object obj = map.get(cc0.b(d));
            if (obj != null && ((Boolean) SwipeableState.this.n().invoke(obj)).booleanValue()) {
                Object j = SwipeableState.j(SwipeableState.this, obj, null, by0Var, 2, null);
                return j == kotlin.coroutines.intrinsics.a.h() ? j : ww8.a;
            }
            SwipeableState swipeableState = SwipeableState.this;
            Object h = swipeableState.h(floatValue, swipeableState.m(), by0Var);
            return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
        }
    }

    public SwipeableState(Object obj, ci ciVar, ss2 ss2Var) {
        this.a = ciVar;
        this.b = ss2Var;
        this.c = b0.e(obj, null, 2, null);
        this.d = b0.e(Boolean.FALSE, null, 2, null);
        this.e = t26.a(0.0f);
        this.f = t26.a(0.0f);
        this.g = t26.a(0.0f);
        this.h = b0.e(null, null, 2, null);
        this.i = b0.e(t.i(), null, 2, null);
        final Flow p = y.p(new qs2() { // from class: androidx.compose.material.SwipeableState$latestNonEmptyAnchorsFlow$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Map mo865invoke() {
                return SwipeableState.this.l();
            }
        });
        this.j = FlowKt.take(new Flow() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {223}, m = "emit")
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        java.util.Map r6 = (java.util.Map) r6
                        boolean r6 = r6.isEmpty()
                        if (r6 != 0) goto L48
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L48
                        return r1
                    L48:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, 1);
        this.k = Float.NEGATIVE_INFINITY;
        this.l = Float.POSITIVE_INFINITY;
        this.m = b0.e(new gt2() { // from class: androidx.compose.material.SwipeableState$thresholds$2
            public final Float b(float f, float f2) {
                return Float.valueOf(0.0f);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                return b(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
            }
        }, null, 2, null);
        this.n = t26.a(0.0f);
        this.o = b0.e(null, null, 2, null);
        this.p = DraggableKt.a(new ss2() { // from class: androidx.compose.material.SwipeableState$draggableState$1
            {
                super(1);
            }

            public final void b(float f) {
                yx4 yx4Var;
                yx4 yx4Var2;
                yx4 yx4Var3;
                yx4 yx4Var4;
                yx4Var = SwipeableState.this.g;
                float a2 = yx4Var.a() + f;
                float l = uo6.l(a2, SwipeableState.this.s(), SwipeableState.this.r());
                float f2 = a2 - l;
                yy6 v = SwipeableState.this.v();
                float a3 = v != null ? v.a(f2) : 0.0f;
                yx4Var2 = SwipeableState.this.e;
                yx4Var2.r(l + a3);
                yx4Var3 = SwipeableState.this.f;
                yx4Var3.r(f2);
                yx4Var4 = SwipeableState.this.g;
                yx4Var4.r(a2);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b(((Number) obj2).floatValue());
                return ww8.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Object obj) {
        this.c.setValue(obj);
    }

    private final Object H(float f, by0 by0Var) {
        Object a2 = vu1.a(this.p, null, new SwipeableState$snapInternalToOffset$2(f, this, null), by0Var, 1, null);
        return a2 == kotlin.coroutines.intrinsics.a.h() ? a2 : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(float f, ci ciVar, by0 by0Var) {
        Object a2 = vu1.a(this.p, null, new SwipeableState$animateInternalToOffset$2(this, f, ciVar, null), by0Var, 1, null);
        return a2 == kotlin.coroutines.intrinsics.a.h() ? a2 : ww8.a;
    }

    public static /* synthetic */ Object j(SwipeableState swipeableState, Object obj, ci ciVar, by0 by0Var, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i & 2) != 0) {
            ciVar = swipeableState.a;
        }
        return swipeableState.i(obj, ciVar, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.material.SwipeableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.material.SwipeableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.material.SwipeableState] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.util.Map r11, java.util.Map r12, defpackage.by0 r13) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.A(java.util.Map, java.util.Map, by0):java.lang.Object");
    }

    public final void B(Map map) {
        this.i.setValue(map);
    }

    public final void E(yy6 yy6Var) {
        this.o.setValue(yy6Var);
    }

    public final void F(gt2 gt2Var) {
        this.m.setValue(gt2Var);
    }

    public final void G(float f) {
        this.n.r(f);
    }

    public final Object i(Object obj, ci ciVar, by0 by0Var) {
        Object collect = this.j.collect(new SwipeableState$animateTo$2(obj, this, ciVar), by0Var);
        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
    }

    public final void k(Map map) {
        Float f;
        if (l().isEmpty()) {
            f = SwipeableKt.f(map, o());
            if (f == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.e.r(f.floatValue());
            this.g.r(f.floatValue());
        }
    }

    public final Map l() {
        return (Map) this.i.getValue();
    }

    public final ci m() {
        return this.a;
    }

    public final ss2 n() {
        return this.b;
    }

    public final Object o() {
        return this.c.getValue();
    }

    public final float p() {
        Float f;
        f = SwipeableKt.f(l(), o());
        if (f == null) {
            return 0.0f;
        }
        return Math.signum(((Number) t().getValue()).floatValue() - f.floatValue());
    }

    public final vu1 q() {
        return this.p;
    }

    public final float r() {
        return this.l;
    }

    public final float s() {
        return this.k;
    }

    public final x08 t() {
        return this.e;
    }

    public final fd8 u() {
        List e;
        Object o;
        float f;
        Object obj;
        e = SwipeableKt.e(((Number) t().getValue()).floatValue(), l().keySet());
        int size = e.size();
        if (size == 0) {
            Object o2 = o();
            o = o();
            f = 1.0f;
            obj = o2;
        } else if (size != 1) {
            Pair a2 = p() > 0.0f ? du8.a(e.get(0), e.get(1)) : du8.a(e.get(1), e.get(0));
            float floatValue = ((Number) a2.a()).floatValue();
            float floatValue2 = ((Number) a2.b()).floatValue();
            obj = t.j(l(), Float.valueOf(floatValue));
            o = t.j(l(), Float.valueOf(floatValue2));
            f = (((Number) t().getValue()).floatValue() - floatValue) / (floatValue2 - floatValue);
        } else {
            Object j = t.j(l(), e.get(0));
            o = t.j(l(), e.get(0));
            f = 1.0f;
            obj = j;
        }
        return new fd8(obj, o, f);
    }

    public final yy6 v() {
        return (yy6) this.o.getValue();
    }

    public final gt2 w() {
        return (gt2) this.m.getValue();
    }

    public final float x() {
        return this.n.a();
    }

    public final boolean y() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object z(float f, by0 by0Var) {
        Object collect = this.j.collect(new b(f), by0Var);
        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
    }

    public /* synthetic */ SwipeableState(Object obj, ci ciVar, ss2 ss2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? gd8.a.a() : ciVar, (i & 4) != 0 ? new ss2() { // from class: androidx.compose.material.SwipeableState.1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj2) {
                return Boolean.TRUE;
            }
        } : ss2Var);
    }
}
