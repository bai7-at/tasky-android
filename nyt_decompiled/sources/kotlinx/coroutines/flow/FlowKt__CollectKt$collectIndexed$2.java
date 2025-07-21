package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.bk3;
import defpackage.by0;
import defpackage.cc0;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class FlowKt__CollectKt$collectIndexed$2<T> implements FlowCollector<T> {
    final /* synthetic */ it2 $action;
    private int index;

    public FlowKt__CollectKt$collectIndexed$2(it2 it2Var) {
        this.$action = it2Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, by0<? super ww8> by0Var) {
        it2 it2Var = this.$action;
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        Object invoke = it2Var.invoke(cc0.c(i), t, by0Var);
        return invoke == a.h() ? invoke : ww8.a;
    }

    public Object emit$$forInline(T t, final by0<? super ww8> by0Var) {
        bk3.c(4);
        new ContinuationImpl(by0Var) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= RecyclerView.UNDEFINED_DURATION;
                return FlowKt__CollectKt$collectIndexed$2.this.emit(null, this);
            }
        };
        bk3.c(5);
        it2 it2Var = this.$action;
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        it2Var.invoke(Integer.valueOf(i), t, by0Var);
        return ww8.a;
    }
}
