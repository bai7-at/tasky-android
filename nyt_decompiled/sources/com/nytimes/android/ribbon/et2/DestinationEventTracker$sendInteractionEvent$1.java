package com.nytimes.android.ribbon.et2;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.s42;
import defpackage.u32;
import defpackage.ue4;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.et2.DestinationEventTracker$sendInteractionEvent$1", f = "DestinationEventTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DestinationEventTracker$sendInteractionEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ RibbonConfig $config;
    final /* synthetic */ u32 $eventData;
    final /* synthetic */ ue4 $extraData;
    final /* synthetic */ s42 $module;
    int label;
    final /* synthetic */ DestinationEventTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationEventTracker$sendInteractionEvent$1(DestinationEventTracker destinationEventTracker, RibbonConfig ribbonConfig, s42 s42Var, u32 u32Var, ue4 ue4Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = destinationEventTracker;
        this.$config = ribbonConfig;
        this.$module = s42Var;
        this.$eventData = u32Var;
        this.$extraData = ue4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DestinationEventTracker$sendInteractionEvent$1(this.this$0, this.$config, this.$module, this.$eventData, this.$extraData, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RibbonConfig ribbonConfig;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ribbonConfig = this.this$0.d;
        if (ribbonConfig == this.$config) {
            ET2SimpleScope eT2SimpleScope = this.this$0.a;
            e52.e eVar = new e52.e();
            s42 s42Var = this.$module;
            u32 u32Var = this.$eventData;
            final ue4 ue4Var = this.$extraData;
            eT2SimpleScope.a(eVar, s42Var, u32Var, new qs2() { // from class: com.nytimes.android.ribbon.et2.DestinationEventTracker$sendInteractionEvent$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ue4 mo865invoke() {
                    return ue4.this;
                }
            });
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DestinationEventTracker$sendInteractionEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
