package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import coil.request.NullRequestDataException;
import coil.size.Scale;
import defpackage.dg4;
import defpackage.fv0;
import defpackage.in3;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt7;

/* loaded from: classes.dex */
public abstract class UtilsKt {
    private static final long a = fv0.b.c(0, 0);

    public static final float a(long j, float f) {
        return uo6.l(f, fv0.o(j), fv0.m(j));
    }

    public static final float b(long j, float f) {
        return uo6.l(f, fv0.p(j), fv0.n(j));
    }

    public static final long c() {
        return a;
    }

    public static final ss2 d(final ss2 ss2Var, final ss2 ss2Var2, final ss2 ss2Var3) {
        if (ss2Var == null && ss2Var2 == null && ss2Var3 == null) {
            return null;
        }
        return new ss2() { // from class: coil.compose.UtilsKt$onStateOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(AsyncImagePainter.b bVar) {
                if (bVar instanceof AsyncImagePainter.b.c) {
                    ss2 ss2Var4 = ss2.this;
                    if (ss2Var4 != null) {
                        ss2Var4.invoke(bVar);
                        return;
                    }
                    return;
                }
                if (bVar instanceof AsyncImagePainter.b.d) {
                    ss2 ss2Var5 = ss2Var2;
                    if (ss2Var5 != null) {
                        ss2Var5.invoke(bVar);
                        return;
                    }
                    return;
                }
                if (!(bVar instanceof AsyncImagePainter.b.C0135b)) {
                    boolean z = bVar instanceof AsyncImagePainter.b.a;
                    return;
                }
                ss2 ss2Var6 = ss2Var3;
                if (ss2Var6 != null) {
                    ss2Var6.invoke(bVar);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((AsyncImagePainter.b) obj);
                return ww8.a;
            }
        };
    }

    public static final vg3 e(Object obj, Composer composer, int i) {
        if (b.G()) {
            b.S(1151830858, i, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        return obj instanceof vg3 ? (vg3) obj : new vg3.a((Context) composer.m(AndroidCompositionLocals_androidKt.g())).d(obj).a();
    }

    public static final long f(long j) {
        return in3.a(dg4.d(zt7.i(j)), dg4.d(zt7.g(j)));
    }

    public static final Scale g(ContentScale contentScale) {
        ContentScale.a aVar = ContentScale.a;
        return zq3.c(contentScale, aVar.e()) ? true : zq3.c(contentScale, aVar.f()) ? Scale.FIT : Scale.FILL;
    }

    public static final ss2 h(final Painter painter, final Painter painter2, final Painter painter3) {
        return (painter == null && painter2 == null && painter3 == null) ? AsyncImagePainter.B.a() : new ss2() { // from class: coil.compose.UtilsKt$transformOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AsyncImagePainter.b invoke(AsyncImagePainter.b bVar) {
                AsyncImagePainter.b c;
                if (bVar instanceof AsyncImagePainter.b.c) {
                    Painter painter4 = Painter.this;
                    AsyncImagePainter.b.c cVar = (AsyncImagePainter.b.c) bVar;
                    if (painter4 == null) {
                        return cVar;
                    }
                    c = cVar.b(painter4);
                } else {
                    if (!(bVar instanceof AsyncImagePainter.b.C0135b)) {
                        return bVar;
                    }
                    AsyncImagePainter.b.C0135b c0135b = (AsyncImagePainter.b.C0135b) bVar;
                    if (c0135b.d().c() instanceof NullRequestDataException) {
                        Painter painter5 = painter3;
                        if (painter5 == null) {
                            return c0135b;
                        }
                        c = AsyncImagePainter.b.C0135b.c(c0135b, painter5, null, 2, null);
                    } else {
                        Painter painter6 = painter2;
                        if (painter6 == null) {
                            return c0135b;
                        }
                        c = AsyncImagePainter.b.C0135b.c(c0135b, painter6, null, 2, null);
                    }
                }
                return c;
            }
        };
    }
}
