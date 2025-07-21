package com.nytimes.android.internal.pushmessaging.util;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kz4;
import defpackage.ss2;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.YieldKt;

@fc1(c = "com.nytimes.android.internal.pushmessaging.util.ControlledRunner$joinPreviousOrRun$3", f = "ControlledRunner.kt", l = {94, 102, 107}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ControlledRunner$joinPreviousOrRun$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ControlledRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlledRunner$joinPreviousOrRun$3(ControlledRunner controlledRunner, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = controlledRunner;
        this.$block = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ControlledRunner$joinPreviousOrRun$3 controlledRunner$joinPreviousOrRun$3 = new ControlledRunner$joinPreviousOrRun$3(this.this$0, this.$block, by0Var);
        controlledRunner$joinPreviousOrRun$3.L$0 = obj;
        return controlledRunner$joinPreviousOrRun$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Deferred async$default;
        Deferred deferred;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object h = a.h();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    deferred = (Deferred) this.L$0;
                    f.b(obj);
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            f.b(obj);
            return obj;
        }
        f.b(obj);
        async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, CoroutineStart.LAZY, new ControlledRunner$joinPreviousOrRun$3$newTask$1(this.$block, null), 1, null);
        final ControlledRunner controlledRunner = this.this$0;
        async$default.invokeOnCompletion(new ss2() { // from class: com.nytimes.android.internal.pushmessaging.util.ControlledRunner$joinPreviousOrRun$3.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((Throwable) obj2);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                AtomicReference atomicReference3;
                atomicReference3 = ControlledRunner.this.a;
                kz4.a(atomicReference3, async$default, null);
            }
        });
        deferred = async$default;
        do {
            atomicReference = this.this$0.a;
            if (kz4.a(atomicReference, null, deferred)) {
                this.L$0 = null;
                this.label = 3;
                obj = deferred.await(this);
                if (obj == h) {
                    return h;
                }
            } else {
                atomicReference2 = this.this$0.a;
                Deferred deferred2 = (Deferred) atomicReference2.get();
                if (deferred2 != null) {
                    Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
                    this.L$0 = null;
                    this.label = 1;
                    obj = deferred2.await(this);
                    if (obj == h) {
                        return h;
                    }
                } else {
                    this.L$0 = deferred;
                    this.label = 2;
                }
            }
            return obj;
        } while (YieldKt.yield(this) != h);
        return h;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ControlledRunner$joinPreviousOrRun$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
