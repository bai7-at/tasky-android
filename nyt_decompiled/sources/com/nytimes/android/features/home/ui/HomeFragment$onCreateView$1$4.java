package com.nytimes.android.features.home.ui;

import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.o93;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes4.dex */
final class HomeFragment$onCreateView$1$4 extends Lambda implements ss2 {
    final /* synthetic */ o93 $binding;
    final /* synthetic */ Ref$BooleanRef $firstLoad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeFragment$onCreateView$1$4(Ref$BooleanRef ref$BooleanRef, o93 o93Var) {
        super(1);
        this.$firstLoad = ref$BooleanRef;
        this.$binding = o93Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(o93 o93Var, String str) {
        zq3.h(o93Var, "$binding");
        zq3.h(str, "$html");
        o93Var.e.loadUrl("javascript:document.open();document.close();");
        HybridWebView hybridWebView = o93Var.e;
        zq3.g(hybridWebView, "webView");
        HybridWebView.m(hybridWebView, str, null, HybridWebView.HybridSource.TODAY_TAB, null, 8, null);
        o93Var.e.animate().alpha(1.0f);
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return ww8.a;
    }

    public final void invoke(final String str) {
        if (str != null) {
            Ref$BooleanRef ref$BooleanRef = this.$firstLoad;
            final o93 o93Var = this.$binding;
            if (!ref$BooleanRef.element) {
                o93Var.e.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: com.nytimes.android.features.home.ui.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeFragment$onCreateView$1$4.c(o93.this, str);
                    }
                });
                return;
            }
            HybridWebView hybridWebView = o93Var.e;
            zq3.g(hybridWebView, "webView");
            HybridWebView.m(hybridWebView, str, null, HybridWebView.HybridSource.TODAY_TAB, null, 8, null);
            ref$BooleanRef.element = false;
        }
    }
}
