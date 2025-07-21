package com.nytimes.android.subauth.core.auth.util;

import defpackage.by0;
import defpackage.cu;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.subauth.core.auth.util.AssistedLoginLifecycleObserver$launchAssistedLogin$2", f = "AssistedLoginLifecycleObserver.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AssistedLoginLifecycleObserver$launchAssistedLogin$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AssistedLoginLifecycleObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssistedLoginLifecycleObserver$launchAssistedLogin$2(AssistedLoginLifecycleObserver assistedLoginLifecycleObserver, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assistedLoginLifecycleObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssistedLoginLifecycleObserver$launchAssistedLogin$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (!this.this$0.c()) {
                ul8.a.z("SUBAUTH").a("Skip Assisted Login", new Object[0]);
                return cu.b.a;
            }
            ul8.a.z("SUBAUTH").a("Launch Assisted Login", new Object[0]);
            this.this$0.g();
            ss2 d = this.this$0.d();
            this.label = 1;
            obj = d.invoke(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return (cu) obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssistedLoginLifecycleObserver$launchAssistedLogin$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
