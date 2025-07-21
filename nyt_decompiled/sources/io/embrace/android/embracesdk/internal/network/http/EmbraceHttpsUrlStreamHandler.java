package io.embrace.android.embracesdk.internal.network.http;

import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes5.dex */
final class EmbraceHttpsUrlStreamHandler extends EmbraceUrlStreamHandler {
    static final int PORT = 443;

    public EmbraceHttpsUrlStreamHandler(URLStreamHandler uRLStreamHandler) {
        super(uRLStreamHandler);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceUrlStreamHandler, java.net.URLStreamHandler
    public int getDefaultPort() {
        return PORT;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceUrlStreamHandler
    protected Method getMethodOpenConnection(Class<URL> cls) throws NoSuchMethodException {
        Method declaredMethod = this.handler.getClass().getSuperclass().getDeclaredMethod("openConnection", cls);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceUrlStreamHandler
    protected URLConnection wrapUrlConnection(URLConnection uRLConnection) {
        if (!(uRLConnection instanceof HttpsURLConnection)) {
            return uRLConnection;
        }
        injectTraceparent(uRLConnection);
        if (!EmbraceUrlStreamHandler.enableRequestSizeCapture.booleanValue() || uRLConnection.getRequestProperties().containsKey("Accept-Encoding")) {
            return new EmbraceHttpsUrlConnectionImpl((HttpsURLConnection) uRLConnection, false);
        }
        uRLConnection.setRequestProperty("Accept-Encoding", EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP);
        return new EmbraceHttpsUrlConnectionImpl((HttpsURLConnection) uRLConnection, true);
    }

    EmbraceHttpsUrlStreamHandler(URLStreamHandler uRLStreamHandler, Embrace embrace) {
        super(uRLStreamHandler, embrace);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceUrlStreamHandler
    protected Method getMethodOpenConnection(Class<URL> cls, Class<Proxy> cls2) throws NoSuchMethodException {
        Method declaredMethod = this.handler.getClass().getSuperclass().getDeclaredMethod("openConnection", cls, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
