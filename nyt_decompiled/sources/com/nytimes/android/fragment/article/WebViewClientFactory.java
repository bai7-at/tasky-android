package com.nytimes.android.fragment.article;

import android.webkit.WebChromeClient;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.MainWebViewClient;
import com.nytimes.android.readerhybrid.c;
import defpackage.le9;
import defpackage.lw0;
import defpackage.p76;
import defpackage.ss2;
import defpackage.xt6;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class WebViewClientFactory {
    private final p76 a;
    private final p76 b;
    private final p76 c;
    private final p76 d;
    private final p76 e;

    public WebViewClientFactory(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5) {
        zq3.h(p76Var, "webViewClientProgressWrapper");
        zq3.h(p76Var2, "hybridWebViewClient");
        zq3.h(p76Var3, "hybridDeepLinkExtrasProvider");
        zq3.h(p76Var4, "embeddedLinkWebChromeClient");
        zq3.h(p76Var5, "fullscreenVideoChromeDelegate");
        this.a = p76Var;
        this.b = p76Var2;
        this.c = p76Var3;
        this.d = p76Var4;
        this.e = p76Var5;
    }

    public final MainWebViewClient a(lw0 lw0Var, ss2 ss2Var, boolean z, boolean z2, boolean z3, boolean z4, CoroutineScope coroutineScope, ss2 ss2Var2, HybridType hybridType) {
        zq3.h(lw0Var, "contentLoadedListener");
        zq3.h(ss2Var, "deepLinkAnalyticsReporter");
        zq3.h(coroutineScope, "scope");
        zq3.h(ss2Var2, "onProgressChanged");
        zq3.h(hybridType, "hybridType");
        if (z2) {
            Object obj = this.b.get();
            Object obj2 = this.c.get();
            zq3.g(obj2, "get(...)");
            ((c) obj).t(lw0Var, (xt6) obj2, coroutineScope, hybridType);
            zq3.e(obj);
            return (MainWebViewClient) obj;
        }
        Object obj3 = this.a.get();
        le9 le9Var = (le9) obj3;
        le9Var.t(ss2Var, z3, z, z4, lw0Var, null, coroutineScope, hybridType);
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(le9Var.u(), new WebViewClientFactory$create$2$1(ss2Var2, null)), new WebViewClientFactory$create$2$2(null)), coroutineScope);
        zq3.e(obj3);
        return (MainWebViewClient) obj3;
    }

    public final WebChromeClient c(boolean z) {
        if (z) {
            Object obj = this.d.get();
            zq3.e(obj);
            return (WebChromeClient) obj;
        }
        Object obj2 = this.e.get();
        zq3.e(obj2);
        return (WebChromeClient) obj2;
    }
}
