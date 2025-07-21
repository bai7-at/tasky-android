package com.nytimes.xwords.hybrid.view.error;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$AnimatedIcon$1$1", f = "ErrorScreen.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ErrorScreenKt$AnimatedIcon$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $animationMillisDelay;
    final /* synthetic */ sy4 $shouldStartPlay$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorScreenKt$AnimatedIcon$1$1(long j, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$animationMillisDelay = j;
        this.$shouldStartPlay$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ErrorScreenKt$AnimatedIcon$1$1(this.$animationMillisDelay, this.$shouldStartPlay$delegate, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            long j = this.$animationMillisDelay;
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
        ErrorScreenKt.c(this.$shouldStartPlay$delegate, true);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ErrorScreenKt$AnimatedIcon$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
