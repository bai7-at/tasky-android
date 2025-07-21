package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {54, 55}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FlowExtKt$simpleScan$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $initial;
    final /* synthetic */ it2 $operation;
    final /* synthetic */ Flow<Object> $this_simpleScan;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name */
    static final class AnonymousClass1 implements FlowCollector {
        final /* synthetic */ Ref$ObjectRef a;
        final /* synthetic */ it2 b;
        final /* synthetic */ FlowCollector c;

        AnonymousClass1(Ref$ObjectRef ref$ObjectRef, it2 it2Var, FlowCollector flowCollector) {
            this.a = ref$ObjectRef;
            this.b = it2Var;
            this.c = flowCollector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, defpackage.by0 r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.FlowExtKt$simpleScan$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.FlowExtKt$simpleScan$1$1$emit$1 r0 = (androidx.paging.FlowExtKt$simpleScan$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.FlowExtKt$simpleScan$1$1$emit$1 r0 = new androidx.paging.FlowExtKt$simpleScan$1$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.f.b(r9)
                goto L70
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$1
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
                java.lang.Object r8 = r0.L$0
                androidx.paging.FlowExtKt$simpleScan$1$1 r8 = (androidx.paging.FlowExtKt$simpleScan$1.AnonymousClass1) r8
                kotlin.f.b(r9)
                goto L5a
            L40:
                kotlin.f.b(r9)
                kotlin.jvm.internal.Ref$ObjectRef r9 = r7.a
                it2 r2 = r7.b
                T r5 = r9.element
                r0.L$0 = r7
                r0.L$1 = r9
                r0.label = r4
                java.lang.Object r8 = r2.invoke(r5, r8, r0)
                if (r8 != r1) goto L56
                return r1
            L56:
                r6 = r8
                r8 = r7
                r7 = r9
                r9 = r6
            L5a:
                r7.element = r9
                kotlinx.coroutines.flow.FlowCollector r7 = r8.c
                kotlin.jvm.internal.Ref$ObjectRef r8 = r8.a
                T r8 = r8.element
                r9 = 0
                r0.L$0 = r9
                r0.L$1 = r9
                r0.label = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L70
                return r1
            L70:
                ww8 r7 = defpackage.ww8.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$simpleScan$1.AnonymousClass1.emit(java.lang.Object, by0):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowExtKt$simpleScan$1(Object obj, Flow flow, it2 it2Var, by0 by0Var) {
        super(2, by0Var);
        this.$initial = obj;
        this.$this_simpleScan = flow;
        this.$operation = it2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.$initial, this.$this_simpleScan, this.$operation, by0Var);
        flowExtKt$simpleScan$1.L$0 = obj;
        return flowExtKt$simpleScan$1;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        FlowCollector flowCollector;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            ref$ObjectRef = new Ref$ObjectRef();
            ?? r4 = this.$initial;
            ref$ObjectRef.element = r4;
            this.L$0 = flowCollector2;
            this.L$1 = ref$ObjectRef;
            this.label = 1;
            if (flowCollector2.emit(r4, this) == h) {
                return h;
            }
            flowCollector = flowCollector2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
                return ww8.a;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            kotlin.f.b(obj);
        }
        Flow<Object> flow = this.$this_simpleScan;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, this.$operation, flowCollector);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (flow.collect(anonymousClass1, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((FlowExtKt$simpleScan$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
