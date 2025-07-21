package com.nytimes.android.onboarding.compose;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.c04;
import defpackage.dc7;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ComposeOnboardingActivity extends com.nytimes.android.onboarding.compose.a implements dc7 {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private final c04 e;
    public b navStateConductor;
    public SmartLockLifecycleObserver smartLock;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ComposeOnboardingActivity() {
        final qs2 qs2Var = null;
        this.e = new s(zt6.b(OnboardingViewModel.class), new qs2() { // from class: com.nytimes.android.onboarding.compose.ComposeOnboardingActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                u viewModelStore = ComponentActivity.this.getViewModelStore();
                zq3.g(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new qs2() { // from class: com.nytimes.android.onboarding.compose.ComposeOnboardingActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                t.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new qs2() { // from class: com.nytimes.android.onboarding.compose.ComposeOnboardingActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                if (qs2Var2 != null && (t21Var = (t21) qs2Var2.mo865invoke()) != null) {
                    return t21Var;
                }
                t21 defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                zq3.g(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingViewModel Q() {
        return (OnboardingViewModel) this.e.getValue();
    }

    public final b P() {
        b bVar = this.navStateConductor;
        if (bVar != null) {
            return bVar;
        }
        zq3.z("navStateConductor");
        return null;
    }

    public final SmartLockLifecycleObserver R() {
        SmartLockLifecycleObserver smartLockLifecycleObserver = this.smartLock;
        if (smartLockLifecycleObserver != null) {
            return smartLockLifecycleObserver;
        }
        zq3.z("smartLock");
        return null;
    }

    @Override // com.nytimes.android.onboarding.compose.a, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tq0.b(this, null, zr0.c(1669369964, true, new gt2() { // from class: com.nytimes.android.onboarding.compose.ComposeOnboardingActivity$onCreate$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1669369964, i, -1, "com.nytimes.android.onboarding.compose.ComposeOnboardingActivity.onCreate.<anonymous> (ComposeOnboardingActivity.kt:30)");
                }
                final ComposeOnboardingActivity composeOnboardingActivity = ComposeOnboardingActivity.this;
                NytThemeKt.a(false, null, null, zr0.b(composer, 565460476, true, new gt2() { // from class: com.nytimes.android.onboarding.compose.ComposeOnboardingActivity$onCreate$1.1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        OnboardingViewModel Q;
                        if ((i2 & 11) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(565460476, i2, -1, "com.nytimes.android.onboarding.compose.ComposeOnboardingActivity.onCreate.<anonymous>.<anonymous> (ComposeOnboardingActivity.kt:31)");
                        }
                        ComposeOnboardingActivity composeOnboardingActivity2 = ComposeOnboardingActivity.this;
                        SmartLockLifecycleObserver R = composeOnboardingActivity2.R();
                        SnackbarUtil snackbarUtil = ComposeOnboardingActivity.this.getSnackbarUtil();
                        b P = ComposeOnboardingActivity.this.P();
                        Q = ComposeOnboardingActivity.this.Q();
                        OnboardingScreensKt.a(composeOnboardingActivity2, R, snackbarUtil, P, Q, null, null, null, null, composer2, (SnackbarUtil.f << 6) | 36936, 480);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer, 3072, 7);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 1, null);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        zq3.h(strArr, "permissions");
        zq3.h(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 5953) {
            Q().n(!(iArr.length == 0) && iArr[0] == 0);
        }
    }
}
