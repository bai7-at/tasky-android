package com.nytimes.android;

import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$LoadTodayHtml$2", f = "HybridWebViewLayout.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridWebViewLayoutKt$LoadTodayHtml$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $html;
    final /* synthetic */ HybridWebView $webView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebViewLayoutKt$LoadTodayHtml$2(HybridWebView hybridWebView, String str, by0 by0Var) {
        super(2, by0Var);
        this.$webView = hybridWebView;
        this.$html = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebViewLayoutKt$LoadTodayHtml$2(this.$webView, this.$html, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        HybridWebView.m(this.$webView, this.$html, null, HybridWebView.HybridSource.TODAY_TAB, null, 8, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridWebViewLayoutKt$LoadTodayHtml$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
