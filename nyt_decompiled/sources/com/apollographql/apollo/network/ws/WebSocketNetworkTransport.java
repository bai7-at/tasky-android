package com.apollographql.apollo.network.ws;

import androidx.recyclerview.widget.RecyclerView;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.internal.FlowsKt;
import com.apollographql.apollo.network.ws.SubscriptionWsProtocol;
import com.apollographql.apollo.network.ws.WsProtocol;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fx2;
import defpackage.gt2;
import defpackage.hm0;
import defpackage.ie9;
import defpackage.il1;
import defpackage.it2;
import defpackage.j55;
import defpackage.ki5;
import defpackage.li5;
import defpackage.qs1;
import defpackage.ri5;
import defpackage.ss2;
import defpackage.t35;
import defpackage.ww8;
import defpackage.xj;
import defpackage.yj;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport implements j55 {
    private final ss2 a;
    private final List b;
    private final ie9 c;
    private final long d;
    private final WsProtocol.a e;
    private final it2 f;
    private final Channel g;
    private final MutableSharedFlow h;
    private final SharedFlow i;
    private final StateFlow j;
    private final hm0 k;
    private final CoroutineScope l;
    private final a m;

    @fc1(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", l = {95}, m = "invokeSuspend")
    /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = WebSocketNetworkTransport.this.new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r4 = r4.L$0
                java.io.Closeable r4 = (java.io.Closeable) r4
                kotlin.f.b(r5)     // Catch: java.lang.Throwable -> L13
                goto L38
            L13:
                r5 = move-exception
                goto L46
            L15:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1d:
                kotlin.f.b(r5)
                java.lang.Object r5 = r4.L$0
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                com.apollographql.apollo.network.ws.WebSocketNetworkTransport r1 = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.this
                hm0 r1 = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.c(r1)
                com.apollographql.apollo.network.ws.WebSocketNetworkTransport r3 = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.this
                r4.L$0 = r1     // Catch: java.lang.Throwable -> L44
                r4.label = r2     // Catch: java.lang.Throwable -> L44
                java.lang.Object r4 = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.f(r3, r5, r4)     // Catch: java.lang.Throwable -> L44
                if (r4 != r0) goto L37
                return r0
            L37:
                r4 = r1
            L38:
                ww8 r5 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L13
                if (r4 == 0) goto L42
                r4.close()     // Catch: java.lang.Throwable -> L40
                goto L42
            L40:
                r4 = move-exception
                goto L51
            L42:
                r4 = 0
                goto L51
            L44:
                r5 = move-exception
                r4 = r1
            L46:
                if (r4 == 0) goto L50
                r4.close()     // Catch: java.lang.Throwable -> L4c
                goto L50
            L4c:
                r4 = move-exception
                defpackage.g62.a(r5, r4)
            L50:
                r4 = r5
            L51:
                if (r4 != 0) goto L56
                ww8 r4 = defpackage.ww8.a
                return r4
            L56:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public static final class Builder {
        private ss2 a;
        private List b = new ArrayList();
        private ie9 c;
        private Long d;
        private WsProtocol.a e;
        private it2 f;

        public final WebSocketNetworkTransport a() {
            ss2 ss2Var = this.a;
            if (ss2Var == null) {
                throw new IllegalStateException("No serverUrl specified");
            }
            List list = this.b;
            ie9 ie9Var = this.c;
            if (ie9Var == null) {
                ie9Var = new DefaultWebSocketEngine();
            }
            Long l = this.d;
            long longValue = l != null ? l.longValue() : 60000L;
            WsProtocol.a aVar = this.e;
            if (aVar == null) {
                aVar = new SubscriptionWsProtocol.Factory(0L, null, null, 7, null);
            }
            return new WebSocketNetworkTransport(ss2Var, list, ie9Var, longValue, aVar, this.f, null);
        }

        public final Builder b(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public final Builder c(WsProtocol.a aVar) {
            zq3.h(aVar, "protocolFactory");
            this.e = aVar;
            return this;
        }

        public final Builder d(it2 it2Var) {
            this.f = it2Var;
            return this;
        }

        public final Builder e(ss2 ss2Var) {
            this.a = ss2Var;
            return this;
        }

        public final Builder f(String str) {
            zq3.h(str, "serverUrl");
            this.a = new WebSocketNetworkTransport$Builder$serverUrl$1$1(str, null);
            return this;
        }

        public final Builder g(ie9 ie9Var) {
            zq3.h(ie9Var, "webSocketEngine");
            this.c = ie9Var;
            return this;
        }
    }

    public static final class a implements WsProtocol.b {
        a() {
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.b
        public void a(String str) {
            zq3.h(str, "id");
            WebSocketNetworkTransport.this.g.mo129trySendJP2dKIU(new ki5(str));
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.b
        public void b(String str, Map map) {
            zq3.h(str, "id");
            WebSocketNetworkTransport.this.g.mo129trySendJP2dKIU(new li5(str, map));
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.b
        public void c(String str, Map map) {
            zq3.h(str, "id");
            zq3.h(map, "payload");
            WebSocketNetworkTransport.this.g.mo129trySendJP2dKIU(new ri5(str, map));
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.b
        public void d(Map map) {
            WebSocketNetworkTransport.this.g.mo129trySendJP2dKIU(new fx2(map));
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.b
        public void e(Throwable th) {
            zq3.h(th, "cause");
            WebSocketNetworkTransport.this.g.mo129trySendJP2dKIU(new t35(th));
        }
    }

    public /* synthetic */ WebSocketNetworkTransport(ss2 ss2Var, List list, ie9 ie9Var, long j, WsProtocol.a aVar, it2 it2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(ss2Var, list, ie9Var, j, aVar, it2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yj h(xj xjVar, ApolloException apolloException) {
        return new yj.a(xjVar.g(), xjVar.h()).e(apolloException).g(true).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:71|72|73|74|(3:130|(3:133|(5:135|136|83|84|(1:86)(16:87|88|89|90|91|92|(1:94)|95|96|(0)(0)|99|13|(0)(0)|16|17|(0)(0)))(1:137)|131)|138)(1:78)|79|80|81|82|83|84|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:87|88|89|90|91|92|(1:94)|95|96|(0)(0)|99|13|(0)(0)|16|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03d1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03d2, code lost:
    
        r2 = r4;
        r4 = r12;
        r12 = r13;
        r13 = r14;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0411, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0412, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0320, code lost:
    
        r2 = r11;
        r10 = r12;
        r11 = r13;
        r12 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0445 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0330 A[Catch: Exception -> 0x031f, TryCatch #0 {Exception -> 0x031f, blocks: (B:73:0x0309, B:76:0x0315, B:79:0x0345, B:130:0x0326, B:131:0x032a, B:133:0x0330, B:136:0x0340), top: B:72:0x0309 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0378 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0459  */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, com.apollographql.apollo.network.ws.WsProtocol, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v46, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x04bd -> B:12:0x04c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0276 -> B:17:0x01ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x04cd -> B:13:0x04d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlinx.coroutines.CoroutineScope r27, defpackage.by0 r28) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport.i(kotlinx.coroutines.CoroutineScope, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        WsProtocol wsProtocol = (WsProtocol) ref$ObjectRef.element;
        if (wsProtocol != null) {
            wsProtocol.a();
        }
        ref$ObjectRef.element = null;
        Job job = (Job) ref$ObjectRef2.element;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        ref$ObjectRef2.element = null;
        Job job2 = (Job) ref$ObjectRef3.element;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        ref$ObjectRef3.element = null;
    }

    @Override // defpackage.j55
    public Flow a(final xj xjVar) {
        zq3.h(xjVar, "request");
        final il1 il1Var = new il1();
        final SharedFlow onSubscription = FlowKt.onSubscription(this.i, new WebSocketNetworkTransport$execute$1(this, xjVar, null));
        final Flow a2 = FlowsKt.a(new Flow() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1

            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ xj b;

                @fc1(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2", f = "WebSocketNetworkTransport.kt", l = {219}, m = "emit")
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, xj xjVar) {
                    this.a = flowCollector;
                    this.b = xjVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, defpackage.by0 r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1 r0 = (com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1 r0 = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r7)
                        goto L5c
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.a
                        r2 = r6
                        d32 r2 = (defpackage.d32) r2
                        java.lang.String r4 = r2.getId()
                        xj r5 = r5.b
                        java.util.UUID r5 = r5.h()
                        java.lang.String r5 = r5.toString()
                        boolean r5 = defpackage.zq3.c(r4, r5)
                        if (r5 != 0) goto L53
                        java.lang.String r5 = r2.getId()
                        if (r5 != 0) goto L5c
                    L53:
                        r0.label = r3
                        java.lang.Object r5 = r7.emit(r6, r0)
                        if (r5 != r1) goto L5c
                        return r1
                    L5c:
                        ww8 r5 = defpackage.ww8.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, xjVar), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        }, new WebSocketNetworkTransport$execute$3(xjVar, null));
        final Flow flow = new Flow() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1

            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ xj b;
                final /* synthetic */ il1 c;
                final /* synthetic */ WebSocketNetworkTransport d;

                @fc1(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2", f = "WebSocketNetworkTransport.kt", l = {219}, m = "emit")
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, xj xjVar, il1 il1Var, WebSocketNetworkTransport webSocketNetworkTransport) {
                    this.a = flowCollector;
                    this.b = xjVar;
                    this.c = il1Var;
                    this.d = webSocketNetworkTransport;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, defpackage.by0 r10) {
                    /*
                        Method dump skipped, instructions count: 300
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, xjVar, il1Var, this), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
        return FlowKt.onCompletion(new Flow() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1

            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ il1 b;

                @fc1(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2", f = "WebSocketNetworkTransport.kt", l = {219}, m = "emit")
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, il1 il1Var) {
                    this.a = flowCollector;
                    this.b = il1Var;
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
                        boolean r0 = r6 instanceof com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1 r0 = (com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1 r0 = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        r2 = r5
                        yj r2 = (defpackage.yj) r2
                        il1 r4 = r4.b
                        boolean r4 = r4.d()
                        if (r4 != 0) goto L4a
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r5, r0)
                        if (r4 != r1) goto L4a
                        return r1
                    L4a:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, il1Var), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        }, new WebSocketNetworkTransport$execute$6(this, xjVar, null));
    }

    @Override // defpackage.j55
    public void dispose() {
        this.g.mo129trySendJP2dKIU(qs1.a);
    }

    private WebSocketNetworkTransport(ss2 ss2Var, List list, ie9 ie9Var, long j, WsProtocol.a aVar, it2 it2Var) {
        this.a = ss2Var;
        this.b = list;
        this.c = ie9Var;
        this.d = j;
        this.e = aVar;
        this.f = it2Var;
        this.g = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, Integer.MAX_VALUE, BufferOverflow.SUSPEND);
        this.h = MutableSharedFlow;
        this.i = FlowKt.asSharedFlow(MutableSharedFlow);
        this.j = MutableSharedFlow.getSubscriptionCount();
        hm0 hm0Var = new hm0();
        this.k = hm0Var;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(hm0Var.a());
        this.l = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        this.m = new a();
    }
}
