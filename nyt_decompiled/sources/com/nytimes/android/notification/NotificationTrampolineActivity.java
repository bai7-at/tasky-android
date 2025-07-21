package com.nytimes.android.notification;

import android.content.Intent;
import android.os.Bundle;
import defpackage.q95;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NotificationTrampolineActivity extends b {
    public q95 notificationIntentParser;

    public final q95 O() {
        q95 q95Var = this.notificationIntentParser;
        if (q95Var != null) {
            return q95Var;
        }
        zq3.z("notificationIntentParser");
        return null;
    }

    @Override // com.nytimes.android.notification.b, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q95 O = O();
        Intent intent = getIntent();
        zq3.g(intent, "getIntent(...)");
        O.a(intent);
        finish();
    }
}
