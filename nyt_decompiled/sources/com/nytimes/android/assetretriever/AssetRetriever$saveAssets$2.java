package com.nytimes.android.assetretriever;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.HasHybridProperties;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.resourcedownloader.model.AssetResourceSource;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h07;
import defpackage.st;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.assetretriever.AssetRetriever$saveAssets$2", f = "AssetRetriever.kt", l = {131}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AssetRetriever$saveAssets$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<Asset> $assets;
    final /* synthetic */ st[] $optionalSources;
    final /* synthetic */ st $source;
    int label;
    final /* synthetic */ AssetRetriever this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetRetriever$saveAssets$2(st[] stVarArr, st stVar, List list, AssetRetriever assetRetriever, by0 by0Var) {
        super(2, by0Var);
        this.$optionalSources = stVarArr;
        this.$source = stVar;
        this.$assets = list;
        this.this$0 = assetRetriever;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssetRetriever$saveAssets$2(this.$optionalSources, this.$source, this.$assets, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h07 h07Var;
        h m;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            List G0 = kotlin.collections.i.G0(kotlin.collections.d.C0(this.$optionalSources), this.$source);
            List<Asset> list = this.$assets;
            AssetRetriever assetRetriever = this.this$0;
            for (Asset asset : list) {
                m = assetRetriever.m();
                m.m(new e.b(asset.getSafeUri()), asset, G0);
            }
            List<Asset> list2 = this.$assets;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof HasHybridProperties) {
                    arrayList.add(obj2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(kotlin.collections.i.w(arrayList, 10)), 16));
            for (Object obj3 : arrayList) {
                HasHybridProperties hasHybridProperties = (HasHybridProperties) obj3;
                zq3.f(hasHybridProperties, "null cannot be cast to non-null type com.nytimes.android.api.cms.Asset");
                linkedHashMap.put(obj3, new AssetResourceSource(((Asset) hasHybridProperties).getSafeUri()));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.e(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(((HasHybridProperties) entry.getKey()).toHybridProperties(), entry.getValue());
            }
            h07Var = this.this$0.c;
            this.label = 1;
            if (h07Var.e(linkedHashMap2, "AssetRetriever", true, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssetRetriever$saveAssets$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
