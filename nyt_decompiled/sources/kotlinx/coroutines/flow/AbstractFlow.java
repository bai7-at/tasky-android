package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.ww8;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@ExperimentalCoroutinesApi
/* loaded from: classes5.dex */
public abstract class AbstractFlow<T> implements Flow<T>, CancellableFlow<T> {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r5, defpackage.by0<? super defpackage.ww8> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.AbstractFlow$collect$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = (kotlinx.coroutines.flow.AbstractFlow$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = new kotlinx.coroutines.flow.AbstractFlow$collect$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r4 = (kotlinx.coroutines.flow.internal.SafeCollector) r4
            kotlin.f.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L57
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r6)
            kotlinx.coroutines.flow.internal.SafeCollector r6 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r6.<init>(r5, r2)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L55
            r0.label = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = r4.collectSafely(r6, r0)     // Catch: java.lang.Throwable -> L55
            if (r4 != r1) goto L4e
            return r1
        L4e:
            r4 = r6
        L4f:
            r4.releaseIntercepted()
            ww8 r4 = defpackage.ww8.a
            return r4
        L55:
            r5 = move-exception
            r4 = r6
        L57:
            r4.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow.collect(kotlinx.coroutines.flow.FlowCollector, by0):java.lang.Object");
    }

    public abstract Object collectSafely(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var);
}
