package defpackage;

import com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl;
import com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker;

/* loaded from: classes4.dex */
public abstract class sb8 implements op4 {
    public static void a(SubscriptionWorker subscriptionWorker, SubscriptionManagerImpl subscriptionManagerImpl) {
        subscriptionWorker.subscriptionManagerImpl = subscriptionManagerImpl;
    }
}
