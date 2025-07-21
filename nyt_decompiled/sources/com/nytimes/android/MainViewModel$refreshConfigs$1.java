package com.nytimes.android;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.MainViewModel$refreshConfigs$1", f = "MainViewModel.kt", l = {83, 87, 88}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MainViewModel$refreshConfigs$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainViewModel$refreshConfigs$1(MainViewModel mainViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MainViewModel$refreshConfigs$1(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r6)
            goto L5a
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1d:
            kotlin.f.b(r6)
            goto L4b
        L21:
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L25
            goto L3c
        L25:
            r6 = move-exception
            goto L39
        L27:
            kotlin.f.b(r6)
            com.nytimes.android.MainViewModel r6 = r5.this$0     // Catch: java.lang.Exception -> L25
            com.nytimes.android.latestfeed.feed.FeedStore r6 = com.nytimes.android.MainViewModel.g(r6)     // Catch: java.lang.Exception -> L25
            r5.label = r4     // Catch: java.lang.Exception -> L25
            java.lang.Object r6 = r6.c(r4, r5)     // Catch: java.lang.Exception -> L25
            if (r6 != r0) goto L3c
            return r0
        L39:
            com.nytimes.android.logging.NYTLogger.h(r6)
        L3c:
            com.nytimes.android.MainViewModel r6 = r5.this$0
            com.nytimes.android.abra.AbraManager r6 = com.nytimes.android.MainViewModel.e(r6)
            r5.label = r3
            java.lang.Object r6 = r6.forceRefresh(r5)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            com.nytimes.android.MainViewModel r6 = r5.this$0
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater r6 = com.nytimes.android.MainViewModel.i(r6)
            r5.label = r2
            java.lang.Object r5 = r6.c(r5)
            if (r5 != r0) goto L5a
            return r0
        L5a:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.MainViewModel$refreshConfigs$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MainViewModel$refreshConfigs$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
