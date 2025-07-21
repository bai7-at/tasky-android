package kotlinx.coroutines.flow;

import defpackage.bk3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", l = {288, 288}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combine$6$2 extends SuspendLambda implements it2 {
    final /* synthetic */ gt2 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$6$2(gt2 gt2Var, by0<? super FlowKt__ZipKt$combine$6$2> by0Var) {
        super(3, by0Var);
        this.$transform = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            gt2 gt2Var = this.$transform;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = gt2Var.invoke(objArr, this);
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

    public final Object invokeSuspend$$forInline(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Object invoke = this.$transform.invoke((Object[]) this.L$1, this);
        bk3.c(0);
        flowCollector.emit(invoke, this);
        bk3.c(1);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, by0<? super ww8> by0Var) {
        zq3.m();
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.$transform, by0Var);
        flowKt__ZipKt$combine$6$2.L$0 = flowCollector;
        flowKt__ZipKt$combine$6$2.L$1 = tArr;
        return flowKt__ZipKt$combine$6$2.invokeSuspend(ww8.a);
    }
}
