package kotlinx.coroutines.reactive;

import defpackage.by0;
import defpackage.g86;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;

/* loaded from: classes5.dex */
final class PublisherAsFlow<T> extends ChannelFlow<T> {
    private final g86 publisher;

    public /* synthetic */ PublisherAsFlow(g86 g86Var, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(g86Var, (i2 & 2) != 0 ? EmptyCoroutineContext.a : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0038, B:13:0x00ab, B:15:0x00b6, B:18:0x0076, B:26:0x0093, B:34:0x0056), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0038, B:13:0x00ab, B:15:0x00b6, B:18:0x0076, B:26:0x0093, B:34:0x0056), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v6, types: [kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:13:0x00ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectImpl(kotlin.coroutines.CoroutineContext r13, kotlinx.coroutines.flow.FlowCollector<? super T> r14, defpackage.by0<? super defpackage.ww8> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1
            if (r0 == 0) goto L13
            r0 = r15
            kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1 r0 = (kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1 r0 = new kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L5a
            if (r2 == r6) goto L48
            if (r2 != r5) goto L40
            long r12 = r0.J$0
            java.lang.Object r14 = r0.L$2
            kotlinx.coroutines.reactive.ReactiveSubscriber r14 = (kotlinx.coroutines.reactive.ReactiveSubscriber) r14
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.reactive.PublisherAsFlow r7 = (kotlinx.coroutines.reactive.PublisherAsFlow) r7
            kotlin.f.b(r15)     // Catch: java.lang.Throwable -> L3d
            goto Lab
        L3d:
            r12 = move-exception
            goto Lc1
        L40:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L48:
            long r12 = r0.J$0
            java.lang.Object r14 = r0.L$2
            kotlinx.coroutines.reactive.ReactiveSubscriber r14 = (kotlinx.coroutines.reactive.ReactiveSubscriber) r14
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.reactive.PublisherAsFlow r7 = (kotlinx.coroutines.reactive.PublisherAsFlow) r7
            kotlin.f.b(r15)     // Catch: java.lang.Throwable -> L3d
            goto L8b
        L5a:
            kotlin.f.b(r15)
            kotlinx.coroutines.reactive.ReactiveSubscriber r15 = new kotlinx.coroutines.reactive.ReactiveSubscriber
            int r2 = r12.capacity
            kotlinx.coroutines.channels.BufferOverflow r7 = r12.onBufferOverflow
            long r8 = r12.getRequestSize()
            r15.<init>(r2, r7, r8)
            g86 r2 = r12.publisher
            g86 r13 = kotlinx.coroutines.reactive.ReactiveFlowKt.injectCoroutineContext(r2, r13)
            r13.subscribe(r15)
            r13 = r14
            r14 = r15
        L75:
            r7 = r3
        L76:
            r0.L$0 = r12     // Catch: java.lang.Throwable -> L3d
            r0.L$1 = r13     // Catch: java.lang.Throwable -> L3d
            r0.L$2 = r14     // Catch: java.lang.Throwable -> L3d
            r0.J$0 = r7     // Catch: java.lang.Throwable -> L3d
            r0.label = r6     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r15 = r14.takeNextOrNull(r0)     // Catch: java.lang.Throwable -> L3d
            if (r15 != r1) goto L87
            return r1
        L87:
            r2 = r13
            r10 = r7
            r7 = r12
            r12 = r10
        L8b:
            if (r15 != 0) goto L93
            r14.cancel()
            ww8 r12 = defpackage.ww8.a
            return r12
        L93:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()     // Catch: java.lang.Throwable -> L3d
            kotlinx.coroutines.JobKt.ensureActive(r8)     // Catch: java.lang.Throwable -> L3d
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L3d
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L3d
            r0.L$2 = r14     // Catch: java.lang.Throwable -> L3d
            r0.J$0 = r12     // Catch: java.lang.Throwable -> L3d
            r0.label = r5     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r15 = r2.emit(r15, r0)     // Catch: java.lang.Throwable -> L3d
            if (r15 != r1) goto Lab
            return r1
        Lab:
            r8 = 1
            long r12 = r12 + r8
            long r8 = r7.getRequestSize()     // Catch: java.lang.Throwable -> L3d
            int r15 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r15 != 0) goto Lbc
            r14.makeRequest()     // Catch: java.lang.Throwable -> L3d
            r13 = r2
            r12 = r7
            goto L75
        Lbc:
            r10 = r12
            r13 = r2
            r12 = r7
            r7 = r10
            goto L76
        Lc1:
            r14.cancel()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherAsFlow.collectImpl(kotlin.coroutines.CoroutineContext, kotlinx.coroutines.flow.FlowCollector, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectSlowPath(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new PublisherAsFlow$collectSlowPath$2(flowCollector, this, null), by0Var);
        return coroutineScope == a.h() ? coroutineScope : ww8.a;
    }

    private final long getRequestSize() {
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i = this.capacity;
        if (i == -2) {
            return Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core();
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j = i;
        if (j >= 1) {
            return j;
        }
        throw new IllegalStateException("Check failed.");
    }

    private static /* synthetic */ void getRequestSize$annotations() {
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        CoroutineContext context = by0Var.getContext();
        CoroutineContext coroutineContext = this.context;
        c.b bVar = c.P;
        c cVar = (c) coroutineContext.get(bVar);
        if (cVar == null || zq3.c(cVar, context.get(bVar))) {
            Object collectImpl = collectImpl(context.plus(this.context), flowCollector, by0Var);
            return collectImpl == a.h() ? collectImpl : ww8.a;
        }
        Object collectSlowPath = collectSlowPath(flowCollector, by0Var);
        return collectSlowPath == a.h() ? collectSlowPath : ww8.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(ProducerScope<? super T> producerScope, by0<? super ww8> by0Var) {
        Object collectImpl = collectImpl(producerScope.getCoroutineContext(), new SendingCollector(producerScope.getChannel()), by0Var);
        return collectImpl == a.h() ? collectImpl : ww8.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow<T> create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new PublisherAsFlow(this.publisher, coroutineContext, i, bufferOverflow);
    }

    public PublisherAsFlow(g86 g86Var, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.publisher = g86Var;
    }
}
