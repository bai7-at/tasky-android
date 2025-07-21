package com.nytimes.android.fragment.article;

import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nytimes.android.fragment.WebViewFragment;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.e44;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hd3;
import defpackage.na3;
import defpackage.pe9;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.z58;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class WebContentLoader implements na3 {
    private final NetworkStatus a;
    private final z58 b;
    private final pe9 c;
    private final SnackbarUtil d;
    private final hd3 e;
    private qs2 f;
    private final WebViewFragment g;

    public WebContentLoader(NetworkStatus networkStatus, z58 z58Var, pe9 pe9Var, SnackbarUtil snackbarUtil, hd3 hd3Var, Fragment fragment) {
        zq3.h(networkStatus, "networkStatus");
        zq3.h(z58Var, "subauthClient");
        zq3.h(pe9Var, "webViewCustomHeaders");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(hd3Var, "hybridPerformanceTracker");
        zq3.h(fragment, "genericFragment");
        this.a = networkStatus;
        this.b = z58Var;
        this.c = pe9Var;
        this.d = snackbarUtil;
        this.e = hd3Var;
        this.g = (WebViewFragment) fragment;
    }

    private final void d() {
        f(new qs2() { // from class: com.nytimes.android.fragment.article.WebContentLoader$handleOfflineView$1

            @fc1(c = "com.nytimes.android.fragment.article.WebContentLoader$handleOfflineView$1$1", f = "WebContentLoader.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.fragment.article.WebContentLoader$handleOfflineView$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                int label;
                final /* synthetic */ WebContentLoader this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(WebContentLoader webContentLoader, by0 by0Var) {
                    super(2, by0Var);
                    this.this$0 = webContentLoader;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.this$0, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    a.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    this.this$0.a();
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m550invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m550invoke() {
                WebViewFragment webViewFragment;
                webViewFragment = WebContentLoader.this.g;
                BuildersKt__Builders_commonKt.launch$default(e44.a(webViewFragment), null, null, new AnonymousClass1(WebContentLoader.this, null), 3, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r7, defpackage.by0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.nytimes.android.fragment.article.WebContentLoader$handleOnlineView$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.fragment.article.WebContentLoader$handleOnlineView$1 r0 = (com.nytimes.android.fragment.article.WebContentLoader$handleOnlineView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.fragment.article.WebContentLoader$handleOnlineView$1 r0 = new com.nytimes.android.fragment.article.WebContentLoader$handleOnlineView$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.fragment.article.WebContentLoader r6 = (com.nytimes.android.fragment.article.WebContentLoader) r6
            kotlin.f.b(r8)
        L31:
            r2 = r7
            goto L58
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.f.b(r8)
            com.nytimes.android.fragment.WebViewFragment r8 = r6.g
            com.nytimes.android.readerhybrid.HybridWebView r8 = r8.l
            if (r8 != 0) goto L45
            goto L49
        L45:
            r2 = 0
            r8.setVisibility(r2)
        L49:
            z58 r8 = r6.b
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r8.c(r7, r0)
            if (r8 != r1) goto L31
            return r1
        L58:
            com.nytimes.android.fragment.WebViewFragment r7 = r6.g
            com.nytimes.android.readerhybrid.HybridWebView r7 = r7.l
            if (r7 == 0) goto L63
            pe9 r8 = r6.c
            r8.b(r7, r2)
        L63:
            com.nytimes.android.fragment.WebViewFragment r7 = r6.g
            com.nytimes.android.fragment.AssetViewModel r7 = r7.v1()
            com.nytimes.android.fragment.AssetArgs r7 = r7.g()
            hd3 r0 = r6.e
            int r1 = r6.hashCode()
            java.lang.String r3 = r7.a()
            java.lang.Long r4 = r7.d()
            com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType r5 = com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType.Interactive
            r0.n(r1, r2, r3, r4, r5)
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.fragment.article.WebContentLoader.e(java.lang.String, by0):java.lang.Object");
    }

    private final void f(qs2 qs2Var) {
        this.f = this.d.r(true, qs2Var);
        SwipeRefreshLayout u1 = this.g.u1();
        if (u1 == null) {
            return;
        }
        u1.setRefreshing(false);
    }

    @Override // defpackage.na3
    public void a() {
        String t1;
        qs2 qs2Var = this.f;
        if (qs2Var != null) {
            qs2Var.mo865invoke();
        }
        this.f = null;
        HybridWebView hybridWebView = this.g.l;
        if (hybridWebView == null || (t1 = hybridWebView.getUrl()) == null) {
            t1 = this.g.t1();
        }
        if (!this.a.g()) {
            d();
        } else if (t1 != null) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(this.g), null, null, new WebContentLoader$reloadData$1(this, t1, null), 3, null);
        } else {
            NYTLogger.s(new IllegalStateException("urlToLoad is null"));
            this.d.k(true);
        }
    }
}
