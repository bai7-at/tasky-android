package com.nytimes.android.coroutinesutils;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public abstract class FlatMapFirstKt {
    public static final Flow a(final Flow flow, final gt2 gt2Var) {
        zq3.h(flow, "<this>");
        zq3.h(gt2Var, "transform");
        return b(new Flow() { // from class: com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1

            /* renamed from: com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ gt2 b;

                @fc1(c = "com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1$2", f = "FlatMapFirst.kt", l = {223, 223}, m = "emit")
                /* renamed from: com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, gt2 gt2Var) {
                    this.a = flowCollector;
                    this.b = gt2Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, defpackage.by0 r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1$2$1 r0 = (com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1$2$1 r0 = new com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.f.b(r8)
                        goto L5d
                    L2c:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L34:
                        java.lang.Object r6 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                        kotlin.f.b(r8)
                        goto L51
                    L3c:
                        kotlin.f.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.a
                        gt2 r6 = r6.b
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r6 = r6.invoke(r7, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        r5 = r8
                        r8 = r6
                        r6 = r5
                    L51:
                        r7 = 0
                        r0.L$0 = r7
                        r0.label = r3
                        java.lang.Object r6 = r6.emit(r8, r0)
                        if (r6 != r1) goto L5d
                        return r1
                    L5d:
                        ww8 r6 = defpackage.ww8.a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.FlatMapFirstKt$flatMapFirst$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, gt2Var), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        });
    }

    public static final Flow b(Flow flow) {
        zq3.h(flow, "<this>");
        return FlowKt.channelFlow(new FlatMapFirstKt$flattenFirst$1(flow, null));
    }
}
