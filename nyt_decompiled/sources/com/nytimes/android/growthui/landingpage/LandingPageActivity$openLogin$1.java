package com.nytimes.android.growthui.landingpage;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.t43;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.growthui.landingpage.LandingPageActivity$openLogin$1", f = "LandingPageActivity.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LandingPageActivity$openLogin$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ LandingPageActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LandingPageActivity$openLogin$1(LandingPageActivity landingPageActivity, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = landingPageActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LandingPageActivity$openLogin$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            t43 O = this.this$0.O();
            LandingPageActivity landingPageActivity = this.this$0;
            this.label = 1;
            if (O.a(landingPageActivity, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LandingPageActivity$openLogin$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
