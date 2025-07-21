package com.nytimes.android.dailyfive.di;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.apolloschema.ExtensionsKt;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ii5;
import defpackage.k81;
import defpackage.l81;
import defpackage.nk5;
import defpackage.tn2;
import defpackage.ww8;
import defpackage.yj;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.dailyfive.di.DailyFiveModule$provideDailyFiveFeedStore$1$1", f = "DailyFiveModule.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DailyFiveModule$provideDailyFiveFeedStore$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ApolloClient $apolloClient;
    final /* synthetic */ l81 $it;
    final /* synthetic */ k81 $parser;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyFiveModule$provideDailyFiveFeedStore$1$1(ApolloClient apolloClient, l81 l81Var, k81 k81Var, by0 by0Var) {
        super(2, by0Var);
        this.$apolloClient = apolloClient;
        this.$it = l81Var;
        this.$parser = k81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DailyFiveModule$provideDailyFiveFeedStore$1$1(this.$apolloClient, this.$it, this.$parser, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ApolloCall L = this.$apolloClient.L(new tn2(new nk5.c(cc0.c(this.$it.a()))));
            this.label = 1;
            obj = ExtensionsKt.a(L, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        ii5.a aVar = ((yj) obj).c;
        zq3.e(aVar);
        return this.$parser.d((tn2.f) aVar);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DailyFiveModule$provideDailyFiveFeedStore$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
