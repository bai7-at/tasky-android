package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.layout.ContentScale;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.ch3;
import defpackage.dj7;
import defpackage.e49;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.n27;
import defpackage.nn0;
import defpackage.qn0;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zt7;

/* loaded from: classes.dex */
public abstract class IconKt {
    private static final Modifier a = SizeKt.n(Modifier.a, bu1.g(24));

    public static final void a(ch3 ch3Var, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        composer.z(-800853103);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        long r = (i2 & 8) != 0 ? nn0.r(((nn0) composer.m(ContentColorKt.a())).B(), ((Number) composer.m(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-800853103, i, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        b(e49.g(ch3Var, composer, i & 14), str, modifier2, r, composer, VectorPainter.n | (i & ContentType.LONG_FORM_ON_DEMAND) | (i & 896) | (i & 7168), 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
    }

    public static final void b(final Painter painter, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        final long j2;
        int i3;
        Modifier modifier2;
        Composer h = composer.h(-1142959010);
        final Modifier modifier3 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if ((i2 & 8) != 0) {
            j2 = nn0.r(((nn0) h.m(ContentColorKt.a())).B(), ((Number) h.m(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            i3 = i & (-7169);
        } else {
            j2 = j;
            i3 = i;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1142959010, i3, -1, "androidx.compose.material.Icon (Icon.kt:134)");
        }
        nn0 j3 = nn0.j(j2);
        h.z(1157296644);
        boolean S = h.S(j3);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            A = nn0.t(j2, nn0.b.g()) ? null : qn0.a.b(qn0.b, j2, 0, 2, null);
            h.q(A);
        }
        h.R();
        qn0 qn0Var = (qn0) A;
        if (str != null) {
            Modifier.a aVar = Modifier.a;
            h.z(-2040376539);
            boolean S2 = h.S(str);
            Object A2 = h.A();
            if (S2 || A2 == Composer.a.a()) {
                A2 = new ss2() { // from class: androidx.compose.material.IconKt$Icon$semantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(lj7 lj7Var) {
                        jj7.O(lj7Var, str);
                        jj7.V(lj7Var, n27.b.d());
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((lj7) obj);
                        return ww8.a;
                    }
                };
                h.q(A2);
            }
            h.R();
            modifier2 = dj7.d(aVar, false, (ss2) A2, 1, null);
        } else {
            modifier2 = Modifier.a;
        }
        BoxKt.a(androidx.compose.ui.draw.c.b(c(androidx.compose.ui.graphics.b.f(modifier3), painter), painter, false, null, ContentScale.a.e(), 0.0f, qn0Var, 22, null).h(modifier2), h, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.IconKt$Icon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    IconKt.b(Painter.this, str, modifier3, j2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    private static final Modifier c(Modifier modifier, Painter painter) {
        return modifier.h((zt7.f(painter.k(), zt7.b.a()) || d(painter.k())) ? a : Modifier.a);
    }

    private static final boolean d(long j) {
        return Float.isInfinite(zt7.i(j)) && Float.isInfinite(zt7.g(j));
    }
}
