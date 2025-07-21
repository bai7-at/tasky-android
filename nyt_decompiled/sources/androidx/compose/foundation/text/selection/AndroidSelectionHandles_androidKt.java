package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.b90;
import defpackage.cc7;
import defpackage.dj7;
import defpackage.du7;
import defpackage.ev1;
import defpackage.fd5;
import defpackage.fg0;
import defpackage.fm1;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hd5;
import defpackage.it2;
import defpackage.jd5;
import defpackage.lj7;
import defpackage.n63;
import defpackage.nn0;
import defpackage.o76;
import defpackage.ph0;
import defpackage.qn0;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rh0;
import defpackage.sf3;
import defpackage.sj8;
import defpackage.ss2;
import defpackage.tf3;
import defpackage.uf3;
import defpackage.uh0;
import defpackage.vi7;
import defpackage.wi7;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.yv0;
import defpackage.yz5;
import defpackage.zr0;
import defpackage.zt7;
import defpackage.zu1;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class AndroidSelectionHandles_androidKt {
    public static final void a(final jd5 jd5Var, final HandleReferencePoint handleReferencePoint, final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(345017889);
        if ((i & 14) == 0) {
            i2 = (h.S(jd5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(handleReferencePoint) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(345017889, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            int i3 = i2 << 3;
            h.z(511388516);
            boolean S = h.S(handleReferencePoint) | h.S(jd5Var);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new n63(handleReferencePoint, jd5Var);
                h.q(A);
            }
            h.R();
            AndroidPopup_androidKt.a((n63) A, null, new yz5(false, false, false, null, true, false, 15, null), gt2Var, h, (i3 & 7168) | 384, 2);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
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
                    AndroidSelectionHandles_androidKt.a(jd5.this, handleReferencePoint, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final jd5 jd5Var, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-626955031);
        if ((i & 14) == 0) {
            i2 = (h.S(jd5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.a(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(resolvedTextDirection) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.a(z2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= h.S(modifier) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i3 = i2;
        if ((46811 & i3) == 9362 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-626955031, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:66)");
            }
            final boolean g = g(z, resolvedTextDirection, z2);
            HandleReferencePoint handleReferencePoint = g ? HandleReferencePoint.TopRight : HandleReferencePoint.TopLeft;
            final r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            a(jd5Var, handleReferencePoint, zr0.b(h, 1868300064, true, new gt2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
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
                    if ((i4 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(1868300064, i4, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:74)");
                    }
                    o76 c = CompositionLocalsKt.p().c(r99.this);
                    final Modifier modifier2 = modifier;
                    final boolean z3 = g;
                    final jd5 jd5Var2 = jd5Var;
                    final boolean z4 = z;
                    CompositionLocalKt.a(c, zr0.b(composer2, -1338858912, true, new gt2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 11) == 2 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.S(-1338858912, i5, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:75)");
                            }
                            Modifier modifier3 = Modifier.this;
                            final jd5 jd5Var3 = jd5Var2;
                            final boolean z5 = z4;
                            final boolean z6 = z3;
                            Modifier d = dj7.d(modifier3, false, new ss2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void b(lj7 lj7Var) {
                                    long a = jd5.this.a();
                                    lj7Var.a(wi7.d(), new vi7(z5 ? Handle.SelectionStart : Handle.SelectionEnd, a, z6 ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, hd5.c(a), null));
                                }

                                @Override // defpackage.ss2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    b((lj7) obj);
                                    return ww8.a;
                                }
                            }, 1, null);
                            final jd5 jd5Var4 = jd5Var2;
                            AndroidSelectionHandles_androidKt.c(d, new qs2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle.1.1.2
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final Boolean mo865invoke() {
                                    return Boolean.valueOf(hd5.c(jd5.this.a()));
                                }
                            }, z3, composer3, 0);
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.R();
                            }
                        }
                    }), composer2, 56);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, (i3 & 14) | 384);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
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
                    AndroidSelectionHandles_androidKt.b(jd5.this, z, resolvedTextDirection, z2, modifier, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void c(final Modifier modifier, final qs2 qs2Var, final boolean z, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(2111672474);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.a(z) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(2111672474, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:98)");
            }
            SpacerKt.a(e(SizeKt.p(modifier, wi7.c(), wi7.b()), qs2Var, z), h, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandleIcon$1
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
                    AndroidSelectionHandles_androidKt.c(Modifier.this, qs2Var, z, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final sf3 d(fg0 fg0Var, float f) {
        int ceil = ((int) Math.ceil(f)) * 2;
        c cVar = c.a;
        sf3 c = cVar.c();
        ph0 a = cVar.a();
        rh0 b = cVar.b();
        if (c == null || a == null || ceil > c.getWidth() || ceil > c.getHeight()) {
            c = uf3.b(ceil, ceil, tf3.b.a(), false, null, 24, null);
            cVar.f(c);
            a = uh0.a(c);
            cVar.d(a);
        }
        sf3 sf3Var = c;
        ph0 ph0Var = a;
        if (b == null) {
            b = new rh0();
            cVar.e(b);
        }
        rh0 rh0Var = b;
        LayoutDirection layoutDirection = fg0Var.getLayoutDirection();
        long a2 = du7.a(sf3Var.getWidth(), sf3Var.getHeight());
        rh0.a u = rh0Var.u();
        fm1 a3 = u.a();
        LayoutDirection b2 = u.b();
        ph0 c2 = u.c();
        long d = u.d();
        rh0.a u2 = rh0Var.u();
        u2.j(fg0Var);
        u2.k(layoutDirection);
        u2.i(ph0Var);
        u2.l(a2);
        ph0Var.t();
        fv1.a0(rh0Var, nn0.b.a(), 0L, rh0Var.b(), 0.0f, null, null, b90.a.a(), 58, null);
        fv1.a0(rh0Var, wn0.d(4278190080L), fd5.b.c(), du7.a(f, f), 0.0f, null, null, 0, 120, null);
        fv1.K(rh0Var, wn0.d(4278190080L), f, hd5.a(f, f), 0.0f, null, null, 0, 120, null);
        ph0Var.k();
        rh0.a u3 = rh0Var.u();
        u3.j(a3);
        u3.k(b2);
        u3.i(c2);
        u3.l(d);
        return sf3Var;
    }

    public static final Modifier e(Modifier modifier, final qs2 qs2Var, final boolean z) {
        return ComposedModifierKt.b(modifier, null, new it2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(-196777734);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-196777734, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:110)");
                }
                final long b = ((sj8) composer.m(TextSelectionColorsKt.b())).b();
                composer.z(-433018279);
                boolean e = composer.e(b) | composer.C(qs2.this) | composer.a(z);
                final qs2 qs2Var2 = qs2.this;
                final boolean z2 = z;
                Object A = composer.A();
                if (e || A == Composer.a.a()) {
                    A = new ss2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final ev1 invoke(fg0 fg0Var) {
                            final sf3 d = AndroidSelectionHandles_androidKt.d(fg0Var, zt7.i(fg0Var.b()) / 2.0f);
                            final qn0 b2 = qn0.a.b(qn0.b, b, 0, 2, null);
                            final qs2 qs2Var3 = qs2Var2;
                            final boolean z3 = z2;
                            return fg0Var.e(new ss2() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void b(yv0 yv0Var) {
                                    yv0Var.A1();
                                    if (((Boolean) qs2.this.mo865invoke()).booleanValue()) {
                                        if (!z3) {
                                            fv1.W0(yv0Var, d, 0L, 0.0f, null, b2, 0, 46, null);
                                            return;
                                        }
                                        sf3 sf3Var = d;
                                        qn0 qn0Var = b2;
                                        long t1 = yv0Var.t1();
                                        zu1 i1 = yv0Var.i1();
                                        long b3 = i1.b();
                                        i1.c().t();
                                        i1.a().e(-1.0f, 1.0f, t1);
                                        fv1.W0(yv0Var, sf3Var, 0L, 0.0f, null, qn0Var, 0, 46, null);
                                        i1.c().k();
                                        i1.d(b3);
                                    }
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
                Modifier c = androidx.compose.ui.draw.a.c(modifier2, (ss2) A);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return c;
            }
        }, 1, null);
    }

    public static final boolean f(ResolvedTextDirection resolvedTextDirection, boolean z) {
        return (resolvedTextDirection == ResolvedTextDirection.Ltr && !z) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z);
    }

    public static final boolean g(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        return z ? f(resolvedTextDirection, z2) : !f(resolvedTextDirection, z2);
    }
}
