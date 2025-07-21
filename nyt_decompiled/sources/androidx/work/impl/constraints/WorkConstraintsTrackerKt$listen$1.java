package androidx.work.impl.constraints;

import defpackage.by0;
import defpackage.dk9;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.oe5;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WorkConstraintsTrackerKt$listen$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ oe5 $listener;
    final /* synthetic */ dk9 $spec;
    final /* synthetic */ WorkConstraintsTracker $this_listen;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ oe5 a;
        final /* synthetic */ dk9 b;

        a(oe5 oe5Var, dk9 dk9Var) {
            this.a = oe5Var;
            this.b = dk9Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(androidx.work.impl.constraints.a aVar, by0 by0Var) {
            this.a.e(this.b, aVar);
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkConstraintsTrackerKt$listen$1(WorkConstraintsTracker workConstraintsTracker, dk9 dk9Var, oe5 oe5Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_listen = workConstraintsTracker;
        this.$spec = dk9Var;
        this.$listener = oe5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WorkConstraintsTrackerKt$listen$1(this.$this_listen, this.$spec, this.$listener, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow b = this.$this_listen.b(this.$spec);
            a aVar = new a(this.$listener, this.$spec);
            this.label = 1;
            if (b.collect(aVar, this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WorkConstraintsTrackerKt$listen$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
