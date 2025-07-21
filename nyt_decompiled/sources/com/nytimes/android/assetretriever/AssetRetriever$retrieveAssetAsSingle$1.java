package com.nytimes.android.assetretriever;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.st;
import defpackage.ww8;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import org.threeten.bp.Instant;

@fc1(c = "com.nytimes.android.assetretriever.AssetRetriever$retrieveAssetAsSingle$1", f = "AssetRetriever.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AssetRetriever$retrieveAssetAsSingle$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ e $assetIdentifier;
    final /* synthetic */ Instant $lastModified;
    final /* synthetic */ st[] $sources;
    int label;
    final /* synthetic */ AssetRetriever this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetRetriever$retrieveAssetAsSingle$1(AssetRetriever assetRetriever, e eVar, Instant instant, st[] stVarArr, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assetRetriever;
        this.$assetIdentifier = eVar;
        this.$lastModified = instant;
        this.$sources = stVarArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssetRetriever$retrieveAssetAsSingle$1(this.this$0, this.$assetIdentifier, this.$lastModified, this.$sources, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            AssetRetriever assetRetriever = this.this$0;
            e eVar = this.$assetIdentifier;
            Instant instant = this.$lastModified;
            st[] stVarArr = this.$sources;
            st[] stVarArr2 = (st[]) Arrays.copyOf(stVarArr, stVarArr.length);
            this.label = 1;
            obj = assetRetriever.o(eVar, instant, stVarArr2, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssetRetriever$retrieveAssetAsSingle$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
