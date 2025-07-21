package com.nytimes.android.ribbon.et2;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.et2.DestinationEventTracker$pageSwipeEvent$1", f = "DestinationEventTracker.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationEventTracker$pageSwipeEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ RibbonConfig $config;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DestinationEventTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationEventTracker$pageSwipeEvent$1(DestinationEventTracker destinationEventTracker, RibbonConfig ribbonConfig, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = destinationEventTracker;
        this.$config = ribbonConfig;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DestinationEventTracker$pageSwipeEvent$1 destinationEventTracker$pageSwipeEvent$1 = new DestinationEventTracker$pageSwipeEvent$1(this.this$0, this.$config, this.$url, by0Var);
        destinationEventTracker$pageSwipeEvent$1.L$0 = obj;
        return destinationEventTracker$pageSwipeEvent$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean m;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            m = this.this$0.m(this.$config);
            if (m) {
                this.this$0.x("panel swipe", this.$config);
                DestinationEventTracker destinationEventTracker = this.this$0;
                RibbonConfig ribbonConfig = this.$config;
                String str = this.$url;
                this.label = 1;
                if (DestinationEventTracker.z(destinationEventTracker, coroutineScope, ribbonConfig, str, null, this, 4, null) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DestinationEventTracker$pageSwipeEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
