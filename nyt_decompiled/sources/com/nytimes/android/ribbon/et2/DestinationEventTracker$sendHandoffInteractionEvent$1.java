package com.nytimes.android.ribbon.et2;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s42;
import defpackage.u32;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.et2.DestinationEventTracker$sendHandoffInteractionEvent$1", f = "DestinationEventTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationEventTracker$sendHandoffInteractionEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ RibbonConfig $config;
    final /* synthetic */ s42 $eventModule;
    int label;
    final /* synthetic */ DestinationEventTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationEventTracker$sendHandoffInteractionEvent$1(DestinationEventTracker destinationEventTracker, RibbonConfig ribbonConfig, s42 s42Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = destinationEventTracker;
        this.$config = ribbonConfig;
        this.$eventModule = s42Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DestinationEventTracker$sendHandoffInteractionEvent$1(this.this$0, this.$config, this.$eventModule, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean l;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        l = this.this$0.l(this.$config);
        if (l) {
            ET2PageScope.DefaultImpls.a(this.this$0.a, new e52.e(), this.$eventModule, new u32(null, DestinationEventTracker.Companion.a(this.$config), "tap", 1, null), null, 8, null);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DestinationEventTracker$sendHandoffInteractionEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
