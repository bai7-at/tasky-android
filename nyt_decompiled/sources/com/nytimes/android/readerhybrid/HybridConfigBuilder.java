package com.nytimes.android.readerhybrid;

import android.app.Application;
import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.hybrid.ConnectionStatus;
import com.nytimes.android.hybrid.HybridConfig;
import com.nytimes.android.hybrid.HybridTcfInfo;
import com.nytimes.android.hybrid.HybridUserInfo;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.by0;
import defpackage.du8;
import defpackage.j65;
import defpackage.jb3;
import defpackage.jd3;
import defpackage.uo6;
import defpackage.zq3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class HybridConfigBuilder {
    public static final a Companion = new a(null);
    public static final int i = 8;
    private final com.nytimes.android.entitlements.a a;
    private final Application b;
    private final NetworkStatus c;
    private final HybridUserInfoBuilder d;
    private final jd3 e;
    private final jb3 f;
    private final AbraManager g;
    private final j65 h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public HybridConfigBuilder(com.nytimes.android.entitlements.a aVar, Application application, NetworkStatus networkStatus, HybridUserInfoBuilder hybridUserInfoBuilder, jd3 jd3Var, jb3 jb3Var, AbraManager abraManager, j65 j65Var) {
        zq3.h(aVar, "eCommClient");
        zq3.h(application, "context");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(hybridUserInfoBuilder, "hybridUserInfoBuilder");
        zq3.h(jd3Var, "directiveProvider");
        zq3.h(jb3Var, "hybridAdClient");
        zq3.h(abraManager, "abraManager");
        zq3.h(j65Var, "nightModeProvider");
        this.a = aVar;
        this.b = application;
        this.c = networkStatus;
        this.d = hybridUserInfoBuilder;
        this.e = jd3Var;
        this.f = jb3Var;
        this.g = abraManager;
        this.h = j65Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Map r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.readerhybrid.HybridConfigBuilder$buildHybridConfig$2
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.readerhybrid.HybridConfigBuilder$buildHybridConfig$2 r0 = (com.nytimes.android.readerhybrid.HybridConfigBuilder$buildHybridConfig$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.readerhybrid.HybridConfigBuilder$buildHybridConfig$2 r0 = new com.nytimes.android.readerhybrid.HybridConfigBuilder$buildHybridConfig$2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.readerhybrid.HybridConfigBuilder r4 = (com.nytimes.android.readerhybrid.HybridConfigBuilder) r4
            kotlin.f.b(r6)
            goto L4c
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.f.b(r6)
            com.nytimes.android.readerhybrid.HybridUserInfoBuilder r6 = r4.d
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            com.nytimes.android.hybrid.HybridUserInfo r6 = (com.nytimes.android.hybrid.HybridUserInfo) r6
            com.nytimes.android.hybrid.HybridConfig r4 = r4.e(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.HybridConfigBuilder.c(java.util.Map, by0):java.lang.Object");
    }

    private final ConnectionStatus d() {
        ConnectionStatus connectionStatus = ConnectionStatus.NO_CONNECTION;
        if (!this.c.g()) {
            return connectionStatus;
        }
        if (this.c.l() && this.c.j()) {
            return ConnectionStatus.GOOD_WIFI;
        }
        if (this.c.l()) {
            return ConnectionStatus.POOR_WIFI;
        }
        if (this.c.l()) {
            return connectionStatus;
        }
        return this.c.h() ? ConnectionStatus.MODERN_CELL : ConnectionStatus.LEGACY_CELL;
    }

    private final HybridConfig e(Map map, HybridUserInfo hybridUserInfo) {
        Map a2 = this.e.a();
        List<AbraTest> allTests = this.g.getAllTests();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(allTests, 10)), 16));
        for (AbraTest abraTest : allTests) {
            Pair a3 = du8.a(abraTest.getTestName(), abraTest.getAbraMetaData().getAbraVariant());
            linkedHashMap.put(a3.c(), a3.d());
        }
        boolean b = this.h.b();
        boolean q = this.a.q();
        boolean a4 = this.a.a();
        String h = h();
        String j = j();
        String g = g(this.b);
        String i2 = i();
        int status = d().status();
        HybridTcfInfo b2 = this.e.b();
        String f = f();
        boolean e = this.e.e(a2);
        return new HybridConfig(0.0f, b, Boolean.valueOf(q), "uri", Boolean.valueOf(a4), h, "Android", i2, j, g, f, status, (Map) linkedHashMap, map, a2, b2, hybridUserInfo, false, Boolean.valueOf(this.e.e(a2)), Boolean.valueOf(e), 1, (DefaultConstructorMarker) null);
    }

    private final String f() {
        String format = new SimpleDateFormat(QueryKeys.MEMFLY_API_VERSION, Locale.getDefault()).format(new Date());
        zq3.g(format, "format(...)");
        return format;
    }

    public final Object b(String str, ArticleAsset articleAsset, by0 by0Var) {
        return c(this.f.a(articleAsset, str), by0Var);
    }

    public final String g(Context context) {
        zq3.h(context, "context");
        return DeviceUtils.u(context, false, false, 3, null);
    }

    public final String h() {
        return DeviceUtils.g();
    }

    public final String i() {
        Locale locale = this.b.getResources().getConfiguration().locale;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        zq3.g(language, "getLanguage(...)");
        return language;
    }

    public final String j() {
        return DeviceUtils.l();
    }
}
