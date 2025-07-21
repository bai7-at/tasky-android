package com.nytimes.android.saved.synchronization;

import com.nytimes.android.saved.SavedAssetIndex;
import com.nytimes.android.saved.SavedAssetIndexList;
import defpackage.by0;
import defpackage.q87;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes4.dex */
public final class AssetSynchronizer {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final LowLevelOperations a;
    private final q87 b;
    private final SavedStrategyMigrationManager c;
    private final Mutex d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AssetSynchronizer(LowLevelOperations lowLevelOperations, q87 q87Var, SavedStrategyMigrationManager savedStrategyMigrationManager) {
        zq3.h(lowLevelOperations, "ops");
        zq3.h(q87Var, "percentageDispatcher");
        zq3.h(savedStrategyMigrationManager, "migrationManager");
        this.a = lowLevelOperations;
        this.b = q87Var;
        this.c = savedStrategyMigrationManager;
        this.d = MutexKt.Mutex$default(false, 1, null);
    }

    private final Object d(SavedAssetIndexList savedAssetIndexList, List list, by0 by0Var) {
        List F0 = i.F0(list, savedAssetIndexList.g());
        ArrayList arrayList = new ArrayList(i.w(F0, 10));
        Iterator it2 = F0.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SavedAssetIndex) it2.next()).getUrl());
        }
        List i = savedAssetIndexList.i();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : i) {
            if (!arrayList.contains(((SavedAssetIndex) obj).getUrl())) {
                arrayList2.add(obj);
            }
        }
        Object h = this.a.h(arrayList2, by0Var);
        return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
    }

    private final void h(int i, int i2) {
        this.b.b(i / i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:11:0x0031, B:13:0x0081, B:15:0x0064, B:17:0x006a, B:21:0x0089, B:24:0x0085, B:28:0x0045), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #0 {Exception -> 0x0038, blocks: (B:11:0x0031, B:13:0x0081, B:15:0x0064, B:17:0x006a, B:21:0x0089, B:24:0x0085, B:28:0x0045), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:11:0x0031, B:13:0x0081, B:15:0x0064, B:17:0x006a, B:21:0x0089, B:24:0x0085, B:28:0x0045), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:13:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.nytimes.android.saved.SavedAssetIndexList r6, int r7, int r8, defpackage.by0 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.nytimes.android.saved.synchronization.AssetSynchronizer$getAssets$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.saved.synchronization.AssetSynchronizer$getAssets$1 r0 = (com.nytimes.android.saved.synchronization.AssetSynchronizer$getAssets$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.AssetSynchronizer$getAssets$1 r0 = new com.nytimes.android.saved.synchronization.AssetSynchronizer$getAssets$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r5 = r0.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$1
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.saved.synchronization.AssetSynchronizer r7 = (com.nytimes.android.saved.synchronization.AssetSynchronizer) r7
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L38
            r4 = r7
            r7 = r6
            r6 = r4
            goto L81
        L38:
            r5 = move-exception
            goto L8c
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L42:
            kotlin.f.b(r9)
            java.util.List r6 = r6.f()     // Catch: java.lang.Exception -> L38
            int r9 = r6.size()     // Catch: java.lang.Exception -> L38
            int r8 = r8 + r7
            int r8 = defpackage.uo6.i(r9, r8)     // Catch: java.lang.Exception -> L38
            java.util.List r6 = r6.subList(r7, r8)     // Catch: java.lang.Exception -> L38
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Exception -> L38
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> L38
            r7.<init>()     // Catch: java.lang.Exception -> L38
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L38
            r4 = r6
            r6 = r5
            r5 = r4
        L64:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Exception -> L38
            if (r8 == 0) goto L89
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Exception -> L38
            com.nytimes.android.saved.SavedAssetIndex r8 = (com.nytimes.android.saved.SavedAssetIndex) r8     // Catch: java.lang.Exception -> L38
            com.nytimes.android.saved.synchronization.LowLevelOperations r9 = r6.a     // Catch: java.lang.Exception -> L38
            r0.L$0 = r6     // Catch: java.lang.Exception -> L38
            r0.L$1 = r7     // Catch: java.lang.Exception -> L38
            r0.L$2 = r5     // Catch: java.lang.Exception -> L38
            r0.label = r3     // Catch: java.lang.Exception -> L38
            java.lang.Object r9 = r9.q(r8, r0)     // Catch: java.lang.Exception -> L38
            if (r9 != r1) goto L81
            return r1
        L81:
            com.nytimes.android.api.cms.Asset r9 = (com.nytimes.android.api.cms.Asset) r9     // Catch: java.lang.Exception -> L38
            if (r9 == 0) goto L64
            r7.add(r9)     // Catch: java.lang.Exception -> L38
            goto L64
        L89:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L38
            return r7
        L8c:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "Failed to get saved assets"
            com.nytimes.android.logging.NYTLogger.i(r5, r7, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.AssetSynchronizer.e(com.nytimes.android.saved.SavedAssetIndexList, int, int, by0):java.lang.Object");
    }

    public final Observable f() {
        return this.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.saved.synchronization.AssetSynchronizer$migrateAndSyncIfNeeded$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.saved.synchronization.AssetSynchronizer$migrateAndSyncIfNeeded$1 r0 = (com.nytimes.android.saved.synchronization.AssetSynchronizer$migrateAndSyncIfNeeded$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.AssetSynchronizer$migrateAndSyncIfNeeded$1 r0 = new com.nytimes.android.saved.synchronization.AssetSynchronizer$migrateAndSyncIfNeeded$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L60
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.saved.synchronization.AssetSynchronizer r5 = (com.nytimes.android.saved.synchronization.AssetSynchronizer) r5
            kotlin.f.b(r6)
            goto L4c
        L3c:
            kotlin.f.b(r6)
            com.nytimes.android.saved.synchronization.SavedStrategyMigrationManager r6 = r5.c
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L63
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L60
            return r1
        L60:
            ww8 r5 = defpackage.ww8.a
            return r5
        L63:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.AssetSynchronizer.g(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.nytimes.android.saved.synchronization.AssetSynchronizer$sync$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.saved.synchronization.AssetSynchronizer$sync$1 r0 = (com.nytimes.android.saved.synchronization.AssetSynchronizer$sync$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.synchronization.AssetSynchronizer$sync$1 r0 = new com.nytimes.android.saved.synchronization.AssetSynchronizer$sync$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            kotlin.f.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L70
        L31:
            r8 = move-exception
            goto L7c
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r2 = r0.L$0
            com.nytimes.android.saved.synchronization.AssetSynchronizer r2 = (com.nytimes.android.saved.synchronization.AssetSynchronizer) r2
            kotlin.f.b(r8)
            r8 = r7
            r7 = r2
            goto L5b
        L49:
            kotlin.f.b(r8)
            kotlinx.coroutines.sync.Mutex r8 = r7.d
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            kotlinx.coroutines.NonCancellable r2 = kotlinx.coroutines.NonCancellable.INSTANCE     // Catch: java.lang.Throwable -> L78
            com.nytimes.android.saved.synchronization.AssetSynchronizer$sync$2$1 r4 = new com.nytimes.android.saved.synchronization.AssetSynchronizer$sync$2$1     // Catch: java.lang.Throwable -> L78
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L78
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L78
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L78
            r0.label = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r2, r4, r0)     // Catch: java.lang.Throwable -> L78
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r7 = r8
        L70:
            ww8 r8 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L31
            r7.unlock(r5)
            ww8 r7 = defpackage.ww8.a
            return r7
        L78:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L7c:
            r7.unlock(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.AssetSynchronizer.i(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9 A[LOOP:1: B:45:0x00b3->B:47:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0183 -> B:13:0x0185). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x018a -> B:14:0x018e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.List r12, com.nytimes.android.saved.SavedAssetIndexList r13, boolean r14, defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.synchronization.AssetSynchronizer.j(java.util.List, com.nytimes.android.saved.SavedAssetIndexList, boolean, by0):java.lang.Object");
    }
}
