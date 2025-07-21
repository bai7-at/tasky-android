package kotlinx.coroutines.flow;

import defpackage.gt2;
import defpackage.it2;

/* loaded from: classes5.dex */
final /* synthetic */ class FlowKt__EmittersKt {
    public static final void ensureActive(FlowCollector<?> flowCollector) {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector<? super T> r4, defpackage.it2 r5, java.lang.Throwable r6, defpackage.by0<? super defpackage.ww8> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.f.b(r7)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2e
            r0.label = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            ww8 r4 = defpackage.ww8.a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            defpackage.g62.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector, it2, java.lang.Throwable, by0):java.lang.Object");
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, it2 it2Var) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flow, it2Var);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, gt2 gt2Var) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(flow, gt2Var);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, gt2 gt2Var) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(gt2Var, flow);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt.flow(new FlowKt__EmittersKt$transform$1(flow, it2Var, null));
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, it2 it2Var) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(flow, it2Var);
    }
}
