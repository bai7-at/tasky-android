package com.nytimes.android.readerhybrid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.webkit.WebViewClient;
import com.nytimes.android.ads.hybrid.bridge.commands.AdCommBridgeCommand;
import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.hybrid.bridge.JavascriptEventParameter;
import com.nytimes.android.hybrid.bridge.NativeBridge;
import com.nytimes.android.logging.NYTLogger;
import defpackage.b22;
import defpackage.by0;
import defpackage.ju;
import defpackage.mc0;
import defpackage.qe9;
import defpackage.sd3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.y15;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes4.dex */
public final class HybridWebView extends b implements ju {
    public static final int r = 8;
    public qe9 darkModeManager;
    public ET2Scope et2Scope;
    public HybridConfigManager hybridConfigManager;
    public sd3 hybridWebViewConfigurer;
    public CoroutineDispatcher ioDispatcher;
    private NativeBridge l;
    private WebViewType m;
    private CoroutineScope n;
    public y15 nativeBridgeFactory;
    public SharedPreferences prefs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HybridSource {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ HybridSource[] $VALUES;
        public static final HybridSource ARTICLE = new HybridSource("ARTICLE", 0, AssetConstants.ARTICLE_TYPE);
        public static final HybridSource INTERACTIVE = new HybridSource("INTERACTIVE", 1, AssetConstants.INTERACTIVE_TYPE);
        public static final HybridSource TODAY_TAB = new HybridSource("TODAY_TAB", 2, "today_tab");
        private final String id;

        private static final /* synthetic */ HybridSource[] $values() {
            return new HybridSource[]{ARTICLE, INTERACTIVE, TODAY_TAB};
        }

        static {
            HybridSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private HybridSource(String str, int i, String str2) {
            this.id = str2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static HybridSource valueOf(String str) {
            return (HybridSource) Enum.valueOf(HybridSource.class, str);
        }

        public static HybridSource[] values() {
            return (HybridSource[]) $VALUES.clone();
        }

        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HybridWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(String str, String str2) {
        loadDataWithBaseURL(str, str2, "text/html; charset=utf-8", "base64", null);
    }

    public static /* synthetic */ void m(HybridWebView hybridWebView, String str, ArticleAsset articleAsset, HybridSource hybridSource, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            articleAsset = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        hybridWebView.k(str, articleAsset, hybridSource, str2);
    }

    @Override // defpackage.ju
    public Object a(String str, by0 by0Var) {
        WebViewClient webViewClient = getWebViewClient();
        MainWebViewClient mainWebViewClient = webViewClient instanceof MainWebViewClient ? (MainWebViewClient) webViewClient : null;
        if (mainWebViewClient != null) {
            return mainWebViewClient.a(this, str, by0Var);
        }
        return null;
    }

    public final qe9 getDarkModeManager() {
        qe9 qe9Var = this.darkModeManager;
        if (qe9Var != null) {
            return qe9Var;
        }
        zq3.z("darkModeManager");
        return null;
    }

    public final ET2Scope getEt2Scope$reader_hybrid_release() {
        ET2Scope eT2Scope = this.et2Scope;
        if (eT2Scope != null) {
            return eT2Scope;
        }
        zq3.z("et2Scope");
        return null;
    }

    public final HybridConfigManager getHybridConfigManager() {
        HybridConfigManager hybridConfigManager = this.hybridConfigManager;
        if (hybridConfigManager != null) {
            return hybridConfigManager;
        }
        zq3.z("hybridConfigManager");
        return null;
    }

    public final sd3 getHybridWebViewConfigurer$reader_hybrid_release() {
        sd3 sd3Var = this.hybridWebViewConfigurer;
        if (sd3Var != null) {
            return sd3Var;
        }
        zq3.z("hybridWebViewConfigurer");
        return null;
    }

    public final CoroutineDispatcher getIoDispatcher() {
        CoroutineDispatcher coroutineDispatcher = this.ioDispatcher;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        zq3.z("ioDispatcher");
        return null;
    }

    public final y15 getNativeBridgeFactory() {
        y15 y15Var = this.nativeBridgeFactory;
        if (y15Var != null) {
            return y15Var;
        }
        zq3.z("nativeBridgeFactory");
        return null;
    }

    public final SharedPreferences getPrefs() {
        SharedPreferences sharedPreferences = this.prefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        zq3.z("prefs");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(CoroutineScope coroutineScope, WebViewType webViewType, Collection collection) {
        zq3.h(coroutineScope, "scope");
        zq3.h(webViewType, "webViewType");
        zq3.h(collection, "commands");
        this.m = webViewType;
        this.n = coroutineScope;
        getHybridWebViewConfigurer$reader_hybrid_release().b(this, webViewType);
        getDarkModeManager().a(this);
        y15 nativeBridgeFactory = getNativeBridgeFactory();
        mc0[] mc0VarArr = (mc0[]) d.B(collection.toArray(new mc0[0]), new AdCommBridgeCommand(null, 1, 0 == true ? 1 : 0));
        this.l = nativeBridgeFactory.a(this, (mc0[]) Arrays.copyOf(mc0VarArr, mc0VarArr.length));
        JobKt.getJob(coroutineScope.getCoroutineContext()).invokeOnCompletion(new ss2() { // from class: com.nytimes.android.readerhybrid.HybridWebView$initialize$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                NativeBridge nativeBridge;
                nativeBridge = HybridWebView.this.l;
                if (nativeBridge == null) {
                    zq3.z("nativeBridge");
                    nativeBridge = null;
                }
                nativeBridge.i();
            }
        });
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public final void k(String str, ArticleAsset articleAsset, HybridSource hybridSource, String str2) {
        zq3.h(str, AssetConstants.HTML);
        zq3.h(hybridSource, "source");
        CoroutineScope coroutineScope = this.n;
        if (coroutineScope == null) {
            zq3.z("scope");
            coroutineScope = null;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HybridWebView$loadData$1(this, articleAsset, str, str2, hybridSource, null), 3, null);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        zq3.h(str2, "data");
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        try {
            NativeBridge nativeBridge = this.l;
            if (nativeBridge == null) {
                zq3.z("nativeBridge");
                nativeBridge = null;
            }
            evaluateJavascript(nativeBridge.d(), null);
        } catch (Throwable th) {
            NYTLogger.h(th);
        }
    }

    public final Object n(JavascriptEventParameter javascriptEventParameter, Class cls, by0 by0Var) {
        NativeBridge nativeBridge = this.l;
        if (nativeBridge == null) {
            zq3.z("nativeBridge");
            nativeBridge = null;
        }
        return nativeBridge.f(javascriptEventParameter, cls, by0Var);
    }

    public final void setDarkModeManager(qe9 qe9Var) {
        zq3.h(qe9Var, "<set-?>");
        this.darkModeManager = qe9Var;
    }

    public final void setEt2Scope$reader_hybrid_release(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "<set-?>");
        this.et2Scope = eT2Scope;
    }

    public final void setHybridConfigManager(HybridConfigManager hybridConfigManager) {
        zq3.h(hybridConfigManager, "<set-?>");
        this.hybridConfigManager = hybridConfigManager;
    }

    public final void setHybridWebViewConfigurer$reader_hybrid_release(sd3 sd3Var) {
        zq3.h(sd3Var, "<set-?>");
        this.hybridWebViewConfigurer = sd3Var;
    }

    public final void setIoDispatcher(CoroutineDispatcher coroutineDispatcher) {
        zq3.h(coroutineDispatcher, "<set-?>");
        this.ioDispatcher = coroutineDispatcher;
    }

    public final void setNativeBridgeFactory(y15 y15Var) {
        zq3.h(y15Var, "<set-?>");
        this.nativeBridgeFactory = y15Var;
    }

    public final void setPrefs(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "<set-?>");
        this.prefs = sharedPreferences;
    }

    public /* synthetic */ HybridWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
    }
}
