package com.nytimes.android.onboarding.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.features.notifications.push.NotificationsPermissionProviderKt;
import com.nytimes.android.features.notifications.push.NotificationsScreenKt;
import com.nytimes.android.push.NotificationsGroupItems;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import com.nytimes.piano.PianoSpacing;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fb0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m37;
import defpackage.n37;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ve0;
import defpackage.ww8;
import defpackage.xe0;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class OnboardingScaffoldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(802679052);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(802679052, i2, -1, "com.nytimes.android.onboarding.compose.ContinueButton (OnboardingScaffold.kt:105)");
            }
            SurfaceKt.a(SizeKt.h(Modifier.a, 0.0f, 1, null), null, 0L, 0L, null, bu1.g(16), zr0.b(h, -1373036472, true, new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$ContinueButton$1
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
                        androidx.compose.runtime.b.S(-1373036472, i3, -1, "com.nytimes.android.onboarding.compose.ContinueButton.<anonymous> (OnboardingScaffold.kt:107)");
                    }
                    Arrangement.e c = Arrangement.a.c();
                    Alignment.c i4 = Alignment.a.i();
                    qs2 qs2Var2 = qs2.this;
                    composer2.z(693286680);
                    Modifier.a aVar = Modifier.a;
                    rg4 a = m.a(c, i4, composer2, 54);
                    composer2.z(-1323940314);
                    int a2 = cs0.a(composer2, 0);
                    et0 o = composer2.o();
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a3 = companion.a();
                    it2 c2 = LayoutKt.c(aVar);
                    if (composer2.j() == null) {
                        cs0.c();
                    }
                    composer2.G();
                    if (composer2.f()) {
                        composer2.D(a3);
                    } else {
                        composer2.p();
                    }
                    Composer a4 = Updater.a(composer2);
                    Updater.c(a4, a, companion.e());
                    Updater.c(a4, o, companion.g());
                    gt2 b = companion.b();
                    if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                        a4.q(Integer.valueOf(a2));
                        a4.v(Integer.valueOf(a2), b);
                    }
                    c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                    composer2.z(2058660585);
                    n37 n37Var = n37.a;
                    OnboardingScaffoldKt.b("Continue", eb5.Companion.c(composer2, 8).v0(), androidx.compose.material.a.a.a(nn0.b.f(), 0L, 0L, 0L, composer2, (androidx.compose.material.a.l << 12) | 6, 14), qs2Var2, composer2, 6);
                    composer2.R();
                    composer2.t();
                    composer2.R();
                    composer2.R();
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, 1769478, 30);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$ContinueButton$2
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
                    OnboardingScaffoldKt.a(qs2.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final String str, final j jVar, final ve0 ve0Var, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(265614932);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(jVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(ve0Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.C(qs2Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(265614932, i3, -1, "com.nytimes.android.onboarding.compose.FlatTextButton (OnboardingScaffold.kt:129)");
            }
            Modifier.a aVar = Modifier.a;
            float g = bu1.g(PianoSpacing.spacing_1.getInDp());
            PianoSpacing pianoSpacing = PianoSpacing.spacing_1_5;
            Modifier d = ModifierUtilsKt.d(PaddingKt.l(aVar, g, bu1.g(pianoSpacing.getInDp()), bu1.g(PianoSpacing.spacing_2.getInDp()), bu1.g(pianoSpacing.getInDp())), str);
            eb0 a = fb0.a(bu1.g(1), eb5.Companion.a(h, 8).S());
            float f = 0;
            xe0 b = androidx.compose.material.a.a.b(bu1.g(f), bu1.g(f), 0.0f, 0.0f, 0.0f, h, (androidx.compose.material.a.l << 15) | 54, 28);
            float f2 = 12;
            ym5 b2 = PaddingKt.b(bu1.g(f2), bu1.g(f2));
            h.z(1813376282);
            boolean z = (i3 & 7168) == 2048;
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$FlatTextButton$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m619invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m619invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            ButtonKt.a((qs2) A, d, false, null, b, null, a, ve0Var, b2, zr0.b(h, 476665412, true, new it2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$FlatTextButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer2, int i4) {
                    zq3.h(m37Var, "$this$Button");
                    if ((i4 & 81) == 16 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(476665412, i4, -1, "com.nytimes.android.onboarding.compose.FlatTextButton.<anonymous> (OnboardingScaffold.kt:156)");
                    }
                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar, composer2, 0, 0, 65534);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, ((i3 << 15) & 29360128) | 905969664, 44);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$FlatTextButton$3
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
                    OnboardingScaffoldKt.b(str, jVar, ve0Var, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void c(final int i, final int i2, final qs2 qs2Var, final List list, final it2 it2Var, Boolean bool, Composer composer, final int i3, final int i4) {
        zq3.h(qs2Var, "nextScreen");
        zq3.h(list, "notificationGroups");
        zq3.h(it2Var, "onSubscriptionChanged");
        Composer h = composer.h(338681376);
        final Boolean bool2 = (i4 & 32) != 0 ? null : bool;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(338681376, i3, -1, "com.nytimes.android.onboarding.compose.NotificationsScreenScaffold (OnboardingScaffold.kt:75)");
        }
        d(i, i2, zr0.b(h, -2037735456, true, new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$NotificationsScreenScaffold$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i5) {
                if ((i5 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-2037735456, i5, -1, "com.nytimes.android.onboarding.compose.NotificationsScreenScaffold.<anonymous> (OnboardingScaffold.kt:79)");
                }
                composer2.z(51854148);
                boolean S = composer2.S(qs2.this);
                final qs2 qs2Var2 = qs2.this;
                Object A = composer2.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$NotificationsScreenScaffold$1$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m620invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m620invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer2.q(A);
                }
                composer2.R();
                OnboardingScaffoldKt.a((qs2) A, composer2, 0);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), zr0.b(h, -184382818, true, new it2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$NotificationsScreenScaffold$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(it2 it2Var2, Composer composer2, int i5) {
                zq3.h(it2Var2, "pageHeader");
                if ((i5 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-184382818, i5, -1, "com.nytimes.android.onboarding.compose.NotificationsScreenScaffold.<anonymous> (OnboardingScaffold.kt:81)");
                }
                Boolean bool3 = bool2;
                final List<NotificationsGroupItems> list2 = list;
                final it2 it2Var3 = it2Var;
                NotificationsPermissionProviderKt.a(bool3, zr0.b(composer2, 1259579586, true, new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$NotificationsScreenScaffold$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(1259579586, i6, -1, "com.nytimes.android.onboarding.compose.NotificationsScreenScaffold.<anonymous>.<anonymous> (OnboardingScaffold.kt:83)");
                        }
                        NotificationsScreenKt.e(null, list2, it2Var3, ComposableSingletons$OnboardingScaffoldKt.a.a(), null, composer3, 3136, 17);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer2, 48, 0);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((it2) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h, (i3 & 14) | 3456 | (i3 & ContentType.LONG_FORM_ON_DEMAND));
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$NotificationsScreenScaffold$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    OnboardingScaffoldKt.c(i, i2, qs2Var, list, it2Var, bool2, composer2, gt6.a(i3 | 1), i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final int i, final int i2, final gt2 gt2Var, final it2 it2Var, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Composer h = composer.h(677679649);
        if ((i3 & 14) == 0) {
            i4 = (h.d(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.d(i2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= h.C(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= h.C(it2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i4 & 5851) == 1170 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(677679649, i4, -1, "com.nytimes.android.onboarding.compose.OnboardingScaffold (OnboardingScaffold.kt:47)");
            }
            composer2 = h;
            ScaffoldKt.b(WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, h, 8)), null, null, zr0.b(h, -854338073, true, new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$OnboardingScaffold$1
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
                        androidx.compose.runtime.b.S(-854338073, i5, -1, "com.nytimes.android.onboarding.compose.OnboardingScaffold.<anonymous> (OnboardingScaffold.kt:58)");
                    }
                    Modifier h2 = SizeKt.h(Modifier.a, 0.0f, 1, null);
                    gt2 gt2Var2 = gt2.this;
                    composer3.z(733328855);
                    rg4 g = BoxKt.g(Alignment.a.o(), false, composer3, 0);
                    composer3.z(-1323940314);
                    int a = cs0.a(composer3, 0);
                    et0 o = composer3.o();
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a2 = companion.a();
                    it2 c = LayoutKt.c(h2);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a2);
                    } else {
                        composer3.p();
                    }
                    Composer a3 = Updater.a(composer3);
                    Updater.c(a3, g, companion.e());
                    Updater.c(a3, o, companion.g());
                    gt2 b = companion.b();
                    if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                        a3.q(Integer.valueOf(a));
                        a3.v(Integer.valueOf(a), b);
                    }
                    c.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                    gt2Var2.invoke(composer3, 0);
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(h, 1472738783, true, new it2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$OnboardingScaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(ym5 ym5Var, Composer composer3, int i5) {
                    zq3.h(ym5Var, "insets");
                    if ((i5 & 14) == 0) {
                        i5 |= composer3.S(ym5Var) ? 4 : 2;
                    }
                    if ((i5 & 91) == 18 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(1472738783, i5, -1, "com.nytimes.android.onboarding.compose.OnboardingScaffold.<anonymous> (OnboardingScaffold.kt:51)");
                    }
                    Modifier h2 = PaddingKt.h(Modifier.a, ym5Var);
                    it2 it2Var2 = it2.this;
                    final int i6 = i;
                    final int i7 = i2;
                    composer3.z(-483455358);
                    rg4 a = androidx.compose.foundation.layout.d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                    composer3.z(-1323940314);
                    int a2 = cs0.a(composer3, 0);
                    et0 o = composer3.o();
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a3 = companion.a();
                    it2 c = LayoutKt.c(h2);
                    if (composer3.j() == null) {
                        cs0.c();
                    }
                    composer3.G();
                    if (composer3.f()) {
                        composer3.D(a3);
                    } else {
                        composer3.p();
                    }
                    Composer a4 = Updater.a(composer3);
                    Updater.c(a4, a, companion.e());
                    Updater.c(a4, o, companion.g());
                    gt2 b = companion.b();
                    if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                        a4.q(Integer.valueOf(a2));
                        a4.v(Integer.valueOf(a2), b);
                    }
                    c.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                    composer3.z(2058660585);
                    ap0 ap0Var = ap0.a;
                    it2Var2.invoke(zr0.b(composer3, 454838755, true, new it2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$OnboardingScaffold$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void b(Modifier modifier, Composer composer4, int i8) {
                            zq3.h(modifier, "modifier");
                            if ((i8 & 14) == 0) {
                                i8 |= composer4.S(modifier) ? 4 : 2;
                            }
                            if ((i8 & 91) == 18 && composer4.i()) {
                                composer4.K();
                                return;
                            }
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.S(454838755, i8, -1, "com.nytimes.android.onboarding.compose.OnboardingScaffold.<anonymous>.<anonymous>.<anonymous> (OnboardingScaffold.kt:54)");
                            }
                            OnboardingScaffoldKt.e(modifier, i6, i7, composer4, i8 & 14, 0);
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.R();
                            }
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }
                    }), composer3, 6);
                    composer3.R();
                    composer3.t();
                    composer3.R();
                    composer3.R();
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), composer2, 3072, 12582912, 131062);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$OnboardingScaffold$3
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
                    OnboardingScaffoldKt.d(i, i2, gt2Var, it2Var, composer3, gt6.a(i3 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Modifier modifier, final int i, final int i2, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        Composer composer2;
        Composer h = composer.h(-113485368);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 14) == 0) {
            modifier2 = modifier;
            i5 = (h.S(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i5 |= h.d(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            i5 |= h.d(i2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i5 & 731) == 146 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            Modifier modifier3 = i6 != 0 ? Modifier.a : modifier2;
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-113485368, i5, -1, "com.nytimes.android.onboarding.compose.PageHeader (OnboardingScaffold.kt:94)");
            }
            h.z(-483455358);
            rg4 a = androidx.compose.foundation.layout.d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(modifier3);
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
            SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(PianoSpacing.spacing_4.getInDp())), h, 0);
            composer2 = h;
            TextKt.c(i + " of " + i2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).A0(), composer2, 0, 0, 65534);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            modifier2 = modifier3;
        }
        cc7 k = composer2.k();
        if (k != null) {
            final Modifier modifier4 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScaffoldKt$PageHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i7) {
                    OnboardingScaffoldKt.e(Modifier.this, i, i2, composer3, gt6.a(i3 | 1), i4);
                }
            });
        }
    }
}
