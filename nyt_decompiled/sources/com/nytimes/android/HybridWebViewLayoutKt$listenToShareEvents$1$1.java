package com.nytimes.android;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.d83;
import defpackage.eq7;
import defpackage.fc1;
import defpackage.fq7;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$listenToShareEvents$1$1", f = "HybridWebViewLayout.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridWebViewLayoutKt$listenToShareEvents$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Asset $asset;
    final /* synthetic */ HybridWebView $webView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebViewLayoutKt$listenToShareEvents$1$1(HybridWebView hybridWebView, Asset asset, by0 by0Var) {
        super(2, by0Var);
        this.$webView = hybridWebView;
        this.$asset = asset;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(eq7 eq7Var, by0 by0Var) {
        return ((HybridWebViewLayoutKt$listenToShareEvents$1$1) create(eq7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebViewLayoutKt$listenToShareEvents$1$1(this.$webView, this.$asset, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        HybridWebViewLayoutKt.l(this.$webView, this.$asset, new ss2() { // from class: com.nytimes.android.HybridWebViewLayoutKt$listenToShareEvents$1$1.1
            public final void b(fq7 fq7Var) {
                zq3.h(fq7Var, "sharedTextFound");
                d83.a.b(fq7Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b((fq7) obj2);
                return ww8.a;
            }
        });
        return ww8.a;
    }
}
