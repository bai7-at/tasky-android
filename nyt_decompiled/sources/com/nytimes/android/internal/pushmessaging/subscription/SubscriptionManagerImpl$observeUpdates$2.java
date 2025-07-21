package com.nytimes.android.internal.pushmessaging.subscription;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$observeUpdates$2", f = "SubscriptionManagerImpl.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubscriptionManagerImpl$observeUpdates$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ SubscriptionManagerImpl this$0;

    @fc1(c = "com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$observeUpdates$2$1", f = "SubscriptionManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl$observeUpdates$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            ul8.a.z("PushMessaging").e((Throwable) this.L$0);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(ww8.a);
        }
    }

    static final class a implements FlowCollector {
        final /* synthetic */ SubscriptionManagerImpl a;

        a(SubscriptionManagerImpl subscriptionManagerImpl) {
            this.a = subscriptionManagerImpl;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, by0 by0Var) {
            Object w;
            this.a.m = str;
            ul8.a.z("PushMessaging").l("Received token " + str, new Object[0]);
            w = this.a.w(by0Var);
            return w == kotlin.coroutines.intrinsics.a.h() ? w : ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionManagerImpl$observeUpdates$2(SubscriptionManagerImpl subscriptionManagerImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = subscriptionManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubscriptionManagerImpl$observeUpdates$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow m911catch = FlowKt.m911catch(this.this$0.q().a(), new AnonymousClass1(null));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (m911catch.collect(aVar, this) == h) {
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
        return ((SubscriptionManagerImpl$observeUpdates$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
