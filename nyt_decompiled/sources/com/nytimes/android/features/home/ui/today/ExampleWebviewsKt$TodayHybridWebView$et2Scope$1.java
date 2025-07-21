package com.nytimes.android.features.home.ui.today;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$et2Scope$1", f = "ExampleWebviews.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ExampleWebviewsKt$TodayHybridWebView$et2Scope$1 extends SuspendLambda implements gt2 {
    int label;

    ExampleWebviewsKt$TodayHybridWebView$et2Scope$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
        return ((ExampleWebviewsKt$TodayHybridWebView$et2Scope$1) create(eT2CoroutineScope, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ExampleWebviewsKt$TodayHybridWebView$et2Scope$1(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return ww8.a;
    }
}
