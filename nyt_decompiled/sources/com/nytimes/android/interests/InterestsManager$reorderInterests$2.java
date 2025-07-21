package com.nytimes.android.interests;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.yj;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.interests.InterestsManager$reorderInterests$2", f = "InterestsManager.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsManager$reorderInterests$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $onSuccess;
    final /* synthetic */ List<Integer> $order;
    int label;
    final /* synthetic */ InterestsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsManager$reorderInterests$2(InterestsManager interestsManager, List list, qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = interestsManager;
        this.$order = list;
        this.$onSuccess = qs2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(yj yjVar, by0 by0Var) {
        return ((InterestsManager$reorderInterests$2) create(yjVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsManager$reorderInterests$2(this.this$0, this.$order, this.$onSuccess, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterestsCacheManager interestsCacheManager;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            interestsCacheManager = this.this$0.b;
            List<Integer> list = this.$order;
            this.label = 1;
            if (interestsCacheManager.p(list, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        this.$onSuccess.mo865invoke();
        return ww8.a;
    }
}
