package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.bk3;
import defpackage.by0;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements Flow<R> {
    final /* synthetic */ Flow[] $flows$inlined;
    final /* synthetic */ gt2 $transform$inlined;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(Flow[] flowArr, gt2 gt2Var) {
        this.$flows$inlined = flowArr;
        this.$transform$inlined = gt2Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super R> flowCollector, by0<? super ww8> by0Var) {
        Flow[] flowArr = this.$flows$inlined;
        zq3.m();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.$flows$inlined);
        zq3.m();
        Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$5$1, new FlowKt__ZipKt$combine$5$2(this.$transform$inlined, null), by0Var);
        return combineInternal == a.h() ? combineInternal : ww8.a;
    }

    public Object collect$$forInline(FlowCollector flowCollector, by0 by0Var) {
        bk3.c(4);
        new ContinuationImpl(by0Var) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= RecyclerView.UNDEFINED_DURATION;
                return FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.this.collect(null, this);
            }
        };
        bk3.c(5);
        Flow[] flowArr = this.$flows$inlined;
        zq3.m();
        FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new FlowKt__ZipKt$combine$5$1(this.$flows$inlined);
        zq3.m();
        FlowKt__ZipKt$combine$5$2 flowKt__ZipKt$combine$5$2 = new FlowKt__ZipKt$combine$5$2(this.$transform$inlined, null);
        bk3.c(0);
        CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$5$1, flowKt__ZipKt$combine$5$2, by0Var);
        bk3.c(1);
        return ww8.a;
    }
}
