package com.dropbox.flow.multicast;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.dropbox.flow.multicast.StoreRealActor", f = "StoreRealActor.kt", l = {79, 81}, m = "close")
/* loaded from: classes2.dex */
final class StoreRealActor$close$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StoreRealActor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoreRealActor$close$1(StoreRealActor storeRealActor, by0 by0Var) {
        super(by0Var);
        this.this$0 = storeRealActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(this);
    }
}
