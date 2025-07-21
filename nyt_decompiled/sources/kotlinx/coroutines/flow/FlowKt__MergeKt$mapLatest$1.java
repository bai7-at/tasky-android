package kotlinx.coroutines.flow;

import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {AdvertisementType.ON_DEMAND_POST_ROLL, AdvertisementType.ON_DEMAND_POST_ROLL}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements it2 {
    final /* synthetic */ gt2 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__MergeKt$mapLatest$1(gt2 gt2Var, by0<? super FlowKt__MergeKt$mapLatest$1> by0Var) {
        super(3, by0Var);
        this.$transform = gt2Var;
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector) obj, (FlowCollector) obj2, (by0<? super ww8>) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            Object obj2 = this.L$1;
            gt2 gt2Var = this.$transform;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = gt2Var.invoke(obj2, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            flowCollector = (FlowCollector) this.L$0;
            f.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == h) {
            return h;
        }
        return ww8.a;
    }

    public final Object invoke(FlowCollector<? super R> flowCollector, T t, by0<? super ww8> by0Var) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.$transform, by0Var);
        flowKt__MergeKt$mapLatest$1.L$0 = flowCollector;
        flowKt__MergeKt$mapLatest$1.L$1 = t;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(ww8.a);
    }
}
