package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.bk3;
import defpackage.by0;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class FlowKt__CollectKt$collect$3<T> implements FlowCollector<T> {
    final /* synthetic */ gt2 $action;

    public FlowKt__CollectKt$collect$3(gt2 gt2Var) {
        this.$action = gt2Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, by0<? super ww8> by0Var) {
        Object invoke = this.$action.invoke(t, by0Var);
        return invoke == a.h() ? invoke : ww8.a;
    }

    public Object emit$$forInline(T t, final by0<? super ww8> by0Var) {
        bk3.c(4);
        new ContinuationImpl(by0Var) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= RecyclerView.UNDEFINED_DURATION;
                return FlowKt__CollectKt$collect$3.this.emit(null, this);
            }
        };
        bk3.c(5);
        this.$action.invoke(t, by0Var);
        return ww8.a;
    }
}
