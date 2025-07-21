package kotlinx.coroutines.rx2;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "kotlinx.coroutines.rx2.DispatcherScheduler$scheduleDirect$1$1$1", f = "RxScheduler.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class DispatcherScheduler$scheduleDirect$1$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DispatcherScheduler$scheduleDirect$1$1$1(ss2 ss2Var, by0<? super DispatcherScheduler$scheduleDirect$1$1$1> by0Var) {
        super(2, by0Var);
        this.$task = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new DispatcherScheduler$scheduleDirect$1$1$1(this.$task, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ss2 ss2Var = this.$task;
            this.label = 1;
            if (ss2Var.invoke(this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((DispatcherScheduler$scheduleDirect$1$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
