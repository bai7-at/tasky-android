package com.nytimes.android.features.home.ui.today;

import com.nytimes.android.ads.model.ContentType;
import defpackage.b27;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kb3;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$3", f = "ExampleWebviews.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ExampleWebviewsKt$TodayHybridWebView$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ b27 $entryPoint;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExampleWebviewsKt$TodayHybridWebView$3(b27 b27Var, by0 by0Var) {
        super(2, by0Var);
        this.$entryPoint = b27Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ExampleWebviewsKt$TodayHybridWebView$3(this.$entryPoint, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        kb3.a.a(this.$entryPoint.q0(), ContentType.SECTION_HOMEPAGE.getValue(), "https://www.nytimes.com/pages/index.html", null, 4, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ExampleWebviewsKt$TodayHybridWebView$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
