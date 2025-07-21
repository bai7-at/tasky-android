package com.nytimes.android.internal.pushmessaging.subscription;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.CoroutineWorker;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.nytimes.android.internal.pushmessaging.model.Subscription;
import com.nytimes.android.internal.pushmessaging.model.b;
import defpackage.gv0;
import defpackage.zq3;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SubscriptionWorker extends CoroutineWorker {
    public static final a h = new a(null);
    private final WorkerParameters g;
    public SubscriptionManagerImpl subscriptionManagerImpl;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c b(a aVar, Subscription subscription, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return aVar.a(subscription, str);
        }

        public final c a(Subscription subscription, String str) {
            zq3.h(subscription, "sub");
            return (c) ((c.a) ((c.a) ((c.a) ((c.a) new c.a(SubscriptionWorker.class).j(new gv0.a().b(NetworkType.CONNECTED).a())).a("PushMessaging.SubscriptionWorker")).i(BackoffPolicy.EXPONENTIAL, 1L, TimeUnit.MINUTES)).m(b.a(subscription, str))).b();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zq3.h(context, "context");
        zq3.h(workerParameters, "workerParams");
        this.g = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker$doWork$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker$doWork$1 r0 = (com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker$doWork$1 r0 = new com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker$doWork$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L29
            goto L5b
        L29:
            r4 = move-exception
            goto L63
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r5)
            f61 r5 = defpackage.f61.a     // Catch: java.lang.Exception -> L29
            ca6 r5 = r5.a()     // Catch: java.lang.Exception -> L29
            r5.c(r4)     // Catch: java.lang.Exception -> L29
            com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl r5 = r4.f()     // Catch: java.lang.Exception -> L29
            androidx.work.WorkerParameters r4 = r4.g     // Catch: java.lang.Exception -> L29
            androidx.work.Data r4 = r4.d()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "getInputData(...)"
            defpackage.zq3.g(r4, r2)     // Catch: java.lang.Exception -> L29
            com.nytimes.android.internal.pushmessaging.model.Subscription r4 = com.nytimes.android.internal.pushmessaging.model.b.b(r4)     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r5.z(r4, r0)     // Catch: java.lang.Exception -> L29
            if (r4 != r1) goto L5b
            return r1
        L5b:
            androidx.work.b$a r4 = androidx.work.b.a.c()     // Catch: java.lang.Exception -> L29
            defpackage.zq3.e(r4)     // Catch: java.lang.Exception -> L29
            goto L7a
        L63:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r0 = "PushMessaging"
            ul8$c r5 = r5.z(r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "SubscriptionWorker failed (will retry)"
            r5.f(r4, r1, r0)
            androidx.work.b$a r4 = androidx.work.b.a.b()
            defpackage.zq3.e(r4)
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker.b(by0):java.lang.Object");
    }

    public final SubscriptionManagerImpl f() {
        SubscriptionManagerImpl subscriptionManagerImpl = this.subscriptionManagerImpl;
        if (subscriptionManagerImpl != null) {
            return subscriptionManagerImpl;
        }
        zq3.z("subscriptionManagerImpl");
        return null;
    }
}
