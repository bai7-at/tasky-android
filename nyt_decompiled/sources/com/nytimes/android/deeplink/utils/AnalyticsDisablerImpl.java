package com.nytimes.android.deeplink.utils;

import com.nytimes.navigation.deeplink.base.AnalyticsDisabler;
import defpackage.jc;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class AnalyticsDisablerImpl extends AnalyticsDisabler {
    private final jc b;
    private final ss2 c;

    public AnalyticsDisablerImpl(jc jcVar) {
        zq3.h(jcVar, "analyticsClient");
        this.b = jcVar;
        this.c = new ss2() { // from class: com.nytimes.android.deeplink.utils.AnalyticsDisablerImpl$rule$1
            @Override // defpackage.ss2
            public final Boolean invoke(String str) {
                zq3.h(str, "referringSource");
                return Boolean.valueOf(zq3.c(str, "com.google.appcrawler"));
            }
        };
    }

    @Override // com.nytimes.navigation.deeplink.base.AnalyticsDisabler
    public void a(String str) {
        zq3.h(str, "referringSource");
        if (((Boolean) this.c.invoke(str)).booleanValue()) {
            this.b.b();
        }
    }
}
