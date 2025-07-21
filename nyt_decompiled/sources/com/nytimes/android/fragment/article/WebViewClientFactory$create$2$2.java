package com.nytimes.android.fragment.article;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.fragment.article.WebViewClientFactory$create$2$2", f = "WebViewClientFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewClientFactory$create$2$2 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;

    WebViewClientFactory$create$2$2(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        NYTLogger.h((Throwable) this.L$0);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        WebViewClientFactory$create$2$2 webViewClientFactory$create$2$2 = new WebViewClientFactory$create$2$2(by0Var);
        webViewClientFactory$create$2$2.L$0 = th;
        return webViewClientFactory$create$2$2.invokeSuspend(ww8.a);
    }
}
