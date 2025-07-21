package com.nytimes.android.utils;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.os.storage.StorageManager;
import android.webkit.WebSettings;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.crashlytics.CrashlyticsConfig;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cb2;
import defpackage.hd9;
import defpackage.jk;
import defpackage.lk6;
import defpackage.r82;
import defpackage.tc2;
import defpackage.uc2;
import defpackage.xk6;
import defpackage.zq3;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class FeedbackAppDependenciesImpl implements tc2 {
    private final Application a;
    private final com.nytimes.android.entitlements.a b;
    private final AbraManager c;
    private final CrashlyticsConfig d;
    private final r82 e;
    private final FeedStore f;
    private final cb2 g;

    public FeedbackAppDependenciesImpl(Application application, com.nytimes.android.entitlements.a aVar, AbraManager abraManager, CrashlyticsConfig crashlyticsConfig, r82 r82Var, FeedStore feedStore, cb2 cb2Var) {
        zq3.h(application, "application");
        zq3.h(aVar, "ecommClient");
        zq3.h(abraManager, "abraManager");
        zq3.h(crashlyticsConfig, "crashlyticsConfig");
        zq3.h(r82Var, "fcmTokenProvider");
        zq3.h(feedStore, "feedStore");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = application;
        this.b = aVar;
        this.c = abraManager;
        this.d = crashlyticsConfig;
        this.e = r82Var;
        this.f = feedStore;
        this.g = cb2Var;
    }

    @Override // defpackage.tc2
    public String a() {
        return DeviceUtils.u(this.a, false, false, 3, null);
    }

    @Override // defpackage.tc2
    public boolean b(jk jkVar) {
        zq3.h(jkVar, "activity");
        String string = this.a.getString(lk6.privacy_url);
        zq3.g(string, "getString(...)");
        return p(jkVar, string);
    }

    @Override // defpackage.tc2
    public Object c(by0 by0Var) {
        return FlowKt.first(this.e.a(), by0Var);
    }

    @Override // defpackage.tc2
    public Object d(by0 by0Var) {
        return this.d.g();
    }

    @Override // defpackage.tc2
    public Object e(by0 by0Var) {
        return h().g();
    }

    @Override // defpackage.tc2
    public boolean f(jk jkVar) {
        zq3.h(jkVar, "activity");
        String string = this.a.getString(xk6.tos_url);
        zq3.g(string, "getString(...)");
        return p(jkVar, string);
    }

    @Override // defpackage.tc2
    public Object g(by0 by0Var) {
        return this.c.getAllTests();
    }

    @Override // defpackage.tc2
    public com.nytimes.android.entitlements.a h() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.tc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.utils.FeedbackAppDependenciesImpl$getFeedVersion$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.utils.FeedbackAppDependenciesImpl$getFeedVersion$1 r0 = (com.nytimes.android.utils.FeedbackAppDependenciesImpl$getFeedVersion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.utils.FeedbackAppDependenciesImpl$getFeedVersion$1 r0 = new com.nytimes.android.utils.FeedbackAppDependenciesImpl$getFeedVersion$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L4b
            goto L41
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.f.b(r6)
            com.nytimes.android.latestfeed.feed.FeedStore r5 = r5.f     // Catch: java.lang.Exception -> L4b
            r0.label = r4     // Catch: java.lang.Exception -> L4b
            r6 = 0
            java.lang.Object r6 = com.nytimes.android.latestfeed.feed.FeedStore.d(r5, r6, r0, r4, r3)     // Catch: java.lang.Exception -> L4b
            if (r6 != r1) goto L41
            return r1
        L41:
            com.nytimes.android.api.cms.LatestFeed r6 = (com.nytimes.android.api.cms.LatestFeed) r6     // Catch: java.lang.Exception -> L4b
            com.nytimes.android.api.cms.ProgramMeta r5 = com.nytimes.android.api.cms.ProgramMetaKt.getHomeProgramMeta(r6)     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = r5.getFeedVersion()     // Catch: java.lang.Exception -> L4b
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.utils.FeedbackAppDependenciesImpl.i(by0):java.lang.Object");
    }

    @Override // defpackage.tc2
    public String j() {
        Long l;
        float c;
        Application application = this.a;
        StorageManager storageManager = (StorageManager) application.getApplicationContext().getSystemService(StorageManager.class);
        Float f = null;
        try {
            UUID uuidForPath = storageManager.getUuidForPath(application.getFilesDir());
            zq3.g(uuidForPath, "getUuidForPath(...)");
            l = Long.valueOf(storageManager.getAllocatableBytes(uuidForPath));
        } catch (IOException unused) {
            l = null;
        }
        if (l != null) {
            c = uc2.c(l.longValue());
            f = Float.valueOf(c);
        }
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{f}, 1));
        zq3.g(format, "format(...)");
        return format + " GB";
    }

    @Override // defpackage.tc2
    public String k() {
        return DeviceUtils.v(this.a);
    }

    @Override // defpackage.tc2
    public boolean l() {
        return this.g.m();
    }

    @Override // defpackage.tc2
    public String m() {
        float d;
        d = uc2.d(DeviceUtils.k());
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(d)}, 1));
        zq3.g(format, "format(...)");
        return format + " MB";
    }

    @Override // defpackage.tc2
    public Object n(by0 by0Var) {
        return this.d.f();
    }

    @Override // defpackage.tc2
    public String o() {
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.a);
        zq3.g(defaultUserAgent, "getDefaultUserAgent(...)");
        return defaultUserAgent;
    }

    public final boolean p(jk jkVar, String str) {
        zq3.h(jkVar, "activity");
        zq3.h(str, "url");
        try {
            hd9.a.c(jkVar, str);
            return true;
        } catch (ActivityNotFoundException e) {
            NYTLogger.h(e);
            return false;
        }
    }
}
