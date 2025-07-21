package com.nytimes.android.fragment.article;

import com.nytimes.android.hybrid.HybridEventListener;
import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.fragment.article.HybridEventManager$init$1", f = "HybridEventManager.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridEventManager$init$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $assetUri;
    final /* synthetic */ String $assetUrl;
    final /* synthetic */ ss2 $onProgressChanged;
    final /* synthetic */ HybridWebView $webView;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HybridEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridEventManager$init$1(HybridEventManager hybridEventManager, String str, String str2, HybridWebView hybridWebView, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridEventManager;
        this.$assetUri = str;
        this.$assetUrl = str2;
        this.$webView = hybridWebView;
        this.$onProgressChanged = ss2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(HybridEventListener.a aVar, by0 by0Var) {
        return ((HybridEventManager$init$1) create(aVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        HybridEventManager$init$1 hybridEventManager$init$1 = new HybridEventManager$init$1(this.this$0, this.$assetUri, this.$assetUrl, this.$webView, this.$onProgressChanged, by0Var);
        hybridEventManager$init$1.L$0 = obj;
        return hybridEventManager$init$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            HybridEventListener.a aVar = (HybridEventListener.a) this.L$0;
            HybridEventManager hybridEventManager = this.this$0;
            String str = this.$assetUri;
            String str2 = this.$assetUrl;
            HybridWebView hybridWebView = this.$webView;
            ss2 ss2Var = this.$onProgressChanged;
            this.label = 1;
            c = hybridEventManager.c(aVar, str, str2, hybridWebView, ss2Var, this);
            if (c == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
