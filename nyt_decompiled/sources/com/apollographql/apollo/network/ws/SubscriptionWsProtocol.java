package com.apollographql.apollo.network.ws;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.network.ws.WsProtocol;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.he9;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xh1;
import defpackage.xj;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class SubscriptionWsProtocol extends WsProtocol {
    private final long c;
    private final ss2 d;
    private final WsFrameType e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol(he9 he9Var, WsProtocol.b bVar, long j, ss2 ss2Var, WsFrameType wsFrameType) {
        super(he9Var, bVar);
        zq3.h(he9Var, "webSocketConnection");
        zq3.h(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        zq3.h(ss2Var, "connectionPayload");
        zq3.h(wsFrameType, "frameType");
        this.c = j;
        this.d = ss2Var;
        this.e = wsFrameType;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.network.ws.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1
            if (r0 == 0) goto L13
            r0 = r8
            com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1 r0 = (com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1 r0 = new com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L89
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$1
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r2 = r0.L$0
            com.apollographql.apollo.network.ws.SubscriptionWsProtocol r2 = (com.apollographql.apollo.network.ws.SubscriptionWsProtocol) r2
            kotlin.f.b(r8)
            goto L66
        L40:
            kotlin.f.b(r8)
            java.lang.String r8 = "type"
            java.lang.String r2 = "connection_init"
            kotlin.Pair r8 = defpackage.du8.a(r8, r2)
            kotlin.Pair[] r8 = new kotlin.Pair[]{r8}
            java.util.Map r8 = kotlin.collections.t.n(r8)
            ss2 r2 = r7.d
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r2.invoke(r0)
            if (r2 != r1) goto L62
            return r1
        L62:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L66:
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L6f
            java.lang.String r4 = "payload"
            r7.put(r4, r8)
        L6f:
            com.apollographql.apollo.network.ws.WsFrameType r8 = r2.e
            r2.h(r7, r8)
            long r7 = r2.c
            com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2 r4 = new com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2
            r5 = 0
            r4.<init>(r2, r5)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeout(r7, r4, r0)
            if (r7 != r1) goto L89
            return r1
        L89:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.SubscriptionWsProtocol.b(by0):java.lang.Object");
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public void d(Map map) {
        zq3.h(map, "messageMap");
        Object obj = map.get(TransferTable.COLUMN_TYPE);
        if (zq3.c(obj, "data")) {
            WsProtocol.b c = c();
            Object obj2 = map.get("id");
            zq3.f(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = map.get("payload");
            zq3.f(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            c.c((String) obj2, (Map) obj3);
            return;
        }
        if (zq3.c(obj, "error")) {
            Object obj4 = map.get("id");
            if (obj4 instanceof String) {
                c().b((String) obj4, (Map) map.get("payload"));
                return;
            } else {
                c().d((Map) map.get("payload"));
                return;
            }
        }
        if (zq3.c(obj, "complete")) {
            WsProtocol.b c2 = c();
            Object obj5 = map.get("id");
            zq3.f(obj5, "null cannot be cast to non-null type kotlin.String");
            c2.a((String) obj5);
        }
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public void k(xj xjVar) {
        zq3.h(xjVar, "request");
        h(t.m(du8.a(TransferTable.COLUMN_TYPE, "start"), du8.a("id", xjVar.h().toString()), du8.a("payload", xh1.b.l(xjVar))), this.e);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public void l(xj xjVar) {
        zq3.h(xjVar, "request");
        h(t.m(du8.a(TransferTable.COLUMN_TYPE, "stop"), du8.a("id", xjVar.h().toString())), this.e);
    }

    public static final class Factory implements WsProtocol.a {
        private final long a;
        private final ss2 b;
        private final WsFrameType c;

        @fc1(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$Factory$1", f = "SubscriptionWsProtocol.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.apollographql.apollo.network.ws.SubscriptionWsProtocol$Factory$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements ss2 {
            int label;

            AnonymousClass1(by0 by0Var) {
                super(1, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(by0 by0Var) {
                return new AnonymousClass1(by0Var);
            }

            @Override // defpackage.ss2
            public final Object invoke(by0 by0Var) {
                return ((AnonymousClass1) create(by0Var)).invokeSuspend(ww8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return null;
            }
        }

        public Factory(long j, ss2 ss2Var, WsFrameType wsFrameType) {
            zq3.h(ss2Var, "connectionPayload");
            zq3.h(wsFrameType, "frameType");
            this.a = j;
            this.b = ss2Var;
            this.c = wsFrameType;
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.a
        public WsProtocol a(he9 he9Var, WsProtocol.b bVar, CoroutineScope coroutineScope) {
            zq3.h(he9Var, "webSocketConnection");
            zq3.h(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            zq3.h(coroutineScope, "scope");
            return new SubscriptionWsProtocol(he9Var, bVar, this.a, this.b, this.c);
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.a
        public String getName() {
            return "graphql-ws";
        }

        public /* synthetic */ Factory(long j, ss2 ss2Var, WsFrameType wsFrameType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 10000L : j, (i & 2) != 0 ? new AnonymousClass1(null) : ss2Var, (i & 4) != 0 ? WsFrameType.Text : wsFrameType);
        }
    }
}
