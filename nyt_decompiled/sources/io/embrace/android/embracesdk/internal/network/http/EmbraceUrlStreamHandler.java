package io.embrace.android.embracesdk.internal.network.http;

import io.embrace.android.embracesdk.Embrace;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* loaded from: classes5.dex */
abstract class EmbraceUrlStreamHandler extends URLStreamHandler {
    protected static final String METHOD_NAME_OPEN_CONNECTION = "openConnection";
    protected static final String MSG_ERROR_OPEN_CONNECTION = "An exception was thrown while attempting to open a connection";
    protected static Boolean enableRequestSizeCapture = Boolean.FALSE;
    protected final Embrace embrace;
    protected final URLStreamHandler handler;
    private final Method methodOpenConnection1;
    private final Method methodOpenConnection2;

    public EmbraceUrlStreamHandler(URLStreamHandler uRLStreamHandler) {
        this(uRLStreamHandler, Embrace.getInstance());
    }

    private URLConnection newUrlConnection(URLConnection uRLConnection) {
        return this.embrace.isStarted() ? wrapUrlConnection(uRLConnection) : uRLConnection;
    }

    public static void setEnableRequestSizeCapture(Boolean bool) {
        enableRequestSizeCapture = bool;
    }

    @Override // java.net.URLStreamHandler
    public abstract int getDefaultPort();

    protected abstract Method getMethodOpenConnection(Class<URL> cls) throws NoSuchMethodException;

    protected abstract Method getMethodOpenConnection(Class<URL> cls, Class<Proxy> cls2) throws NoSuchMethodException;

    protected void injectTraceparent(URLConnection uRLConnection) {
        if (!this.embrace.getInternalInterface().isNetworkSpanForwardingEnabled() || uRLConnection.getRequestProperties().containsKey("traceparent")) {
            return;
        }
        uRLConnection.addRequestProperty("traceparent", this.embrace.generateW3cTraceparent());
    }

    @Override // java.net.URLStreamHandler
    protected URLConnection openConnection(URL url) throws IOException {
        try {
            return newUrlConnection((URLConnection) this.methodOpenConnection1.invoke(this.handler, url));
        } catch (Exception e) {
            throw new IOException(MSG_ERROR_OPEN_CONNECTION, e);
        }
    }

    protected abstract URLConnection wrapUrlConnection(URLConnection uRLConnection);

    EmbraceUrlStreamHandler(URLStreamHandler uRLStreamHandler, Embrace embrace) {
        this.handler = uRLStreamHandler;
        this.embrace = embrace;
        try {
            this.methodOpenConnection1 = getMethodOpenConnection(URL.class);
            this.methodOpenConnection2 = getMethodOpenConnection(URL.class, Proxy.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Failed to initialize EmbraceUrlStreamHandler instance.", e);
        }
    }

    @Override // java.net.URLStreamHandler
    protected URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        try {
            return newUrlConnection((URLConnection) this.methodOpenConnection2.invoke(this.handler, url, proxy));
        } catch (Exception e) {
            throw new IOException(MSG_ERROR_OPEN_CONNECTION, e);
        }
    }
}
