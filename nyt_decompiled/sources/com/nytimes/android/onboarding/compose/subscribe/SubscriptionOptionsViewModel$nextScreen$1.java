package com.nytimes.android.onboarding.compose.subscribe;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.onboarding.compose.b;
import com.nytimes.android.onboarding.compose.c;
import defpackage.by0;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s42;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.onboarding.compose.subscribe.SubscriptionOptionsViewModel$nextScreen$1", f = "SubscriptionOptionsViewModel.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubscriptionOptionsViewModel$nextScreen$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SubscriptionOptionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionOptionsViewModel$nextScreen$1(SubscriptionOptionsViewModel subscriptionOptionsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subscriptionOptionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubscriptionOptionsViewModel$nextScreen$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2SimpleScope eT2SimpleScope;
        b bVar;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            eT2SimpleScope = this.this$0.a;
            ET2PageScope.DefaultImpls.a(eT2SimpleScope, new e52.e(), new s42("continue", "continue", null, null, null, null, null, null, null, 508, null), null, null, 12, null);
            bVar = this.this$0.c;
            c.f fVar = c.f.b;
            this.label = 1;
            if (bVar.d(fVar, this) == h) {
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
        return ((SubscriptionOptionsViewModel$nextScreen$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
