package com.nytimes.android.firebase;

import com.google.firebase.installations.c;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.og8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.tasks.TasksKt;

@fc1(c = "com.nytimes.android.firebase.FirebaseModule$provideFirebaseToken$1", f = "FirebaseModule.kt", l = {132, 132}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FirebaseModule$provideFirebaseToken$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;

    FirebaseModule$provideFirebaseToken$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FirebaseModule$provideFirebaseToken$1 firebaseModule$provideFirebaseToken$1 = new FirebaseModule$provideFirebaseToken$1(by0Var);
        firebaseModule$provideFirebaseToken$1.L$0 = obj;
        return firebaseModule$provideFirebaseToken$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            og8 a = c.p().a(false);
            zq3.g(a, "getToken(...)");
            this.L$0 = flowCollector;
            this.label = 1;
            obj = TasksKt.await(a, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            flowCollector = (FlowCollector) this.L$0;
            f.b(obj);
        }
        String b = ((com.google.firebase.installations.f) obj).b();
        zq3.g(b, "getToken(...)");
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(b, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((FirebaseModule$provideFirebaseToken$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
