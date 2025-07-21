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

@fc1(c = "com.nytimes.android.firebase.FirebaseModule$provideFirebaseInstanceId$1", f = "FirebaseModule.kt", l = {143, 143}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FirebaseModule$provideFirebaseInstanceId$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ c $firebaseInstallations;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FirebaseModule$provideFirebaseInstanceId$1(c cVar, by0 by0Var) {
        super(2, by0Var);
        this.$firebaseInstallations = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FirebaseModule$provideFirebaseInstanceId$1 firebaseModule$provideFirebaseInstanceId$1 = new FirebaseModule$provideFirebaseInstanceId$1(this.$firebaseInstallations, by0Var);
        firebaseModule$provideFirebaseInstanceId$1.L$0 = obj;
        return firebaseModule$provideFirebaseInstanceId$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            og8 id = this.$firebaseInstallations.getId();
            zq3.g(id, "getId(...)");
            this.L$0 = flowCollector;
            this.label = 1;
            obj = TasksKt.await(id, this);
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
        zq3.g(obj, "await(...)");
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((FirebaseModule$provideFirebaseInstanceId$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
