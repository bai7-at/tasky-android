package com.nytimes.android.growthui.paywall;

import android.content.Context;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.landingpage.LandingPageActivity;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.growthui.paywall.PaywallDialogFragment$onButtonClick$1", f = "PaywallDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PaywallDialogFragment$onButtonClick$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ DataConfigId $targetConfigId;
    int label;
    final /* synthetic */ PaywallDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallDialogFragment$onButtonClick$1(PaywallDialogFragment paywallDialogFragment, DataConfigId dataConfigId, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = paywallDialogFragment;
        this.$targetConfigId = dataConfigId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PaywallDialogFragment$onButtonClick$1(this.this$0, this.$targetConfigId, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        LandingPageActivity.a aVar = LandingPageActivity.Companion;
        Context requireContext = this.this$0.requireContext();
        zq3.g(requireContext, "requireContext(...)");
        LandingPageActivity.a.d(aVar, requireContext, this.$targetConfigId, null, 4, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PaywallDialogFragment$onButtonClick$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
