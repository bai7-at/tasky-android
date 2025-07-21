package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import defpackage.cc7;
import defpackage.ft6;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.kt2;
import defpackage.ku8;
import defpackage.mt2;
import defpackage.nt2;
import defpackage.ot2;
import defpackage.pt2;
import defpackage.qt2;
import defpackage.rs2;
import defpackage.ts2;
import defpackage.ws2;
import defpackage.ww8;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ComposableLambdaImpl implements yr0 {
    private final int a;
    private final boolean b;
    private Object c;
    private ft6 d;
    private List e;

    public ComposableLambdaImpl(int i, boolean z, Object obj) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    private final void o(Composer composer) {
        ft6 x;
        if (!this.b || (x = composer.x()) == null) {
            return;
        }
        composer.I(x);
        if (zr0.e(this.d, x)) {
            this.d = x;
            return;
        }
        List list = this.e;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            arrayList.add(x);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (zr0.e((ft6) list.get(i), x)) {
                list.set(i, x);
                return;
            }
        }
        list.add(x);
    }

    private final void p() {
        if (this.b) {
            ft6 ft6Var = this.d;
            if (ft6Var != null) {
                ft6Var.invalidate();
                this.d = null;
            }
            List list = this.e;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((ft6) list.get(i)).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // defpackage.nt2
    public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return h(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
    }

    public Object b(Composer composer, int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = i | (h.S(this) ? zr0.d(0) : zr0.f(0));
        Object obj = this.c;
        zq3.f(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((gt2) ku8.f(obj, 2)).invoke(h, Integer.valueOf(d));
        cc7 k = h.k();
        if (k != null) {
            zq3.f(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            k.a((gt2) ku8.f(this, 2));
        }
        return invoke;
    }

    public Object c(final Object obj, Composer composer, final int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(1) : zr0.f(1);
        Object obj2 = this.c;
        zq3.f(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((it2) ku8.f(obj2, 3)).invoke(obj, h, Integer.valueOf(d | i));
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((Composer) obj3, ((Number) obj4).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.c(obj, composer2, gt6.a(i) | 1);
                }
            });
        }
        return invoke;
    }

    public Object d(final Object obj, final Object obj2, Composer composer, final int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(2) : zr0.f(2);
        Object obj3 = this.c;
        zq3.f(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((kt2) ku8.f(obj3, 4)).invoke(obj, obj2, h, Integer.valueOf(d | i));
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((Composer) obj4, ((Number) obj5).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.d(obj, obj2, composer2, gt6.a(i) | 1);
                }
            });
        }
        return invoke;
    }

    @Override // defpackage.qt2
    public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return k(obj, obj2, obj3, obj4, obj5, obj6, obj7, (Composer) obj8, ((Number) obj9).intValue());
    }

    public Object g(final Object obj, final Object obj2, final Object obj3, Composer composer, final int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(3) : zr0.f(3);
        Object obj4 = this.c;
        zq3.f(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((mt2) ku8.f(obj4, 5)).invoke(obj, obj2, obj3, h, Integer.valueOf(d | i));
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6) {
                    invoke((Composer) obj5, ((Number) obj6).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.g(obj, obj2, obj3, composer2, gt6.a(i) | 1);
                }
            });
        }
        return invoke;
    }

    public Object h(final Object obj, final Object obj2, final Object obj3, final Object obj4, Composer composer, final int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(4) : zr0.f(4);
        Object obj5 = this.c;
        zq3.f(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object a = ((nt2) ku8.f(obj5, 6)).a(obj, obj2, obj3, obj4, h, Integer.valueOf(d | i));
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj6, Object obj7) {
                    invoke((Composer) obj6, ((Number) obj7).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.h(obj, obj2, obj3, obj4, composer2, gt6.a(i) | 1);
                }
            });
        }
        return a;
    }

    public Object i(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, Composer composer, final int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(5) : zr0.f(5);
        Object obj6 = this.c;
        zq3.f(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((ot2) ku8.f(obj6, 7)).invoke(obj, obj2, obj3, obj4, obj5, h, Integer.valueOf(i | d));
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj7, Object obj8) {
                    invoke((Composer) obj7, ((Number) obj8).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.i(obj, obj2, obj3, obj4, obj5, composer2, gt6.a(i) | 1);
                }
            });
        }
        return invoke;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b((Composer) obj, ((Number) obj2).intValue());
    }

    public Object j(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, Composer composer, final int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(6) : zr0.f(6);
        Object obj7 = this.c;
        zq3.f(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((pt2) ku8.f(obj7, 8)).invoke(obj, obj2, obj3, obj4, obj5, obj6, h, Integer.valueOf(i | d));
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj8, Object obj9) {
                    invoke((Composer) obj8, ((Number) obj9).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.j(obj, obj2, obj3, obj4, obj5, obj6, composer2, gt6.a(i) | 1);
                }
            });
        }
        return invoke;
    }

    public Object k(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, Composer composer, final int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(7) : zr0.f(7);
        Object obj8 = this.c;
        zq3.f(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object e = ((qt2) ku8.f(obj8, 9)).e(obj, obj2, obj3, obj4, obj5, obj6, obj7, h, Integer.valueOf(i | d));
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj9, Object obj10) {
                    invoke((Composer) obj9, ((Number) obj10).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.k(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer2, gt6.a(i) | 1);
                }
            });
        }
        return e;
    }

    public Object l(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, Composer composer, final int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(8) : zr0.f(8);
        Object obj9 = this.c;
        zq3.f(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((rs2) ku8.f(obj9, 10)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, h, Integer.valueOf(i | d));
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj10, Object obj11) {
                    invoke((Composer) obj10, ((Number) obj11).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.l(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composer2, gt6.a(i) | 1);
                }
            });
        }
        return invoke;
    }

    public Object m(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, Composer composer, final int i) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(9) : zr0.f(9);
        Object obj10 = this.c;
        zq3.f(obj10, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((ts2) ku8.f(obj10, 11)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, h, Integer.valueOf(i | d));
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj11, Object obj12) {
                    invoke((Composer) obj11, ((Number) obj12).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposableLambdaImpl.this.m(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer2, gt6.a(i) | 1);
                }
            });
        }
        return invoke;
    }

    public Object n(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, Composer composer, final int i, final int i2) {
        Composer h = composer.h(this.a);
        o(h);
        int d = h.S(this) ? zr0.d(11) : zr0.f(11);
        Object obj12 = this.c;
        zq3.f(obj12, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((ws2) ku8.f(obj12, 14)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, h, Integer.valueOf(i), Integer.valueOf(i2 | d));
        cc7 k = h.k();
        if (k == null) {
            return invoke;
        }
        k.a(new gt2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj13, Object obj14) {
                invoke((Composer) obj13, ((Number) obj14).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i3) {
                ComposableLambdaImpl.this.n(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer2, gt6.a(i) | 1, gt6.a(i2));
            }
        });
        return invoke;
    }

    public final void q(Object obj) {
        if (zq3.c(this.c, obj)) {
            return;
        }
        boolean z = this.c == null;
        this.c = obj;
        if (z) {
            return;
        }
        p();
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return c(obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.kt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.mt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return g(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
    }

    @Override // defpackage.ot2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return i(obj, obj2, obj3, obj4, obj5, (Composer) obj6, ((Number) obj7).intValue());
    }

    @Override // defpackage.pt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return j(obj, obj2, obj3, obj4, obj5, obj6, (Composer) obj7, ((Number) obj8).intValue());
    }

    @Override // defpackage.rs2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (Composer) obj9, ((Number) obj10).intValue());
    }

    @Override // defpackage.ts2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return m(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (Composer) obj10, ((Number) obj11).intValue());
    }

    @Override // defpackage.ws2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return n(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, (Composer) obj12, ((Number) obj13).intValue(), ((Number) obj14).intValue());
    }
}
