package com.nytimes.android.internal.pushmessaging.subscription;

import androidx.work.ExistingWorkPolicy;
import com.comscore.streaming.ContentType;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;
import com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser;
import com.nytimes.android.internal.pushmessaging.model.Subscription;
import com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl;
import com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import okhttp3.internal.ws.WebSocketProtocol;

@fc1(c = "com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$initSubscription$2", f = "SubscriptionManagerImpl.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubscriptionManagerImpl$initSubscription$2 extends SuspendLambda implements ss2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SubscriptionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionManagerImpl$initSubscription$2(SubscriptionManagerImpl subscriptionManagerImpl, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = subscriptionManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new SubscriptionManagerImpl$initSubscription$2(this.this$0, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((SubscriptionManagerImpl$initSubscription$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        NYTPushMessagingUser nYTPushMessagingUser;
        Set set;
        String str2;
        NYTPushMessagingUser nYTPushMessagingUser2;
        Set set2;
        Object c;
        Collection collection;
        Set set3;
        String str3;
        NYTPushMessagingUser nYTPushMessagingUser3;
        Collection collection2;
        Subscription subscription;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Collection linkedHashSet = new LinkedHashSet();
            str = this.this$0.m;
            boolean z = str != null;
            nYTPushMessagingUser = this.this$0.l;
            boolean z2 = nYTPushMessagingUser != null;
            set = this.this$0.n;
            boolean z3 = set != null;
            ul8.a.z("PushMessaging").u("initSubscription ready: token:%s user:%s tagMetadata:%s", cc0.a(z), cc0.a(z2), cc0.a(z3));
            if (z && z2 && z3) {
                str2 = this.this$0.m;
                zq3.e(str2);
                nYTPushMessagingUser2 = this.this$0.l;
                zq3.e(nYTPushMessagingUser2);
                set2 = this.this$0.n;
                zq3.e(set2);
                PushMessagingDao s = this.this$0.s();
                this.L$0 = linkedHashSet;
                this.L$1 = str2;
                this.L$2 = nYTPushMessagingUser2;
                this.L$3 = set2;
                this.label = 1;
                c = s.c(this);
                if (c == h) {
                    return h;
                }
                collection = linkedHashSet;
                set3 = set2;
                str3 = str2;
                nYTPushMessagingUser3 = nYTPushMessagingUser2;
            }
            return ww8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        set3 = (Set) this.L$3;
        nYTPushMessagingUser3 = (NYTPushMessagingUser) this.L$2;
        String str4 = (String) this.L$1;
        Collection collection3 = (Set) this.L$0;
        f.b(obj);
        str3 = str4;
        collection = collection3;
        c = obj;
        Subscription subscription2 = (Subscription) c;
        Set a = SubscriptionManagerImpl.Companion.a(set3);
        if (subscription2 == null) {
            collection.add(SubscriptionManagerImpl.Companion.UpdateReason.SUBSCRIPTION);
            collection2 = collection;
            subscription = new Subscription(str3, a, nYTPushMessagingUser3.c(), this.this$0.p(), false, this.this$0.t().b().c(), 0, 64, null);
        } else {
            collection2 = collection;
            if (!zq3.c(str3, subscription2.h())) {
                collection2.add(SubscriptionManagerImpl.Companion.UpdateReason.TOKEN);
                subscription2 = Subscription.b(subscription2, str3, null, 0, null, false, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
            }
            Subscription subscription3 = subscription2;
            if (nYTPushMessagingUser3.c() != subscription3.f()) {
                collection2.add(SubscriptionManagerImpl.Companion.UpdateReason.REGI_ID);
                subscription3 = Subscription.b(subscription3, null, null, nYTPushMessagingUser3.c(), null, false, null, 0, ContentType.USER_GENERATED_LIVE, null);
            }
            Subscription subscription4 = subscription3;
            if (!zq3.c(this.this$0.p(), subscription4.c())) {
                collection2.add(SubscriptionManagerImpl.Companion.UpdateReason.APP_VERSION);
                subscription4 = Subscription.b(subscription4, null, null, 0, this.this$0.p(), false, null, 0, 119, null);
            }
            Subscription subscription5 = subscription4;
            if (zq3.c(this.this$0.t().b().c(), subscription5.d())) {
                subscription = subscription5;
            } else {
                collection2.add(SubscriptionManagerImpl.Companion.UpdateReason.ENVIRONMENT);
                subscription = Subscription.b(subscription5, null, null, 0, null, false, this.this$0.t().b().c(), 0, 95, null);
            }
            if (this.this$0.t().c() != null) {
                collection2.add(SubscriptionManagerImpl.Companion.UpdateReason.MIGRATION);
            }
        }
        if (collection2.isEmpty()) {
            ul8.a.z("PushMessaging").l("Skipping init", new Object[0]);
        } else {
            ul8.a.z("PushMessaging").u("Enqueuing Subscription.Worker job: " + collection2, new Object[0]);
            this.this$0.v().a("initSubscription", ExistingWorkPolicy.REPLACE, SubscriptionWorker.a.b(SubscriptionWorker.h, subscription, null, 2, null));
        }
        return ww8.a;
    }
}
