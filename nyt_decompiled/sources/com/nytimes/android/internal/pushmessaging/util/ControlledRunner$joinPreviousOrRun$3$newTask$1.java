package com.nytimes.android.internal.pushmessaging.util;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.internal.pushmessaging.util.ControlledRunner$joinPreviousOrRun$3$newTask$1", f = "ControlledRunner.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ControlledRunner$joinPreviousOrRun$3$newTask$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlledRunner$joinPreviousOrRun$3$newTask$1(ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.$block = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ControlledRunner$joinPreviousOrRun$3$newTask$1(this.$block, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ss2 ss2Var = this.$block;
            this.label = 1;
            obj = ss2Var.invoke(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ControlledRunner$joinPreviousOrRun$3$newTask$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
