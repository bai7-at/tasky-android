package com.nytimes.android.readerhybrid;

import defpackage.by0;
import defpackage.fc1;
import defpackage.fz8;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.readerhybrid.MainWebViewClient$handleURL$2", f = "MainWebViewClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainWebViewClient$handleURL$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $url;
    final /* synthetic */ fz8 $urlOpener;
    int label;
    final /* synthetic */ MainWebViewClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainWebViewClient$handleURL$2(MainWebViewClient mainWebViewClient, fz8 fz8Var, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = mainWebViewClient;
        this.$urlOpener = fz8Var;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MainWebViewClient$handleURL$2(this.this$0, this.$urlOpener, this.$url, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.this$0.h().b(this.$urlOpener.b(), this.$url);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MainWebViewClient$handleURL$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
