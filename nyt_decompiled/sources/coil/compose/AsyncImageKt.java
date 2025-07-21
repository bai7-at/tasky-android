package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import coil.ImageLoader;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.au7;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dj7;
import defpackage.fm1;
import defpackage.fu7;
import defpackage.fv0;
import defpackage.fv1;
import defpackage.g;
import defpackage.gt2;
import defpackage.gu7;
import defpackage.iu;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.n27;
import defpackage.oq1;
import defpackage.pl0;
import defpackage.qn0;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AsyncImageKt {
    public static final void a(final Object obj, final String str, final ImageLoader imageLoader, Modifier modifier, ss2 ss2Var, ss2 ss2Var2, Alignment alignment, ContentScale contentScale, float f, qn0 qn0Var, int i, Composer composer, final int i2, final int i3, final int i4) {
        final int i5;
        int i6;
        Composer h = composer.h(-2030202961);
        final Modifier modifier2 = (i4 & 8) != 0 ? Modifier.a : modifier;
        final ss2 a = (i4 & 16) != 0 ? AsyncImagePainter.B.a() : ss2Var;
        final ss2 ss2Var3 = (i4 & 32) != 0 ? null : ss2Var2;
        final Alignment e = (i4 & 64) != 0 ? Alignment.a.e() : alignment;
        final ContentScale e2 = (i4 & 128) != 0 ? ContentScale.a.e() : contentScale;
        final float f2 = (i4 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? 1.0f : f;
        final qn0 qn0Var2 = (i4 & 512) != 0 ? null : qn0Var;
        if ((i4 & 1024) != 0) {
            i6 = i3 & (-15);
            i5 = fv1.p.b();
        } else {
            i5 = i;
            i6 = i3;
        }
        if (b.G()) {
            b.S(-2030202961, i2, i6, "coil.compose.AsyncImage (AsyncImage.kt:116)");
        }
        vg3 f3 = f(UtilsKt.e(obj, h, 8), e2, h, 8 | ((i2 >> 18) & ContentType.LONG_FORM_ON_DEMAND));
        int i7 = i2 >> 6;
        int i8 = i2 >> 9;
        int i9 = i8 & 57344;
        ss2 ss2Var4 = a;
        ss2 ss2Var5 = ss2Var3;
        ContentScale contentScale2 = e2;
        int i10 = i5;
        AsyncImagePainter e3 = iu.e(f3, imageLoader, ss2Var4, ss2Var5, contentScale2, i10, h, ((i6 << 15) & 458752) | (i7 & 7168) | (i7 & 896) | 72 | i9, 0);
        fu7 K = f3.K();
        b(K instanceof ConstraintsSizeResolver ? modifier2.h((Modifier) K) : modifier2, e3, str, e, e2, f2, qn0Var2, h, (i8 & 7168) | ((i2 << 3) & 896) | i9 | (i8 & 458752) | (3670016 & i8));
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: coil.compose.AsyncImageKt$AsyncImage$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i11) {
                AsyncImageKt.a(obj, str, imageLoader, modifier2, a, ss2Var3, e, e2, f2, qn0Var2, i5, composer2, i2 | 1, i3, i4);
            }
        });
    }

    public static final void b(final Modifier modifier, final Painter painter, final String str, final Alignment alignment, final ContentScale contentScale, final float f, final qn0 qn0Var, Composer composer, final int i) {
        Modifier e;
        Composer h = composer.h(10290533);
        if (b.G()) {
            b.S(10290533, i, -1, "coil.compose.Content (AsyncImage.kt:154)");
        }
        Modifier h2 = pl0.b(d(modifier, str)).h(new ContentPainterModifier(painter, alignment, contentScale, f, qn0Var));
        AsyncImageKt$Content$1 asyncImageKt$Content$1 = new rg4() { // from class: coil.compose.AsyncImageKt$Content$1
            @Override // defpackage.rg4
            public final sg4 d(f fVar, List list, long j) {
                return f.J(fVar, fv0.p(j), fv0.o(j), null, new ss2() { // from class: coil.compose.AsyncImageKt$Content$1$measure$1
                    public final void b(l.a aVar) {
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
        fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
        e = ComposedModifierKt.e(h, h2);
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        final qs2 a = companion.a();
        h.z(1405779621);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(new qs2() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
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
        h.H();
        Composer a2 = Updater.a(h);
        Updater.c(a2, asyncImageKt$Content$1, companion.e());
        Updater.c(a2, fm1Var, companion.c());
        Updater.c(a2, layoutDirection, companion.d());
        Updater.c(a2, r99Var, companion.h());
        Updater.c(a2, e, companion.f());
        h.c();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: coil.compose.AsyncImageKt$Content$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                AsyncImageKt.b(Modifier.this, painter, str, alignment, contentScale, f, qn0Var, composer2, i | 1);
            }
        });
    }

    private static final Modifier d(Modifier modifier, final String str) {
        return str != null ? dj7.d(modifier, false, new ss2() { // from class: coil.compose.AsyncImageKt$contentDescription$1
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
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final au7 e(long j) {
        if (fv0.r(j)) {
            return null;
        }
        return new au7(fv0.j(j) ? g.a(fv0.n(j)) : oq1.b.a, fv0.i(j) ? g.a(fv0.m(j)) : oq1.b.a);
    }

    public static final vg3 f(vg3 vg3Var, ContentScale contentScale, Composer composer, int i) {
        fu7 fu7Var;
        composer.z(402368983);
        if (b.G()) {
            b.S(402368983, i, -1, "coil.compose.updateRequest (AsyncImage.kt:181)");
        }
        if (vg3Var.q().m() == null) {
            if (zq3.c(contentScale, ContentScale.a.g())) {
                fu7Var = gu7.a(au7.d);
            } else {
                composer.z(-492369756);
                Object A = composer.A();
                if (A == Composer.a.a()) {
                    A = new ConstraintsSizeResolver();
                    composer.q(A);
                }
                composer.R();
                fu7Var = (fu7) A;
            }
            vg3Var = vg3.R(vg3Var, null, 1, null).o(fu7Var).a();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return vg3Var;
    }
}
