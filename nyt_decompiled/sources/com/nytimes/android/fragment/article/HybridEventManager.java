package com.nytimes.android.fragment.article;

import android.app.Activity;
import androidx.fragment.app.f;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.hybrid.HybridEventListener;
import com.nytimes.android.hybrid.ad.HybridAdInitializer;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.cc0;
import defpackage.gp0;
import defpackage.ic3;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.xt6;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class HybridEventManager {
    private final Activity a;
    private final HybridAdInitializer b;
    private final HybridEventListener c;
    private final ET2Scope d;
    private final ic3 e;
    private final xt6 f;
    private String g;

    public HybridEventManager(Activity activity, HybridAdInitializer hybridAdInitializer, HybridEventListener hybridEventListener, ET2Scope eT2Scope, ic3 ic3Var, xt6 xt6Var) {
        zq3.h(activity, "activity");
        zq3.h(hybridAdInitializer, "hybridAdInitializer");
        zq3.h(hybridEventListener, "eventListener");
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(ic3Var, "hybridLinkHandler");
        zq3.h(xt6Var, "linkExtrasProvider");
        this.a = activity;
        this.b = hybridAdInitializer;
        this.c = hybridEventListener;
        this.d = eT2Scope;
        this.e = ic3Var;
        this.f = xt6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(HybridEventListener.a aVar, String str, String str2, HybridWebView hybridWebView, ss2 ss2Var, by0 by0Var) {
        NYTLogger.l(aVar.toString(), new Object[0]);
        if (zq3.c(aVar, HybridEventListener.a.c.a)) {
            int savedScrollPosition = hybridWebView.getSavedScrollPosition();
            if (savedScrollPosition > 0) {
                hybridWebView.scrollTo(0, savedScrollPosition);
            }
            hybridWebView.setVisibility(0);
            ss2Var.invoke(cc0.a(false));
            if (this.a.getIntent().getExtras() != null) {
                this.b.c(str, str2);
            }
        } else if (zq3.c(aVar, HybridEventListener.a.C0328a.a)) {
            this.b.b(hybridWebView);
        } else if (aVar instanceof HybridEventListener.a.b) {
            HybridEventListener.a.b bVar = (HybridEventListener.a.b) aVar;
            if (gp0.d(bVar.a())) {
                ic3 ic3Var = this.e;
                Activity activity = this.a;
                zq3.f(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                Object a = ic3Var.a((f) activity, bVar.a(), this.f.a(), by0Var);
                return a == a.h() ? a : ww8.a;
            }
        }
        return ww8.a;
    }

    public final void b(HybridWebView hybridWebView, String str, String str2, ss2 ss2Var, CoroutineScope coroutineScope) {
        zq3.h(hybridWebView, "webView");
        zq3.h(ss2Var, "onProgressChanged");
        zq3.h(coroutineScope, "scope");
        this.c.d(hybridWebView);
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(this.c.f(), new HybridEventManager$init$1(this, str, str2, hybridWebView, ss2Var, null)), new HybridEventManager$init$2(ss2Var, null)), coroutineScope);
    }

    public final void d() {
        PageContext i;
        tx1 c = this.d.c();
        String g = (c == null || (i = c.i()) == null) ? null : i.g();
        if (g == null) {
            g = "";
        }
        String str = this.g;
        if (str != null && !zq3.c(str, g)) {
            this.b.d(g);
        }
        this.g = g;
    }
}
