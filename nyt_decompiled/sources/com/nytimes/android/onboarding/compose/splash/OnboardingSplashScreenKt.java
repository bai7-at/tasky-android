package com.nytimes.android.onboarding.compose.splash;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import defpackage.ap0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class OnboardingSplashScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final qs2 qs2Var, final ss2 ss2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(300582990);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(ss2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(300582990, i2, -1, "com.nytimes.android.onboarding.compose.splash.FadeOutToNextScreen (OnboardingSplashScreen.kt:52)");
            }
            ww8 ww8Var = ww8.a;
            h.z(-545666893);
            boolean z = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & 14) == 4);
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new OnboardingSplashScreenKt$FadeOutToNextScreen$1$1(ss2Var, qs2Var, null);
                h.q(A);
            }
            h.R();
            py1.d(ww8Var, (gt2) A, h, 70);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.splash.OnboardingSplashScreenKt$FadeOutToNextScreen$2
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
                    OnboardingSplashScreenKt.a(qs2.this, ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        zq3.h(qs2Var, "nextScreen");
        Composer h = composer.h(850399135);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(850399135, i2, -1, "com.nytimes.android.onboarding.compose.splash.OnboardingSplashScreen (OnboardingSplashScreen.kt:24)");
            }
            h.z(-40549452);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = b0.e(Boolean.TRUE, null, 2, null);
                h.q(A);
            }
            final sy4 sy4Var = (sy4) A;
            h.R();
            h.z(-40549382);
            Object A2 = h.A();
            if (A2 == aVar.a()) {
                A2 = new ss2() { // from class: com.nytimes.android.onboarding.compose.splash.OnboardingSplashScreenKt$OnboardingSplashScreen$1$1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z) {
                        OnboardingSplashScreenKt.d(sy4.this, z);
                    }
                };
                h.q(A2);
            }
            h.R();
            a(qs2Var, (ss2) A2, h, (i2 & 14) | 48);
            Modifier f = SizeKt.f(Modifier.a, 0.0f, 1, null);
            Arrangement.f b = Arrangement.a.b();
            Alignment.b g = Alignment.a.g();
            h.z(-483455358);
            rg4 a = d.a(b, g, h, 54);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(f);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            Composer a4 = Updater.a(h);
            Updater.c(a4, a, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            AnimatedVisibilityKt.d(ap0.a, c(sy4Var), null, null, EnterExitTransitionKt.q(null, 0.0f, 3, null), null, ComposableSingletons$OnboardingSplashScreenKt.a.a(), h, 1597446, 22);
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.splash.OnboardingSplashScreenKt$OnboardingSplashScreen$3
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
                    OnboardingSplashScreenKt.b(qs2.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final boolean c(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }
}
