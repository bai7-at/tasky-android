package com.google.accompanist.pager;

import androidx.compose.runtime.y;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.google.accompanist.pager.Pager$Pager$4$1", f = "Pager.kt", l = {349}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Pager$Pager$4$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ PagerState $state;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ PagerState a;

        a(PagerState pagerState) {
            this.a = pagerState;
        }

        public final Object a(boolean z, by0 by0Var) {
            this.a.s();
            return ww8.a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var) {
            return a(((Boolean) obj).booleanValue(), by0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pager$Pager$4$1(PagerState pagerState, by0 by0Var) {
        super(2, by0Var);
        this.$state = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new Pager$Pager$4$1(this.$state, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final PagerState pagerState = this.$state;
            final Flow p = y.p(new qs2() { // from class: com.google.accompanist.pager.Pager$Pager$4$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return Boolean.valueOf(PagerState.this.c());
                }
            });
            Flow drop = FlowKt.drop(new Flow() { // from class: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1

                /* renamed from: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements FlowCollector {
                    final /* synthetic */ FlowCollector a;

                    @fc1(c = "com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2", f = "Pager.kt", l = {223}, m = "emit")
                    /* renamed from: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
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
                    public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.f.b(r6)
                            goto L48
                        L29:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L31:
                            kotlin.f.b(r6)
                            kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                            r6 = r5
                            java.lang.Boolean r6 = (java.lang.Boolean) r6
                            boolean r6 = r6.booleanValue()
                            if (r6 != 0) goto L48
                            r0.label = r3
                            java.lang.Object r4 = r4.emit(r5, r0)
                            if (r4 != r1) goto L48
                            return r1
                        L48:
                            ww8 r4 = defpackage.ww8.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.Pager$Pager$4$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector, by0 by0Var) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                    return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
                }
            }, 1);
            a aVar = new a(this.$state);
            this.label = 1;
            if (drop.collect(aVar, this) == h) {
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
        return ((Pager$Pager$4$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
