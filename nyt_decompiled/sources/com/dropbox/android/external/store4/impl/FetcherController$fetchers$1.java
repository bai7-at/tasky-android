package com.dropbox.android.external.store4.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.android.util.AndroidTcfDataLoader;
import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.ResponseOrigin;
import com.dropbox.flow.multicast.Multicaster;
import defpackage.b38;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.dropbox.android.external.store4.impl.FetcherController$fetchers$1", f = "FetcherController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FetcherController$fetchers$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FetcherController this$0;

    @fc1(c = "com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$1", f = "FetcherController.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend")
    /* renamed from: com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FetcherController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FetcherController fetcherController, Object obj, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = fetcherController;
            this.$key = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$key, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Fetcher fetcher;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                fetcher = this.this$0.b;
                Flow invoke = fetcher.invoke(this.$key);
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, invoke, this) == h) {
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
            return ((AnonymousClass1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$3", f = "FetcherController.kt", l = {AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX}, m = "invokeSuspend")
    /* renamed from: com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements gt2 {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(by0Var);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                b38.d dVar = new b38.d(ResponseOrigin.Fetcher);
                this.label = 1;
                if (flowCollector.emit(dVar, this) == h) {
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
            return ((AnonymousClass3) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$4", f = "FetcherController.kt", l = {87}, m = "invokeSuspend")
    /* renamed from: com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements gt2 {
        final /* synthetic */ Object $key;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FetcherController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(FetcherController fetcherController, Object obj, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = fetcherController;
            this.$key = obj;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b38 b38Var, by0 by0Var) {
            return ((AnonymousClass4) create(b38Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$key, by0Var);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SourceOfTruthWithBarrier sourceOfTruthWithBarrier;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Object a = ((b38) this.L$0).a();
                if (a != null) {
                    FetcherController fetcherController = this.this$0;
                    Object obj2 = this.$key;
                    sourceOfTruthWithBarrier = fetcherController.c;
                    if (sourceOfTruthWithBarrier != null) {
                        this.label = 1;
                        if (sourceOfTruthWithBarrier.e(obj2, a, this) == h) {
                            return h;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetcherController$fetchers$1(FetcherController fetcherController, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fetcherController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FetcherController$fetchers$1 fetcherController$fetchers$1 = new FetcherController$fetchers$1(this.this$0, by0Var);
        fetcherController$fetchers$1.L$0 = obj;
        return fetcherController$fetchers$1;
    }

    @Override // defpackage.gt2
    public final Object invoke(Object obj, by0 by0Var) {
        return ((FetcherController$fetchers$1) create(obj, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Object obj2 = this.L$0;
        coroutineScope = this.this$0.a;
        final Flow flow = FlowKt.flow(new AnonymousClass1(this.this$0, obj2, null));
        return new Multicaster(coroutineScope, 0, FlowKt.onEmpty(new Flow() { // from class: com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1

            /* renamed from: com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1$2", f = "FetcherController.kt", l = {137}, m = "emit")
                /* renamed from: com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L64
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        xd2 r5 = (defpackage.xd2) r5
                        boolean r6 = r5 instanceof xd2.a
                        if (r6 == 0) goto L4a
                        b38$a r6 = new b38$a
                        xd2$a r5 = (xd2.a) r5
                        java.lang.Object r5 = r5.a()
                        com.dropbox.android.external.store4.ResponseOrigin r2 = com.dropbox.android.external.store4.ResponseOrigin.Fetcher
                        r6.<init>(r5, r2)
                        goto L5b
                    L4a:
                        boolean r6 = r5 instanceof xd2.b.a
                        if (r6 == 0) goto L67
                        b38$b$a r6 = new b38$b$a
                        xd2$b$a r5 = (xd2.b.a) r5
                        java.lang.Throwable r5 = r5.a()
                        com.dropbox.android.external.store4.ResponseOrigin r2 = com.dropbox.android.external.store4.ResponseOrigin.Fetcher
                        r6.<init>(r5, r2)
                    L5b:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r6, r0)
                        if (r4 != r1) goto L64
                        return r1
                    L64:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    L67:
                        kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                        r4.<init>()
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.impl.FetcherController$fetchers$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        }, new AnonymousClass3(null)), true, false, new AnonymousClass4(this.this$0, obj2, null), 16, null);
    }
}
