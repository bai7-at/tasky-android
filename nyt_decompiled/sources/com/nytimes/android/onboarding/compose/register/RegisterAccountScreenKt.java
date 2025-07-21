package com.nytimes.android.onboarding.compose.register;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.ac0;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.do5;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.rl6;
import defpackage.ve0;
import defpackage.ve6;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class RegisterAccountScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Composer composer, final int i) {
        Composer h = composer.h(-585471625);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-585471625, i, -1, "com.nytimes.android.onboarding.compose.register.AccessOptions (RegisterAccountScreen.kt:95)");
            }
            Alignment.b k = Alignment.a.k();
            h.z(-483455358);
            Modifier.a aVar = Modifier.a;
            rg4 a = d.a(Arrangement.a.g(), k, h, 48);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(aVar);
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
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            SpacerKt.a(PaddingKt.m(aVar, 0.0f, bu1.g(30), 0.0f, 0.0f, 13, null), h, 6);
            b(ve6.ftux_ic_lock_icon, rl6.offline_image_description, rl6.regi_account_unlock_copy, h, 0);
            float f = 8;
            SpacerKt.a(PaddingKt.m(aVar, 0.0f, bu1.g(f), 0.0f, 0.0f, 13, null), h, 6);
            b(ve6.ftux_ic_offline_reading, rl6.offline_image_description, rl6.offline_copy, h, 0);
            SpacerKt.a(PaddingKt.m(aVar, 0.0f, bu1.g(f), 0.0f, 0.0f, 13, null), h, 6);
            b(ve6.ftux_ic_comments_icon, rl6.offline_image_description, rl6.regi_account_discussion_copy, h, 0);
            SpacerKt.a(PaddingKt.m(aVar, 0.0f, bu1.g(f), 0.0f, 0.0f, 13, null), h, 6);
            b(ve6.ftux_ic_favorites, rl6.offline_image_description, rl6.favorites_copy, h, 0);
            SpacerKt.a(PaddingKt.m(aVar, 0.0f, bu1.g(f), 0.0f, 0.0f, 13, null), h, 6);
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.register.RegisterAccountScreenKt$AccessOptions$2
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
                    RegisterAccountScreenKt.a(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final int i, final int i2, final int i3, Composer composer, final int i4) {
        int i5;
        Composer composer2;
        Composer h = composer.h(1442125198);
        if ((i4 & 14) == 0) {
            i5 = (h.d(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i5 |= h.d(i2) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= h.d(i3) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i6 = i5;
        if ((i6 & 731) == 146 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1442125198, i6, -1, "com.nytimes.android.onboarding.compose.register.AccountAccessOption (RegisterAccountScreen.kt:126)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier m = PaddingKt.m(aVar, 0.0f, 0.0f, 0.0f, bu1.g(20), 7, null);
            Arrangement.f b = Arrangement.a.b();
            Alignment.a aVar2 = Alignment.a;
            Alignment.c i7 = aVar2.i();
            h.z(693286680);
            rg4 a = m.a(b, i7, h, 54);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(m);
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
            n37 n37Var = n37.a;
            eb5.a aVar3 = eb5.Companion;
            IconKt.b(do5.d(i, h, i6 & 14), k48.b(i2, h, (i6 >> 3) & 14), n37Var.c(aVar, aVar2.i()), aVar3.a(h, 8).l(), h, 8, 0);
            SpacerKt.a(PaddingKt.m(aVar, 0.0f, 0.0f, bu1.g(10), 0.0f, 11, null), h, 6);
            composer2 = h;
            TextKt.c(k48.b(i3, h, (i6 >> 6) & 14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.c(h, 8).M0(), composer2, 0, 0, 65534);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.register.RegisterAccountScreenKt$AccountAccessOption$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i8) {
                    RegisterAccountScreenKt.b(i, i2, i3, composer3, gt6.a(i4 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final ac0 ac0Var, final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(1303711503);
        if ((i & 14) == 0) {
            i2 = (h.S(ac0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(qs2Var2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i3 = i2;
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1303711503, i3, -1, "com.nytimes.android.onboarding.compose.register.CTAButtons (RegisterAccountScreen.kt:59)");
            }
            Modifier.a aVar = Modifier.a;
            Alignment.a aVar2 = Alignment.a;
            Modifier m = PaddingKt.m(ac0Var.c(aVar, aVar2.b()), 0.0f, 0.0f, 0.0f, bu1.g(16), 7, null);
            Alignment.b g = aVar2.g();
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), g, h, 48);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(m);
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
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            Modifier h2 = SizeKt.h(PaddingKt.k(aVar, bu1.g(24), 0.0f, 2, null), 0.0f, 1, null);
            a aVar3 = a.a;
            eb5.a aVar4 = eb5.Companion;
            ve0 a5 = aVar3.a(aVar4.a(h, 8).f(), aVar4.a(h, 8).o(), 0L, 0L, h, a.l << 12, 12);
            h.z(2065384814);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.onboarding.compose.register.RegisterAccountScreenKt$CTAButtons$1$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m634invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m634invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            ComposableSingletons$RegisterAccountScreenKt composableSingletons$RegisterAccountScreenKt = ComposableSingletons$RegisterAccountScreenKt.a;
            ButtonKt.a((qs2) A, h2, false, null, null, null, null, a5, null, composableSingletons$RegisterAccountScreenKt.a(), h, 805306416, 380);
            Modifier d = ModifierUtilsKt.d(aVar, "Not now");
            h.z(2065385336);
            boolean z2 = (i3 & 896) == 256;
            Object A2 = h.A();
            if (z2 || A2 == Composer.a.a()) {
                A2 = new qs2() { // from class: com.nytimes.android.onboarding.compose.register.RegisterAccountScreenKt$CTAButtons$1$2$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m635invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m635invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A2);
            }
            h.R();
            composer2 = h;
            ButtonKt.d((qs2) A2, d, false, null, null, null, null, null, null, composableSingletons$RegisterAccountScreenKt.b(), h, 805306368, 508);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.register.RegisterAccountScreenKt$CTAButtons$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    RegisterAccountScreenKt.c(ac0.this, qs2Var, qs2Var2, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Composer composer, final int i) {
        Composer composer2;
        Composer h = composer.h(333419438);
        if (i == 0 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(333419438, i, -1, "com.nytimes.android.onboarding.compose.register.CTASection (RegisterAccountScreen.kt:42)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier k = PaddingKt.k(aVar, bu1.g(24), 0.0f, 2, null);
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(k);
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
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            BoxKt.a(SizeKt.c(aVar, 0.2f), h, 6);
            composer2 = h;
            TextKt.c(k48.b(rl6.regi_account_copy, h, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).N0(), composer2, 0, 0, 65534);
            a(composer2, 0);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = composer2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.register.RegisterAccountScreenKt$CTASection$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i2) {
                    RegisterAccountScreenKt.d(composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void e(final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        zq3.h(qs2Var, "createAccount");
        zq3.h(qs2Var2, "nextScreen");
        Composer h = composer.h(1959444399);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1959444399, i2, -1, "com.nytimes.android.onboarding.compose.register.RegisterAccountScreen (RegisterAccountScreen.kt:34)");
            }
            Modifier f = SizeKt.f(Modifier.a, 0.0f, 1, null);
            h.z(733328855);
            rg4 g = BoxKt.g(Alignment.a.o(), false, h, 0);
            h.z(-1323940314);
            int a = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 c = LayoutKt.c(f);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, o, companion.g());
            gt2 b = companion.b();
            if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                a3.q(Integer.valueOf(a));
                a3.v(Integer.valueOf(a), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            d(h, 0);
            int i3 = i2 << 3;
            c(boxScopeInstance, qs2Var, qs2Var2, h, (i3 & 896) | (i3 & ContentType.LONG_FORM_ON_DEMAND) | 6);
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
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.register.RegisterAccountScreenKt$RegisterAccountScreen$2
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
                    RegisterAccountScreenKt.e(qs2.this, qs2Var2, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
