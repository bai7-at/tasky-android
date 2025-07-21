package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.it2;
import defpackage.ww8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
/* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements it2 {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    SafeCollectorKt$emitFun$1() {
        super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector<Object> flowCollector, Object obj, by0<? super ww8> by0Var) {
        return flowCollector.emit(obj, by0Var);
    }
}
