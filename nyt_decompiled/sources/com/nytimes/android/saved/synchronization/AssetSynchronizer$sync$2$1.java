package com.nytimes.android.saved.synchronization;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.synchronization.AssetSynchronizer$sync$2$1", f = "AssetSynchronizer.kt", l = {41, 42, 43, 45, 47, 54}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AssetSynchronizer$sync$2$1 extends SuspendLambda implements gt2 {
    boolean Z$0;
    int label;
    final /* synthetic */ AssetSynchronizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetSynchronizer$sync$2$1(AssetSynchronizer assetSynchronizer, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assetSynchronizer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssetSynchronizer$sync$2$1(this.this$0, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0013, B:8:0x00ba, B:14:0x0020, B:16:0x00aa, B:19:0x0025, B:20:0x0080, B:23:0x0029, B:24:0x0070, B:27:0x002d, B:28:0x0060, B:31:0x0031, B:32:0x0050, B:36:0x0041), top: B:2:0x0008, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f A[RETURN] */
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
            r2 = 1
            r3 = 0
            switch(r1) {
                case 0: goto L35;
                case 1: goto L31;
                case 2: goto L2d;
                case 3: goto L29;
                case 4: goto L25;
                case 5: goto L1e;
                case 6: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L13:
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto Lba
        L18:
            r7 = move-exception
            goto Ld6
        L1b:
            r7 = move-exception
            goto Lcb
        L1e:
            boolean r1 = r6.Z$0
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto La8
        L25:
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto L80
        L29:
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto L70
        L2d:
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto L60
        L31:
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto L50
        L35:
            kotlin.f.b(r7)
            com.nytimes.android.saved.synchronization.AssetSynchronizer r7 = r6.this$0
            q87 r7 = com.nytimes.android.saved.synchronization.AssetSynchronizer.c(r7)
            r7.d()
            com.nytimes.android.saved.synchronization.AssetSynchronizer r7 = r6.this$0     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            com.nytimes.android.saved.synchronization.LowLevelOperations r7 = com.nytimes.android.saved.synchronization.AssetSynchronizer.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r6.label = r2     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.lang.Object r7 = r7.k(r6)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            if (r7 != r0) goto L50
            return r0
        L50:
            com.nytimes.android.saved.synchronization.AssetSynchronizer r7 = r6.this$0     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            com.nytimes.android.saved.synchronization.LowLevelOperations r7 = com.nytimes.android.saved.synchronization.AssetSynchronizer.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r1 = 2
            r6.label = r1     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.lang.Object r7 = r7.e(r6)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            if (r7 != r0) goto L60
            return r0
        L60:
            com.nytimes.android.saved.synchronization.AssetSynchronizer r7 = r6.this$0     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            com.nytimes.android.saved.synchronization.LowLevelOperations r7 = com.nytimes.android.saved.synchronization.AssetSynchronizer.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r1 = 3
            r6.label = r1     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.lang.Object r7 = r7.s(r6)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            if (r7 != r0) goto L70
            return r0
        L70:
            com.nytimes.android.saved.synchronization.AssetSynchronizer r7 = r6.this$0     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            com.nytimes.android.saved.synchronization.LowLevelOperations r7 = com.nytimes.android.saved.synchronization.AssetSynchronizer.b(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r1 = 4
            r6.label = r1     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.lang.Object r7 = r7.m(r6)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            if (r7 != r0) goto L80
            return r0
        L80:
            kotlin.Pair r7 = (kotlin.Pair) r7     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.lang.Object r1 = r7.a()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            com.nytimes.android.saved.synchronization.AssetSynchronizer r2 = r6.this$0     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            com.nytimes.android.saved.synchronization.LowLevelOperations r4 = com.nytimes.android.saved.synchronization.AssetSynchronizer.b(r2)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            com.nytimes.android.saved.SavedAssetIndexList r4 = r4.n()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r6.Z$0 = r1     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r5 = 5
            r6.label = r5     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.lang.Object r7 = r2.j(r7, r4, r1, r6)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            if (r7 != r0) goto La8
            return r0
        La8:
            if (r1 != 0) goto Lba
            com.nytimes.android.saved.synchronization.AssetSynchronizer r7 = r6.this$0     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            com.nytimes.android.saved.synchronization.SavedStrategyMigrationManager r7 = com.nytimes.android.saved.synchronization.AssetSynchronizer.a(r7)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            r1 = 6
            r6.label = r1     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            java.lang.Object r7 = r7.c(r6)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            if (r7 != r0) goto Lba
            return r0
        Lba:
            java.lang.String r7 = "saved sync completed "
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            com.nytimes.android.logging.NYTLogger.l(r7, r0)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
        Lc1:
            com.nytimes.android.saved.synchronization.AssetSynchronizer r6 = r6.this$0
            q87 r6 = com.nytimes.android.saved.synchronization.AssetSynchronizer.c(r6)
            r6.c()
            goto Ld3
        Lcb:
            java.lang.String r0 = "saved sync aborted "
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L18
            com.nytimes.android.logging.NYTLogger.i(r7, r0, r1)     // Catch: java.lang.Throwable -> L18
            goto Lc1
        Ld3:
            ww8 r6 = defpackage.ww8.a
            return r6
        Ld6:
            com.nytimes.android.saved.synchronization.AssetSynchronizer r6 = r6.this$0
            q87 r6 = com.nytimes.android.saved.synchronization.AssetSynchronizer.c(r6)
            r6.c()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.AssetSynchronizer$sync$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssetSynchronizer$sync$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
