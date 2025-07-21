package com.nytimes.android.coroutinesutils;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.coroutinesutils.FlatMapFirstKt$flattenFirst$1", f = "FlatMapFirst.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FlatMapFirstKt$flattenFirst$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow<Flow<Object>> $this_flattenFirst;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatMapFirstKt$flattenFirst$1(Flow flow, by0 by0Var) {
        super(2, by0Var);
        this.$this_flattenFirst = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FlatMapFirstKt$flattenFirst$1 flatMapFirstKt$flattenFirst$1 = new FlatMapFirstKt$flattenFirst$1(this.$this_flattenFirst, by0Var);
        flatMapFirstKt$flattenFirst$1.L$0 = obj;
        return flatMapFirstKt$flattenFirst$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Flow<Flow<Object>> flow = this.$this_flattenFirst;
            FlowCollector<? super Flow<Object>> flowCollector = new FlowCollector() { // from class: com.nytimes.android.coroutinesutils.FlatMapFirstKt$flattenFirst$1.1

                @fc1(c = "com.nytimes.android.coroutinesutils.FlatMapFirstKt$flattenFirst$1$1$1", f = "FlatMapFirst.kt", l = {31}, m = "invokeSuspend")
                /* renamed from: com.nytimes.android.coroutinesutils.FlatMapFirstKt$flattenFirst$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C02521 extends SuspendLambda implements gt2 {
                    final /* synthetic */ AtomicBoolean $busy;
                    final /* synthetic */ Flow<Object> $inner;
                    final /* synthetic */ ProducerScope<Object> $outerScope;
                    int label;

                    /* renamed from: com.nytimes.android.coroutinesutils.FlatMapFirstKt$flattenFirst$1$1$1$a */
                    static final class a implements FlowCollector {
                        final /* synthetic */ ProducerScope a;

                        a(ProducerScope producerScope) {
                            this.a = producerScope;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, by0 by0Var) {
                            Object send = this.a.send(obj, by0Var);
                            return send == kotlin.coroutines.intrinsics.a.h() ? send : ww8.a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02521(Flow flow, AtomicBoolean atomicBoolean, ProducerScope producerScope, by0 by0Var) {
                        super(2, by0Var);
                        this.$inner = flow;
                        this.$busy = atomicBoolean;
                        this.$outerScope = producerScope;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new C02521(this.$inner, this.$busy, this.$outerScope, by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        try {
                            if (i == 0) {
                                f.b(obj);
                                Flow<Object> flow = this.$inner;
                                a aVar = new a(this.$outerScope);
                                this.label = 1;
                                if (flow.collect(aVar, this) == h) {
                                    return h;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                f.b(obj);
                            }
                            this.$busy.set(false);
                        } catch (CancellationException e) {
                            CoroutineScopeKt.cancel(this.$outerScope, e);
                        }
                        return ww8.a;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                        return ((C02521) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Flow flow2, by0 by0Var) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new C02521(flow2, atomicBoolean, producerScope, null), 3, null);
                    }
                    return ww8.a;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == h) {
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
    public final Object invoke(ProducerScope producerScope, by0 by0Var) {
        return ((FlatMapFirstKt$flattenFirst$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
