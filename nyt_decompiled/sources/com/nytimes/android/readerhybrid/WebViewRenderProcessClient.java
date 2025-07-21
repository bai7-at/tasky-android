package com.nytimes.android.readerhybrid;

import android.webkit.WebView;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import defpackage.by0;
import defpackage.df9;
import defpackage.ef9;
import defpackage.ww8;
import defpackage.ze9;
import defpackage.zq3;
import java.util.Timer;
import java.util.TimerTask;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final class WebViewRenderProcessClient {
    public static final WebViewRenderProcessClient a = new WebViewRenderProcessClient();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends ef9 {
        private final MutableStateFlow a;
        private Timer b;

        /* renamed from: com.nytimes.android.readerhybrid.WebViewRenderProcessClient$a$a, reason: collision with other inner class name */
        public static final class C0378a extends TimerTask {
            public C0378a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                a.this.a.setValue(WebViewResponsiveState.FREEZE_TIMEOUT);
                a.this.b = null;
            }
        }

        public a(MutableStateFlow mutableStateFlow, Timer timer) {
            zq3.h(mutableStateFlow, "flow");
            this.a = mutableStateFlow;
            this.b = timer;
        }

        @Override // defpackage.ef9
        public void a(WebView webView, df9 df9Var) {
            zq3.h(webView, "view");
            this.a.setValue(WebViewResponsiveState.RESPONSIVE);
            Timer timer = this.b;
            if (timer != null) {
                timer.cancel();
            }
            this.b = null;
        }

        @Override // defpackage.ef9
        public void b(WebView webView, df9 df9Var) {
            zq3.h(webView, "view");
            this.a.setValue(WebViewResponsiveState.FROZEN);
            if (this.b == null) {
                Timer timer = new Timer(false);
                timer.schedule(new C0378a(), 15000L);
                this.b = timer;
            }
        }
    }

    private WebViewRenderProcessClient() {
    }

    public final Object a(HybridType hybridType, WebView webView, ze9 ze9Var, by0 by0Var) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new WebViewRenderProcessClient$observeWebViewResponsiveState$2(webView, ze9Var, hybridType, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }
}
