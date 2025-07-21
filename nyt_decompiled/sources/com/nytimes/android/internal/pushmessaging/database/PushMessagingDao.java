package com.nytimes.android.internal.pushmessaging.database;

import com.nytimes.android.internal.pushmessaging.model.Subscription;
import defpackage.by0;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public abstract class PushMessagingDao {
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object h(com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r5, java.util.List r6, defpackage.by0 r7) {
        /*
            boolean r0 = r7 instanceof com.nytimes.android.internal.pushmessaging.database.PushMessagingDao$replaceAllTags$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao$replaceAllTags$1 r0 = (com.nytimes.android.internal.pushmessaging.database.PushMessagingDao$replaceAllTags$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao$replaceAllTags$1 r0 = new com.nytimes.android.internal.pushmessaging.database.PushMessagingDao$replaceAllTags$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r5 = (com.nytimes.android.internal.pushmessaging.database.PushMessagingDao) r5
            kotlin.f.b(r7)
            goto L51
        L41:
            kotlin.f.b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.b(r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r5 = r5.f(r6, r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.database.PushMessagingDao.h(com.nytimes.android.internal.pushmessaging.database.PushMessagingDao, java.util.List, by0):java.lang.Object");
    }

    public abstract Object a(by0 by0Var);

    public abstract Object b(by0 by0Var);

    public abstract Object c(by0 by0Var);

    public abstract Flow d();

    public abstract Flow e();

    public abstract Object f(List list, by0 by0Var);

    public Object g(List list, by0 by0Var) {
        return h(this, list, by0Var);
    }

    public abstract Object i(Subscription subscription, by0 by0Var);
}
