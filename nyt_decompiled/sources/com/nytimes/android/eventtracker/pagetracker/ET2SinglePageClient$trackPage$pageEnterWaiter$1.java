package com.nytimes.android.eventtracker.pagetracker;

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

@fc1(c = "com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient$trackPage$pageEnterWaiter$1", f = "ET2SinglePageClient.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ET2SinglePageClient$trackPage$pageEnterWaiter$1 extends SuspendLambda implements gt2 {
    int label;

    ET2SinglePageClient$trackPage$pageEnterWaiter$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ET2SinglePageClient$trackPage$pageEnterWaiter$1(by0Var);
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
        return ((ET2SinglePageClient$trackPage$pageEnterWaiter$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
