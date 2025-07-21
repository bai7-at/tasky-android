package com.nytimes.android.features.settings;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import defpackage.ii6;
import defpackage.km7;
import defpackage.qg6;
import defpackage.wl6;
import defpackage.x3;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SettingsActivity extends g {
    public km7 analytics;

    private final void P() {
        View findViewById = findViewById(qg6.toolbar);
        zq3.f(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        setSupportActionBar((Toolbar) findViewById);
        x3 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(getString(wl6.action_settings));
        }
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.setDisplayOptions(14);
    }

    public final km7 O() {
        km7 km7Var = this.analytics;
        if (km7Var != null) {
            return km7Var;
        }
        zq3.z("analytics");
        return null;
    }

    @Override // com.nytimes.android.features.settings.g, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ii6.activity_settings);
        P();
        if (bundle == null) {
            getSupportFragmentManager().p().b(qg6.pref_container, new SettingsFragment()).h();
        }
        O().a("Open Settings");
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        O().b();
    }

    @Override // defpackage.jk
    public boolean onSupportNavigateUp() {
        if (getSupportFragmentManager().r0() > 0) {
            getSupportFragmentManager().f1();
            return true;
        }
        getOnBackPressedDispatcher().l();
        return true;
    }
}
