package com.nytimes.android;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.AbraLoginObserver$initialize$1", f = "AbraLoginObserver.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbraLoginObserver$initialize$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AbraLoginObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbraLoginObserver$initialize$1(AbraLoginObserver abraLoginObserver, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = abraLoginObserver;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(NYTUser.StateChangeType stateChangeType, by0 by0Var) {
        return ((AbraLoginObserver$initialize$1) create(stateChangeType, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AbraLoginObserver$initialize$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbraManager abraManager;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            abraManager = this.this$0.b;
            this.label = 1;
            if (abraManager.forceRefresh(this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
