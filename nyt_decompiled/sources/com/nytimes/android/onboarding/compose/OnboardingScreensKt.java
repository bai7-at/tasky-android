package com.nytimes.android.onboarding.compose;

import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.appsflyer.AppsFlyerProperties;
import com.comscore.streaming.ContentType;
import com.nytimes.android.onboarding.compose.c;
import com.nytimes.android.onboarding.compose.notifications.OnboardingNotificationsViewModel;
import com.nytimes.android.onboarding.compose.register.RegisterAccountScreenKt;
import com.nytimes.android.onboarding.compose.register.RegisterAccountViewModel;
import com.nytimes.android.onboarding.compose.splash.OnboardingSplashScreenKt;
import com.nytimes.android.onboarding.compose.splash.OnboardingSplashViewModel;
import com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsScreenKt;
import com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsViewModel;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import com.nytimes.android.utils.composeutils.ActionUtilsKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.i83;
import defpackage.it2;
import defpackage.jk;
import defpackage.kt2;
import defpackage.m25;
import defpackage.n25;
import defpackage.pa9;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.t21;
import defpackage.uh;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class OnboardingScreensKt {
    public static final void a(final jk jkVar, final SmartLockLifecycleObserver smartLockLifecycleObserver, final SnackbarUtil snackbarUtil, final b bVar, final OnboardingViewModel onboardingViewModel, OnboardingSplashViewModel onboardingSplashViewModel, RegisterAccountViewModel registerAccountViewModel, SubscriptionOptionsViewModel subscriptionOptionsViewModel, OnboardingNotificationsViewModel onboardingNotificationsViewModel, Composer composer, final int i, final int i2) {
        String str;
        int i3;
        OnboardingSplashViewModel onboardingSplashViewModel2;
        int i4;
        RegisterAccountViewModel registerAccountViewModel2;
        SubscriptionOptionsViewModel subscriptionOptionsViewModel2;
        OnboardingNotificationsViewModel onboardingNotificationsViewModel2;
        zq3.h(jkVar, "activity");
        zq3.h(smartLockLifecycleObserver, "smartLock");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(bVar, "navStateConductor");
        zq3.h(onboardingViewModel, "onboardingViewModel");
        Composer h = composer.h(1143366784);
        if ((i2 & 32) != 0) {
            h.z(1890788296);
            sa9 a = LocalViewModelStoreOwner.a.a(h, LocalViewModelStoreOwner.c);
            if (a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t.b a2 = i83.a(a, h, 0);
            h.z(1729797275);
            str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
            i3 = 1729797275;
            q c = pa9.c(OnboardingSplashViewModel.class, a, null, a2, a instanceof androidx.lifecycle.d ? ((androidx.lifecycle.d) a).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
            h.R();
            h.R();
            onboardingSplashViewModel2 = (OnboardingSplashViewModel) c;
            i4 = i & (-458753);
        } else {
            str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
            i3 = 1729797275;
            onboardingSplashViewModel2 = onboardingSplashViewModel;
            i4 = i;
        }
        if ((i2 & 64) != 0) {
            h.z(1890788296);
            sa9 a3 = LocalViewModelStoreOwner.a.a(h, LocalViewModelStoreOwner.c);
            if (a3 == null) {
                throw new IllegalStateException(str);
            }
            t.b a4 = i83.a(a3, h, 0);
            h.z(i3);
            q c2 = pa9.c(RegisterAccountViewModel.class, a3, null, a4, a3 instanceof androidx.lifecycle.d ? ((androidx.lifecycle.d) a3).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
            h.R();
            h.R();
            i4 &= -3670017;
            registerAccountViewModel2 = (RegisterAccountViewModel) c2;
        } else {
            registerAccountViewModel2 = registerAccountViewModel;
        }
        if ((i2 & 128) != 0) {
            h.z(1890788296);
            sa9 a5 = LocalViewModelStoreOwner.a.a(h, LocalViewModelStoreOwner.c);
            if (a5 == null) {
                throw new IllegalStateException(str);
            }
            t.b a6 = i83.a(a5, h, 0);
            h.z(i3);
            q c3 = pa9.c(SubscriptionOptionsViewModel.class, a5, null, a6, a5 instanceof androidx.lifecycle.d ? ((androidx.lifecycle.d) a5).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
            h.R();
            h.R();
            i4 &= -29360129;
            subscriptionOptionsViewModel2 = (SubscriptionOptionsViewModel) c3;
        } else {
            subscriptionOptionsViewModel2 = subscriptionOptionsViewModel;
        }
        if ((i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0) {
            h.z(1890788296);
            sa9 a7 = LocalViewModelStoreOwner.a.a(h, LocalViewModelStoreOwner.c);
            if (a7 == null) {
                throw new IllegalStateException(str);
            }
            t.b a8 = i83.a(a7, h, 0);
            h.z(i3);
            q c4 = pa9.c(OnboardingNotificationsViewModel.class, a7, null, a8, a7 instanceof androidx.lifecycle.d ? ((androidx.lifecycle.d) a7).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
            h.R();
            h.R();
            i4 &= -234881025;
            onboardingNotificationsViewModel2 = (OnboardingNotificationsViewModel) c4;
        } else {
            onboardingNotificationsViewModel2 = onboardingNotificationsViewModel;
        }
        int i5 = i4;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1143366784, i5, -1, "com.nytimes.android.onboarding.compose.OnboardingScreens (OnboardingScreens.kt:37)");
        }
        n25 e = NavHostControllerKt.e(new Navigator[0], h, 8);
        final String str2 = "onboarding";
        final OnboardingSplashViewModel onboardingSplashViewModel3 = onboardingSplashViewModel2;
        final RegisterAccountViewModel registerAccountViewModel3 = registerAccountViewModel2;
        final SubscriptionOptionsViewModel subscriptionOptionsViewModel3 = subscriptionOptionsViewModel2;
        final OnboardingNotificationsViewModel onboardingNotificationsViewModel3 = onboardingNotificationsViewModel2;
        NavHostKt.b(e, "onboarding", null, null, null, null, null, null, null, new ss2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$OnboardingScreens$1
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
                OnboardingScreensKt.e(m25Var, str2, jkVar, snackbarUtil, onboardingViewModel, onboardingSplashViewModel3, registerAccountViewModel3, subscriptionOptionsViewModel3, onboardingNotificationsViewModel3);
            }
        }, h, 56, 508);
        OnboardingNavStateConductorKt.a(jkVar, bVar, e, new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$OnboardingScreens$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m621invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m621invoke() {
                OnboardingViewModel onboardingViewModel2 = OnboardingViewModel.this;
                Lifecycle lifecycle = jkVar.getLifecycle();
                zq3.g(lifecycle, "<get-lifecycle>(...)");
                onboardingViewModel2.l(lifecycle, smartLockLifecycleObserver);
            }
        }, h, 584);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final OnboardingSplashViewModel onboardingSplashViewModel4 = onboardingSplashViewModel2;
            final RegisterAccountViewModel registerAccountViewModel4 = registerAccountViewModel2;
            final SubscriptionOptionsViewModel subscriptionOptionsViewModel4 = subscriptionOptionsViewModel2;
            final OnboardingNotificationsViewModel onboardingNotificationsViewModel4 = onboardingNotificationsViewModel2;
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$OnboardingScreens$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    OnboardingScreensKt.a(jk.this, smartLockLifecycleObserver, snackbarUtil, bVar, onboardingViewModel, onboardingSplashViewModel4, registerAccountViewModel4, subscriptionOptionsViewModel4, onboardingNotificationsViewModel4, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1484829120);
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
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1484829120, i2, -1, "com.nytimes.android.onboarding.compose.TrackingLifecycleEffect (OnboardingScreens.kt:130)");
            }
            h.z(1408481743);
            boolean z = ((i2 & 14) == 4) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$TrackingLifecycleEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(Lifecycle.Event event) {
                        zq3.h(event, "event");
                        if (event == Lifecycle.Event.ON_CREATE) {
                            qs2.this.mo865invoke();
                        }
                        if (event == Lifecycle.Event.ON_RESUME) {
                            qs2Var2.mo865invoke();
                        }
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Lifecycle.Event) obj);
                        return ww8.a;
                    }
                };
                h.q(A);
            }
            h.R();
            ActionUtilsKt.a(null, (ss2) A, h, 0, 1);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$TrackingLifecycleEffect$2
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
                    OnboardingScreensKt.b(qs2.this, qs2Var2, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(m25 m25Var, String str, final Activity activity, final SnackbarUtil snackbarUtil, final OnboardingViewModel onboardingViewModel, final OnboardingSplashViewModel onboardingSplashViewModel, final RegisterAccountViewModel registerAccountViewModel, final SubscriptionOptionsViewModel subscriptionOptionsViewModel, final OnboardingNotificationsViewModel onboardingNotificationsViewModel) {
        NavGraphBuilderKt.f(m25Var, c.e.b.a(), str, null, null, null, null, null, null, new ss2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$onboardingGraph$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((m25) obj);
                return ww8.a;
            }

            public final void invoke(m25 m25Var2) {
                zq3.h(m25Var2, "$this$navigation");
                String a = c.e.b.a();
                final OnboardingSplashViewModel onboardingSplashViewModel2 = OnboardingSplashViewModel.this;
                NavGraphBuilderKt.c(m25Var2, a, null, null, null, null, null, null, zr0.c(1615446061, true, new kt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$onboardingGraph$1.1
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((uh) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                        zq3.h(uhVar, "$this$composable");
                        zq3.h(navBackStackEntry, "it");
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(1615446061, i, -1, "com.nytimes.android.onboarding.compose.onboardingGraph.<anonymous>.<anonymous> (OnboardingScreens.kt:74)");
                        }
                        final OnboardingSplashViewModel onboardingSplashViewModel3 = OnboardingSplashViewModel.this;
                        OnboardingSplashScreenKt.b(new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.1.1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m622invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m622invoke() {
                                OnboardingSplashViewModel.this.f();
                            }
                        }, composer, 0);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), WebSocketProtocol.PAYLOAD_SHORT, null);
                String a2 = c.d.b.a();
                final RegisterAccountViewModel registerAccountViewModel2 = registerAccountViewModel;
                final OnboardingViewModel onboardingViewModel2 = onboardingViewModel;
                final Activity activity2 = activity;
                NavGraphBuilderKt.c(m25Var2, a2, null, null, null, null, null, null, zr0.c(176409444, true, new kt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$onboardingGraph$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((uh) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                        zq3.h(uhVar, "$this$composable");
                        zq3.h(navBackStackEntry, "it");
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(176409444, i, -1, "com.nytimes.android.onboarding.compose.onboardingGraph.<anonymous>.<anonymous> (OnboardingScreens.kt:77)");
                        }
                        final RegisterAccountViewModel registerAccountViewModel3 = RegisterAccountViewModel.this;
                        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.2.1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m623invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m623invoke() {
                                RegisterAccountViewModel.this.k();
                            }
                        };
                        final OnboardingViewModel onboardingViewModel3 = onboardingViewModel2;
                        OnboardingScreensKt.b(qs2Var, new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.2.2
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m624invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m624invoke() {
                                OnboardingViewModel.this.j();
                            }
                        }, composer, 0);
                        final RegisterAccountViewModel registerAccountViewModel4 = RegisterAccountViewModel.this;
                        final Activity activity3 = activity2;
                        qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.2.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m625invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m625invoke() {
                                RegisterAccountViewModel.this.i(activity3);
                            }
                        };
                        final RegisterAccountViewModel registerAccountViewModel5 = RegisterAccountViewModel.this;
                        RegisterAccountScreenKt.e(qs2Var2, new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.2.4
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m626invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m626invoke() {
                                RegisterAccountViewModel.this.j();
                            }
                        }, composer, 0);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), WebSocketProtocol.PAYLOAD_SHORT, null);
                String a3 = c.f.b.a();
                final SubscriptionOptionsViewModel subscriptionOptionsViewModel2 = subscriptionOptionsViewModel;
                final OnboardingViewModel onboardingViewModel3 = onboardingViewModel;
                NavGraphBuilderKt.c(m25Var2, a3, null, null, null, null, null, null, zr0.c(1728063973, true, new kt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$onboardingGraph$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((uh) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                        zq3.h(uhVar, "$this$composable");
                        zq3.h(navBackStackEntry, "it");
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(1728063973, i, -1, "com.nytimes.android.onboarding.compose.onboardingGraph.<anonymous>.<anonymous> (OnboardingScreens.kt:87)");
                        }
                        final SubscriptionOptionsViewModel subscriptionOptionsViewModel3 = SubscriptionOptionsViewModel.this;
                        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.3.1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m627invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m627invoke() {
                                SubscriptionOptionsViewModel.this.k();
                            }
                        };
                        final OnboardingViewModel onboardingViewModel4 = onboardingViewModel3;
                        OnboardingScreensKt.b(qs2Var, new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.3.2
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m628invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m628invoke() {
                                OnboardingViewModel.this.j();
                            }
                        }, composer, 0);
                        List g = SubscriptionOptionsViewModel.this.g();
                        final SubscriptionOptionsViewModel subscriptionOptionsViewModel4 = SubscriptionOptionsViewModel.this;
                        qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.3.3
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m629invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m629invoke() {
                                SubscriptionOptionsViewModel.this.i();
                            }
                        };
                        final SubscriptionOptionsViewModel subscriptionOptionsViewModel5 = SubscriptionOptionsViewModel.this;
                        SubscriptionOptionsScreenKt.g(g, qs2Var2, new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.3.4
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m630invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m630invoke() {
                                SubscriptionOptionsViewModel.this.j();
                            }
                        }, composer, 8);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), WebSocketProtocol.PAYLOAD_SHORT, null);
                String a4 = c.C0372c.b.a();
                final OnboardingNotificationsViewModel onboardingNotificationsViewModel2 = onboardingNotificationsViewModel;
                final Activity activity3 = activity;
                final SnackbarUtil snackbarUtil2 = snackbarUtil;
                NavGraphBuilderKt.c(m25Var2, a4, null, null, null, null, null, null, zr0.c(-1015248794, true, new kt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt$onboardingGraph$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final List c(x08 x08Var) {
                        return (List) x08Var.getValue();
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((uh) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                        zq3.h(uhVar, "$this$composable");
                        zq3.h(navBackStackEntry, "it");
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-1015248794, i, -1, "com.nytimes.android.onboarding.compose.onboardingGraph.<anonymous>.<anonymous> (OnboardingScreens.kt:98)");
                        }
                        final x08 b = y.b(OnboardingNotificationsViewModel.this.q(), null, composer, 8, 1);
                        final OnboardingNotificationsViewModel onboardingNotificationsViewModel3 = OnboardingNotificationsViewModel.this;
                        final Activity activity4 = activity3;
                        final SnackbarUtil snackbarUtil3 = snackbarUtil2;
                        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.4.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m631invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m631invoke() {
                                OnboardingNotificationsViewModel.this.H();
                                OnboardingNotificationsViewModel.this.m(activity4, snackbarUtil3);
                                activity4.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 5953);
                            }
                        };
                        final OnboardingNotificationsViewModel onboardingNotificationsViewModel4 = OnboardingNotificationsViewModel.this;
                        OnboardingScreensKt.b(qs2Var, new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.4.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m632invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m632invoke() {
                                if (AnonymousClass4.c(b).isEmpty()) {
                                    OnboardingNotificationsViewModel.this.p();
                                }
                            }
                        }, composer, 0);
                        final OnboardingNotificationsViewModel onboardingNotificationsViewModel5 = OnboardingNotificationsViewModel.this;
                        qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.4.3
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m633invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m633invoke() {
                                OnboardingNotificationsViewModel.this.E();
                            }
                        };
                        List c = c(b);
                        final OnboardingNotificationsViewModel onboardingNotificationsViewModel6 = OnboardingNotificationsViewModel.this;
                        OnboardingScaffoldKt.c(1, 2, qs2Var2, c, new it2() { // from class: com.nytimes.android.onboarding.compose.OnboardingScreensKt.onboardingGraph.1.4.4
                            {
                                super(3);
                            }

                            public final void b(NotificationsGroupItems notificationsGroupItems, NotificationsChannel notificationsChannel, boolean z) {
                                zq3.h(notificationsGroupItems, "group");
                                zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
                                OnboardingNotificationsViewModel.this.o(notificationsGroupItems, notificationsChannel, z);
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                b((NotificationsGroupItems) obj, (NotificationsChannel) obj2, ((Boolean) obj3).booleanValue());
                                return ww8.a;
                            }
                        }, null, composer, 4150, 32);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), WebSocketProtocol.PAYLOAD_SHORT, null);
            }
        }, 252, null);
    }
}
