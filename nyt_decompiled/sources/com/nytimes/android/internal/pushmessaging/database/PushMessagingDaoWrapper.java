package com.nytimes.android.internal.pushmessaging.database;

import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class PushMessagingDaoWrapper extends PushMessagingDao {
    private final PushMessagingDao a;

    public PushMessagingDaoWrapper(PushMessagingDao pushMessagingDao) {
        zq3.h(pushMessagingDao, "dao");
        this.a = pushMessagingDao;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        defpackage.ul8.a.z("PushMessaging").e(r4);
        r4 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$countTags$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$countTags$1 r0 = (com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$countTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$countTags$1 r0 = new com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$countTags$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r5)
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r4 = r4.a     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r4.a(r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Exception -> L29
            int r4 = r5.intValue()     // Catch: java.lang.Exception -> L29
            goto L54
        L48:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r0 = "PushMessaging"
            ul8$c r5 = r5.z(r0)
            r5.e(r4)
            r4 = 0
        L54:
            java.lang.Integer r4 = defpackage.cc0.c(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper.a(by0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        defpackage.ul8.a.z("PushMessaging").e(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$deleteTag$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$deleteTag$1 r0 = (com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$deleteTag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$deleteTag$1 r0 = new com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$deleteTag$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L29
            goto L4c
        L29:
            r4 = move-exception
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r5)
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r4 = r4.a     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r4.b(r0)     // Catch: java.lang.Exception -> L29
            if (r4 != r1) goto L4c
            return r1
        L41:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r0 = "PushMessaging"
            ul8$c r5 = r5.z(r0)
            r5.e(r4)
        L4c:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper.b(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$getSubscription$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$getSubscription$1 r0 = (com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$getSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$getSubscription$1 r0 = new com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$getSubscription$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r5)
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r4 = r4.a     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r4.c(r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L41
            return r1
        L41:
            com.nytimes.android.internal.pushmessaging.model.Subscription r5 = (com.nytimes.android.internal.pushmessaging.model.Subscription) r5     // Catch: java.lang.Exception -> L29
            goto L50
        L44:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r0 = "PushMessaging"
            ul8$c r5 = r5.z(r0)
            r5.e(r4)
            r5 = 0
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper.c(by0):java.lang.Object");
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Flow d() {
        return this.a.d();
    }

    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    public Flow e() {
        return this.a.e();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        defpackage.ul8.a.z("PushMessaging").e(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.util.List r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$insertTags$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$insertTags$1 r0 = (com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$insertTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$insertTags$1 r0 = new com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$insertTags$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L29
            goto L4c
        L29:
            r4 = move-exception
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r4 = r4.a     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r4.f(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r4 != r1) goto L4c
            return r1
        L41:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r6 = "PushMessaging"
            ul8$c r5 = r5.z(r6)
            r5.e(r4)
        L4c:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper.f(java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        defpackage.ul8.a.z("PushMessaging").e(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.util.List r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$replaceAllTags$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$replaceAllTags$1 r0 = (com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$replaceAllTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$replaceAllTags$1 r0 = new com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$replaceAllTags$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L29
            goto L4c
        L29:
            r4 = move-exception
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r4 = r4.a     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r4.g(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r4 != r1) goto L4c
            return r1
        L41:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r6 = "PushMessaging"
            ul8$c r5 = r5.z(r6)
            r5.e(r4)
        L4c:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper.g(java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        defpackage.ul8.a.z("PushMessaging").e(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.nytimes.android.internal.pushmessaging.database.PushMessagingDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(com.nytimes.android.internal.pushmessaging.model.Subscription r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$updateSubscription$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$updateSubscription$1 r0 = (com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$updateSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$updateSubscription$1 r0 = new com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper$updateSubscription$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L29
            goto L4c
        L29:
            r4 = move-exception
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r4 = r4.a     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r4.i(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r4 != r1) goto L4c
            return r1
        L41:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r6 = "PushMessaging"
            ul8$c r5 = r5.z(r6)
            r5.e(r4)
        L4c:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper.i(com.nytimes.android.internal.pushmessaging.model.Subscription, by0):java.lang.Object");
    }
}
