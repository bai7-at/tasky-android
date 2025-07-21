package kotlinx.coroutines.flow;

import defpackage.bk3;
import defpackage.by0;
import defpackage.it2;
import defpackage.ww8;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$fold$2<T> implements FlowCollector {
    final /* synthetic */ Ref$ObjectRef<R> $accumulator;
    final /* synthetic */ it2 $operation;

    public FlowKt__ReduceKt$fold$2(Ref$ObjectRef<R> ref$ObjectRef, it2 it2Var) {
        this.$accumulator = ref$ObjectRef;
        this.$operation = it2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r6, defpackage.by0<? super defpackage.ww8> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            kotlin.f.b(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef<R> r7 = r5.$accumulator
            it2 r5 = r5.$operation
            T r2 = r7.element
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r5 = r5.invoke(r2, r6, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r4 = r7
            r7 = r5
            r5 = r4
        L4c:
            r5.element = r7
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2.emit(java.lang.Object, by0):java.lang.Object");
    }

    public final Object emit$$forInline(T t, by0<? super ww8> by0Var) {
        bk3.c(4);
        new FlowKt__ReduceKt$fold$2$emit$1(this, by0Var);
        bk3.c(5);
        Ref$ObjectRef<R> ref$ObjectRef = this.$accumulator;
        ref$ObjectRef.element = (T) this.$operation.invoke(ref$ObjectRef.element, t, by0Var);
        return ww8.a;
    }
}
