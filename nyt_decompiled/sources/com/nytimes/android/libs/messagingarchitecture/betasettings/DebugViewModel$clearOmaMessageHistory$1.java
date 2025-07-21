package com.nytimes.android.libs.messagingarchitecture.betasettings;

import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qg0;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel$clearOmaMessageHistory$1", f = "DebugViewModel.kt", l = {ContentType.USER_GENERATED_LIVE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DebugViewModel$clearOmaMessageHistory$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ DebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugViewModel$clearOmaMessageHistory$1(DebugViewModel debugViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = debugViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DebugViewModel$clearOmaMessageHistory$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qg0 qg0Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            qg0Var = this.this$0.b;
            this.label = 1;
            if (qg0Var.b(this) == h) {
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
        return ((DebugViewModel$clearOmaMessageHistory$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
