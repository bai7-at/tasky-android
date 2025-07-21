package com.apollographql.apollo.internal;

import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
final class AbortFlowException extends CancellationException {
    private final FlowCollector<?> owner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortFlowException(FlowCollector flowCollector) {
        super("Flow was aborted, no more elements needed");
        zq3.h(flowCollector, "owner");
        this.owner = flowCollector;
    }

    public final void a(FlowCollector flowCollector) {
        zq3.h(flowCollector, "owner");
        if (this.owner != flowCollector) {
            throw this;
        }
    }
}
