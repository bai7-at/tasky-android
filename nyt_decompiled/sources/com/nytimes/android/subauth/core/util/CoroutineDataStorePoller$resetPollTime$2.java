package com.nytimes.android.subauth.core.util;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.subauth.core.util.CoroutineDataStorePoller$resetPollTime$2", f = "CoroutinePoller.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CoroutineDataStorePoller$resetPollTime$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CoroutineDataStorePoller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineDataStorePoller$resetPollTime$2(CoroutineDataStorePoller coroutineDataStorePoller, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = coroutineDataStorePoller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CoroutineDataStorePoller$resetPollTime$2 coroutineDataStorePoller$resetPollTime$2 = new CoroutineDataStorePoller$resetPollTime$2(this.this$0, by0Var);
        coroutineDataStorePoller$resetPollTime$2.L$0 = obj;
        return coroutineDataStorePoller$resetPollTime$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
        return ((CoroutineDataStorePoller$resetPollTime$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
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
        aVar = this.this$0.e;
        mutablePreferences.j(aVar, cc0.d(System.currentTimeMillis()));
        return ww8.a;
    }
}
