package com.nytimes.android.features.settings;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.features.settings.legal.LibrariesViewModel;
import defpackage.c04;
import defpackage.id9;
import defpackage.qs2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;

/* loaded from: classes4.dex */
public final class LegalDynamicActivity extends e {
    private final c04 e;
    public id9 webActivityNavigator;

    public LegalDynamicActivity() {
        final qs2 qs2Var = null;
        this.e = new s(zt6.b(LibrariesViewModel.class), new qs2() { // from class: com.nytimes.android.features.settings.LegalDynamicActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.features.settings.LegalDynamicActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.features.settings.LegalDynamicActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
    }

    public final LibrariesViewModel O() {
        return (LibrariesViewModel) this.e.getValue();
    }

    public final id9 P() {
        id9 id9Var = this.webActivityNavigator;
        if (id9Var != null) {
            return id9Var;
        }
        zq3.z("webActivityNavigator");
        return null;
    }

    @Override // com.nytimes.android.features.settings.e, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tq0.b(this, null, zr0.c(-1424026007, true, new LegalDynamicActivity$onCreate$1(this)), 1, null);
    }
}
