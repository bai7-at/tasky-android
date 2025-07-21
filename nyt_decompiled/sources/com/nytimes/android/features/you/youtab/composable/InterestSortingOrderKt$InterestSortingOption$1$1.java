package com.nytimes.android.features.you.youtab.composable;

import com.nytimes.android.features.you.youtab.SortOrder;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.InterestSortingOrderKt$InterestSortingOption$1$1", f = "InterestSortingOrder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestSortingOrderKt$InterestSortingOption$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $sendSortByImpression;
    final /* synthetic */ x08 $sortOrder$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestSortingOrderKt$InterestSortingOption$1$1(ss2 ss2Var, x08 x08Var, by0 by0Var) {
        super(2, by0Var);
        this.$sendSortByImpression = ss2Var;
        this.$sortOrder$delegate = x08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestSortingOrderKt$InterestSortingOption$1$1(this.$sendSortByImpression, this.$sortOrder$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SortOrder d;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ss2 ss2Var = this.$sendSortByImpression;
        d = InterestSortingOrderKt.d(this.$sortOrder$delegate);
        ss2Var.invoke(d);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((InterestSortingOrderKt$InterestSortingOption$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
