package com.nytimes.android.ribbon.destinations.elections;

import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fm9;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ribbon.destinations.elections.ElectionsDestinationKt$ElectionsDestination$1", f = "ElectionsDestination.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ElectionsDestinationKt$ElectionsDestination$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ fm9 $tracker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ElectionsDestinationKt$ElectionsDestination$1(fm9 fm9Var, by0 by0Var) {
        super(2, by0Var);
        this.$tracker = fm9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ElectionsDestinationKt$ElectionsDestination$1(this.$tracker, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        fm9 fm9Var = this.$tracker;
        if (fm9Var != null) {
            fm9Var.n(RibbonConfig.ELECTION.getId());
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ElectionsDestinationKt$ElectionsDestination$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
