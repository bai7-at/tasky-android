package okhttp3;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.zq3;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        zq3.h(webSocket, "webSocket");
        zq3.h(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        zq3.h(webSocket, "webSocket");
        zq3.h(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        zq3.h(webSocket, "webSocket");
        zq3.h(th, QueryKeys.TOKEN);
    }

    public void onMessage(WebSocket webSocket, String str) {
        zq3.h(webSocket, "webSocket");
        zq3.h(str, "text");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        zq3.h(webSocket, "webSocket");
        zq3.h(response, "response");
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        zq3.h(webSocket, "webSocket");
        zq3.h(byteString, "bytes");
    }
}
