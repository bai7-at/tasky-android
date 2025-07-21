package com.nytimes.android.hybrid.ad;

import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.b04;
import defpackage.kb3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes4.dex */
public final class HybridAdInitializer {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final b04 a;
    private final CoroutineScope b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public HybridAdInitializer(b04 b04Var, CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        zq3.h(b04Var, "hybridAdManager");
        zq3.h(coroutineDispatcher, "mainDispatcher");
        this.a = b04Var;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.b = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher));
    }

    public final void b(HybridWebView hybridWebView) {
        zq3.h(hybridWebView, "webView");
        ((kb3) this.a.get()).a(hybridWebView);
    }

    public final void c(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new HybridAdInitializer$setupHybridAds$1(this, str, str2, null), 3, null);
    }

    public final void d(String str) {
        zq3.h(str, "pageViewId");
        ((kb3) this.a.get()).c(str);
    }
}
