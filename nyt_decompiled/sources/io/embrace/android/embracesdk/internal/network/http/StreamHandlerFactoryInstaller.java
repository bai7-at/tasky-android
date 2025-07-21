package io.embrace.android.embracesdk.internal.network.http;

import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import io.embrace.android.embracesdk.utils.exceptions.Unchecked;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes5.dex */
class StreamHandlerFactoryInstaller {

    private static class WrappingFactory implements URLStreamHandlerFactory {
        final Boolean enableRequestSizeCapture;
        private final URLStreamHandlerFactory parent;

        WrappingFactory(URLStreamHandlerFactory uRLStreamHandlerFactory, Boolean bool) {
            this.parent = uRLStreamHandlerFactory;
            this.enableRequestSizeCapture = bool;
        }

        @Override // java.net.URLStreamHandlerFactory
        public URLStreamHandler createURLStreamHandler(final String str) {
            try {
                final URLStreamHandler createURLStreamHandler = this.parent.createURLStreamHandler(str);
                return createURLStreamHandler == null ? new EmbraceUrlStreamHandlerFactory().createURLStreamHandler(str) : new URLStreamHandler() { // from class: io.embrace.android.embracesdk.internal.network.http.StreamHandlerFactoryInstaller.WrappingFactory.1
                    private URLConnection wrapConnection(URLConnection uRLConnection) {
                        boolean z;
                        if (!(uRLConnection instanceof HttpURLConnection)) {
                            StreamHandlerFactoryInstaller.logError("Cannot wrap unsupported protocol: " + str, null);
                            return uRLConnection;
                        }
                        if (!WrappingFactory.this.enableRequestSizeCapture.booleanValue() || uRLConnection.getRequestProperties().containsKey("Accept-Encoding")) {
                            z = false;
                        } else {
                            uRLConnection.setRequestProperty("Accept-Encoding", EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP);
                            z = true;
                        }
                        return uRLConnection instanceof HttpsURLConnection ? new EmbraceHttpsUrlConnectionImpl((HttpsURLConnection) uRLConnection, z) : new EmbraceHttpUrlConnectionImpl((HttpURLConnection) uRLConnection, z);
                    }

                    @Override // java.net.URLStreamHandler
                    protected URLConnection openConnection(URL url, Proxy proxy) {
                        try {
                            Method declaredMethod = createURLStreamHandler.getClass().getDeclaredMethod("openConnection", URL.class, Proxy.class);
                            declaredMethod.setAccessible(true);
                            return wrapConnection((URLConnection) declaredMethod.invoke(createURLStreamHandler, url, proxy));
                        } catch (Exception e) {
                            StreamHandlerFactoryInstaller.logError("Exception when opening connection for protocol: " + str + " and URL: " + url, e);
                            throw Unchecked.propagate(e);
                        }
                    }

                    @Override // java.net.URLStreamHandler
                    protected URLConnection openConnection(URL url) {
                        try {
                            Method declaredMethod = createURLStreamHandler.getClass().getDeclaredMethod("openConnection", URL.class);
                            declaredMethod.setAccessible(true);
                            return wrapConnection((URLConnection) declaredMethod.invoke(createURLStreamHandler, url));
                        } catch (Exception e) {
                            StreamHandlerFactoryInstaller.logError("Exception when opening connection for protocol: " + str + " and URL: " + url, e);
                            throw Unchecked.propagate(e);
                        }
                    }
                };
            } catch (Exception e) {
                StreamHandlerFactoryInstaller.logError("Exception when trying to create stream handler with parent factory for protocol: " + str, e);
                return new EmbraceUrlStreamHandlerFactory().createURLStreamHandler(str);
            }
        }
    }

    private StreamHandlerFactoryInstaller() {
    }

    private static void clearFactory() {
        try {
            getFactoryField().set(null, null);
        } catch (Exception e) {
            throw Unchecked.propagate(e);
        }
    }

    private static Field getFactoryField() {
        for (Field field : URL.class.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(URLStreamHandlerFactory.class)) {
                field.setAccessible(true);
                return field;
            }
        }
        throw new IllegalStateException("Unable to detect static field in the URL class for the URLStreamHandlerFactory.");
    }

    static void logError(String str, Throwable th) {
        Embrace.getInstance().getInternalInterface().logError(str, null, null, false);
        if (th != null) {
            Embrace.getInstance().getInternalInterface().logInternalError(th);
        }
    }

    static void registerFactory(Boolean bool) {
        EmbraceUrlStreamHandler.setEnableRequestSizeCapture(bool);
        try {
            Object obj = getFactoryField().get(null);
            if (obj == null) {
                Embrace.getInstance().getInternalInterface().logInfo("Registering EmbraceUrlStreamHandlerFactory.", null);
                URL.setURLStreamHandlerFactory(new EmbraceUrlStreamHandlerFactory());
            } else {
                Embrace.getInstance().getInternalInterface().logInfo("Existing URLStreamHandlerFactory detected (" + obj.getClass().getName() + "). Wrapping with Embrace factory to enable network traffic interception.", null);
                WrappingFactory wrappingFactory = new WrappingFactory((URLStreamHandlerFactory) obj, bool);
                clearFactory();
                URL.setURLStreamHandlerFactory(wrappingFactory);
            }
        } catch (Throwable th) {
            logError("Error during wrapping of UrlStreamHandlerFactory. Will attempt to set the default Embrace factory", th);
            try {
                URL.setURLStreamHandlerFactory(new EmbraceUrlStreamHandlerFactory());
            } catch (Throwable th2) {
                logError("Failed to register EmbraceUrlStreamHandlerFactory. Network capture disabled.", th2);
            }
        }
    }
}
