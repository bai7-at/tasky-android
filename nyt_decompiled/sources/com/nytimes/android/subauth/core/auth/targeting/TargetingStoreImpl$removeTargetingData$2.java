package com.nytimes.android.subauth.core.auth.targeting;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl$removeTargetingData$2", f = "TargetingStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TargetingStoreImpl$removeTargetingData$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TargetingStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TargetingStoreImpl$removeTargetingData$2(TargetingStoreImpl targetingStoreImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = targetingStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        TargetingStoreImpl$removeTargetingData$2 targetingStoreImpl$removeTargetingData$2 = new TargetingStoreImpl$removeTargetingData$2(this.this$0, by0Var);
        targetingStoreImpl$removeTargetingData$2.L$0 = obj;
        return targetingStoreImpl$removeTargetingData$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((TargetingStoreImpl$removeTargetingData$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s16.a aVar;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        aVar = this.this$0.b;
        mutablePreferences.i(aVar);
        return ww8.a;
    }
}
