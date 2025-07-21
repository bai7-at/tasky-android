package com.nytimes.android.eventtracker;

import com.nytimes.android.eventtracker.EventTracker;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.text.h;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.eventtracker.EventTracker$Builder$checkRequiredParameters$1", f = "EventTracker.kt", l = {561}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EventTracker$Builder$checkRequiredParameters$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ EventTracker.Builder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventTracker$Builder$checkRequiredParameters$1(EventTracker.Builder builder, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new EventTracker$Builder$checkRequiredParameters$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ss2 ss2Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ss2Var = this.this$0.e;
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
        if (h.d0((CharSequence) obj)) {
            throw new EventTracker.Builder.MissingRequiredParameter("agentId (lambda response)");
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((EventTracker$Builder$checkRequiredParameters$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
