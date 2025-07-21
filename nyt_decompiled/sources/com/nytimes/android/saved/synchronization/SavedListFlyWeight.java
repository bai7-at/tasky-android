package com.nytimes.android.saved.synchronization;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.saved.SavedAssetIndexList;
import defpackage.a97;
import defpackage.by0;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes4.dex */
public final class SavedListFlyWeight {
    private final a97 a;
    private SavedAssetIndexList b;
    private final CoroutineScope c;
    private final Mutex d;
    private final Deferred e;

    public SavedListFlyWeight(a97 a97Var, CoroutineDispatcher coroutineDispatcher) {
        Deferred async$default;
        zq3.h(a97Var, "diskPersister");
        zq3.h(coroutineDispatcher, "dispatcher");
        this.a = a97Var;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.c = CoroutineScope;
        this.d = MutexKt.Mutex$default(false, 1, null);
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScope, null, CoroutineStart.LAZY, new SavedListFlyWeight$loading$1(this, null), 1, null);
        this.e = async$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.by0 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.nytimes.android.saved.synchronization.SavedListFlyWeight$deleteFile$1
            if (r0 == 0) goto L13
            r0 = r15
            com.nytimes.android.saved.synchronization.SavedListFlyWeight$deleteFile$1 r0 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight$deleteFile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.SavedListFlyWeight$deleteFile$1 r0 = new com.nytimes.android.saved.synchronization.SavedListFlyWeight$deleteFile$1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r14 = r0.L$1
            kotlinx.coroutines.sync.Mutex r14 = (kotlinx.coroutines.sync.Mutex) r14
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r0 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r0
            kotlin.f.b(r15)     // Catch: java.lang.Throwable -> L35
            goto L70
        L35:
            r15 = move-exception
            goto L8b
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3f:
            java.lang.Object r14 = r0.L$1
            kotlinx.coroutines.sync.Mutex r14 = (kotlinx.coroutines.sync.Mutex) r14
            java.lang.Object r2 = r0.L$0
            com.nytimes.android.saved.synchronization.SavedListFlyWeight r2 = (com.nytimes.android.saved.synchronization.SavedListFlyWeight) r2
            kotlin.f.b(r15)
            r15 = r14
            r14 = r2
            goto L5f
        L4d:
            kotlin.f.b(r15)
            kotlinx.coroutines.sync.Mutex r15 = r14.d
            r0.L$0 = r14
            r0.L$1 = r15
            r0.label = r4
            java.lang.Object r2 = r15.lock(r5, r0)
            if (r2 != r1) goto L5f
            return r1
        L5f:
            a97 r2 = r14.a     // Catch: java.lang.Throwable -> L87
            r0.L$0 = r14     // Catch: java.lang.Throwable -> L87
            r0.L$1 = r15     // Catch: java.lang.Throwable -> L87
            r0.label = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L87
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r0 = r14
            r14 = r15
        L70:
            com.nytimes.android.saved.SavedAssetIndexList r15 = new com.nytimes.android.saved.SavedAssetIndexList     // Catch: java.lang.Throwable -> L35
            r11 = 15
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L35
            r0.b = r15     // Catch: java.lang.Throwable -> L35
            ww8 r15 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L35
            r14.unlock(r5)
            ww8 r14 = defpackage.ww8.a
            return r14
        L87:
            r14 = move-exception
            r13 = r15
            r15 = r14
            r14 = r13
        L8b:
            r14.unlock(r5)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.SavedListFlyWeight.e(by0):java.lang.Object");
    }

    public final SavedAssetIndexList f() {
        if (this.b == null) {
            BuildersKt__BuildersKt.runBlocking$default(null, new SavedListFlyWeight$getList$1(this, null), 1, null);
        }
        SavedAssetIndexList savedAssetIndexList = this.b;
        if (savedAssetIndexList != null) {
            return savedAssetIndexList;
        }
        zq3.z(TransferTable.COLUMN_STATE);
        return null;
    }

    public final Object g(by0 by0Var) {
        Object await = this.e.await(by0Var);
        return await == a.h() ? await : ww8.a;
    }
}
