package com.nytimes.android.features.settings.push;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import defpackage.ii6;
import defpackage.jc;
import defpackage.qg6;
import defpackage.x3;
import defpackage.xk6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NotificationsSettingsActivity extends b {
    public jc analyticsClient;

    private final void P() {
        setSupportActionBar((Toolbar) findViewById(qg6.toolbar));
        x3 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(xk6.notification_setting_title);
        }
        x3 supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 == null) {
            return;
        }
        supportActionBar2.setDisplayOptions(14);
    }

    public final jc O() {
        jc jcVar = this.analyticsClient;
        if (jcVar != null) {
            return jcVar;
        }
        zq3.z("analyticsClient");
        return null;
    }

    @Override // com.nytimes.android.features.settings.push.b, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ii6.activity_settings);
        P();
        if (bundle == null) {
            getSupportFragmentManager().p().b(qg6.pref_container, new NotificationsSettingsFragment()).h();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        zq3.h(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().l();
        return true;
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        O().B(-1);
    }
}
