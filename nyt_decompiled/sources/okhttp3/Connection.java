package okhttp3;

import java.net.Socket;

/* loaded from: classes5.dex */
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
