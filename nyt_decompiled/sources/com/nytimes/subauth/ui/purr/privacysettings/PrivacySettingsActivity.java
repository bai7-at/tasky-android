package com.nytimes.subauth.ui.purr.privacysettings;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsContainerScreenKt;
import defpackage.c04;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;

/* loaded from: classes4.dex */
public final class PrivacySettingsActivity extends a {
    private final c04 e;

    public PrivacySettingsActivity() {
        final qs2 qs2Var = null;
        this.e = new s(zt6.b(PrivacySettingsViewModel.class), new qs2() { // from class: com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsActivity$special$$inlined$viewModels$default$2
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
        }, new qs2() { // from class: com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsActivity$special$$inlined$viewModels$default$1
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
        }, new qs2() { // from class: com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsActivity$special$$inlined$viewModels$default$3
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
    public final PrivacySettingsViewModel M() {
        return (PrivacySettingsViewModel) this.e.getValue();
    }

    @Override // com.nytimes.subauth.ui.purr.privacysettings.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tq0.b(this, null, zr0.c(821113506, true, new gt2() { // from class: com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsActivity$onCreate$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                PrivacySettingsViewModel M;
                PrivacySettingsViewModel M2;
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(821113506, i, -1, "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsActivity.onCreate.<anonymous> (PrivacySettingsActivity.kt:19)");
                }
                M = PrivacySettingsActivity.this.M();
                M2 = PrivacySettingsActivity.this.M();
                PrivacySettingsContainerScreenKt.a(M, y.b(M2.x(), null, composer, 8, 1), composer, 8);
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        M().u();
    }
}
