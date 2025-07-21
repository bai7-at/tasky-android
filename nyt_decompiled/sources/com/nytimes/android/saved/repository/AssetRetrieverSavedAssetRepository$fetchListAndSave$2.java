package com.nytimes.android.saved.repository;

import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s87;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetchListAndSave$2", f = "AssetRetrieverSavedAssetRepository.kt", l = {EventType.CDN}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AssetRetrieverSavedAssetRepository$fetchListAndSave$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<s87> $saveables;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AssetRetrieverSavedAssetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetRetrieverSavedAssetRepository$fetchListAndSave$2(List list, AssetRetrieverSavedAssetRepository assetRetrieverSavedAssetRepository, by0 by0Var) {
        super(2, by0Var);
        this.$saveables = list;
        this.this$0 = assetRetrieverSavedAssetRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AssetRetrieverSavedAssetRepository$fetchListAndSave$2 assetRetrieverSavedAssetRepository$fetchListAndSave$2 = new AssetRetrieverSavedAssetRepository$fetchListAndSave$2(this.$saveables, this.this$0, by0Var);
        assetRetrieverSavedAssetRepository$fetchListAndSave$2.L$0 = obj;
        return assetRetrieverSavedAssetRepository$fetchListAndSave$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a9 -> B:7:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r14.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L25
            java.lang.Object r1 = r14.L$4
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r4 = r14.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r14.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r14.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r14.L$0
            java.util.Collection r7 = (java.util.Collection) r7
            kotlin.f.b(r15)     // Catch: java.lang.Exception -> Lb0
            goto Lab
        L25:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2d:
            kotlin.f.b(r15)
            java.lang.Object r15 = r14.L$0
            kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
            java.util.List<s87> r1 = r14.$saveables
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository r10 = r14.this$0
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r4 = kotlin.collections.i.w(r1, r12)
            r11.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L6f
            java.lang.Object r4 = r1.next()
            s87 r4 = (defpackage.s87) r4
            java.lang.String r13 = r4.getUri()
            com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetchListAndSave$2$results$1$1 r7 = new com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetchListAndSave$2$results$1$1
            r7.<init>(r10, r4, r2)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            r4 = r15
            kotlinx.coroutines.Deferred r4 = kotlinx.coroutines.BuildersKt.async$default(r4, r5, r6, r7, r8, r9)
            kotlin.Pair r4 = defpackage.du8.a(r13, r4)
            r11.add(r4)
            goto L49
        L6f:
            java.util.ArrayList r15 = new java.util.ArrayList
            int r1 = kotlin.collections.i.w(r11, r12)
            r15.<init>(r1)
            java.util.Iterator r1 = r11.iterator()
            r6 = r1
            r1 = r15
        L7e:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto Lbb
            java.lang.Object r15 = r6.next()
            kotlin.Pair r15 = (kotlin.Pair) r15
            java.lang.Object r4 = r15.a()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r15 = r15.b()
            kotlinx.coroutines.Deferred r15 = (kotlinx.coroutines.Deferred) r15
            r14.L$0 = r1     // Catch: java.lang.Exception -> Lae
            r14.L$1 = r6     // Catch: java.lang.Exception -> Lae
            r14.L$2 = r4     // Catch: java.lang.Exception -> Lae
            r14.L$3 = r4     // Catch: java.lang.Exception -> Lae
            r14.L$4 = r1     // Catch: java.lang.Exception -> Lae
            r14.label = r3     // Catch: java.lang.Exception -> Lae
            java.lang.Object r15 = r15.await(r14)     // Catch: java.lang.Exception -> Lae
            if (r15 != r0) goto La9
            return r0
        La9:
            r7 = r1
            r5 = r4
        Lab:
            com.nytimes.android.api.cms.Asset r15 = (com.nytimes.android.api.cms.Asset) r15     // Catch: java.lang.Exception -> Lb0
            goto Lb2
        Lae:
            r7 = r1
            r5 = r4
        Lb0:
            r15 = r2
            r4 = r5
        Lb2:
            kotlin.Pair r15 = defpackage.du8.a(r4, r15)
            r1.add(r15)
            r1 = r7
            goto L7e
        Lbb:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r1.iterator()
        Lc8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Le0
            java.lang.Object r0 = r15.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.b()
            com.nytimes.android.api.cms.Asset r0 = (com.nytimes.android.api.cms.Asset) r0
            if (r0 == 0) goto Lc8
            r14.add(r0)
            goto Lc8
        Le0:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetchListAndSave$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssetRetrieverSavedAssetRepository$fetchListAndSave$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
