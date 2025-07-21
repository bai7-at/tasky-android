package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SingleProcessDataStore$data$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore this$0;

    @fc1(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ d $currentDownStreamFlowState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(d dVar, by0 by0Var) {
            super(2, by0Var);
            this.$currentDownStreamFlowState = dVar;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, by0 by0Var) {
            return ((AnonymousClass1) create(dVar, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDownStreamFlowState, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            d dVar = (d) this.L$0;
            d dVar2 = this.$currentDownStreamFlowState;
            boolean z = false;
            if (!(dVar2 instanceof a) && !(dVar2 instanceof b) && dVar == dVar2) {
                z = true;
            }
            return cc0.a(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$data$1(SingleProcessDataStore singleProcessDataStore, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, by0Var);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        SimpleActor simpleActor;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            mutableStateFlow = this.this$0.h;
            d dVar = (d) mutableStateFlow.getValue();
            if (!(dVar instanceof a)) {
                simpleActor = this.this$0.j;
                simpleActor.e(new SingleProcessDataStore.b.a(dVar));
            }
            mutableStateFlow2 = this.this$0.h;
            final Flow dropWhile = FlowKt.dropWhile(mutableStateFlow2, new AnonymousClass1(dVar, null));
            Flow flow = new Flow() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements FlowCollector {
                    final /* synthetic */ FlowCollector a;

                    @fc1(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(by0 by0Var) {
                            super(by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.a = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = (androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = new androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.f.b(r6)
                            goto L53
                        L29:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L31:
                            kotlin.f.b(r6)
                            kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                            androidx.datastore.core.d r5 = (androidx.datastore.core.d) r5
                            boolean r6 = r5 instanceof androidx.datastore.core.c
                            if (r6 != 0) goto L6f
                            boolean r6 = r5 instanceof androidx.datastore.core.b
                            if (r6 != 0) goto L68
                            boolean r6 = r5 instanceof androidx.datastore.core.a
                            if (r6 == 0) goto L56
                            androidx.datastore.core.a r5 = (androidx.datastore.core.a) r5
                            java.lang.Object r5 = r5.b()
                            r0.label = r3
                            java.lang.Object r4 = r4.emit(r5, r0)
                            if (r4 != r1) goto L53
                            return r1
                        L53:
                            ww8 r4 = defpackage.ww8.a
                            return r4
                        L56:
                            boolean r4 = r5 instanceof androidx.datastore.core.e
                            if (r4 == 0) goto L62
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                            r4.<init>(r5)
                            throw r4
                        L62:
                            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                            r4.<init>()
                            throw r4
                        L68:
                            androidx.datastore.core.b r5 = (androidx.datastore.core.b) r5
                            java.lang.Throwable r4 = r5.a()
                            throw r4
                        L6f:
                            androidx.datastore.core.c r5 = (androidx.datastore.core.c) r5
                            java.lang.Throwable r4 = r5.a()
                            throw r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector2, by0 by0Var) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector2), by0Var);
                    return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
                }
            };
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == h) {
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
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((SingleProcessDataStore$data$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
