package com.nytimes.android.fragment.gateway;

import android.app.Application;
import com.nytimes.android.utils.AppPreferences;
import defpackage.c04;
import defpackage.ck6;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.c;

/* loaded from: classes4.dex */
public final class PaywallPreferences {
    private final AppPreferences a;
    private final Application b;
    private final c04 c;

    public PaywallPreferences(AppPreferences appPreferences, Application application) {
        zq3.h(appPreferences, "prefs");
        zq3.h(application, "context");
        this.a = appPreferences;
        this.b = application;
        this.c = c.a(new qs2() { // from class: com.nytimes.android.fragment.gateway.PaywallPreferences$enabledKey$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                Application application2;
                application2 = PaywallPreferences.this.b;
                return application2.getString(ck6.com_nytimes_android_paywall_meter_status);
            }
        });
    }

    private final String c() {
        return (String) this.c.getValue();
    }

    public final boolean b() {
        AppPreferences appPreferences = this.a;
        String c = c();
        zq3.g(c, "<get-enabledKey>(...)");
        return appPreferences.n(c, true);
    }
}
