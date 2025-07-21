package io.embrace.android.embracesdk.internal.network.http;

import io.embrace.android.embracesdk.Embrace;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
final class EmbraceUrlStreamHandlerFactory implements URLStreamHandlerFactory {
    private static final String CLASS_HTTPS_OKHTTP_STREAM_HANDLER = "com.android.okhttp.HttpsHandler";
    private static final String CLASS_HTTP_OKHTTP_STREAM_HANDLER = "com.android.okhttp.HttpHandler";
    private static final String PROTOCOL_HTTP = "http";
    private static final String PROTOCOL_HTTPS = "https";
    private static final Map<String, URLStreamHandler> handlers;

    static {
        HashMap hashMap = new HashMap();
        handlers = hashMap;
        try {
            hashMap.put(PROTOCOL_HTTP, new EmbraceHttpUrlStreamHandler(newUrlStreamHandler(CLASS_HTTP_OKHTTP_STREAM_HANDLER)));
            hashMap.put(PROTOCOL_HTTPS, new EmbraceHttpsUrlStreamHandler(newUrlStreamHandler(CLASS_HTTPS_OKHTTP_STREAM_HANDLER)));
        } catch (Exception e) {
            logError("Failed initialize EmbraceUrlStreamHandlerFactory", e);
        }
    }

    EmbraceUrlStreamHandlerFactory() {
    }

    private static void logError(String str, Throwable th) {
        Embrace.getInstance().getInternalInterface().logError(str, null, null, false);
        if (th != null) {
            Embrace.getInstance().getInternalInterface().logInternalError(th);
        }
    }

    static URLStreamHandler newUrlStreamHandler(String str) {
        try {
            return (URLStreamHandler) Class.forName(str).newInstance();
        } catch (Exception e) {
            logError("Failed to instantiate new URLStreamHandler instance: " + str, e);
            return null;
        }
    }

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        if (str != null) {
            return handlers.get(str);
        }
        return null;
    }
}
