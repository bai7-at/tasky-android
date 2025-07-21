package com.nytimes.android.assetretriever;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.section.AssetNotFoundException;
import defpackage.by0;
import defpackage.et;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.pt;
import defpackage.st;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import org.threeten.bp.Instant;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.TemporalUnit;

@fc1(c = "com.nytimes.android.assetretriever.AssetRetriever$retrieveAsset$2", f = "AssetRetriever.kt", l = {79, 85}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AssetRetriever$retrieveAsset$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ e $assetIdentifier;
    final /* synthetic */ Instant $lastModified;
    final /* synthetic */ st[] $sources;
    Object L$0;
    int label;
    final /* synthetic */ AssetRetriever this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetRetriever$retrieveAsset$2(st[] stVarArr, AssetRetriever assetRetriever, e eVar, Instant instant, by0 by0Var) {
        super(2, by0Var);
        this.$sources = stVarArr;
        this.this$0 = assetRetriever;
        this.$assetIdentifier = eVar;
        this.$lastModified = instant;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssetRetriever$retrieveAsset$2(this.$sources, this.this$0, this.$assetIdentifier, this.$lastModified, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pt l;
        h m;
        h m2;
        AssetDownloader k;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.f.b(obj);
                List C0 = kotlin.collections.d.C0(this.$sources);
                if (C0.isEmpty()) {
                    C0 = kotlin.collections.i.e(new st("CACHE", Instant.now().plus(1L, (TemporalUnit) ChronoUnit.DAYS), null, null, null, 28, null));
                }
                m2 = this.this$0.m();
                m2.r(new et(this.$assetIdentifier, this.$lastModified), C0);
                k = this.this$0.k();
                e eVar = this.$assetIdentifier;
                Instant instant = this.$lastModified;
                this.label = 1;
                obj = k.d(eVar, instant, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Exception exc = (Exception) this.L$0;
                    kotlin.f.b(obj);
                    throw exc;
                }
                kotlin.f.b(obj);
            }
            return (Asset) obj;
        } catch (AssetNotFoundException e) {
            m = this.this$0.m();
            m.j(this.$assetIdentifier);
            throw e;
        } catch (Exception e2) {
            l = this.this$0.l();
            this.L$0 = e2;
            this.label = 2;
            if (l.b(this) == h) {
                return h;
            }
            throw e2;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssetRetriever$retrieveAsset$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
