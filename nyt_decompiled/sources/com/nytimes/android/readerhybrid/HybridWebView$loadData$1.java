package com.nytimes.android.readerhybrid;

import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.hybrid.bridge.NativeBridge;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.readerhybrid.HybridWebView$loadData$1", f = "HybridWebView.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridWebView$loadData$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ArticleAsset $asset;
    final /* synthetic */ String $baseUrl;
    final /* synthetic */ String $html;
    final /* synthetic */ HybridWebView.HybridSource $source;
    int label;
    final /* synthetic */ HybridWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebView$loadData$1(HybridWebView hybridWebView, ArticleAsset articleAsset, String str, String str2, HybridWebView.HybridSource hybridSource, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridWebView;
        this.$asset = articleAsset;
        this.$html = str;
        this.$baseUrl = str2;
        this.$source = hybridSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebView$loadData$1(this.this$0, this.$asset, this.$html, this.$baseUrl, this.$source, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebViewType webViewType;
        WebViewType webViewType2;
        NativeBridge nativeBridge;
        NativeBridge nativeBridge2;
        PageContext i;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                HybridConfigManager hybridConfigManager = this.this$0.getHybridConfigManager();
                ArticleAsset articleAsset = this.$asset;
                String str = this.$html;
                webViewType = this.this$0.m;
                if (webViewType == null) {
                    zq3.z("webViewType");
                    webViewType2 = null;
                } else {
                    webViewType2 = webViewType;
                }
                nativeBridge = this.this$0.l;
                if (nativeBridge == null) {
                    zq3.z("nativeBridge");
                    nativeBridge2 = null;
                } else {
                    nativeBridge2 = nativeBridge;
                }
                tx1 c = this.this$0.getEt2Scope$reader_hybrid_release().c();
                String g = (c == null || (i = c.i()) == null) ? null : i.g();
                if (g == null) {
                    g = "";
                }
                this.label = 1;
                obj = hybridConfigManager.d(articleAsset, str, webViewType2, nativeBridge2, g, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            String str2 = (String) obj;
            if (str2.length() > 0) {
                HybridWebView hybridWebView = this.this$0;
                String str3 = this.$baseUrl;
                if (str3 == null) {
                    ArticleAsset articleAsset2 = this.$asset;
                    String url = articleAsset2 != null ? articleAsset2.getUrl() : null;
                    if (url == null) {
                        str3 = "https://www.nytimes.com/" + this.$source.getId();
                    } else {
                        str3 = url;
                    }
                }
                hybridWebView.l(str3, str2);
            }
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                NYTLogger.i(th, "Unable to inject HybridConfig using raw hybridBody:" + th.getMessage(), new Object[0]);
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridWebView$loadData$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
