package com.nytimes.android;

import com.nytimes.android.m;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.td3;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$LoadWebContent$1", f = "HybridWebViewLayout.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridWebViewLayoutKt$LoadWebContent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ m.f $content;
    final /* synthetic */ td3 $entryPoint;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnackbarUtil $snackbar;
    final /* synthetic */ HybridWebView $webView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebViewLayoutKt$LoadWebContent$1(td3 td3Var, HybridWebView hybridWebView, m.f fVar, SnackbarUtil snackbarUtil, CoroutineScope coroutineScope, by0 by0Var) {
        super(2, by0Var);
        this.$entryPoint = td3Var;
        this.$webView = hybridWebView;
        this.$content = fVar;
        this.$snackbar = snackbarUtil;
        this.$scope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebViewLayoutKt$LoadWebContent$1(this.$entryPoint, this.$webView, this.$content, this.$snackbar, this.$scope, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        HybridWebViewLayoutKt.r(this.$entryPoint, this.$webView, this.$content, this.$snackbar, this.$scope);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridWebViewLayoutKt$LoadWebContent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
