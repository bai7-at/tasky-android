package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloWebSocketClosedException;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.by0;
import defpackage.he9;
import defpackage.ie9;
import defpackage.ud5;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class DefaultWebSocketEngine implements ie9 {
    private final WebSocket.Factory a;

    public static final class b extends WebSocketListener {
        final /* synthetic */ CompletableDeferred a;
        final /* synthetic */ Channel b;

        b(CompletableDeferred completableDeferred, Channel channel) {
            this.a = completableDeferred;
            this.b = channel;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            zq3.h(webSocket, "webSocket");
            zq3.h(str, "reason");
            SendChannel.DefaultImpls.close$default(this.b, null, 1, null);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i, String str) {
            zq3.h(webSocket, "webSocket");
            zq3.h(str, "reason");
            this.a.complete(ww8.a);
            this.b.close(new ApolloWebSocketClosedException(i, str, null, 4, null));
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            zq3.h(webSocket, "webSocket");
            zq3.h(th, QueryKeys.TOKEN);
            this.a.complete(ww8.a);
            this.b.close(new ApolloNetworkException("Web socket communication error", th));
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            zq3.h(webSocket, "webSocket");
            zq3.h(str, "text");
            this.b.mo129trySendJP2dKIU(str);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            zq3.h(webSocket, "webSocket");
            zq3.h(response, "response");
            this.a.complete(ww8.a);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, ByteString byteString) {
            zq3.h(webSocket, "webSocket");
            zq3.h(byteString, "bytes");
            this.b.mo129trySendJP2dKIU(byteString.K());
        }
    }

    public DefaultWebSocketEngine(WebSocket.Factory factory) {
        zq3.h(factory, "webSocketFactory");
        this.a = factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ww8 c(WebSocket webSocket, Throwable th) {
        webSocket.close(1001, null);
        return ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ie9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r6, java.util.List r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1
            if (r0 == 0) goto L13
            r0 = r8
            com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1 r0 = (com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1 r0 = new com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            okhttp3.WebSocket r5 = (okhttp3.WebSocket) r5
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.Channel r6 = (kotlinx.coroutines.channels.Channel) r6
            kotlin.f.b(r8)
            goto L77
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r8)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r2 = 6
            r4 = 0
            kotlinx.coroutines.channels.Channel r8 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r8, r4, r4, r2, r4)
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r4, r3, r4)
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder
            r4.<init>()
            okhttp3.Request$Builder r6 = r4.url(r6)
            okhttp3.Headers r7 = defpackage.ud5.e(r7)
            okhttp3.Request$Builder r6 = r6.headers(r7)
            okhttp3.Request r6 = r6.build()
            okhttp3.WebSocket$Factory r5 = r5.a
            com.apollographql.apollo.network.ws.DefaultWebSocketEngine$b r7 = new com.apollographql.apollo.network.ws.DefaultWebSocketEngine$b
            r7.<init>(r2, r8)
            okhttp3.WebSocket r5 = r5.newWebSocket(r6, r7)
            r0.L$0 = r8
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r2.await(r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            r6 = r8
        L77:
            bl1 r7 = new bl1
            r7.<init>()
            r6.mo949invokeOnClose(r7)
            com.apollographql.apollo.network.ws.DefaultWebSocketEngine$a r7 = new com.apollographql.apollo.network.ws.DefaultWebSocketEngine$a
            r7.<init>(r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.DefaultWebSocketEngine.a(java.lang.String, java.util.List, by0):java.lang.Object");
    }

    public static final class a implements he9 {
        final /* synthetic */ Channel a;
        final /* synthetic */ WebSocket b;

        a(Channel channel, WebSocket webSocket) {
            this.a = channel;
            this.b = webSocket;
        }

        @Override // defpackage.he9
        public void close() {
            this.b.close(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, null);
        }

        @Override // defpackage.he9
        public Object receive(by0 by0Var) {
            return this.a.receive(by0Var);
        }

        @Override // defpackage.he9
        public void send(ByteString byteString) {
            zq3.h(byteString, "data");
            if (this.b.send(byteString)) {
                return;
            }
            SendChannel.DefaultImpls.close$default(this.a, null, 1, null);
        }

        @Override // defpackage.he9
        public void send(String str) {
            zq3.h(str, "string");
            if (this.b.send(str)) {
                return;
            }
            SendChannel.DefaultImpls.close$default(this.a, null, 1, null);
        }
    }

    public DefaultWebSocketEngine() {
        this(ud5.c().build());
    }
}
