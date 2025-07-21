package com.nytimes.subauth.ui.purr.ui.screens;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.nytimes.android.composeui.notice.ShowSnackbarKt;
import com.nytimes.android.composeui.notice.a;
import com.nytimes.android.composeui.webview.WebviewScreenKt;
import com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel;
import com.nytimes.subauth.ui.purr.ui.screens.a;
import com.nytimes.subauth.ui.purr.ui.theme.ThemeKt;
import defpackage.PrivacySettingsScreenKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ka7;
import defpackage.m25;
import defpackage.m36;
import defpackage.mm6;
import defpackage.n25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class PrivacySettingsContainerScreenKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PrivacySettingsSnackbarState.values().length];
            try {
                iArr[PrivacySettingsSnackbarState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivacySettingsSnackbarState.CCPA_REGI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivacySettingsSnackbarState.CCPA_ANON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrivacySettingsSnackbarState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrivacySettingsSnackbarState.ERROR_DEVICE_OFFLINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public static final void a(final PrivacySettingsViewModel privacySettingsViewModel, final x08 x08Var, Composer composer, final int i) {
        zq3.h(privacySettingsViewModel, "viewModel");
        zq3.h(x08Var, "snackbarState");
        Composer h = composer.h(-360372520);
        if (b.G()) {
            b.S(-360372520, i, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen (PrivacySettingsContainerScreen.kt:31)");
        }
        final ka7 l = ScaffoldKt.l(null, null, h, 0, 3);
        final n25 e = NavHostControllerKt.e(new Navigator[0], h, 8);
        final Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        h.z(2035753366);
        if (x08Var.getValue() != PrivacySettingsSnackbarState.NONE) {
            ShowSnackbarKt.a(l.b(), b((PrivacySettingsSnackbarState) x08Var.getValue()), new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt$PrivacySettingsContainerScreen$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m796invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m796invoke() {
                    PrivacySettingsViewModel.this.D();
                }
            }, h, com.nytimes.android.composeui.notice.a.a << 3);
        }
        h.R();
        ScaffoldKt.b(WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, h, 8)), null, null, null, zr0.b(h, -1718901505, true, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt$PrivacySettingsContainerScreen$2
            {
                super(3);
            }

            public final void b(SnackbarHostState snackbarHostState, Composer composer2, int i2) {
                zq3.h(snackbarHostState, "it");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1718901505, i2, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous> (PrivacySettingsContainerScreen.kt:46)");
                }
                SnackbarHostKt.b(ka7.this.b(), null, null, composer2, 0, 6);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(h, 135732314, true, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt$PrivacySettingsContainerScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(final ym5 ym5Var, Composer composer2, int i2) {
                zq3.h(ym5Var, "it");
                if ((i2 & 14) == 0) {
                    i2 |= composer2.S(ym5Var) ? 4 : 2;
                }
                if ((i2 & 91) == 18 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(135732314, i2, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous> (PrivacySettingsContainerScreen.kt:49)");
                }
                final n25 n25Var = n25.this;
                final PrivacySettingsViewModel privacySettingsViewModel2 = privacySettingsViewModel;
                final Context context2 = context;
                ThemeKt.a(false, zr0.b(composer2, -213728562, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt$PrivacySettingsContainerScreen$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-213728562, i3, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous>.<anonymous> (PrivacySettingsContainerScreen.kt:50)");
                        }
                        long c = m36.a.a(composer3, 6).b().c();
                        Modifier h2 = PaddingKt.h(Modifier.a, ym5.this);
                        final n25 n25Var2 = n25Var;
                        final PrivacySettingsViewModel privacySettingsViewModel3 = privacySettingsViewModel2;
                        final Context context3 = context2;
                        SurfaceKt.a(h2, null, c, 0L, null, 0.0f, zr0.b(composer3, 595682322, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer4, int i4) {
                                if ((i4 & 11) == 2 && composer4.i()) {
                                    composer4.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(595682322, i4, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous>.<anonymous>.<anonymous> (PrivacySettingsContainerScreen.kt:54)");
                                }
                                n25 n25Var3 = n25.this;
                                String a2 = a.e.b.a();
                                final PrivacySettingsViewModel privacySettingsViewModel4 = privacySettingsViewModel3;
                                final n25 n25Var4 = n25.this;
                                final Context context4 = context3;
                                NavHostKt.c(n25Var3, a2, null, null, new ss2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((m25) obj);
                                        return ww8.a;
                                    }

                                    public final void invoke(m25 m25Var) {
                                        zq3.h(m25Var, "$this$NavHost");
                                        String a3 = a.e.b.a();
                                        final PrivacySettingsViewModel privacySettingsViewModel5 = PrivacySettingsViewModel.this;
                                        final n25 n25Var5 = n25Var4;
                                        final Context context5 = context4;
                                        NavGraphBuilderKt.d(m25Var, a3, null, null, zr0.c(1932677677, true, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            public final void b(NavBackStackEntry navBackStackEntry, Composer composer5, int i5) {
                                                zq3.h(navBackStackEntry, "it");
                                                if (b.G()) {
                                                    b.S(1932677677, i5, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrivacySettingsContainerScreen.kt:59)");
                                                }
                                                x08 b = y.b(PrivacySettingsViewModel.this.w(), null, composer5, 8, 1);
                                                n25 n25Var6 = n25Var5;
                                                final PrivacySettingsViewModel privacySettingsViewModel6 = PrivacySettingsViewModel.this;
                                                qs2 qs2Var = new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.1.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // defpackage.qs2
                                                    /* renamed from: invoke */
                                                    public final Boolean mo865invoke() {
                                                        return Boolean.valueOf(PrivacySettingsViewModel.this.t());
                                                    }
                                                };
                                                final PrivacySettingsViewModel privacySettingsViewModel7 = PrivacySettingsViewModel.this;
                                                final Context context6 = context5;
                                                PrivacySettingsScreenKt.a(b, n25Var6, qs2Var, new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // defpackage.qs2
                                                    /* renamed from: invoke */
                                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                        m797invoke();
                                                        return ww8.a;
                                                    }

                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m797invoke() {
                                                        PrivacySettingsViewModel.this.E(context6);
                                                    }
                                                }, composer5, 64);
                                                if (b.G()) {
                                                    b.R();
                                                }
                                            }

                                            @Override // defpackage.it2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return ww8.a;
                                            }
                                        }), 6, null);
                                        String a4 = a.g.b.a();
                                        final PrivacySettingsViewModel privacySettingsViewModel6 = PrivacySettingsViewModel.this;
                                        final n25 n25Var6 = n25Var4;
                                        NavGraphBuilderKt.d(m25Var, a4, null, null, zr0.c(-2114916266, true, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            public final void b(NavBackStackEntry navBackStackEntry, Composer composer5, int i5) {
                                                zq3.h(navBackStackEntry, "it");
                                                if (b.G()) {
                                                    b.S(-2114916266, i5, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrivacySettingsContainerScreen.kt:69)");
                                                }
                                                x08 b = y.b(PrivacySettingsViewModel.this.A(), null, composer5, 8, 1);
                                                final PrivacySettingsViewModel privacySettingsViewModel7 = PrivacySettingsViewModel.this;
                                                YourPrivacyChoicesScreenKt.a(b, new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.2.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // defpackage.qs2
                                                    /* renamed from: invoke */
                                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                        m798invoke();
                                                        return ww8.a;
                                                    }

                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m798invoke() {
                                                        PrivacySettingsViewModel.this.F();
                                                    }
                                                }, n25Var6, composer5, 512);
                                                if (b.G()) {
                                                    b.R();
                                                }
                                            }

                                            @Override // defpackage.it2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return ww8.a;
                                            }
                                        }), 6, null);
                                        String a5 = a.b.b.a();
                                        final PrivacySettingsViewModel privacySettingsViewModel7 = PrivacySettingsViewModel.this;
                                        NavGraphBuilderKt.d(m25Var, a5, null, null, zr0.c(-2063872651, true, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.3
                                            {
                                                super(3);
                                            }

                                            public final void b(NavBackStackEntry navBackStackEntry, Composer composer5, int i5) {
                                                zq3.h(navBackStackEntry, "it");
                                                if (b.G()) {
                                                    b.S(-2063872651, i5, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrivacySettingsContainerScreen.kt:76)");
                                                }
                                                final PrivacySettingsViewModel privacySettingsViewModel8 = PrivacySettingsViewModel.this;
                                                WebviewScreenKt.a("https://www.nytimes.com/cookie-policy?gdpr-purr=true", new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.3.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // defpackage.qs2
                                                    /* renamed from: invoke */
                                                    public final Boolean mo865invoke() {
                                                        return Boolean.valueOf(PrivacySettingsViewModel.this.C());
                                                    }
                                                }, null, null, false, null, null, null, null, composer5, 6, 508);
                                                if (b.G()) {
                                                    b.R();
                                                }
                                            }

                                            @Override // defpackage.it2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return ww8.a;
                                            }
                                        }), 6, null);
                                        String a6 = a.C0462a.b.a();
                                        final PrivacySettingsViewModel privacySettingsViewModel8 = PrivacySettingsViewModel.this;
                                        NavGraphBuilderKt.d(m25Var, a6, null, null, zr0.c(-2012829036, true, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.4
                                            {
                                                super(3);
                                            }

                                            public final void b(NavBackStackEntry navBackStackEntry, Composer composer5, int i5) {
                                                zq3.h(navBackStackEntry, "it");
                                                if (b.G()) {
                                                    b.S(-2012829036, i5, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrivacySettingsContainerScreen.kt:82)");
                                                }
                                                final PrivacySettingsViewModel privacySettingsViewModel9 = PrivacySettingsViewModel.this;
                                                WebviewScreenKt.a("https://help.nytimes.com/hc/en-us/articles/10940941449492#california-notice", new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.4.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // defpackage.qs2
                                                    /* renamed from: invoke */
                                                    public final Boolean mo865invoke() {
                                                        return Boolean.valueOf(PrivacySettingsViewModel.this.C());
                                                    }
                                                }, null, null, false, null, null, null, null, composer5, 6, 508);
                                                if (b.G()) {
                                                    b.R();
                                                }
                                            }

                                            @Override // defpackage.it2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return ww8.a;
                                            }
                                        }), 6, null);
                                        String a7 = a.d.b.a();
                                        final PrivacySettingsViewModel privacySettingsViewModel9 = PrivacySettingsViewModel.this;
                                        NavGraphBuilderKt.d(m25Var, a7, null, null, zr0.c(-1961785421, true, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.5
                                            {
                                                super(3);
                                            }

                                            public final void b(NavBackStackEntry navBackStackEntry, Composer composer5, int i5) {
                                                zq3.h(navBackStackEntry, "it");
                                                if (b.G()) {
                                                    b.S(-1961785421, i5, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrivacySettingsContainerScreen.kt:88)");
                                                }
                                                final PrivacySettingsViewModel privacySettingsViewModel10 = PrivacySettingsViewModel.this;
                                                WebviewScreenKt.a("https://help.nytimes.com/hc/en-us/articles/10940941449492-The-New-York-Times-Company-Privacy-Policy-", new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.5.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // defpackage.qs2
                                                    /* renamed from: invoke */
                                                    public final Boolean mo865invoke() {
                                                        return Boolean.valueOf(PrivacySettingsViewModel.this.C());
                                                    }
                                                }, null, null, false, null, null, null, null, composer5, 6, 508);
                                                if (b.G()) {
                                                    b.R();
                                                }
                                            }

                                            @Override // defpackage.it2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return ww8.a;
                                            }
                                        }), 6, null);
                                        String a8 = a.c.b.a();
                                        final PrivacySettingsViewModel privacySettingsViewModel10 = PrivacySettingsViewModel.this;
                                        NavGraphBuilderKt.d(m25Var, a8, null, null, zr0.c(-1910741806, true, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.6
                                            {
                                                super(3);
                                            }

                                            public final void b(NavBackStackEntry navBackStackEntry, Composer composer5, int i5) {
                                                zq3.h(navBackStackEntry, "it");
                                                if (b.G()) {
                                                    b.S(-1910741806, i5, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrivacySettingsContainerScreen.kt:94)");
                                                }
                                                final PrivacySettingsViewModel privacySettingsViewModel11 = PrivacySettingsViewModel.this;
                                                WebviewScreenKt.a("https://www.nytimes.com/privacy", new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.6.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // defpackage.qs2
                                                    /* renamed from: invoke */
                                                    public final Boolean mo865invoke() {
                                                        return Boolean.valueOf(PrivacySettingsViewModel.this.C());
                                                    }
                                                }, null, null, false, null, null, null, null, composer5, 6, 508);
                                                if (b.G()) {
                                                    b.R();
                                                }
                                            }

                                            @Override // defpackage.it2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return ww8.a;
                                            }
                                        }), 6, null);
                                        String a9 = a.f.b.a();
                                        final n25 n25Var7 = n25Var4;
                                        NavGraphBuilderKt.d(m25Var, a9, null, null, zr0.c(-1859698191, true, new it2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.7
                                            {
                                                super(3);
                                            }

                                            public final void b(NavBackStackEntry navBackStackEntry, Composer composer5, int i5) {
                                                zq3.h(navBackStackEntry, "it");
                                                if (b.G()) {
                                                    b.S(-1859698191, i5, -1, "com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrivacySettingsContainerScreen.kt:100)");
                                                }
                                                final n25 n25Var8 = n25.this;
                                                TCFScreensKt.h(null, new qs2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt.PrivacySettingsContainerScreen.3.1.1.1.7.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // defpackage.qs2
                                                    /* renamed from: invoke */
                                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                        m799invoke();
                                                        return ww8.a;
                                                    }

                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m799invoke() {
                                                        n25.this.V();
                                                    }
                                                }, null, composer5, 0, 5);
                                                if (b.G()) {
                                                    b.R();
                                                }
                                            }

                                            @Override // defpackage.it2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                                                return ww8.a;
                                            }
                                        }), 6, null);
                                    }
                                }, composer4, 8, 12);
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        }), composer3, 1572864, 58);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 48, 1);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 24576, 12582912, 131054);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt$PrivacySettingsContainerScreen$4
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
                    PrivacySettingsContainerScreenKt.a(PrivacySettingsViewModel.this, x08Var, composer2, i | 1);
                }
            });
        }
    }

    private static final com.nytimes.android.composeui.notice.a b(PrivacySettingsSnackbarState privacySettingsSnackbarState) {
        int i = a.a[privacySettingsSnackbarState.ordinal()];
        if (i == 1) {
            return a.b.b;
        }
        if (i == 2) {
            return new a.c(mm6.ccpa_opt_out_logged_in);
        }
        if (i == 3) {
            return new a.c(mm6.ccpa_opt_out_anonymous);
        }
        if (i == 4) {
            return new a.c(mm6.ccpa_or_gdpr_error);
        }
        if (i == 5) {
            return a.C0250a.b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
