package com.nytimes.android;

import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$1", f = "HybridWebViewLayout.kt", l = {463}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $savedScrollPosition;
    final /* synthetic */ HybridWebView $webView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$1(HybridWebView hybridWebView, int i, by0 by0Var) {
        super(2, by0Var);
        this.$webView = hybridWebView;
        this.$savedScrollPosition = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$1(this.$webView, this.$savedScrollPosition, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            this.label = 1;
            if (DelayKt.delay(250L, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        this.$webView.scrollBy(0, this.$savedScrollPosition);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridWebViewLayoutKt$createWebViewClient$1$onContentLoaded$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
