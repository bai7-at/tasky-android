package com.dropbox.android.external.store4.impl;

import com.dropbox.android.external.store4.ResponseOrigin;
import com.dropbox.android.external.store4.SourceOfTruth;
import defpackage.b38;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$reader$1$1$readFlow$2", f = "SourceOfTruthWithBarrier.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SourceOfTruthWithBarrier$reader$1$1$readFlow$2 extends SuspendLambda implements it2 {
    final /* synthetic */ Object $key;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SourceOfTruthWithBarrier$reader$1$1$readFlow$2(Object obj, by0 by0Var) {
        super(3, by0Var);
        this.$key = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            b38.b.a aVar = new b38.b.a(new SourceOfTruth.ReadException(this.$key, (Throwable) this.L$1), ResponseOrigin.SourceOfTruth);
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(aVar, this) == h) {
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
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        SourceOfTruthWithBarrier$reader$1$1$readFlow$2 sourceOfTruthWithBarrier$reader$1$1$readFlow$2 = new SourceOfTruthWithBarrier$reader$1$1$readFlow$2(this.$key, by0Var);
        sourceOfTruthWithBarrier$reader$1$1$readFlow$2.L$0 = flowCollector;
        sourceOfTruthWithBarrier$reader$1$1$readFlow$2.L$1 = th;
        return sourceOfTruthWithBarrier$reader$1$1$readFlow$2.invokeSuspend(ww8.a);
    }
}
