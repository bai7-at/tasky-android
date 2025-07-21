package com.nytimes.android.eventtracker.coordinator;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.coordinator.DefaultEventCoordinator", f = "DefaultEventCoordinator.kt", l = {195, 196, AdvertisementType.ON_DEMAND_MID_ROLL, 223}, m = "processEvent")
/* loaded from: classes4.dex */
final class DefaultEventCoordinator$processEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultEventCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEventCoordinator$processEvent$1(DefaultEventCoordinator defaultEventCoordinator, by0 by0Var) {
        super(by0Var);
        this.this$0 = defaultEventCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object C;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        C = this.this$0.C(null, this);
        return C;
    }
}
