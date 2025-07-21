package com.nytimes.android.fragment.article;

import com.comscore.streaming.EventType;
import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.fragment.AssetViewModel;
import com.nytimes.android.fragment.WebViewFragment;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hd3;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.article.HybridContentLoader$reloadData$1", f = "HybridContentLoader.kt", l = {EventType.CDN}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridContentLoader$reloadData$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HybridContentLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridContentLoader$reloadData$1(HybridContentLoader hybridContentLoader, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridContentLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        HybridContentLoader$reloadData$1 hybridContentLoader$reloadData$1 = new HybridContentLoader$reloadData$1(this.this$0, by0Var);
        hybridContentLoader$reloadData$1.L$0 = obj;
        return hybridContentLoader$reloadData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WebViewFragment webViewFragment;
        CoroutineScope coroutineScope;
        hd3 hd3Var;
        WebViewFragment webViewFragment2;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                webViewFragment = this.this$0.b;
                AssetViewModel v1 = webViewFragment.v1();
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object f = v1.f(this);
                if (f == h) {
                    return h;
                }
                coroutineScope = coroutineScope2;
                obj = f;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                f.b(obj);
            }
            Asset asset = (Asset) obj;
            hd3Var = this.this$0.a;
            hd3Var.m(coroutineScope.hashCode(), asset, HybridType.Article);
            zq3.f(asset, "null cannot be cast to non-null type com.nytimes.android.api.cms.ArticleAsset");
            ArticleAsset articleAsset = (ArticleAsset) asset;
            webViewFragment2 = this.this$0.b;
            HybridWebView hybridWebView = webViewFragment2.l;
            if (hybridWebView != null) {
                HybridWebView.m(hybridWebView, articleAsset.getHybridBody(), articleAsset, HybridWebView.HybridSource.ARTICLE, null, 8, null);
            }
        } catch (Throwable th) {
            NYTLogger.h(th);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridContentLoader$reloadData$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
