package com.nytimes.android;

import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.m;
import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.td3;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$LoadArticleHtml$1", f = "HybridWebViewLayout.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridWebViewLayoutKt$LoadArticleHtml$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ m.g $content;
    final /* synthetic */ td3 $entryPoint;
    final /* synthetic */ HybridWebView $webView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebViewLayoutKt$LoadArticleHtml$1(m.g gVar, td3 td3Var, HybridWebView hybridWebView, by0 by0Var) {
        super(2, by0Var);
        this.$content = gVar;
        this.$entryPoint = td3Var;
        this.$webView = hybridWebView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebViewLayoutKt$LoadArticleHtml$1(this.$content, this.$entryPoint, this.$webView, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        ArticleAsset a = this.$content.a();
        this.$entryPoint.u().m(this.$content.hashCode(), a, this.$content.e());
        this.$webView.k(a.getHybridBody(), a, HybridWebView.HybridSource.ARTICLE, this.$content.g());
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridWebViewLayoutKt$LoadArticleHtml$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
