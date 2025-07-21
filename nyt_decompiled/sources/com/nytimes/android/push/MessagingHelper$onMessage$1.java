package com.nytimes.android.push;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.push.MessagingHelper$onMessage$1", f = "MessagingHelper.kt", l = {48, 49}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MessagingHelper$onMessage$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ BreakingNewsAlert $bna;
    final /* synthetic */ Context $context;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MessagingHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessagingHelper$onMessage$1(MessagingHelper messagingHelper, Context context, BreakingNewsAlert breakingNewsAlert, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = messagingHelper;
        this.$context = context;
        this.$bna = breakingNewsAlert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MessagingHelper$onMessage$1(this.this$0, this.$context, this.$bna, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r0 = r6.L$2
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r6.L$1
            com.nytimes.android.push.BreakingNewsAlert r1 = (com.nytimes.android.push.BreakingNewsAlert) r1
            java.lang.Object r6 = r6.L$0
            com.nytimes.android.push.MessagingHelper r6 = (com.nytimes.android.push.MessagingHelper) r6
            kotlin.f.b(r7)
            goto L5c
        L1e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L26:
            kotlin.f.b(r7)
            goto L3c
        L2a:
            kotlin.f.b(r7)
            com.nytimes.android.push.MessagingHelper r7 = r6.this$0
            android.content.Context r1 = r6.$context
            com.nytimes.android.push.BreakingNewsAlert r4 = r6.$bna
            r6.label = r3
            java.lang.Object r7 = com.nytimes.android.push.MessagingHelper.access$getBnaLaunchAppIntent(r7, r1, r4, r6)
            if (r7 != r0) goto L3c
            return r0
        L3c:
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            if (r7 == 0) goto L8f
            com.nytimes.android.push.MessagingHelper r1 = r6.this$0
            com.nytimes.android.push.BreakingNewsAlert r3 = r6.$bna
            android.content.Context r4 = r6.$context
            com.nytimes.android.push.BreakingNewsAlertManager r5 = com.nytimes.android.push.MessagingHelper.access$getBnaManager$p(r1)
            r6.L$0 = r1
            r6.L$1 = r3
            r6.L$2 = r4
            r6.label = r2
            java.lang.Object r6 = r5.generateNotification(r7, r3, r6)
            if (r6 != r0) goto L59
            return r0
        L59:
            r6 = r1
            r1 = r3
            r0 = r4
        L5c:
            com.nytimes.android.push.MessagingHelper$a r7 = com.nytimes.android.push.MessagingHelper.Companion
            r7.c(r0)
            com.nytimes.android.push.BreakingNewsAlertManager$a r7 = com.nytimes.android.push.BreakingNewsAlertManager.Companion
            boolean r7 = r7.a(r1)
            if (r7 == 0) goto L71
            com.nytimes.android.push.BreakingNewsAlertManager r6 = com.nytimes.android.push.MessagingHelper.access$getBnaManager$p(r6)
            r6.addAlert(r1)
            goto L8c
        L71:
            java.lang.String r6 = r1.b()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "not adding SF expired bna "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.nytimes.android.logging.NYTLogger.l(r6, r7)
        L8c:
            ww8 r6 = defpackage.ww8.a
            goto L90
        L8f:
            r6 = 0
        L90:
            if (r6 != 0) goto L9c
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "BnaLaunchAppIntent was null"
            r6.<init>(r7)
            com.nytimes.android.logging.NYTLogger.h(r6)
        L9c:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.MessagingHelper$onMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MessagingHelper$onMessage$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
