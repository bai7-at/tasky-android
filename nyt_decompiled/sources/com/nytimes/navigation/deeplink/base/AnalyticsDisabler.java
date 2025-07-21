package com.nytimes.navigation.deeplink.base;

import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class AnalyticsDisabler {
    private final ss2 a = new ss2() { // from class: com.nytimes.navigation.deeplink.base.AnalyticsDisabler$rule$1
        @Override // defpackage.ss2
        public final Boolean invoke(String str) {
            zq3.h(str, "referringSource");
            return Boolean.valueOf(zq3.c(str, "com.google.appcrawler"));
        }
    };

    public abstract void a(String str);
}
