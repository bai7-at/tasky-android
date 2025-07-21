package com.nytimes.android;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.HybridWebViewLayoutKt;
import com.nytimes.android.ads.hybrid.bridge.commands.AdCommBridgeCommand;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.fragment.VerticalScrollStateKt;
import com.nytimes.android.fragment.article.HybridEventManager;
import com.nytimes.android.fragment.article.WebViewClientFactory;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import com.nytimes.android.hybrid.bridge.SetPTREnabledCommand;
import com.nytimes.android.m;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.performancetrackerclientphoenix.utils.AppLaunchHomeConstants;
import com.nytimes.android.readerhybrid.HybridConfigManager;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.readerhybrid.MainWebViewClient;
import com.nytimes.android.readerhybrid.WebViewType;
import com.nytimes.android.utils.composeutils.nestedscroll.NestedScrollViewInteropKt;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.cc7;
import defpackage.cn8;
import defpackage.d44;
import defpackage.d83;
import defpackage.dg4;
import defpackage.ei1;
import defpackage.eq7;
import defpackage.fq7;
import defpackage.gd6;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.jk;
import defpackage.jv6;
import defpackage.lm;
import defpackage.lw0;
import defpackage.mf9;
import defpackage.mt2;
import defpackage.mx0;
import defpackage.ng6;
import defpackage.pl0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.s5;
import defpackage.si1;
import defpackage.ss2;
import defpackage.td3;
import defpackage.tx1;
import defpackage.uo6;
import defpackage.wp7;
import defpackage.ww8;
import defpackage.z12;
import defpackage.zq3;
import kotlin.collections.b0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes2.dex */
public abstract class HybridWebViewLayoutKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final m.g gVar, final td3 td3Var, final HybridWebView hybridWebView, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(1030516181);
        if ((i & 14) == 0) {
            i2 = (h.S(gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(td3Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(hybridWebView) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1030516181, i2, -1, "com.nytimes.android.LoadArticleHtml (HybridWebViewLayout.kt:322)");
            }
            py1.d(gVar, new HybridWebViewLayoutKt$LoadArticleHtml$1(gVar, td3Var, hybridWebView, null), h, (i2 & 14) | 64);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$LoadArticleHtml$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    HybridWebViewLayoutKt.c(m.g.this, td3Var, hybridWebView, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final String str, final HybridWebView hybridWebView, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-534794452);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(hybridWebView) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-534794452, i2, -1, "com.nytimes.android.LoadTodayHtml (HybridWebViewLayout.kt:309)");
            }
            if (str == null || str.length() == 0) {
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                cc7 k = h.k();
                if (k != null) {
                    k.a(new gt2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$LoadTodayHtml$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            HybridWebViewLayoutKt.d(str, hybridWebView, composer2, gt6.a(i | 1));
                        }
                    });
                    return;
                }
                return;
            }
            py1.d(str, new HybridWebViewLayoutKt$LoadTodayHtml$2(hybridWebView, str, null), h, (i2 & 14) | 64);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$LoadTodayHtml$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    HybridWebViewLayoutKt.d(str, hybridWebView, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final m.f fVar, final td3 td3Var, final HybridWebView hybridWebView, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(768151989);
        if ((i & 14) == 0) {
            i2 = (h.S(fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(td3Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(hybridWebView) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(768151989, i2, -1, "com.nytimes.android.LoadWebContent (HybridWebViewLayout.kt:339)");
            }
            h.z(773894976);
            h.z(-492369756);
            Object A = h.A();
            if (A == Composer.a.a()) {
                androidx.compose.runtime.e eVar = new androidx.compose.runtime.e(py1.j(EmptyCoroutineContext.a, h));
                h.q(eVar);
                A = eVar;
            }
            h.R();
            CoroutineScope a = ((androidx.compose.runtime.e) A).a();
            h.R();
            py1.d(fVar, new HybridWebViewLayoutKt$LoadWebContent$1(td3Var, hybridWebView, fVar, (SnackbarUtil) h.m(LocalSnackbarKt.a()), a, null), h, (i2 & 14) | 64);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$LoadWebContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    HybridWebViewLayoutKt.e(m.f.this, td3Var, hybridWebView, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final MainWebViewClient k(WebViewClientFactory webViewClientFactory, final m mVar, final jk jkVar, final HybridWebView hybridWebView, final CoroutineScope coroutineScope, final ET2SimpleScope eT2SimpleScope, final HybridConfigManager hybridConfigManager, final lm lmVar, final cn8 cn8Var, final com.nytimes.android.coroutinesutils.b bVar, boolean z, final ss2 ss2Var, ss2 ss2Var2, HybridType hybridType) {
        boolean i = mVar.i();
        boolean h = mVar.h();
        return webViewClientFactory.a(new lw0() { // from class: com.nytimes.android.HybridWebViewLayoutKt$createWebViewClient$1
            @Override // defpackage.lw0
            public void I0() {
                Object runBlocking$default;
                PageContext i2;
                jk jkVar2 = jk.this;
                if (jkVar2 instanceof SingleArticleActivity) {
                    ((SingleArticleActivity) jkVar2).W0();
                    lmVar.p(AppLaunchHomeConstants.ARTICLE);
                }
                String g = mVar.g();
                if (g != null && g.length() != 0) {
                    mf9.b(hybridWebView, mf9.a(g));
                }
                if (mVar instanceof m.l) {
                    int savedScrollPosition = hybridWebView.getSavedScrollPosition();
                    if (savedScrollPosition > 0) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$1(hybridWebView, savedScrollPosition, null), 3, null);
                    }
                    if (((m.l) mVar).k()) {
                        tx1 c = eT2SimpleScope.c();
                        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$hybridConfig$1(hybridConfigManager, (c == null || (i2 = c.i()) == null) ? null : i2.g(), null), 1, null);
                        hybridWebView.loadUrl("javascript:" + ((String) runBlocking$default));
                    }
                }
                bVar.a();
                if (mVar instanceof m.k) {
                    cn8Var.a();
                    lmVar.p(AppLaunchHomeConstants.XPN_HOME);
                }
            }
        }, new ss2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$createWebViewClient$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "it");
                if (m.this.c()) {
                    ss2Var.invoke(str);
                }
            }
        }, z, mVar instanceof m.g, i, h, coroutineScope, ss2Var2, hybridType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(WebView webView, final Asset asset, final ss2 ss2Var) {
        webView.evaluateJavascript("(function(){return window.getSelection().toString()})()", new ValueCallback() { // from class: vd3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                HybridWebViewLayoutKt.m(ss2.this, asset, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ss2 ss2Var, Asset asset, String str) {
        zq3.h(ss2Var, "$block");
        zq3.h(asset, "$asset");
        zq3.e(str);
        String e = new Regex("^\"|\"$").e(str, "");
        if (e.length() > 0) {
            ss2Var.invoke(new fq7(wp7.Companion.a(asset, e)));
        }
    }

    public static final HybridWebView n(m mVar, HybridType hybridType, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, qs2 qs2Var, ss2 ss2Var4, boolean z, boolean z2, boolean z3, gt2 gt2Var, Composer composer, int i, int i2, int i3) {
        zq3.h(mVar, "content");
        zq3.h(hybridType, "hybridType");
        zq3.h(ss2Var, "onProgressChanged");
        zq3.h(ss2Var2, "onPullToRefreshEnabled");
        zq3.h(ss2Var3, "reportDeepLinkAnalytics");
        zq3.h(qs2Var, "reportUserInteraction");
        zq3.h(ss2Var4, "onScroll");
        composer.z(-1101614086);
        boolean z4 = (i3 & 128) != 0 ? false : z;
        boolean z5 = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z2;
        boolean z6 = (i3 & 512) != 0 ? false : z3;
        gt2 gt2Var2 = (i3 & 1024) != 0 ? null : gt2Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1101614086, i, i2, "com.nytimes.android.hybridWebViewLayout (HybridWebViewLayout.kt:133)");
        }
        composer.z(1396128245);
        ComponentActivity d = s5.d(composer, 0);
        composer.z(363804603);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            try {
                zq3.e(d);
                A = z12.a(d, td3.class);
            } catch (Exception unused) {
                A = null;
            }
            composer.q(A);
        }
        composer.R();
        composer.R();
        zq3.e(A);
        td3 td3Var = (td3) A;
        composer.z(-418734006);
        boolean z7 = (((i & 3670016) ^ 1572864) > 1048576 && composer.S(ss2Var4)) || (i & 1572864) == 1048576;
        Object A2 = composer.A();
        if (z7 || A2 == Composer.a.a()) {
            A2 = VerticalScrollStateKt.c(ss2Var4);
            composer.q(A2);
        }
        mt2 mt2Var = (mt2) A2;
        composer.R();
        int i4 = i >> 15;
        int i5 = (i & 14) | (i4 & 896) | (i4 & 7168) | ((i << 6) & 57344);
        int i6 = i << 3;
        final HybridWebView t = t(mVar, td3Var, z4, z5, ss2Var, ss2Var3, qs2Var, ss2Var2, mt2Var, hybridType, gt2Var2, composer, i5 | (458752 & i6) | (i6 & 3670016) | ((i << 12) & 29360128) | ((i << 24) & 1879048192), i2 & 14, 0);
        composer.z(-418733842);
        Modifier u = z6 ? u(Modifier.a, t, composer, (HybridWebView.r << 3) | 6) : NestedScrollViewInteropKt.a(Modifier.a, t);
        composer.R();
        AndroidView_androidKt.b(new ss2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$hybridWebViewLayout$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FrameLayout invoke(Context context) {
                zq3.h(context, "context");
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(HybridWebView.this);
                return frameLayout;
            }
        }, pl0.b(SizeKt.f(u, 0.0f, 1, null)), null, composer, 0, 4);
        if (mVar instanceof m.g) {
            composer.z(-418733159);
            c((m.g) mVar, td3Var, t, composer, HybridWebView.r << 6);
            composer.R();
        } else if (mVar instanceof m.f) {
            composer.z(-418733041);
            e((m.f) mVar, td3Var, t, composer, HybridWebView.r << 6);
            composer.R();
        } else if (mVar instanceof m.k) {
            composer.z(-418732948);
            d(((m.k) mVar).j(), t, composer, HybridWebView.r << 3);
            composer.R();
        } else {
            composer.z(-418732894);
            composer.R();
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return t;
    }

    private static final void o(HybridWebView hybridWebView, m mVar, CoroutineScope coroutineScope, td3 td3Var, final ss2 ss2Var, final qs2 qs2Var, gt2 gt2Var) {
        SetPTREnabledCommand setPTREnabledCommand = new SetPTREnabledCommand(null, new gt2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$initialize$setPTREEnabledCommand$1
            {
                super(2);
            }

            public final BridgeCommandResult b(int i, boolean z) {
                ss2.this.invoke(Boolean.valueOf(z));
                return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            }
        }, 1, null);
        hybridWebView.j(coroutineScope, mVar instanceof m.g ? WebViewType.HYBRID : WebViewType.WEB, b0.n(b0.n(td3Var.l0().a(), setPTREnabledCommand), new AdCommBridgeCommand(gt2Var)));
        hybridWebView.setOnTouchListener(new View.OnTouchListener() { // from class: ud3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean p;
                p = HybridWebViewLayoutKt.p(qs2.this, view, motionEvent);
                return p;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(qs2 qs2Var, View view, MotionEvent motionEvent) {
        zq3.h(qs2Var, "$reportUserInteraction");
        zq3.h(motionEvent, "event");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        qs2Var.mo865invoke();
        return false;
    }

    private static final void q(m mVar, HybridWebView hybridWebView, CoroutineScope coroutineScope) {
        Asset a = mVar.a();
        if (a != null) {
            FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(FlowKt.flowOn(RxConvertKt.asFlow(d83.a.a(eq7.class)), Dispatchers.getIO()), new HybridWebViewLayoutKt$listenToShareEvents$1$1(hybridWebView, a, null)), new HybridWebViewLayoutKt$listenToShareEvents$1$2(null)), coroutineScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final td3 td3Var, final HybridWebView hybridWebView, final m.f fVar, final SnackbarUtil snackbarUtil, final CoroutineScope coroutineScope) {
        if (!td3Var.b().g()) {
            snackbarUtil.r(true, new qs2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$loadWebContentOrError$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m170invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m170invoke() {
                    HybridWebViewLayoutKt.r(td3.this, hybridWebView, fVar, snackbarUtil, coroutineScope);
                }
            });
            return;
        }
        String url = hybridWebView.getUrl();
        if (url == null) {
            url = fVar.getUrl();
        }
        zq3.e(url);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HybridWebViewLayoutKt$loadWebContentOrError$1(td3Var, url, hybridWebView, fVar, null), 3, null);
        if (jv6.a.a(url)) {
            FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(FlowKt.drop(td3Var.q().e(), 1), new HybridWebViewLayoutKt$loadWebContentOrError$2(td3Var, hybridWebView, fVar, snackbarUtil, coroutineScope, null)), new HybridWebViewLayoutKt$loadWebContentOrError$3(null)), coroutineScope);
        }
    }

    private static final void s(CoroutineScope coroutineScope, HybridType hybridType, HybridWebView hybridWebView, td3 td3Var) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HybridWebViewLayoutKt$observeWebViewResponsiveState$1(hybridType, hybridWebView, td3Var, null), 3, null);
    }

    public static final HybridWebView t(final m mVar, final td3 td3Var, boolean z, boolean z2, ss2 ss2Var, ss2 ss2Var2, qs2 qs2Var, ss2 ss2Var3, mt2 mt2Var, HybridType hybridType, gt2 gt2Var, Composer composer, int i, int i2, int i3) {
        jk jkVar;
        Lifecycle lifecycle;
        CoroutineScope coroutineScope;
        zq3.h(mVar, "content");
        zq3.h(td3Var, "entryPoint");
        zq3.h(ss2Var, "onProgressChanged");
        zq3.h(ss2Var2, "reportDeepLinkAnalytics");
        zq3.h(qs2Var, "reportUserInteraction");
        zq3.h(ss2Var3, "onPullToRefreshEnabled");
        zq3.h(mt2Var, "onScroll");
        zq3.h(hybridType, "hybridType");
        composer.z(-463544970);
        gt2 gt2Var2 = (i3 & 1024) != 0 ? null : gt2Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-463544970, i, i2, "com.nytimes.android.rememberWebView (HybridWebViewLayout.kt:229)");
        }
        composer.z(-614131144);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = si1.a.b(td3Var.J(), "HybridWebviewLoading", null, null, 6, null);
            composer.q(A);
        }
        si1 si1Var = (si1) A;
        composer.R();
        py1.d(mVar, new HybridWebViewLayoutKt$rememberWebView$1(si1Var, null), composer, (i & 14) | 64);
        composer.z(773894976);
        composer.z(-492369756);
        Object A2 = composer.A();
        if (A2 == aVar.a()) {
            androidx.compose.runtime.e eVar = new androidx.compose.runtime.e(py1.j(EmptyCoroutineContext.a, composer));
            composer.q(eVar);
            A2 = eVar;
        }
        composer.R();
        CoroutineScope a = ((androidx.compose.runtime.e) A2).a();
        composer.R();
        ComponentActivity d = s5.d(composer, 0);
        zq3.f(d, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        jk jkVar2 = (jk) d;
        Lifecycle lifecycle2 = ((d44) composer.m(AndroidCompositionLocals_androidKt.i())).getLifecycle();
        composer.z(-614130833);
        Object A3 = composer.A();
        if (A3 == aVar.a()) {
            HybridWebView hybridWebView = new HybridWebView(jkVar2, null, 0, 6, null);
            hybridWebView.setForceClamping(z2);
            hybridWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            hybridWebView.setId(ng6.webView);
            o(hybridWebView, mVar, a, td3Var, ss2Var3, qs2Var, gt2Var2);
            td3Var.X().a(hybridWebView);
            hybridWebView.setWebViewClient(k(td3Var.T(), mVar, jkVar2, hybridWebView, a, td3Var.R(), td3Var.N(), td3Var.c0(), td3Var.S(), si1Var, z, ss2Var2, ss2Var, hybridType));
            boolean z3 = mVar instanceof m.g;
            hybridWebView.setWebChromeClient(td3Var.T().c(z3));
            if (z3) {
                jkVar = jkVar2;
                hybridWebView.setBackgroundColor(mx0.c(jkVar, gd6.background_primary));
                final HybridEventManager v = td3Var.v();
                m.g gVar = (m.g) mVar;
                v.b(hybridWebView, gVar.a().getUri(), gVar.a().getUrl(), ss2Var, a);
                ei1 ei1Var = new ei1() { // from class: com.nytimes.android.HybridWebViewLayoutKt$rememberWebView$2$1
                    @Override // defpackage.ei1
                    public void onResume(d44 d44Var) {
                        zq3.h(d44Var, "owner");
                        HybridEventManager.this.d();
                    }
                };
                lifecycle = lifecycle2;
                lifecycle.a(ei1Var);
            } else {
                jkVar = jkVar2;
                lifecycle = lifecycle2;
            }
            lifecycle.a(new ei1() { // from class: com.nytimes.android.HybridWebViewLayoutKt$rememberWebView$2$2
                @Override // defpackage.ei1
                public void onResume(d44 d44Var) {
                    zq3.h(d44Var, "owner");
                    td3.this.u().q(mVar.e());
                }
            });
            ViewExtensions.b(hybridWebView, jkVar, mt2Var);
            if (td3Var.a().r()) {
                coroutineScope = a;
                q(mVar, hybridWebView, coroutineScope);
            } else {
                coroutineScope = a;
            }
            s(coroutineScope, hybridType, hybridWebView, td3Var);
            composer.q(hybridWebView);
            A3 = hybridWebView;
        }
        HybridWebView hybridWebView2 = (HybridWebView) A3;
        composer.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return hybridWebView2;
    }

    private static final Modifier u(Modifier modifier, final HybridWebView hybridWebView, Composer composer, int i) {
        composer.z(69043820);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(69043820, i, -1, "com.nytimes.android.scrollable (HybridWebViewLayout.kt:188)");
        }
        Modifier l = ScrollableKt.l(modifier, ScrollableStateKt.b(new ss2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$scrollable$1
            {
                super(1);
            }

            public final Float b(float f) {
                HybridWebView hybridWebView2 = HybridWebView.this;
                float f2 = -f;
                if (f2 < 0.0f) {
                    f2 = uo6.c(f2, -hybridWebView2.getScrollY());
                } else if (f2 <= 0.0f || !hybridWebView2.canScrollVertically(1)) {
                    f2 = 0.0f;
                }
                hybridWebView2.scrollBy(0, dg4.d(f2));
                return Float.valueOf(-f2);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).floatValue());
            }
        }, composer, 0), Orientation.Vertical, false, false, null, null, 60, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return l;
    }
}
