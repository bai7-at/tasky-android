package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes5.dex */
final class FlowKt__EmittersKt$onEmpty$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref$BooleanRef $isEmpty;
    final /* synthetic */ FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__EmittersKt$onEmpty$1$1(Ref$BooleanRef ref$BooleanRef, FlowCollector<? super T> flowCollector) {
        this.$isEmpty = ref$BooleanRef;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r5, defpackage.by0<? super defpackage.ww8> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            kotlin.jvm.internal.Ref$BooleanRef r6 = r4.$isEmpty
            r2 = 0
            r6.element = r2
            kotlinx.coroutines.flow.FlowCollector<T> r4 = r4.$this_unsafeFlow
            r0.label = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1.emit(java.lang.Object, by0):java.lang.Object");
    }
}
