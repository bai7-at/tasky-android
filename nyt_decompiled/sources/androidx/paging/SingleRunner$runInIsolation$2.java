package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import zendesk.core.BuildConfig;

@fc1(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {BuildConfig.VERSION_CODE, 59, LockFreeTaskQueueCore.CLOSED_SHIFT, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SingleRunner$runInIsolation$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $block;
    final /* synthetic */ int $priority;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleRunner$runInIsolation$2(SingleRunner singleRunner, int i, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = singleRunner;
        this.$priority = i;
        this.$block = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.this$0, this.$priority, this.$block, by0Var);
        singleRunner$runInIsolation$2.L$0 = obj;
        return singleRunner$runInIsolation$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.SingleRunner$Holder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.paging.SingleRunner$runInIsolation$2, by0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.paging.SingleRunner$runInIsolation$2, by0] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [androidx.paging.SingleRunner$Holder] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L34
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L25
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1c:
            java.lang.Object r8 = r8.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.f.b(r9)
            goto La0
        L25:
            kotlin.f.b(r9)
            goto La1
        L2a:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            kotlin.f.b(r9)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r9 = move-exception
            goto L8e
        L34:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            kotlin.f.b(r9)
            goto L67
        L3c:
            kotlin.f.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            kotlin.coroutines.CoroutineContext r9 = r9.getCoroutineContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$a r9 = r9.get(r1)
            if (r9 == 0) goto La4
            kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
            androidx.paging.SingleRunner r1 = r8.this$0
            androidx.paging.SingleRunner$Holder r1 = androidx.paging.SingleRunner.a(r1)
            int r6 = r8.$priority
            r8.L$0 = r9
            r8.label = r5
            java.lang.Object r1 = r1.b(r6, r9, r8)
            if (r1 != r0) goto L64
            return r0
        L64:
            r7 = r1
            r1 = r9
            r9 = r7
        L67:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La1
            ss2 r9 = r8.$block     // Catch: java.lang.Throwable -> L32
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L32
            r8.label = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L32
            if (r9 != r0) goto L7c
            return r0
        L7c:
            androidx.paging.SingleRunner r9 = r8.this$0
            androidx.paging.SingleRunner$Holder r9 = androidx.paging.SingleRunner.a(r9)
            r2 = 0
            r8.L$0 = r2
            r8.label = r3
            java.lang.Object r8 = r9.a(r1, r8)
            if (r8 != r0) goto La1
            return r0
        L8e:
            androidx.paging.SingleRunner r3 = r8.this$0
            androidx.paging.SingleRunner$Holder r3 = androidx.paging.SingleRunner.a(r3)
            r8.L$0 = r9
            r8.label = r2
            java.lang.Object r8 = r3.a(r1, r8)
            if (r8 != r0) goto L9f
            return r0
        L9f:
            r8 = r9
        La0:
            throw r8
        La1:
            ww8 r8 = defpackage.ww8.a
            return r8
        La4:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Internal error. coroutineScope should've created a job."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner$runInIsolation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SingleRunner$runInIsolation$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
