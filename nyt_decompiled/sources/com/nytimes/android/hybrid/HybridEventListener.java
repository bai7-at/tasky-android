package com.nytimes.android.hybrid;

import android.webkit.JavascriptInterface;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.logging.NYTLogger;
import defpackage.d44;
import defpackage.ei1;
import defpackage.ld3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class HybridEventListener implements ei1 {
    private final Lifecycle a;
    private final ld3 b;
    private final MutableStateFlow c;
    private final CoroutineScope d;
    private com.nytimes.android.readerhybrid.HybridWebView e;

    public static abstract class a {

        /* renamed from: com.nytimes.android.hybrid.HybridEventListener$a$a, reason: collision with other inner class name */
        public static final class C0328a extends a {
            public static final C0328a a = new C0328a();

            private C0328a() {
                super(null);
            }
        }

        public static final class b extends a {
            private final String a;
            private final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2) {
                super(null);
                zq3.h(str, "url");
                zq3.h(str2, "id");
                this.a = str;
                this.b = str2;
            }

            public final String a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return "OnHashChange(url=" + this.a + ", id=" + this.b + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public /* synthetic */ b(java.lang.String r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
                /*
                    r0 = this;
                    r3 = r3 & 2
                    if (r3 == 0) goto L11
                    java.util.UUID r2 = java.util.UUID.randomUUID()
                    java.lang.String r2 = r2.toString()
                    java.lang.String r3 = "toString(...)"
                    defpackage.zq3.g(r2, r3)
                L11:
                    r0.<init>(r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.hybrid.HybridEventListener.a.b.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        public static final class d extends a {
            public static final d a = new d();

            private d() {
                super(null);
            }
        }

        public static final class e extends a {
            public static final e a = new e();

            private e() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public HybridEventListener(Lifecycle lifecycle, ld3 ld3Var, CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        zq3.h(lifecycle, "lifecycle");
        zq3.h(ld3Var, "hybridScripts");
        zq3.h(coroutineDispatcher, "mainDispatcher");
        this.c = StateFlowKt.MutableStateFlow(a.e.a);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.d = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher));
        NYTLogger.z("HybridEventListener", new Object[0]);
        this.a = lifecycle;
        this.b = ld3Var;
        lifecycle.a(this);
    }

    public final void d(com.nytimes.android.readerhybrid.HybridWebView hybridWebView) {
        zq3.h(hybridWebView, "webView");
        this.e = hybridWebView;
        NYTLogger.z("attachListeners", new Object[0]);
        this.c.setValue(a.C0328a.a);
        hybridWebView.addJavascriptInterface(this, "AndroidNativeInterface");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.hybrid.HybridEventListener$collapseAd$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.hybrid.HybridEventListener$collapseAd$1 r0 = (com.nytimes.android.hybrid.HybridEventListener$collapseAd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.hybrid.HybridEventListener$collapseAd$1 r0 = new com.nytimes.android.hybrid.HybridEventListener$collapseAd$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.f.b(r7)
            goto L48
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.f.b(r7)
            com.nytimes.android.readerhybrid.HybridWebView r5 = r5.e
            if (r5 == 0) goto L53
            com.nytimes.android.hybrid.bridge.JavascriptEventParameter r6 = defpackage.x5.a(r6)
            r0.label = r4
            java.lang.Class<com.nytimes.android.ads.hybrid.bridge.model.AdCommandResponse> r7 = com.nytimes.android.ads.hybrid.bridge.model.AdCommandResponse.class
            java.lang.Object r7 = r5.n(r6, r7, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            com.nytimes.android.ads.hybrid.bridge.model.AdCommandResponse r7 = (com.nytimes.android.ads.hybrid.bridge.model.AdCommandResponse) r7
            if (r7 == 0) goto L53
            boolean r5 = r7.a()
            if (r5 == 0) goto L53
            r3 = r4
        L53:
            java.lang.Boolean r5 = defpackage.cc0.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.hybrid.HybridEventListener.e(java.lang.String, by0):java.lang.Object");
    }

    public final Flow f() {
        return FlowKt.asSharedFlow(this.c);
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.a.d(this);
        com.nytimes.android.readerhybrid.HybridWebView hybridWebView = this.e;
        if (hybridWebView != null) {
            hybridWebView.removeJavascriptInterface("AndroidNativeInterface");
        }
        CoroutineScopeKt.cancel$default(this.d, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public final void onHashChange(String str) {
        zq3.h(str, "newUrl");
        NYTLogger.z("onHashChange", new Object[0]);
        this.c.setValue(new a.b(str, null, 2, 0 == true ? 1 : 0));
    }

    @JavascriptInterface
    public final void onLoad() {
        NYTLogger.z("onLoad", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new HybridEventListener$onLoad$1(this, null), 3, null);
    }

    @JavascriptInterface
    public final void onResize() {
        NYTLogger.z("onResize", new Object[0]);
        this.c.setValue(a.d.a);
    }
}
