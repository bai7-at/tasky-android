package kotlinx.coroutines.flow.internal;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.bk3;
import defpackage.by0;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class SafeCollector_commonKt$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ gt2 $block;

    public SafeCollector_commonKt$unsafeFlow$1(gt2 gt2Var) {
        this.$block = gt2Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        Object invoke = this.$block.invoke(flowCollector, by0Var);
        return invoke == a.h() ? invoke : ww8.a;
    }

    public Object collect$$forInline(FlowCollector<? super T> flowCollector, final by0<? super ww8> by0Var) {
        bk3.c(4);
        new ContinuationImpl(by0Var) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= RecyclerView.UNDEFINED_DURATION;
                return SafeCollector_commonKt$unsafeFlow$1.this.collect(null, this);
            }
        };
        bk3.c(5);
        this.$block.invoke(flowCollector, by0Var);
        return ww8.a;
    }
}
