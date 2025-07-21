package com.nytimes.android.growthui.landingpage;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.r53;
import defpackage.ww8;
import defpackage.zc5;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.growthui.landingpage.LandingPageActivity$openProductSubscriptions$1", f = "LandingPageActivity.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LandingPageActivity$openProductSubscriptions$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ zc5 $offer;
    int label;
    final /* synthetic */ LandingPageActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LandingPageActivity$openProductSubscriptions$1(LandingPageActivity landingPageActivity, zc5 zc5Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = landingPageActivity;
        this.$offer = zc5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LandingPageActivity$openProductSubscriptions$1(this.this$0, this.$offer, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            r53 Q = this.this$0.Q();
            LandingPageActivity landingPageActivity = this.this$0;
            zc5 zc5Var = this.$offer;
            this.label = 1;
            obj = Q.b(landingPageActivity, zc5Var, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.finish();
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LandingPageActivity$openProductSubscriptions$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
