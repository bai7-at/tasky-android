package com.nytimes.android.readerhybrid;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.hybrid.HybridConfig;
import defpackage.bc3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ld3;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.readerhybrid.HybridConfigManager$setHybridConfigScript$2", f = "HybridConfigManager.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32, 72}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridConfigManager$setHybridConfigScript$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ ArticleAsset $asset;
    final /* synthetic */ String $pageViewId;
    int label;
    final /* synthetic */ HybridConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridConfigManager$setHybridConfigScript$2(HybridConfigManager hybridConfigManager, String str, ArticleAsset articleAsset, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridConfigManager;
        this.$pageViewId = str;
        this.$asset = articleAsset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridConfigManager$setHybridConfigScript$2(this.this$0, this.$pageViewId, this.$asset, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HybridConfigBuilder hybridConfigBuilder;
        bc3 bc3Var;
        ld3 ld3Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            hybridConfigBuilder = this.this$0.b;
            String str = this.$pageViewId;
            ArticleAsset articleAsset = this.$asset;
            this.label = 1;
            obj = hybridConfigBuilder.b(str, articleAsset, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    f.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        bc3Var = this.this$0.a;
        String b = bc3Var.b((HybridConfig) obj);
        ld3Var = this.this$0.c;
        this.label = 2;
        obj = ld3Var.c(b, this);
        return obj == h ? h : obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridConfigManager$setHybridConfigScript$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
