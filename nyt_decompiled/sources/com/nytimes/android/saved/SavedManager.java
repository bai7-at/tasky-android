package com.nytimes.android.saved;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.saved.synchronization.AssetSynchronizer;
import com.nytimes.android.saved.synchronization.LowLevelOperations;
import defpackage.by0;
import defpackage.i87;
import defpackage.s87;
import defpackage.ww8;
import defpackage.xr;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public final class SavedManager {
    public static final int $stable = 8;
    private final AssetSynchronizer assetSynchronizer;
    private final com.nytimes.android.entitlements.a eCommClient;
    private final CoroutineDispatcher ioDispatcher;
    private final LowLevelOperations ops;
    private final CoroutineScope scope;
    private final xr stateManager;

    public SavedManager(com.nytimes.android.entitlements.a aVar, AssetSynchronizer assetSynchronizer, LowLevelOperations lowLevelOperations, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope) {
        zq3.h(aVar, "eCommClient");
        zq3.h(assetSynchronizer, "assetSynchronizer");
        zq3.h(lowLevelOperations, "ops");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(coroutineScope, "scope");
        this.eCommClient = aVar;
        this.assetSynchronizer = assetSynchronizer;
        this.ops = lowLevelOperations;
        this.ioDispatcher = coroutineDispatcher;
        this.scope = coroutineScope;
        this.stateManager = new xr();
    }

    public final Object add(s87 s87Var, by0<? super ww8> by0Var) {
        Object withContext = BuildersKt.withContext(this.ioDispatcher, new SavedManager$add$2(this, s87Var, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    public final void clearSaveAfterLogin() {
        this.stateManager.a();
    }

    public final Object delete(s87 s87Var, by0<? super ww8> by0Var) {
        Object withContext = BuildersKt.withContext(this.ioDispatcher, new SavedManager$delete$2(this, s87Var, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    public final Object deleteAllTheAssets(by0<? super ww8> by0Var) {
        LowLevelOperations lowLevelOperations = this.ops;
        Object h = lowLevelOperations.h(lowLevelOperations.n().f(), by0Var);
        return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        com.nytimes.android.logging.NYTLogger.i(r4, "Failed while deleting saved articles", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteCache(defpackage.by0<? super defpackage.ww8> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.saved.SavedManager$deleteCache$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.saved.SavedManager$deleteCache$1 r0 = (com.nytimes.android.saved.SavedManager$deleteCache$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.SavedManager$deleteCache$1 r0 = new com.nytimes.android.saved.SavedManager$deleteCache$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L29
            goto L49
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
            com.nytimes.android.saved.synchronization.LowLevelOperations r4 = r4.ops     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r4.i(r0)     // Catch: java.lang.Exception -> L29
            if (r4 != r1) goto L49
            return r1
        L41:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = "Failed while deleting saved articles"
            com.nytimes.android.logging.NYTLogger.i(r4, r0, r5)
        L49:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.SavedManager.deleteCache(by0):java.lang.Object");
    }

    public final Object deleteFromQueueForDeletion(s87 s87Var, by0<? super ww8> by0Var) {
        Object withContext = BuildersKt.withContext(this.ioDispatcher, new SavedManager$deleteFromQueueForDeletion$2(this, s87Var, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    public final Object deleteQueuedItems(by0<? super ww8> by0Var) {
        Object k = this.ops.k(by0Var);
        return k == kotlin.coroutines.intrinsics.a.h() ? k : ww8.a;
    }

    public final void deleteQueuedItemsBlocking() {
        BuildersKt__BuildersKt.runBlocking$default(null, new SavedManager$deleteQueuedItemsBlocking$1(this, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068 A[PHI: r8
      0x0068: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0065, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAssets(int r6, int r7, defpackage.by0<? super java.util.List<? extends com.nytimes.android.api.cms.Asset>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.saved.SavedManager$getAssets$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.saved.SavedManager$getAssets$1 r0 = (com.nytimes.android.saved.SavedManager$getAssets$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.SavedManager$getAssets$1 r0 = new com.nytimes.android.saved.SavedManager$getAssets$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L68
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            int r7 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.saved.SavedManager r5 = (com.nytimes.android.saved.SavedManager) r5
            kotlin.f.b(r8)
            goto L54
        L40:
            kotlin.f.b(r8)
            com.nytimes.android.saved.synchronization.AssetSynchronizer r8 = r5.assetSynchronizer
            r0.L$0 = r5
            r0.I$0 = r6
            r0.I$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.g(r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            com.nytimes.android.saved.synchronization.AssetSynchronizer r8 = r5.assetSynchronizer
            com.nytimes.android.saved.synchronization.LowLevelOperations r5 = r5.ops
            com.nytimes.android.saved.SavedAssetIndexList r5 = r5.n()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = r8.e(r5, r6, r7, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.SavedManager.getAssets(int, int, by0):java.lang.Object");
    }

    public final Single<List<Asset>> getAssetsAsSingle(int i, int i2) {
        return RxSingleKt.rxSingle$default(null, new SavedManager$getAssetsAsSingle$1(this, i, i2, null), 1, null);
    }

    public final Observable<Float> getPctSyncComplete() {
        return this.assetSynchronizer.f();
    }

    public final boolean isSaved(String str) {
        if (str != null) {
            return this.ops.o(str);
        }
        return false;
    }

    public final boolean isSavedAfterLoginAsset(String str) {
        return this.stateManager.b(str);
    }

    public final Object queueForDeletion(s87 s87Var, by0<? super ww8> by0Var) {
        Object withContext = BuildersKt.withContext(this.ioDispatcher, new SavedManager$queueForDeletion$2(this, s87Var, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    public final void setSaveAfterLogin(String str) {
        zq3.h(str, "uri");
        this.stateManager.c(str);
    }

    public final int size() {
        return this.ops.t();
    }

    public final void syncCache() {
        if (this.eCommClient.q()) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SavedManager$syncCache$1(this, null), 3, null);
        }
    }

    public final Object syncCacheSuspending(by0<? super ww8> by0Var) {
        Object withContext = BuildersKt.withContext(this.ioDispatcher, new SavedManager$syncCacheSuspending$2(this, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    public final boolean isSaved(s87 s87Var) {
        zq3.h(s87Var, "card");
        List b = i87.b(s87Var);
        if ((b instanceof Collection) && b.isEmpty()) {
            return false;
        }
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            if (isSaved((String) it2.next())) {
                return true;
            }
        }
        return false;
    }
}
