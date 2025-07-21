package com.apollographql.apollo.network.ws;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.ad0;
import defpackage.by0;
import defpackage.he9;
import defpackage.j8;
import defpackage.k;
import defpackage.rd0;
import defpackage.w41;
import defpackage.xj;
import defpackage.zq3;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;

/* loaded from: classes2.dex */
public abstract class WsProtocol {
    private final he9 a;
    private final b b;

    public interface a {
        WsProtocol a(he9 he9Var, b bVar, CoroutineScope coroutineScope);

        String getName();
    }

    public interface b {
        void a(String str);

        void b(String str, Map map);

        void c(String str, Map map);

        void d(Map map);

        void e(Throwable th);
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WsFrameType.values().length];
            try {
                iArr[WsFrameType.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WsFrameType.Binary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public WsProtocol(he9 he9Var, b bVar) {
        zq3.h(he9Var, "webSocketConnection");
        zq3.h(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.a = he9Var;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:12:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object g(com.apollographql.apollo.network.ws.WsProtocol r4, defpackage.by0 r5) {
        /*
            boolean r0 = r5 instanceof com.apollographql.apollo.network.ws.WsProtocol$run$1
            if (r0 == 0) goto L13
            r0 = r5
            com.apollographql.apollo.network.ws.WsProtocol$run$1 r0 = (com.apollographql.apollo.network.ws.WsProtocol$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.apollographql.apollo.network.ws.WsProtocol$run$1 r0 = new com.apollographql.apollo.network.ws.WsProtocol$run$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.L$1
            com.apollographql.apollo.network.ws.WsProtocol r4 = (com.apollographql.apollo.network.ws.WsProtocol) r4
            java.lang.Object r2 = r0.L$0
            com.apollographql.apollo.network.ws.WsProtocol r2 = (com.apollographql.apollo.network.ws.WsProtocol) r2
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            goto L4e
        L31:
            r4 = move-exception
            goto L58
        L33:
            r4 = move-exception
            goto L60
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.f.b(r5)
        L40:
            r0.L$0 = r4     // Catch: java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L55
            r0.L$1 = r4     // Catch: java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L55
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L55
            java.lang.Object r5 = r4.e(r0)     // Catch: java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L55
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r2 = r4
        L4e:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            r4.d(r5)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L33
            r4 = r2
            goto L40
        L55:
            r5 = move-exception
            r2 = r4
            r4 = r5
        L58:
            com.apollographql.apollo.network.ws.WsProtocol$b r5 = r2.b
            r5.e(r4)
            ww8 r4 = defpackage.ww8.a
            return r4
        L60:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WsProtocol.g(com.apollographql.apollo.network.ws.WsProtocol, by0):java.lang.Object");
    }

    public void a() {
        this.a.close();
    }

    public abstract Object b(by0 by0Var);

    protected final b c() {
        return this.b;
    }

    public abstract void d(Map map);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:10:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object e(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1
            if (r0 == 0) goto L13
            r0 = r5
            com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1 r0 = (com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1 r0 = new com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            com.apollographql.apollo.network.ws.WsProtocol r4 = (com.apollographql.apollo.network.ws.WsProtocol) r4
            java.lang.Object r2 = r0.L$0
            com.apollographql.apollo.network.ws.WsProtocol r2 = (com.apollographql.apollo.network.ws.WsProtocol) r2
            kotlin.f.b(r5)
            goto L4c
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.f.b(r5)
        L3c:
            he9 r5 = r4.a
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r5 = r5.receive(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r2 = r4
        L4c:
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map r4 = r4.n(r5)
            if (r4 == 0) goto L55
            return r4
        L55:
            r4 = r2
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WsProtocol.e(by0):java.lang.Object");
    }

    public Object f(by0 by0Var) {
        return g(this, by0Var);
    }

    protected final void h(Map map, WsFrameType wsFrameType) {
        zq3.h(map, "messageMap");
        zq3.h(wsFrameType, "frameType");
        int i = c.a[wsFrameType.ordinal()];
        if (i == 1) {
            j(map);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i(map);
        }
    }

    protected final void i(Map map) {
        zq3.h(map, "messageMap");
        this.a.send(m(map));
    }

    protected final void j(Map map) {
        zq3.h(map, "messageMap");
        this.a.send(o(map));
    }

    public abstract void k(xj xjVar);

    public abstract void l(xj xjVar);

    protected final ByteString m(Map map) {
        zq3.h(map, "<this>");
        ad0 ad0Var = new ad0();
        k.a(new rd0(ad0Var, null), map);
        return ad0Var.a1();
    }

    protected final Map n(String str) {
        zq3.h(str, "<this>");
        try {
            Object fromJson = j8.g.fromJson(new com.apollographql.apollo.api.json.b(new ad0().V(str)), w41.i);
            if (fromJson instanceof Map) {
                return (Map) fromJson;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    protected final String o(Map map) {
        zq3.h(map, "<this>");
        ad0 ad0Var = new ad0();
        k.a(new rd0(ad0Var, null), map);
        return ad0Var.i1();
    }
}
