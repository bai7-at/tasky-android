package defpackage;

import com.nytimes.android.internal.pushmessaging.PushMessaging;
import com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class fa6 implements PushMessaging {
    private final /* synthetic */ SubscriptionManagerImpl a;

    public fa6(SubscriptionManagerImpl subscriptionManagerImpl) {
        zq3.h(subscriptionManagerImpl, "subscriptionManager");
        this.a = subscriptionManagerImpl;
    }

    @Override // com.nytimes.android.internal.pushmessaging.PushMessaging
    public Object a(Set set, by0 by0Var) {
        return this.a.a(set, by0Var);
    }

    @Override // com.nytimes.android.internal.pushmessaging.PushMessaging
    public Flow b() {
        return this.a.b();
    }

    @Override // com.nytimes.android.internal.pushmessaging.PushMessaging
    public Object c(Set set, by0 by0Var) {
        return this.a.c(set, by0Var);
    }
}
