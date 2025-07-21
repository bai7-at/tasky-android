package com.nytimes.android.features.home.ui;

import android.graphics.Bitmap;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.MainWebViewClient;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.e44;
import defpackage.lw0;
import defpackage.t93;
import defpackage.zq3;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class HomeWebViewClient extends MainWebViewClient {
    private final Fragment i;
    private final DeepLinkManager j;
    private final t93 k;
    private final MutableStateFlow l;

    public HomeWebViewClient(Fragment fragment, DeepLinkManager deepLinkManager, t93 t93Var) {
        zq3.h(fragment, "fragment");
        zq3.h(deepLinkManager, "deepLinkManager");
        zq3.h(t93Var, "navigationStateHolder");
        this.i = fragment;
        this.j = deepLinkManager;
        this.k = t93Var;
        l(e44.a(fragment));
        r(HybridType.Today);
        this.l = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.nytimes.android.readerhybrid.MainWebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.fz8 r12, defpackage.by0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.nytimes.android.features.home.ui.HomeWebViewClient$handleURL$1
            if (r0 == 0) goto L14
            r0 = r13
            com.nytimes.android.features.home.ui.HomeWebViewClient$handleURL$1 r0 = (com.nytimes.android.features.home.ui.HomeWebViewClient$handleURL$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.nytimes.android.features.home.ui.HomeWebViewClient$handleURL$1 r0 = new com.nytimes.android.features.home.ui.HomeWebViewClient$handleURL$1
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r11 = r7.L$1
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r12 = r7.L$0
            com.nytimes.android.features.home.ui.HomeWebViewClient r12 = (com.nytimes.android.features.home.ui.HomeWebViewClient) r12
            kotlin.f.b(r13)
            r10 = r11
            r11 = r12
            goto Laf
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            kotlin.f.b(r13)
            java.lang.String r13 = r12.a()
            boolean r1 = defpackage.rb5.r(r13)
            if (r1 == 0) goto L51
            rb5 r1 = defpackage.rb5.a
            java.lang.String r13 = r1.c(r13)
        L51:
            boolean r1 = defpackage.rb5.f(r13)
            if (r1 == 0) goto L72
            ic3 r12 = r11.d()
            androidx.fragment.app.Fragment r11 = r11.i
            android.content.Context r11 = r11.requireContext()
            java.lang.String r0 = "requireContext(...)"
            defpackage.zq3.g(r11, r0)
            rb5 r0 = defpackage.rb5.a
            java.lang.String r13 = r0.a(r13)
            r12.b(r11, r13)
            ww8 r11 = defpackage.ww8.a
            return r11
        L72:
            android.net.Uri r13 = android.net.Uri.parse(r13)
            android.webkit.WebView r1 = r12.b()
            android.content.Context r10 = r1.getContext()
            kotlinx.coroutines.flow.MutableStateFlow r1 = r11.l
            java.lang.String r12 = r12.a()
            boolean r12 = defpackage.rb5.k(r12)
            java.lang.Boolean r12 = defpackage.cc0.a(r12)
            r1.setValue(r12)
            com.nytimes.navigation.deeplink.DeepLinkManager r1 = r11.j
            defpackage.zq3.e(r10)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r12 = "android.intent.action.VIEW"
            r3.<init>(r12, r13)
            r7.L$0 = r11
            r7.L$1 = r10
            r7.label = r2
            r4 = 0
            r5 = 0
            r6 = 1
            r8 = 12
            r9 = 0
            r2 = r10
            java.lang.Object r13 = com.nytimes.navigation.deeplink.DeepLinkManager.e(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto Laf
            return r0
        Laf:
            android.content.Intent r13 = (android.content.Intent) r13
            if (r13 == 0) goto Lbb
            t93 r11 = r11.k
            r11.b()
            r10.startActivity(r13)
        Lbb:
            ww8 r11 = defpackage.ww8.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.home.ui.HomeWebViewClient.j(fz8, by0):java.lang.Object");
    }

    @Override // com.nytimes.android.readerhybrid.MainWebViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        zq3.h(webView, "view");
        zq3.h(str, "url");
        super.onPageFinished(webView, str);
        d dVar = this.i;
        lw0 lw0Var = dVar instanceof lw0 ? (lw0) dVar : null;
        if (lw0Var != null) {
            lw0Var.I0();
        }
    }

    @Override // com.nytimes.android.readerhybrid.MainWebViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }
}
