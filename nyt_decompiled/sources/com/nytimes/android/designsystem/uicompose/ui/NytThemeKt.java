package com.nytimes.android.designsystem.uicompose.ui;

import android.R;
import android.os.Build;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.utils.composeutils.ComposablePositionsKt;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.ff8;
import defpackage.fo0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.lb5;
import defpackage.mb5;
import defpackage.nb5;
import defpackage.nn0;
import defpackage.nt5;
import defpackage.o76;
import defpackage.ob5;
import defpackage.r81;
import defpackage.ro0;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class NytThemeKt {
    private static final ro0 a;
    private static final ro0 b;

    static {
        ro0 g;
        g = ColorsKt.g((r43 & 1) != 0 ? wn0.d(4284612846L) : mb5.d(nt5.a().f()), (r43 & 2) != 0 ? wn0.d(4281794739L) : mb5.d(nt5.a().f()), (r43 & 4) != 0 ? wn0.d(4278442694L) : mb5.d(nt5.a().n()), (r43 & 8) != 0 ? wn0.d(4278290310L) : mb5.d(nt5.a().n()), (r43 & 16) != 0 ? nn0.b.h() : mb5.d(nt5.a().b()), (r43 & 32) != 0 ? nn0.b.h() : mb5.d(nt5.a().b()), (r43 & 64) != 0 ? wn0.d(4289724448L) : 0L, (r43 & 128) != 0 ? nn0.b.h() : mb5.d(nt5.a().f()), (r43 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nn0.b.a() : mb5.b(nt5.a().f()), (r43 & 512) != 0 ? nn0.b.a() : mb5.d(nt5.a().f()), (r43 & 1024) != 0 ? nn0.b.a() : mb5.d(nt5.a().f()), (r43 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.h() : 0L);
        a = g;
        b = ColorsKt.d(mb5.b(nt5.a().f()), mb5.b(nt5.a().f()), mb5.b(nt5.a().n()), mb5.b(nt5.a().n()), mb5.b(nt5.a().b()), mb5.b(nt5.a().b()), 0L, mb5.b(nt5.a().f()), mb5.d(nt5.a().f()), mb5.b(nt5.a().f()), mb5.b(nt5.a().f()), 0L, 2112, null);
    }

    public static final void a(boolean z, nb5 nb5Var, ro0 ro0Var, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        nb5 nb5Var2;
        final ro0 ro0Var2;
        int i4;
        nb5 nb5Var3;
        int i5;
        int i6;
        int i7;
        zq3.h(gt2Var, "content");
        Composer h = composer.h(686532295);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                z2 = z;
                if (h.a(z)) {
                    i7 = 4;
                    i3 = i7 | i;
                }
            } else {
                z2 = z;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            if ((i2 & 2) == 0) {
                nb5Var2 = nb5Var;
                if (h.S(nb5Var2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                nb5Var2 = nb5Var;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            nb5Var2 = nb5Var;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                ro0Var2 = ro0Var;
                if (h.S(ro0Var2)) {
                    i5 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    i3 |= i5;
                }
            } else {
                ro0Var2 = ro0Var;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            ro0Var2 = ro0Var;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.C(gt2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
            nb5Var3 = nb5Var2;
        } else {
            h.E();
            if ((i & 1) == 0 || h.N()) {
                if ((i2 & 1) != 0) {
                    z2 = r81.a(h, 0);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    nb5Var2 = (nb5) h.m(NytThemeStateKt.a());
                    if (nb5Var2 == null) {
                        nb5Var2 = NytThemeStateKt.b(null, null, h, 0, 3);
                    }
                    i3 &= -113;
                }
                i4 = i3;
                nb5Var3 = nb5Var2;
                if ((i2 & 4) != 0) {
                    i4 &= -897;
                    ro0Var2 = (b() && nb5Var3.b()) ? d(c(z2), 0L, 0L, h, 0, 3) : c(z2);
                }
            } else {
                h.K();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                i4 = i3;
                nb5Var3 = nb5Var2;
            }
            h.u();
            if (b.G()) {
                b.S(686532295, i4, -1, "com.nytimes.android.designsystem.uicompose.ui.NytTheme (NytTheme.kt:76)");
            }
            lb5 a2 = z2 ? mb5.a() : mb5.f();
            CompositionLocalKt.b(new o76[]{NytDesignSystemKt.a().c(new eb5(a2, z2 ? ff8.a() : ff8.d(), new ob5(a2))), NytThemeStateKt.a().c(nb5Var3), ComposablePositionsKt.b().c(nb5Var3.a())}, zr0.b(h, -1112380537, true, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.ui.NytThemeKt$NytTheme$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-1112380537, i8, -1, "com.nytimes.android.designsystem.uicompose.ui.NytTheme.<anonymous> (NytTheme.kt:90)");
                    }
                    MaterialThemeKt.a(ro0.this, null, null, gt2Var, composer2, 0, 6);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 56);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            final boolean z3 = z2;
            final nb5 nb5Var4 = nb5Var3;
            final ro0 ro0Var3 = ro0Var2;
            k.a(new gt2() { // from class: com.nytimes.android.designsystem.uicompose.ui.NytThemeKt$NytTheme$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i8) {
                    NytThemeKt.a(z3, nb5Var4, ro0Var3, gt2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    private static final boolean b() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static final ro0 c(boolean z) {
        return z ? b : a;
    }

    private static final ro0 d(ro0 ro0Var, long j, long j2, Composer composer, int i, int i2) {
        ro0 a2;
        composer.z(-336493739);
        long a3 = (i2 & 1) != 0 ? fo0.a(R.color.system_accent1_300, composer, 6) : j;
        long a4 = (i2 & 2) != 0 ? fo0.a(R.color.system_accent1_600, composer, 6) : j2;
        if (b.G()) {
            b.S(-336493739, i, -1, "com.nytimes.android.designsystem.uicompose.ui.useMaterialYouAsAccent (NytTheme.kt:58)");
        }
        a2 = ro0Var.a((r43 & 1) != 0 ? ro0Var.j() : 0L, (r43 & 2) != 0 ? ro0Var.k() : 0L, (r43 & 4) != 0 ? ro0Var.l() : a3, (r43 & 8) != 0 ? ro0Var.m() : ro0Var.o() ? a4 : a3, (r43 & 16) != 0 ? ro0Var.c() : 0L, (r43 & 32) != 0 ? ro0Var.n() : 0L, (r43 & 64) != 0 ? ro0Var.d() : 0L, (r43 & 128) != 0 ? ro0Var.g() : 0L, (r43 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? ro0Var.h() : wn0.i(a3) > 0.5f ? nn0.b.a() : nn0.b.h(), (r43 & 512) != 0 ? ro0Var.e() : 0L, (r43 & 1024) != 0 ? ro0Var.i() : 0L, (r43 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? ro0Var.f() : 0L, (r43 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? ro0Var.o() : false);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }
}
