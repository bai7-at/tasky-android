package com.nytimes.android.fragment.article;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.fragment.article.WebViewClientFactory$create$2$1", f = "WebViewClientFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebViewClientFactory$create$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $onProgressChanged;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewClientFactory$create$2$1(ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.$onProgressChanged = ss2Var;
    }

    public final Object b(boolean z, by0 by0Var) {
        return ((WebViewClientFactory$create$2$1) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        WebViewClientFactory$create$2$1 webViewClientFactory$create$2$1 = new WebViewClientFactory$create$2$1(this.$onProgressChanged, by0Var);
        webViewClientFactory$create$2$1.Z$0 = ((Boolean) obj).booleanValue();
        return webViewClientFactory$create$2$1;
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Boolean) obj).booleanValue(), (by0) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$onProgressChanged.invoke(cc0.a(this.Z$0));
        return ww8.a;
    }
}
