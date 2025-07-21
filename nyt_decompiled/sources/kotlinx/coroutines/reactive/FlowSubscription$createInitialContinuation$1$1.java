package kotlinx.coroutines.reactive;

import defpackage.by0;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class FlowSubscription$createInitialContinuation$1$1 extends FunctionReferenceImpl implements ss2 {
    FlowSubscription$createInitialContinuation$1$1(Object obj) {
        super(1, obj, FlowSubscription.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0<? super ww8> by0Var) {
        Object flowProcessing;
        flowProcessing = ((FlowSubscription) this.receiver).flowProcessing(by0Var);
        return flowProcessing;
    }
}
