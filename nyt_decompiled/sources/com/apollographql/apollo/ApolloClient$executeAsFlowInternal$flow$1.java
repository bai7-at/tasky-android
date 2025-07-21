package com.apollographql.apollo;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.lh4;
import defpackage.lt0;
import defpackage.ww8;
import defpackage.xj;
import defpackage.yj;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1", f = "ApolloClient.kt", l = {259}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApolloClient$executeAsFlowInternal$flow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ xj $apolloRequest;
    final /* synthetic */ boolean $throwing;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ApolloClient this$0;

    @fc1(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2", f = "ApolloClient.kt", l = {260}, m = "invokeSuspend")
    /* renamed from: com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ ProducerScope<yj> $$this$channelFlow;
        final /* synthetic */ xj $apolloRequest;
        final /* synthetic */ boolean $throwing;
        int label;
        final /* synthetic */ ApolloClient this$0;

        /* renamed from: com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2$a */
        static final class a implements FlowCollector {
            final /* synthetic */ ProducerScope a;

            a(ProducerScope producerScope) {
                this.a = producerScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(yj yjVar, by0 by0Var) {
                Object send = this.a.send(yjVar, by0Var);
                return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ApolloClient apolloClient, xj xjVar, boolean z, ProducerScope producerScope, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = apolloClient;
            this.$apolloRequest = xjVar;
            this.$throwing = z;
            this.$$this$channelFlow = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.this$0, this.$apolloRequest, this.$throwing, this.$$this$channelFlow, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Flow d = this.this$0.d(this.$apolloRequest, this.$throwing);
                a aVar = new a(this.$$this$channelFlow);
                this.label = 1;
                if (d.collect(aVar, this) == h) {
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
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloClient$executeAsFlowInternal$flow$1(ApolloClient apolloClient, xj xjVar, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = apolloClient;
        this.$apolloRequest = xjVar;
        this.$throwing = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ApolloClient$executeAsFlowInternal$flow$1 apolloClient$executeAsFlowInternal$flow$1 = new ApolloClient$executeAsFlowInternal$flow$1(this.this$0, this.$apolloRequest, this.$throwing, by0Var);
        apolloClient$executeAsFlowInternal$flow$1.L$0 = obj;
        return apolloClient$executeAsFlowInternal$flow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.Iterator] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        lt0 lt0Var;
        List list3;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                ProducerScope producerScope = (ProducerScope) this.L$0;
                list2 = this.this$0.j;
                Iterator it2 = list2.iterator();
                if (it2.hasNext()) {
                    lh4.a(it2.next());
                    throw null;
                }
                lt0Var = this.this$0.b;
                CoroutineDispatcher g = lt0Var.g();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$apolloRequest, this.$throwing, producerScope, null);
                this.label = 1;
                if (BuildersKt.withContext(g, anonymousClass2, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            list3 = this.this$0.j;
            this = list3.iterator();
            if (!this.hasNext()) {
                return ww8.a;
            }
            lh4.a(this.next());
            throw null;
        } catch (Throwable th) {
            list = this.this$0.j;
            Iterator it3 = list.iterator();
            if (!it3.hasNext()) {
                throw th;
            }
            lh4.a(it3.next());
            throw null;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(ProducerScope producerScope, by0 by0Var) {
        return ((ApolloClient$executeAsFlowInternal$flow$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
