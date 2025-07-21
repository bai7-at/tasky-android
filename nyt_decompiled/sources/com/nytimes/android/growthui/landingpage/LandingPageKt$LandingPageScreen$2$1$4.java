package com.nytimes.android.growthui.landingpage;

import defpackage.by0;
import defpackage.cy3;
import defpackage.d46;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.growthui.landingpage.LandingPageKt$LandingPageScreen$2$1$4", f = "LandingPage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LandingPageKt$LandingPageScreen$2$1$4 extends SuspendLambda implements gt2 {
    final /* synthetic */ cy3 $analytics;
    final /* synthetic */ d46 $content;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LandingPageKt$LandingPageScreen$2$1$4(cy3 cy3Var, d46 d46Var, by0 by0Var) {
        super(2, by0Var);
        this.$analytics = cy3Var;
        this.$content = d46Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LandingPageKt$LandingPageScreen$2$1$4(this.$analytics, this.$content, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        cy3.a.a(this.$analytics, this.$content.b(), null, 2, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LandingPageKt$LandingPageScreen$2$1$4) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
