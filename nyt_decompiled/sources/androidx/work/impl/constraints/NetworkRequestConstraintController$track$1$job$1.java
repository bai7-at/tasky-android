package androidx.work.impl.constraints;

import androidx.work.impl.constraints.a;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h94;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProducerScope;

@fc1(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$job$1", f = "WorkConstraintsTracker.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NetworkRequestConstraintController$track$1$job$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ProducerScope<a> $$this$callbackFlow;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkRequestConstraintController$track$1$job$1(NetworkRequestConstraintController networkRequestConstraintController, ProducerScope producerScope, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = networkRequestConstraintController;
        this.$$this$callbackFlow = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NetworkRequestConstraintController$track$1$job$1(this.this$0, this.$$this$callbackFlow, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        String str;
        long j2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            j = this.this$0.b;
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
        h94 e = h94.e();
        str = WorkConstraintsTrackerKt.a;
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkRequestConstraintController didn't receive neither  onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after ");
        j2 = this.this$0.b;
        sb.append(j2);
        sb.append(" ms");
        e.a(str, sb.toString());
        this.$$this$callbackFlow.mo129trySendJP2dKIU(new a.b(7));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NetworkRequestConstraintController$track$1$job$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
