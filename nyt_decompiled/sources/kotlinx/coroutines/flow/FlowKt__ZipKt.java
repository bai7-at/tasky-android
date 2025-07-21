package kotlinx.coroutines.flow;

import defpackage.bk3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.nt2;
import defpackage.ot2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.internal.CombineKt;

/* loaded from: classes5.dex */
final /* synthetic */ class FlowKt__ZipKt {
    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, it2 it2Var) {
        return FlowKt.flowCombine(flow, flow2, it2Var);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, kt2 kt2Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new Flow[]{flow, flow2}, null, kt2Var));
    }

    private static final /* synthetic */ <T, R> Flow<R> combineTransformUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, it2 it2Var) {
        zq3.m();
        return FlowKt.flow(new FlowKt__ZipKt$combineTransformUnsafe$1(flowArr, it2Var, null));
    }

    private static final /* synthetic */ <T, R> Flow<R> combineUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, gt2 gt2Var) {
        zq3.m();
        return new FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1(flowArr, gt2Var);
    }

    public static final <T1, T2, R> Flow<R> flowCombine(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final it2 it2Var) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, by0<? super ww8> by0Var) {
                qs2 qs2Var;
                Flow[] flowArr = {Flow.this, flow2};
                qs2Var = new qs2() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Void mo865invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr, qs2Var, new FlowKt__ZipKt$combine$1$1(it2Var, null), by0Var);
                return combineInternal == a.h() ? combineInternal : ww8.a;
            }
        };
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, kt2 kt2Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new Flow[]{flow, flow2}, null, kt2Var));
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, it2 it2Var) {
        return CombineKt.zipImpl(flow, flow2, it2Var);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, final kt2 kt2Var) {
        final Flow[] flowArr = {flow, flow2, flow3};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            @fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {329, 258}, m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements it2 {
                final /* synthetic */ kt2 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(by0 by0Var, kt2 kt2Var) {
                    super(3, by0Var);
                    this.$transform$inlined = kt2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        kt2 kt2Var = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        bk3.c(6);
                        obj = kt2Var.invoke(obj2, obj3, obj4, this);
                        bk3.c(7);
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
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == h) {
                        return h;
                    }
                    return ww8.a;
                }

                @Override // defpackage.it2
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, by0<? super ww8> by0Var) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(ww8.a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                qs2 qs2Var;
                Flow[] flowArr2 = flowArr;
                qs2Var = new qs2() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Void mo865invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, qs2Var, new AnonymousClass2(null, kt2Var), by0Var);
                return combineInternal == a.h() ? combineInternal : ww8.a;
            }
        };
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, mt2 mt2Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new Flow[]{flow, flow2, flow3}, null, mt2Var));
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, final mt2 mt2Var) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            @fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {329, 258}, m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements it2 {
                final /* synthetic */ mt2 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(by0 by0Var, mt2 mt2Var) {
                    super(3, by0Var);
                    this.$transform$inlined = mt2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        mt2 mt2Var = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        bk3.c(6);
                        obj = mt2Var.invoke(obj2, obj3, obj4, obj5, this);
                        bk3.c(7);
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
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == h) {
                        return h;
                    }
                    return ww8.a;
                }

                @Override // defpackage.it2
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, by0<? super ww8> by0Var) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(ww8.a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                qs2 qs2Var;
                Flow[] flowArr2 = flowArr;
                qs2Var = new qs2() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Void mo865invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, qs2Var, new AnonymousClass2(null, mt2Var), by0Var);
                return combineInternal == a.h() ? combineInternal : ww8.a;
            }
        };
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, nt2 nt2Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new Flow[]{flow, flow2, flow3, flow4}, null, nt2Var));
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, final nt2 nt2Var) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4, flow5};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            @fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {329, 258}, m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements it2 {
                final /* synthetic */ nt2 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(by0 by0Var, nt2 nt2Var) {
                    super(3, by0Var);
                    this.$transform$inlined = nt2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        nt2 nt2Var = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        Object obj6 = objArr[4];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        bk3.c(6);
                        obj = nt2Var.a(obj2, obj3, obj4, obj5, obj6, this);
                        bk3.c(7);
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
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == h) {
                        return h;
                    }
                    return ww8.a;
                }

                @Override // defpackage.it2
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, by0<? super ww8> by0Var) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(ww8.a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                qs2 qs2Var;
                Flow[] flowArr2 = flowArr;
                qs2Var = new qs2() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Void mo865invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, qs2Var, new AnonymousClass2(null, nt2Var), by0Var);
                return combineInternal == a.h() ? combineInternal : ww8.a;
            }
        };
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, ot2 ot2Var) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new Flow[]{flow, flow2, flow3, flow4, flow5}, null, ot2Var));
    }

    public static final /* synthetic */ <T, R> Flow<R> combine(Iterable<? extends Flow<? extends T>> iterable, gt2 gt2Var) {
        Flow[] flowArr = (Flow[]) i.X0(iterable).toArray(new Flow[0]);
        zq3.m();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(flowArr, gt2Var);
    }

    public static final /* synthetic */ <T, R> Flow<R> combineTransform(Flow<? extends T>[] flowArr, it2 it2Var) {
        zq3.m();
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$6(flowArr, it2Var, null));
    }

    public static final /* synthetic */ <T, R> Flow<R> combineTransform(Iterable<? extends Flow<? extends T>> iterable, it2 it2Var) {
        Flow[] flowArr = (Flow[]) i.X0(iterable).toArray(new Flow[0]);
        zq3.m();
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$7(flowArr, it2Var, null));
    }

    public static final /* synthetic */ <T, R> Flow<R> combine(Flow<? extends T>[] flowArr, gt2 gt2Var) {
        zq3.m();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(flowArr, gt2Var);
    }
}
