package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.DelayKt;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", l = {411}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FlowKt__MigrationKt$delayFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $timeMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__MigrationKt$delayFlow$1(long j, by0<? super FlowKt__MigrationKt$delayFlow$1> by0Var) {
        super(2, by0Var);
        this.$timeMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new FlowKt__MigrationKt$delayFlow$1(this.$timeMillis, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            long j = this.$timeMillis;
            this.label = 1;
            if (DelayKt.delay(j, this) == h) {
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
    public final Object invoke(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        return ((FlowKt__MigrationKt$delayFlow$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
