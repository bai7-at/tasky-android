package kotlinx.coroutines;

import defpackage.by0;
import defpackage.hc1;
import defpackage.ww8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.time.DurationUnit;
import kotlin.time.b;

/* loaded from: classes5.dex */
public final class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitCancellation(defpackage.by0<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.f.b(r4)
            goto L52
        L31:
            kotlin.f.b(r4)
            r0.label = r3
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            by0 r2 = kotlin.coroutines.intrinsics.a.d(r0)
            r4.<init>(r2, r3)
            r4.initCancellability()
            java.lang.Object r4 = r4.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.h()
            if (r4 != r2) goto L4f
            defpackage.hc1.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.awaitCancellation(by0):java.lang.Object");
    }

    public static final Object delay(long j, by0<? super ww8> by0Var) {
        if (j <= 0) {
            return ww8.a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        if (j < Long.MAX_VALUE) {
            getDelay(cancellableContinuationImpl.getContext()).mo938scheduleResumeAfterDelay(j, cancellableContinuationImpl);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
    }

    /* renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m872delayVtjQ1oo(long j, by0<? super ww8> by0Var) {
        Object delay = delay(m873toDelayMillisLRDsOJo(j), by0Var);
        return delay == kotlin.coroutines.intrinsics.a.h() ? delay : ww8.a;
    }

    public static final Delay getDelay(CoroutineContext coroutineContext) {
        CoroutineContext.a aVar = coroutineContext.get(c.P);
        Delay delay = aVar instanceof Delay ? (Delay) aVar : null;
        return delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
    }

    /* renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m873toDelayMillisLRDsOJo(long j) {
        boolean G = b.G(j);
        if (G) {
            return b.s(b.I(j, kotlin.time.c.t(999999L, DurationUnit.NANOSECONDS)));
        }
        if (G) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
