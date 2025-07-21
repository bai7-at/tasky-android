package com.nytimes.android.eventtracker.coordinator;

import defpackage.by0;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sb6;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

@fc1(c = "com.nytimes.android.eventtracker.coordinator.DefaultEventCoordinator$sendEvent$1", f = "DefaultEventCoordinator.kt", l = {427, 276}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DefaultEventCoordinator$sendEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $eventId;
    final /* synthetic */ sb6 $queuedEvent;
    final /* synthetic */ e52 $subject;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DefaultEventCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEventCoordinator$sendEvent$1(DefaultEventCoordinator defaultEventCoordinator, String str, e52 e52Var, sb6 sb6Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = defaultEventCoordinator;
        this.$eventId = str;
        this.$subject = e52Var;
        this.$queuedEvent = sb6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DefaultEventCoordinator$sendEvent$1(this.this$0, this.$eventId, this.$subject, this.$queuedEvent, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        DefaultEventCoordinator defaultEventCoordinator;
        sb6 sb6Var;
        Mutex mutex2;
        Object C;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                this.this$0.B(this.$eventId, this.$subject.a(), "Received");
                mutex = this.this$0.f;
                DefaultEventCoordinator defaultEventCoordinator2 = this.this$0;
                sb6 sb6Var2 = this.$queuedEvent;
                this.L$0 = mutex;
                this.L$1 = defaultEventCoordinator2;
                this.L$2 = sb6Var2;
                this.label = 1;
                if (mutex.lock(null, this) == h) {
                    return h;
                }
                defaultEventCoordinator = defaultEventCoordinator2;
                sb6Var = sb6Var2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        f.b(obj);
                        ww8 ww8Var = ww8.a;
                        mutex2.unlock(null);
                        this.this$0.B(this.$eventId, this.$subject.a(), "Finished");
                        return ww8.a;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                sb6Var = (sb6) this.L$2;
                defaultEventCoordinator = (DefaultEventCoordinator) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                f.b(obj);
                mutex = mutex3;
            }
            this.L$0 = mutex;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            C = defaultEventCoordinator.C(sb6Var, this);
            if (C == h) {
                return h;
            }
            mutex2 = mutex;
            ww8 ww8Var2 = ww8.a;
            mutex2.unlock(null);
            this.this$0.B(this.$eventId, this.$subject.a(), "Finished");
            return ww8.a;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DefaultEventCoordinator$sendEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
