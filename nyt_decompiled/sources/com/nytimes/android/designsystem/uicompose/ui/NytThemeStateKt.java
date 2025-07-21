package com.nytimes.android.designsystem.uicompose.ui;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import defpackage.bs0;
import defpackage.m76;
import defpackage.nb5;
import defpackage.qs2;
import defpackage.s5;
import defpackage.tk8;
import defpackage.uk8;
import defpackage.z12;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class NytThemeStateKt {
    private static final m76 a = CompositionLocalKt.d(null, new qs2() { // from class: com.nytimes.android.designsystem.uicompose.ui.NytThemeStateKt$LocalNytThemeState$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final nb5 mo865invoke() {
            return null;
        }
    }, 1, null);

    public static final m76 a() {
        return a;
    }

    public static final nb5 b(uk8 uk8Var, bs0 bs0Var, Composer composer, int i, int i2) {
        composer.z(-1130517322);
        if ((i2 & 1) != 0) {
            composer.z(1396128245);
            ComponentActivity d = s5.d(composer, 0);
            composer.z(363804603);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                try {
                    zq3.e(d);
                    A = z12.a(d, tk8.class);
                } catch (Exception unused) {
                    A = null;
                }
                composer.q(A);
            }
            composer.R();
            composer.R();
            tk8 tk8Var = (tk8) A;
            uk8Var = tk8Var != null ? tk8Var.k() : null;
        }
        if ((i2 & 2) != 0) {
            composer.z(1617963449);
            Object A2 = composer.A();
            if (A2 == Composer.a.a()) {
                A2 = new bs0();
                composer.q(A2);
            }
            bs0Var = (bs0) A2;
            composer.R();
        }
        if (b.G()) {
            b.S(-1130517322, i, -1, "com.nytimes.android.designsystem.uicompose.ui.rememberNytThemeState (NytThemeState.kt:22)");
        }
        nb5 nb5Var = new nb5(uk8Var != null ? uk8Var.l() : false, bs0Var);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return nb5Var;
    }
}
