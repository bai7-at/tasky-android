package io.embrace.android.embracesdk.internal.network.http;

import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* loaded from: classes5.dex */
final class EmbraceHttpUrlStreamHandler extends EmbraceUrlStreamHandler {
    static final int PORT = 80;

    public EmbraceHttpUrlStreamHandler(URLStreamHandler uRLStreamHandler) {
        super(uRLStreamHandler);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceUrlStreamHandler, java.net.URLStreamHandler
    public int getDefaultPort() {
        return PORT;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceUrlStreamHandler
    protected Method getMethodOpenConnection(Class<URL> cls) throws NoSuchMethodException {
        Method declaredMethod = this.handler.getClass().getDeclaredMethod("openConnection", cls);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceUrlStreamHandler
    protected URLConnection wrapUrlConnection(URLConnection uRLConnection) {
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return uRLConnection;
        }
        injectTraceparent(uRLConnection);
        if (!EmbraceUrlStreamHandler.enableRequestSizeCapture.booleanValue() || uRLConnection.getRequestProperties().containsKey("Accept-Encoding")) {
            return new EmbraceHttpUrlConnectionImpl((HttpURLConnection) uRLConnection, false);
        }
        uRLConnection.setRequestProperty("Accept-Encoding", EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP);
        return new EmbraceHttpUrlConnectionImpl((HttpURLConnection) uRLConnection, true);
    }

    EmbraceHttpUrlStreamHandler(URLStreamHandler uRLStreamHandler, Embrace embrace) {
        super(uRLStreamHandler, embrace);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceUrlStreamHandler
    protected Method getMethodOpenConnection(Class<URL> cls, Class<Proxy> cls2) throws NoSuchMethodException {
        Method declaredMethod = this.handler.getClass().getDeclaredMethod("openConnection", cls, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
