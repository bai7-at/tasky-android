package com.nytimes.android.features.you.youtab.composable.interests;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.InterestDisplayKt$InterestCard$1$1$1", f = "InterestDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestDisplayKt$InterestCard$1$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $isNewlyAdded;
    final /* synthetic */ qs2 $sendNewlyAddedLabelImpression;
    final /* synthetic */ qs2 $sendUpdatedInterestDotImpression;
    final /* synthetic */ boolean $showNewContentBadge;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestDisplayKt$InterestCard$1$1$1(boolean z, qs2 qs2Var, boolean z2, qs2 qs2Var2, by0 by0Var) {
        super(2, by0Var);
        this.$isNewlyAdded = z;
        this.$sendNewlyAddedLabelImpression = qs2Var;
        this.$showNewContentBadge = z2;
        this.$sendUpdatedInterestDotImpression = qs2Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestDisplayKt$InterestCard$1$1$1(this.$isNewlyAdded, this.$sendNewlyAddedLabelImpression, this.$showNewContentBadge, this.$sendUpdatedInterestDotImpression, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        if (this.$isNewlyAdded) {
            this.$sendNewlyAddedLabelImpression.mo865invoke();
        } else if (this.$showNewContentBadge) {
            this.$sendUpdatedInterestDotImpression.mo865invoke();
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((InterestDisplayKt$InterestCard$1$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
