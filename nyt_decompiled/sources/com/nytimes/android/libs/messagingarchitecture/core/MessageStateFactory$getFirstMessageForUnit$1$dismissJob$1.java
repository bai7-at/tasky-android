package com.nytimes.android.libs.messagingarchitecture.core;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory$getFirstMessageForUnit$1$dismissJob$1", f = "MessageStateFactory.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MessageStateFactory$getFirstMessageForUnit$1$dismissJob$1 extends SuspendLambda implements gt2 {
    int label;

    MessageStateFactory$getFirstMessageForUnit$1$dismissJob$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MessageStateFactory$getFirstMessageForUnit$1$dismissJob$1(by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.label = 1;
            if (DelayKt.awaitCancellation(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MessageStateFactory$getFirstMessageForUnit$1$dismissJob$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
