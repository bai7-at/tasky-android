package kotlinx.coroutines.stream;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
final class StreamFlow<T> implements Flow<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile = 0;
    private final Stream<T> stream;

    public StreamFlow(Stream<T> stream) {
        this.stream = stream;
    }

    private final /* synthetic */ int getConsumed$volatile() {
        return this.consumed$volatile;
    }

    private final /* synthetic */ void setConsumed$volatile(int i) {
        this.consumed$volatile = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:15:0x005a, B:17:0x0060), top: B:14:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r6, defpackage.by0<? super defpackage.ww8> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.stream.StreamFlow$collect$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = (kotlinx.coroutines.stream.StreamFlow$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.stream.StreamFlow$collect$1 r0 = new kotlinx.coroutines.stream.StreamFlow$collect$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r5 = r0.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.stream.StreamFlow r2 = (kotlinx.coroutines.stream.StreamFlow) r2
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L37
            r7 = r6
            r6 = r2
            goto L5a
        L37:
            r5 = move-exception
            r6 = r2
            goto L81
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L42:
            kotlin.f.b(r7)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = getConsumed$volatile$FU()
            r2 = 0
            boolean r7 = r7.compareAndSet(r5, r2, r3)
            if (r7 == 0) goto L87
            java.util.stream.Stream<T> r7 = r5.stream     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L7d
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L5a:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L75
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L73
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L73
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L73
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L73
            r0.label = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = r7.emit(r2, r0)     // Catch: java.lang.Throwable -> L73
            if (r2 != r1) goto L5a
            return r1
        L73:
            r5 = move-exception
            goto L81
        L75:
            java.util.stream.Stream<T> r5 = r6.stream
            r5.close()
            ww8 r5 = defpackage.ww8.a
            return r5
        L7d:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L81:
            java.util.stream.Stream<T> r6 = r6.stream
            r6.close()
            throw r5
        L87:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Stream.consumeAsFlow can be collected only once"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.StreamFlow.collect(kotlinx.coroutines.flow.FlowCollector, by0):java.lang.Object");
    }
}
