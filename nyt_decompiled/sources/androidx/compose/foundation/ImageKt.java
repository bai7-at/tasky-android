package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.ch3;
import defpackage.cs0;
import defpackage.dj7;
import defpackage.e49;
import defpackage.et0;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.n27;
import defpackage.pl0;
import defpackage.qn0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ImageKt {
    public static final void a(ch3 ch3Var, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, qn0 qn0Var, Composer composer, int i, int i2) {
        composer.z(1595907091);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        Alignment e = (i2 & 8) != 0 ? Alignment.a.e() : alignment;
        ContentScale e2 = (i2 & 16) != 0 ? ContentScale.a.e() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        qn0 qn0Var2 = (i2 & 64) != 0 ? null : qn0Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1595907091, i, -1, "androidx.compose.foundation.Image (Image.kt:197)");
        }
        b(e49.g(ch3Var, composer, i & 14), str, modifier2, e, e2, f2, qn0Var2, composer, VectorPainter.n | (i & ContentType.LONG_FORM_ON_DEMAND) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
    }

    public static final void b(final Painter painter, final String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, qn0 qn0Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        Composer h = composer.h(1142754848);
        final Modifier modifier3 = (i2 & 4) != 0 ? Modifier.a : modifier;
        final Alignment e = (i2 & 8) != 0 ? Alignment.a.e() : alignment;
        ContentScale e2 = (i2 & 16) != 0 ? ContentScale.a.e() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        qn0 qn0Var2 = (i2 & 64) != 0 ? null : qn0Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1142754848, i, -1, "androidx.compose.foundation.Image (Image.kt:243)");
        }
        if (str != null) {
            Modifier.a aVar = Modifier.a;
            h.z(-1521136142);
            boolean S = h.S(str);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new ss2() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
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
                h.q(A);
            }
            h.R();
            modifier2 = dj7.d(aVar, false, (ss2) A, 1, null);
        } else {
            modifier2 = Modifier.a;
        }
        Modifier b = androidx.compose.ui.draw.c.b(pl0.b(modifier3.h(modifier2)), painter, false, e, e2, f2, qn0Var2, 2, null);
        ImageKt$Image$1 imageKt$Image$1 = new rg4() { // from class: androidx.compose.foundation.ImageKt$Image$1
            @Override // defpackage.rg4
            public final sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
                return androidx.compose.ui.layout.f.J(fVar, fv0.p(j), fv0.o(j), null, new ss2() { // from class: androidx.compose.foundation.ImageKt$Image$1.1
                    public final void b(l.a aVar2) {
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((l.a) obj);
                        return ww8.a;
                    }
                }, 4, null);
            }
        };
        h.z(544976794);
        int a = cs0.a(h, 0);
        Modifier d = ComposedModifierKt.d(h, b);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        final qs2 a2 = companion.a();
        h.z(1405779621);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(new qs2() { // from class: androidx.compose.foundation.ImageKt$Image$$inlined$Layout$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Object mo865invoke() {
                    return qs2.this.mo865invoke();
                }
            });
        } else {
            h.p();
        }
        Composer a3 = Updater.a(h);
        Updater.c(a3, imageKt$Image$1, companion.e());
        Updater.c(a3, o, companion.g());
        Updater.c(a3, d, companion.f());
        gt2 b2 = companion.b();
        if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
            a3.q(Integer.valueOf(a));
            a3.v(Integer.valueOf(a), b2);
        }
        h.t();
        h.R();
        h.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final ContentScale contentScale2 = e2;
            final float f3 = f2;
            final qn0 qn0Var3 = qn0Var2;
            k.a(new gt2() { // from class: androidx.compose.foundation.ImageKt$Image$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    ImageKt.b(Painter.this, str, modifier3, e, contentScale2, f3, qn0Var3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
