package com.dropbox.android.external.store4.impl;

import com.dropbox.android.external.store4.SourceOfTruth;
import com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier;
import defpackage.b38;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$reader$1$invokeSuspend$$inlined$flatMapLatest$1", f = "SourceOfTruthWithBarrier.kt", l = {239}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SourceOfTruthWithBarrier$reader$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements it2 {
    final /* synthetic */ Object $key$inlined;
    final /* synthetic */ long $readerVersion$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SourceOfTruthWithBarrier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceOfTruthWithBarrier$reader$1$invokeSuspend$$inlined$flatMapLatest$1(by0 by0Var, long j, SourceOfTruthWithBarrier sourceOfTruthWithBarrier, Object obj) {
        super(3, by0Var);
        this.$readerVersion$inlined = j;
        this.this$0 = sourceOfTruthWithBarrier;
        this.$key$inlined = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowOf;
        SourceOfTruth sourceOfTruth;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            SourceOfTruthWithBarrier.a aVar = (SourceOfTruthWithBarrier.a) this.L$1;
            boolean z = this.$readerVersion$inlined < aVar.a();
            Throwable c = (z && (aVar instanceof SourceOfTruthWithBarrier.a.b)) ? ((SourceOfTruthWithBarrier.a.b) aVar).c() : null;
            if (aVar instanceof SourceOfTruthWithBarrier.a.b) {
                sourceOfTruth = this.this$0.a;
                flowOf = FlowKt.m911catch(FlowKt.flow(new SourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda1$$inlined$mapIndexed$1(sourceOfTruth.a(this.$key$inlined), null, z, c)), new SourceOfTruthWithBarrier$reader$1$1$readFlow$2(this.$key$inlined, null));
            } else {
                if (!(aVar instanceof SourceOfTruthWithBarrier.a.C0164a)) {
                    throw new NoWhenBranchMatchedException();
                }
                flowOf = FlowKt.flowOf((Object[]) new b38[0]);
            }
            Flow onStart = FlowKt.onStart(flowOf, new SourceOfTruthWithBarrier$reader$1$1$1(c, null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, onStart, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Object obj, by0 by0Var) {
        SourceOfTruthWithBarrier$reader$1$invokeSuspend$$inlined$flatMapLatest$1 sourceOfTruthWithBarrier$reader$1$invokeSuspend$$inlined$flatMapLatest$1 = new SourceOfTruthWithBarrier$reader$1$invokeSuspend$$inlined$flatMapLatest$1(by0Var, this.$readerVersion$inlined, this.this$0, this.$key$inlined);
        sourceOfTruthWithBarrier$reader$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        sourceOfTruthWithBarrier$reader$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj;
        return sourceOfTruthWithBarrier$reader$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(ww8.a);
    }
}
