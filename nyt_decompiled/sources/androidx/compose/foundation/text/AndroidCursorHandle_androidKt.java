package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.ev1;
import defpackage.fd5;
import defpackage.fg0;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.iv1;
import defpackage.jd5;
import defpackage.qn0;
import defpackage.sf3;
import defpackage.sj8;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yv0;
import defpackage.zr0;
import defpackage.zt7;
import defpackage.zu1;

/* loaded from: classes.dex */
public abstract class AndroidCursorHandle_androidKt {
    private static final float a;
    private static final float b;

    static final class a implements jd5 {
        final /* synthetic */ long a;

        a(long j) {
            this.a = j;
        }

        @Override // defpackage.jd5
        public final long a() {
            return this.a;
        }
    }

    static {
        float g = bu1.g(25);
        a = g;
        b = bu1.g(bu1.g(g * 2.0f) / 2.4142137f);
    }

    public static final void a(final long j, final Modifier modifier, final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-5185995);
        if ((i & 14) == 0) {
            i2 = (h.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-5185995, i2, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:42)");
            }
            h.z(2068318109);
            boolean e = h.e(j);
            Object A = h.A();
            if (e || A == Composer.a.a()) {
                A = new a(j);
                h.q(A);
            }
            h.R();
            AndroidSelectionHandles_androidKt.a((jd5) A, HandleReferencePoint.TopMiddle, zr0.b(h, -1458480226, true, new gt2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2
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
                    if ((i3 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-1458480226, i3, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:47)");
                    }
                    if (gt2.this == null) {
                        composer2.z(1275643845);
                        AndroidCursorHandle_androidKt.b(modifier, composer2, 0);
                        composer2.R();
                    } else {
                        composer2.z(1275643915);
                        gt2.this.invoke(composer2, 0);
                        composer2.R();
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, 432);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$3
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
                    AndroidCursorHandle_androidKt.a(j, modifier, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(694251107);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(694251107, i2, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            SpacerKt.a(c(SizeKt.p(modifier, b, a)), h, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$DefaultCursorHandle$1
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
                    AndroidCursorHandle_androidKt.b(Modifier.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final Modifier c(Modifier modifier) {
        return ComposedModifierKt.b(modifier, null, new it2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1
            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(-2126899193);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-2126899193, i, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
                }
                final long b2 = ((sj8) composer.m(TextSelectionColorsKt.b())).b();
                Modifier.a aVar = Modifier.a;
                composer.z(2068318685);
                boolean e = composer.e(b2);
                Object A = composer.A();
                if (e || A == Composer.a.a()) {
                    A = new ss2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final ev1 invoke(fg0 fg0Var) {
                            final float i2 = zt7.i(fg0Var.b()) / 2.0f;
                            final sf3 d = AndroidSelectionHandles_androidKt.d(fg0Var, i2);
                            final qn0 b3 = qn0.a.b(qn0.b, b2, 0, 2, null);
                            return fg0Var.e(new ss2() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void b(yv0 yv0Var) {
                                    yv0Var.A1();
                                    float f = i2;
                                    sf3 sf3Var = d;
                                    qn0 qn0Var = b3;
                                    zu1 i1 = yv0Var.i1();
                                    long b4 = i1.b();
                                    i1.c().t();
                                    iv1 a2 = i1.a();
                                    iv1.h(a2, f, 0.0f, 2, null);
                                    a2.f(45.0f, fd5.b.c());
                                    fv1.W0(yv0Var, sf3Var, 0L, 0.0f, null, qn0Var, 0, 46, null);
                                    i1.c().k();
                                    i1.d(b4);
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    b((yv0) obj);
                                    return ww8.a;
                                }
                            });
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                Modifier h = modifier2.h(androidx.compose.ui.draw.a.c(aVar, (ss2) A));
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return h;
            }
        }, 1, null);
    }
}
