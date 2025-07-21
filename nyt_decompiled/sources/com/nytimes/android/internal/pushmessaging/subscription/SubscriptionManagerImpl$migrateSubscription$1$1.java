package com.nytimes.android.internal.pushmessaging.subscription;

import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;
import com.nytimes.android.internal.pushmessaging.model.Subscription;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$migrateSubscription$1$1", f = "SubscriptionManagerImpl.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubscriptionManagerImpl$migrateSubscription$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Subscription $it;
    int label;
    final /* synthetic */ SubscriptionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionManagerImpl$migrateSubscription$1$1(SubscriptionManagerImpl subscriptionManagerImpl, Subscription subscription, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subscriptionManagerImpl;
        this.$it = subscription;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubscriptionManagerImpl$migrateSubscription$1$1(this.this$0, this.$it, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            PushMessagingDao s = this.this$0.s();
            Subscription subscription = this.$it;
            this.label = 1;
            if (s.i(subscription, this) == h) {
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
        return ((SubscriptionManagerImpl$migrateSubscription$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
