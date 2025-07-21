package com.nytimes.android.saved.repository;

import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.assetretriever.e;
import defpackage.by0;
import defpackage.s87;
import defpackage.st;
import defpackage.ww8;
import defpackage.y87;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class AssetRetrieverSavedAssetRepository implements y87 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final AssetRetriever a;
    private final com.nytimes.android.entitlements.a b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AssetRetrieverSavedAssetRepository(AssetRetriever assetRetriever, com.nytimes.android.entitlements.a aVar) {
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(aVar, "eCommClient");
        this.a = assetRetriever;
        this.b = aVar;
    }

    private final Object e(by0 by0Var) {
        return new st("SAVED", null, null, null, this.b.g(), 14, null);
    }

    @Override // defpackage.y87
    public Object a(s87 s87Var, by0 by0Var) {
        Object i = this.a.i(new e.b(s87Var.getUri()), "SAVED", by0Var);
        return i == kotlin.coroutines.intrinsics.a.h() ? i : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.y87
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.s87 r9, defpackage.by0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetch$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetch$1 r0 = (com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetch$1 r0 = new com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetch$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r10)
            goto L7b
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.assetretriever.AssetRetriever r9 = (com.nytimes.android.assetretriever.AssetRetriever) r9
            kotlin.f.b(r10)
            goto L69
        L41:
            kotlin.f.b(r10)
            com.nytimes.android.assetretriever.AssetRetriever r10 = r8.a
            et r2 = new et
            com.nytimes.android.assetretriever.e$b r6 = new com.nytimes.android.assetretriever.e$b
            java.lang.String r9 = r9.getUri()
            r6.<init>(r9)
            r2.<init>(r6, r5)
            java.util.List r9 = kotlin.collections.i.e(r2)
            r0.L$0 = r10
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            r7 = r10
            r10 = r8
            r8 = r9
            r9 = r7
        L69:
            st r10 = (defpackage.st) r10
            r2 = 0
            st[] r2 = new defpackage.st[r2]
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r9.n(r8, r10, r2, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository.b(s87, by0):java.lang.Object");
    }

    @Override // defpackage.y87
    public Object c(List list, by0 by0Var) {
        return SupervisorKt.supervisorScope(new AssetRetrieverSavedAssetRepository$fetchListAndSave$2(list, this, null), by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.y87
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.s87 r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$read$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$read$1 r0 = (com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$read$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$read$1 r0 = new com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$read$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r9)
            goto L8d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$3
            st[] r8 = (defpackage.st[]) r8
            java.lang.Object r2 = r0.L$2
            com.nytimes.android.assetretriever.e r2 = (com.nytimes.android.assetretriever.e) r2
            java.lang.Object r4 = r0.L$1
            com.nytimes.android.assetretriever.AssetRetriever r4 = (com.nytimes.android.assetretriever.AssetRetriever) r4
            java.lang.Object r6 = r0.L$0
            st[] r6 = (defpackage.st[]) r6
            kotlin.f.b(r9)
            goto L7a
        L4b:
            kotlin.f.b(r9)
            java.lang.String r9 = r8.getUri()
            int r2 = r9.length()
            if (r2 <= 0) goto L91
            com.nytimes.android.assetretriever.AssetRetriever r8 = r7.a
            com.nytimes.android.assetretriever.e$b r2 = new com.nytimes.android.assetretriever.e$b
            r2.<init>(r9)
            st[] r9 = new defpackage.st[r4]
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r2
            r0.L$3 = r9
            r6 = 0
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            r4 = r8
            r8 = r9
            r9 = r7
            r7 = r6
            r6 = r8
        L7a:
            r8[r7] = r9
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r9 = r4.o(r2, r5, r6, r0)
            if (r9 != r1) goto L8d
            return r1
        L8d:
            r5 = r9
            com.nytimes.android.api.cms.Asset r5 = (com.nytimes.android.api.cms.Asset) r5
            goto Lba
        L91:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r9 = r8.getUrl()
            java.lang.String r8 = r8.getUri()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Empty uri for saveable "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = "  "
            r0.append(r9)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            com.nytimes.android.logging.NYTLogger.h(r7)
        Lba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository.d(s87, by0):java.lang.Object");
    }
}
