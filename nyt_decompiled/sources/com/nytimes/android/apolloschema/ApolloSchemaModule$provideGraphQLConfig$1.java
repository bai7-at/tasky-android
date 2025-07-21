package com.nytimes.android.apolloschema;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Single;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.rx2.RxAwaitKt;

@fc1(c = "com.nytimes.android.apolloschema.ApolloSchemaModule$provideGraphQLConfig$1", f = "ApolloSchemaConfig.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ApolloSchemaModule$provideGraphQLConfig$1 extends SuspendLambda implements ss2 {
    final /* synthetic */ Single<String> $analyticsTrackingId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloSchemaModule$provideGraphQLConfig$1(Single single, by0 by0Var) {
        super(1, by0Var);
        this.$analyticsTrackingId = single;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new ApolloSchemaModule$provideGraphQLConfig$1(this.$analyticsTrackingId, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((ApolloSchemaModule$provideGraphQLConfig$1) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Single<String> single = this.$analyticsTrackingId;
            this.label = 1;
            obj = RxAwaitKt.await(single, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        zq3.g(obj, "await(...)");
        return obj;
    }
}
