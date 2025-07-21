package com.dropbox.android.external.store4.impl;

import com.dropbox.android.external.store4.ResponseOrigin;
import defpackage.b38;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda-1$$inlined$mapIndexed$1", f = "SourceOfTruthWithBarrier.kt", l = {28}, m = "invokeSuspend")
/* renamed from: com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda-1$$inlined$mapIndexed$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class SourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda1$$inlined$mapIndexed$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $messageArrivedAfterMe$inlined;
    final /* synthetic */ Flow $this_mapIndexed;
    final /* synthetic */ Throwable $writeError$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda-1$$inlined$mapIndexed$1$a */
    public static final class a implements FlowCollector {
        private int a;
        final /* synthetic */ FlowCollector b;
        final /* synthetic */ boolean c;
        final /* synthetic */ Throwable d;

        public a(FlowCollector flowCollector, boolean z, Throwable th) {
            this.c = z;
            this.d = th;
            this.b = flowCollector;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(Object obj, by0 by0Var) {
            b38.a aVar;
            int i = this.a;
            this.a = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            FlowCollector flowCollector = this.b;
            if (i == 0 && this.c) {
                aVar = new b38.a(obj, this.d == null ? ResponseOrigin.Fetcher : ResponseOrigin.SourceOfTruth);
            } else {
                aVar = new b38.a(obj, ResponseOrigin.SourceOfTruth);
            }
            Object emit = flowCollector.emit(aVar, by0Var);
            return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda1$$inlined$mapIndexed$1(Flow flow, by0 by0Var, boolean z, Throwable th) {
        super(2, by0Var);
        this.$this_mapIndexed = flow;
        this.$messageArrivedAfterMe$inlined = z;
        this.$writeError$inlined = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda1$$inlined$mapIndexed$1 sourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda1$$inlined$mapIndexed$1 = new SourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda1$$inlined$mapIndexed$1(this.$this_mapIndexed, by0Var, this.$messageArrivedAfterMe$inlined, this.$writeError$inlined);
        sourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda1$$inlined$mapIndexed$1.L$0 = obj;
        return sourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda1$$inlined$mapIndexed$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_mapIndexed;
            a aVar = new a(flowCollector, this.$messageArrivedAfterMe$inlined, this.$writeError$inlined);
            this.label = 1;
            if (flow.collect(aVar, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((SourceOfTruthWithBarrier$reader$1$invokeSuspend$lambda1$$inlined$mapIndexed$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
