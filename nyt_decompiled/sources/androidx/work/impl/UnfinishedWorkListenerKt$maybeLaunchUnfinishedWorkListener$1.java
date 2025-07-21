package androidx.work.impl;

import com.comscore.util.log.LogLevel;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.h94;
import defpackage.kt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 extends SuspendLambda implements kt2 {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(by0 by0Var) {
        super(4, by0Var);
    }

    @Override // defpackage.kt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((FlowCollector) obj, (Throwable) obj2, ((Number) obj3).longValue(), (by0) obj4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        long j;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            Throwable th = (Throwable) this.L$0;
            long j2 = this.J$0;
            h94 e = h94.e();
            str = UnfinishedWorkListenerKt.a;
            e.d(str, "Cannot check for unfinished work", th);
            j = UnfinishedWorkListenerKt.b;
            long min = Math.min(j2 * LogLevel.NONE, j);
            this.label = 1;
            if (DelayKt.delay(min, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return cc0.a(true);
    }

    public final Object invoke(FlowCollector flowCollector, Throwable th, long j, by0 by0Var) {
        UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 = new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(by0Var);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.L$0 = th;
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.J$0 = j;
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.invokeSuspend(ww8.a);
    }
}
