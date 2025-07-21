package com.nytimes.android.libs.messagingarchitecture.betasettings;

import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.by0;
import defpackage.ec1;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel$updateQueueWithOverrides$1", f = "DebugViewModel.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DebugViewModel$updateQueueWithOverrides$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<Message> $messageOverrides;
    int label;
    final /* synthetic */ DebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugViewModel$updateQueueWithOverrides$1(DebugViewModel debugViewModel, List list, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = debugViewModel;
        this.$messageOverrides = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DebugViewModel$updateQueueWithOverrides$1(this.this$0, this.$messageOverrides, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ec1 ec1Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ec1Var = this.this$0.a;
            List<Message> list = this.$messageOverrides;
            this.label = 1;
            if (ec1Var.m(list, this) == h) {
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
        return ((DebugViewModel$updateQueueWithOverrides$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
