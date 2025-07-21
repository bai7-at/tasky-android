package com.nytimes.android.jobs;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.nytimes.android.jobs.UpdateWorkerCompletableCreator$create$1", f = "UpdateWorker.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT, 66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class UpdateWorkerCompletableCreator$create$1 extends SuspendLambda implements gt2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ UpdateWorkerCompletableCreator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateWorkerCompletableCreator$create$1(UpdateWorkerCompletableCreator updateWorkerCompletableCreator, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = updateWorkerCompletableCreator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new UpdateWorkerCompletableCreator$create$1(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:21:0x0091). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r10.label
            java.lang.String r2 = "success"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L28
            if (r1 != r3) goto L20
            java.lang.Object r0 = r10.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r10 = r10.L$0
            ps3 r10 = (defpackage.ps3) r10
            kotlin.f.b(r11)     // Catch: java.lang.Exception -> L1d
            goto Lc0
        L1d:
            r11 = move-exception
            goto Lcb
        L20:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L28:
            java.lang.Object r1 = r10.L$3
            ps3 r1 = (defpackage.ps3) r1
            java.lang.Object r5 = r10.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r10.L$0
            com.nytimes.android.jobs.UpdateWorkerCompletableCreator r7 = (com.nytimes.android.jobs.UpdateWorkerCompletableCreator) r7
            kotlin.f.b(r11)     // Catch: java.lang.Exception -> L3c
            goto L91
        L3c:
            r10 = move-exception
            goto L97
        L3e:
            kotlin.f.b(r11)
            com.nytimes.android.jobs.UpdateWorkerCompletableCreator r11 = r10.this$0
            pk9 r11 = com.nytimes.android.jobs.UpdateWorkerCompletableCreator.a(r11)
            r11.a()
            com.nytimes.android.jobs.UpdateWorkerCompletableCreator r11 = r10.this$0
            if8 r11 = com.nytimes.android.jobs.UpdateWorkerCompletableCreator.d(r11)
            java.util.List r11 = r11.b()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            com.nytimes.android.jobs.UpdateWorkerCompletableCreator r1 = r10.this$0
            java.util.Iterator r11 = r11.iterator()
            r6 = r11
            r7 = r1
        L5e:
            boolean r11 = r6.hasNext()
            java.lang.String r1 = "loading..."
            if (r11 == 0) goto L9b
            java.lang.Object r11 = r6.next()
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r5 = r11.a()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r11 = r11.b()
            de4 r11 = (defpackage.de4) r11
            ps3 r8 = com.nytimes.android.jobs.UpdateWorkerCompletableCreator.b(r7)
            r8.a(r5, r1)     // Catch: java.lang.Exception -> L95
            r10.L$0 = r7     // Catch: java.lang.Exception -> L95
            r10.L$1 = r6     // Catch: java.lang.Exception -> L95
            r10.L$2 = r5     // Catch: java.lang.Exception -> L95
            r10.L$3 = r8     // Catch: java.lang.Exception -> L95
            r10.label = r4     // Catch: java.lang.Exception -> L95
            java.lang.Object r11 = r11.d(r10)     // Catch: java.lang.Exception -> L95
            if (r11 != r0) goto L90
            return r0
        L90:
            r1 = r8
        L91:
            r1.b(r5, r2)     // Catch: java.lang.Exception -> L3c
            goto L5e
        L95:
            r10 = move-exception
            r1 = r8
        L97:
            r1.c(r5, r10)
            throw r10
        L9b:
            com.nytimes.android.jobs.UpdateWorkerCompletableCreator r11 = r10.this$0
            ps3 r11 = com.nytimes.android.jobs.UpdateWorkerCompletableCreator.b(r11)
            java.lang.String r4 = "Saved cache"
            com.nytimes.android.jobs.UpdateWorkerCompletableCreator r5 = r10.this$0
            r11.a(r4, r1)     // Catch: java.lang.Exception -> Lc6
            com.nytimes.android.saved.SavedManager r1 = com.nytimes.android.jobs.UpdateWorkerCompletableCreator.c(r5)     // Catch: java.lang.Exception -> Lc6
            r10.L$0 = r11     // Catch: java.lang.Exception -> Lc6
            r10.L$1 = r4     // Catch: java.lang.Exception -> Lc6
            r5 = 0
            r10.L$2 = r5     // Catch: java.lang.Exception -> Lc6
            r10.L$3 = r5     // Catch: java.lang.Exception -> Lc6
            r10.label = r3     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r10 = r1.syncCacheSuspending(r10)     // Catch: java.lang.Exception -> Lc6
            if (r10 != r0) goto Lbe
            return r0
        Lbe:
            r10 = r11
            r0 = r4
        Lc0:
            r10.b(r0, r2)     // Catch: java.lang.Exception -> L1d
            ww8 r10 = defpackage.ww8.a
            return r10
        Lc6:
            r10 = move-exception
            r0 = r4
            r9 = r11
            r11 = r10
            r10 = r9
        Lcb:
            r10.c(r0, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.jobs.UpdateWorkerCompletableCreator$create$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((UpdateWorkerCompletableCreator$create$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
