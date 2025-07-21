package com.nytimes.android.interests;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gp3;
import defpackage.gt2;
import defpackage.ww8;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.interests.InterestsCacheManager$loadInterestId$2", f = "InterestsCacheManager.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsCacheManager$loadInterestId$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ int $id;
    int label;
    final /* synthetic */ InterestsCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsCacheManager$loadInterestId$2(InterestsCacheManager interestsCacheManager, int i, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = interestsCacheManager;
        this.$id = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsCacheManager$loadInterestId$2(this.this$0, this.$id, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gp3 gp3Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            gp3Var = this.this$0.c;
            int i2 = this.$id;
            this.label = 1;
            obj = gp3Var.b(i2, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return i.m0((List) obj);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((InterestsCacheManager$loadInterestId$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
