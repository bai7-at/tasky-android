package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.bu1;
import defpackage.fu1;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class SizeKt {
    private static final FillElement a;
    private static final FillElement b;
    private static final FillElement c;
    private static final WrapContentElement d;
    private static final WrapContentElement e;
    private static final WrapContentElement f;
    private static final WrapContentElement g;
    private static final WrapContentElement h;
    private static final WrapContentElement i;

    static {
        FillElement.a aVar = FillElement.e;
        a = aVar.c(1.0f);
        b = aVar.a(1.0f);
        c = aVar.b(1.0f);
        WrapContentElement.Companion companion = WrapContentElement.g;
        Alignment.a aVar2 = Alignment.a;
        d = companion.c(aVar2.g(), false);
        e = companion.c(aVar2.k(), false);
        f = companion.a(aVar2.i(), false);
        g = companion.a(aVar2.l(), false);
        h = companion.b(aVar2.e(), false);
        i = companion.b(aVar2.o(), false);
    }

    public static /* synthetic */ Modifier A(Modifier modifier, Alignment.b bVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bVar = Alignment.a.g();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return z(modifier, bVar, z);
    }

    public static final Modifier a(Modifier modifier, float f2, float f3) {
        return modifier.h(new UnspecifiedConstraintsElement(f2, f3, null));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = bu1.b.c();
        }
        if ((i2 & 2) != 0) {
            f3 = bu1.b.c();
        }
        return a(modifier, f2, f3);
    }

    public static final Modifier c(Modifier modifier, float f2) {
        return modifier.h(f2 == 1.0f ? b : FillElement.e.a(f2));
    }

    public static /* synthetic */ Modifier d(Modifier modifier, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return c(modifier, f2);
    }

    public static final Modifier e(Modifier modifier, float f2) {
        return modifier.h(f2 == 1.0f ? c : FillElement.e.b(f2));
    }

    public static /* synthetic */ Modifier f(Modifier modifier, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return e(modifier, f2);
    }

    public static final Modifier g(Modifier modifier, float f2) {
        return modifier.h(f2 == 1.0f ? a : FillElement.e.c(f2));
    }

    public static /* synthetic */ Modifier h(Modifier modifier, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return g(modifier, f2);
    }

    public static final Modifier i(Modifier modifier, final float f2) {
        return modifier.h(new SizeElement(0.0f, f2, 0.0f, f2, true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), 5, null));
    }

    public static final Modifier j(Modifier modifier, final float f2, final float f3) {
        return modifier.h(new SizeElement(0.0f, f2, 0.0f, f3, true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), 5, null));
    }

    public static /* synthetic */ Modifier k(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = bu1.b.c();
        }
        if ((i2 & 2) != 0) {
            f3 = bu1.b.c();
        }
        return j(modifier, f2, f3);
    }

    public static final Modifier l(Modifier modifier, final float f2) {
        return modifier.h(new SizeElement(f2, f2, f2, f2, false, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static final Modifier m(Modifier modifier, final float f2, final float f3) {
        return modifier.h(new SizeElement(f2, f3, f2, f3, false, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static final Modifier n(Modifier modifier, final float f2) {
        return modifier.h(new SizeElement(f2, f2, f2, f2, true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static final Modifier o(Modifier modifier, long j) {
        return p(modifier, fu1.h(j), fu1.g(j));
    }

    public static final Modifier p(Modifier modifier, final float f2, final float f3) {
        return modifier.h(new SizeElement(f2, f3, f2, f3, true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static final Modifier q(Modifier modifier, final float f2, final float f3, final float f4, final float f5) {
        return modifier.h(new SizeElement(f2, f3, f4, f5, true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static /* synthetic */ Modifier r(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = bu1.b.c();
        }
        if ((i2 & 2) != 0) {
            f3 = bu1.b.c();
        }
        if ((i2 & 4) != 0) {
            f4 = bu1.b.c();
        }
        if ((i2 & 8) != 0) {
            f5 = bu1.b.c();
        }
        return q(modifier, f2, f3, f4, f5);
    }

    public static final Modifier s(Modifier modifier, final float f2) {
        return modifier.h(new SizeElement(f2, 0.0f, f2, 0.0f, true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), 10, null));
    }

    public static final Modifier t(Modifier modifier, final float f2, final float f3) {
        return modifier.h(new SizeElement(f2, 0.0f, f3, 0.0f, true, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), 10, null));
    }

    public static /* synthetic */ Modifier u(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = bu1.b.c();
        }
        if ((i2 & 2) != 0) {
            f3 = bu1.b.c();
        }
        return t(modifier, f2, f3);
    }

    public static final Modifier v(Modifier modifier, Alignment.c cVar, boolean z) {
        Alignment.a aVar = Alignment.a;
        return modifier.h((!zq3.c(cVar, aVar.i()) || z) ? (!zq3.c(cVar, aVar.l()) || z) ? WrapContentElement.g.a(cVar, z) : g : f);
    }

    public static /* synthetic */ Modifier w(Modifier modifier, Alignment.c cVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = Alignment.a.i();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return v(modifier, cVar, z);
    }

    public static final Modifier x(Modifier modifier, Alignment alignment, boolean z) {
        Alignment.a aVar = Alignment.a;
        return modifier.h((!zq3.c(alignment, aVar.e()) || z) ? (!zq3.c(alignment, aVar.o()) || z) ? WrapContentElement.g.b(alignment, z) : i : h);
    }

    public static /* synthetic */ Modifier y(Modifier modifier, Alignment alignment, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alignment = Alignment.a.e();
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return x(modifier, alignment, z);
    }

    public static final Modifier z(Modifier modifier, Alignment.b bVar, boolean z) {
        Alignment.a aVar = Alignment.a;
        return modifier.h((!zq3.c(bVar, aVar.g()) || z) ? (!zq3.c(bVar, aVar.k()) || z) ? WrapContentElement.g.c(bVar, z) : e : d);
    }
}
