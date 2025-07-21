package io.embrace.android.embracesdk.internal.network.http;

import android.annotation.TargetApi;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

@InternalApi
/* loaded from: classes5.dex */
class EmbraceUrlConnectionDelegate<T extends HttpURLConnection> implements EmbraceHttpsUrlConnection {
    static final String CONTENT_ENCODING = "Content-Encoding";
    static final String CONTENT_LENGTH = "Content-Length";
    private final T connection;
    private final long createdTime;
    private volatile boolean didLogNetworkCall;
    private final Embrace embrace;
    private final boolean enableWrapIoStreams;
    private final AtomicReference<Map<String, List<String>>> headerFields;
    private volatile Exception inputStreamAccessException;
    private final boolean isSDKStarted;
    private volatile Exception lastConnectionAccessException;
    private final AtomicReference<NetworkCaptureData> networkCaptureData;
    private volatile CountingOutputStream outputStream;
    private volatile HashMap<String, String> requestHeaders;
    private final AtomicInteger responseCode;
    private final AtomicLong responseSize;
    private volatile Long startTime;
    private volatile String traceId;
    private volatile String traceparent;

    public EmbraceUrlConnectionDelegate(T t, boolean z) {
        this(t, z, Embrace.getInstance());
    }

    private void cacheNetworkCallData() {
        cacheNetworkCallData(null);
    }

    private CountingInputStreamWithCallback countingInputStream(InputStream inputStream) {
        return new CountingInputStreamWithCallback(inputStream, hasNetworkCaptureRules(), new ss2() { // from class: io.embrace.android.embracesdk.internal.network.http.e
            @Override // defpackage.ss2
            public final Object invoke(Object obj) {
                ww8 lambda$countingInputStream$6;
                lambda$countingInputStream$6 = EmbraceUrlConnectionDelegate.this.lambda$countingInputStream$6((byte[]) obj);
                return lambda$countingInputStream$6;
            }
        });
    }

    private HashMap<String, String> getProcessedHeaders(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            for (String str : entry.getValue()) {
                if (str != null) {
                    sb.append(str);
                }
            }
            hashMap.put(entry.getKey(), sb.toString());
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.InputStream getWrappedInputStream(final java.io.InputStream r3) {
        /*
            r2 = this;
            r2.identifyTraceId()
            io.embrace.android.embracesdk.Embrace r0 = r2.embrace
            io.embrace.android.embracesdk.internal.EmbraceInternalInterface r0 = r0.getInternalInterface()
            long r0 = r0.getSdkCurrentTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.setStartTime(r0)
            boolean r0 = r2.shouldUncompressGzip()
            if (r0 == 0) goto L2f
            io.embrace.android.embracesdk.internal.network.http.g r0 = new io.embrace.android.embracesdk.internal.network.http.g     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L2f
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            io.embrace.android.embracesdk.internal.network.http.CountingInputStreamWithCallback r0 = r2.countingInputStream(r1)     // Catch: java.lang.Throwable -> L2f
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 != 0) goto L40
            boolean r0 = r2.enableWrapIoStreams
            if (r0 == 0) goto L3f
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r3)
            io.embrace.android.embracesdk.internal.network.http.CountingInputStreamWithCallback r3 = r2.countingInputStream(r0)
        L3f:
            r0 = r3
        L40:
            r2.cacheNetworkCallData()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.internal.network.http.EmbraceUrlConnectionDelegate.getWrappedInputStream(java.io.InputStream):java.io.InputStream");
    }

    private boolean hasNetworkCaptureRules() {
        if (!this.isSDKStarted || this.connection.getURL() == null) {
            return false;
        }
        return this.embrace.getInternalInterface().shouldCaptureNetworkBody(this.connection.getURL().toString(), this.connection.getRequestMethod());
    }

    private void identifyTraceId() {
        if (this.isSDKStarted && this.traceId == null) {
            try {
                this.traceId = getRequestProperty(this.embrace.getTraceIdHeader());
            } catch (Exception unused) {
                Embrace.getInstance().getInternalInterface().logWarning("Failed to retrieve actual trace id header. Current: " + this.traceId, null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ww8 lambda$countingInputStream$6(byte[] bArr) {
        cacheNetworkCallData(bArr);
        internalLogNetworkCall();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getHeaderField$0(int i) {
        return this.connection.getHeaderField(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getHeaderField$1(String str) {
        return this.connection.getHeaderField(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$getHeaderFieldDate$3(String str, long j) {
        return Long.valueOf(this.connection.getHeaderFieldDate(str, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getHeaderFieldInt$4(String str, int i) {
        return Integer.valueOf(this.connection.getHeaderFieldInt(str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getHeaderFieldKey$2(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$getHeaderFieldLong$5(String str, long j) {
        return Long.valueOf(this.connection.getHeaderFieldLong(str, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ GZIPInputStream lambda$getWrappedInputStream$7(InputStream inputStream) throws Throwable {
        return new GZIPInputStream(inputStream);
    }

    private void logError(Throwable th) {
        Embrace.getInstance().getInternalInterface().logInternalError(th);
    }

    private <R> R retrieveHeaderField(String str, R r, qs2 qs2Var) {
        if (str == null) {
            return null;
        }
        if (shouldInterceptHeaderRetrieval(str)) {
            return r;
        }
        R r2 = (R) qs2Var.mo865invoke();
        cacheNetworkCallData();
        return r2;
    }

    private void setStartTime(Long l) {
        if (this.startTime == null) {
            this.startTime = l;
        }
    }

    private boolean shouldCaptureNetworkData() {
        return hasNetworkCaptureRules() && (this.enableWrapIoStreams || this.inputStreamAccessException != null) && (this.networkCaptureData.get() == null || this.networkCaptureData.get().getCapturedResponseBody() == null);
    }

    private boolean shouldInterceptHeaderRetrieval(String str) {
        return shouldUncompressGzip() && str != null && (str.equalsIgnoreCase("Content-Encoding") || str.equalsIgnoreCase("Content-Length"));
    }

    private boolean shouldUncompressGzip() {
        String contentEncoding = this.connection.getContentEncoding();
        return this.enableWrapIoStreams && contentEncoding != null && contentEncoding.equalsIgnoreCase(EmbraceOkHttp3NetworkInterceptor.ENCODING_GZIP);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void addRequestProperty(String str, String str2) {
        this.connection.addRequestProperty(str, str2);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void connect() throws IOException {
        if (this.isSDKStarted) {
            identifyTraceId();
            try {
                if (this.embrace.getInternalInterface().isNetworkSpanForwardingEnabled()) {
                    this.traceparent = this.connection.getRequestProperty("traceparent");
                }
            } catch (Exception unused) {
            }
        }
        this.connection.connect();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void disconnect() {
        setStartTime(Long.valueOf(this.createdTime));
        internalLogNetworkCall();
        this.connection.disconnect();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public boolean getAllowUserInteraction() {
        return this.connection.getAllowUserInteraction();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpsUrlConnection
    public String getCipherSuite() {
        T t = this.connection;
        if (t instanceof HttpsURLConnection) {
            return ((HttpsURLConnection) t).getCipherSuite();
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public int getConnectTimeout() {
        return this.connection.getConnectTimeout();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public Object getContent() throws IOException {
        identifyTraceId();
        return this.connection.getContent();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public String getContentEncoding() {
        if (shouldUncompressGzip()) {
            return null;
        }
        return this.connection.getContentEncoding();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public int getContentLength() {
        if (shouldUncompressGzip()) {
            return -1;
        }
        return this.connection.getContentLength();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    @TargetApi(24)
    public long getContentLengthLong() {
        if (shouldUncompressGzip()) {
            return -1L;
        }
        return this.connection.getContentLengthLong();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public String getContentType() {
        return this.connection.getContentType();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public long getDate() {
        return this.connection.getDate();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public boolean getDefaultUseCaches() {
        return this.connection.getDefaultUseCaches();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public boolean getDoInput() {
        return this.connection.getDoInput();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public boolean getDoOutput() {
        return this.connection.getDoOutput();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public InputStream getErrorStream() {
        return getWrappedInputStream(this.connection.getErrorStream());
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public String getHeaderField(final int i) {
        return (String) retrieveHeaderField(this.connection.getHeaderFieldKey(i), null, new qs2() { // from class: io.embrace.android.embracesdk.internal.network.http.b
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                String lambda$getHeaderField$0;
                lambda$getHeaderField$0 = EmbraceUrlConnectionDelegate.this.lambda$getHeaderField$0(i);
                return lambda$getHeaderField$0;
            }
        });
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public long getHeaderFieldDate(final String str, final long j) {
        Long l = (Long) retrieveHeaderField(str, Long.valueOf(j), new qs2() { // from class: io.embrace.android.embracesdk.internal.network.http.h
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                Long lambda$getHeaderFieldDate$3;
                lambda$getHeaderFieldDate$3 = EmbraceUrlConnectionDelegate.this.lambda$getHeaderFieldDate$3(str, j);
                return lambda$getHeaderFieldDate$3;
            }
        });
        return l != null ? l.longValue() : j;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public int getHeaderFieldInt(final String str, final int i) {
        Integer num = (Integer) retrieveHeaderField(str, Integer.valueOf(i), new qs2() { // from class: io.embrace.android.embracesdk.internal.network.http.f
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                Integer lambda$getHeaderFieldInt$4;
                lambda$getHeaderFieldInt$4 = EmbraceUrlConnectionDelegate.this.lambda$getHeaderFieldInt$4(str, i);
                return lambda$getHeaderFieldInt$4;
            }
        });
        return num != null ? num.intValue() : i;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public String getHeaderFieldKey(int i) {
        final String headerFieldKey = this.connection.getHeaderFieldKey(i);
        return (String) retrieveHeaderField(headerFieldKey, null, new qs2() { // from class: io.embrace.android.embracesdk.internal.network.http.c
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                String lambda$getHeaderFieldKey$2;
                lambda$getHeaderFieldKey$2 = EmbraceUrlConnectionDelegate.lambda$getHeaderFieldKey$2(headerFieldKey);
                return lambda$getHeaderFieldKey$2;
            }
        });
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    @TargetApi(24)
    public long getHeaderFieldLong(final String str, final long j) {
        Long l = (Long) retrieveHeaderField(str, Long.valueOf(j), new qs2() { // from class: io.embrace.android.embracesdk.internal.network.http.d
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                Long lambda$getHeaderFieldLong$5;
                lambda$getHeaderFieldLong$5 = EmbraceUrlConnectionDelegate.this.lambda$getHeaderFieldLong$5(str, j);
                return lambda$getHeaderFieldLong$5;
            }
        });
        return l != null ? l.longValue() : j;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public Map<String, List<String>> getHeaderFields() {
        cacheNetworkCallData();
        return this.headerFields.get();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpsUrlConnection
    public HostnameVerifier getHostnameVerifier() {
        T t = this.connection;
        if (t instanceof HttpsURLConnection) {
            return ((HttpsURLConnection) t).getHostnameVerifier();
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public long getIfModifiedSince() {
        return this.connection.getIfModifiedSince();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public InputStream getInputStream() throws IOException {
        try {
            return getWrappedInputStream(this.connection.getInputStream());
        } catch (IOException e) {
            this.inputStreamAccessException = e;
            throw e;
        }
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public boolean getInstanceFollowRedirects() {
        return this.connection.getInstanceFollowRedirects();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public long getLastModified() {
        return this.connection.getLastModified();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpsUrlConnection
    public Certificate[] getLocalCertificates() {
        T t = this.connection;
        return t instanceof HttpsURLConnection ? ((HttpsURLConnection) t).getLocalCertificates() : new Certificate[0];
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public Principal getLocalPrincipal() {
        T t = this.connection;
        if (t instanceof HttpsURLConnection) {
            return ((HttpsURLConnection) t).getLocalPrincipal();
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public OutputStream getOutputStream() throws IOException {
        identifyTraceId();
        OutputStream outputStream = this.connection.getOutputStream();
        if (!this.enableWrapIoStreams || this.outputStream != null || outputStream == null) {
            return outputStream;
        }
        this.outputStream = new CountingOutputStream(outputStream);
        return this.outputStream;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        T t = this.connection;
        if (t instanceof HttpsURLConnection) {
            return ((HttpsURLConnection) t).getPeerPrincipal();
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public Permission getPermission() throws IOException {
        return this.connection.getPermission();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public int getReadTimeout() {
        return this.connection.getReadTimeout();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public String getRequestMethod() {
        return this.connection.getRequestMethod();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.connection.getRequestProperties();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public String getRequestProperty(String str) {
        return this.connection.getRequestProperty(str);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public int getResponseCode() {
        identifyTraceId();
        cacheNetworkCallData();
        return this.responseCode.get();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public String getResponseMessage() throws IOException {
        identifyTraceId();
        cacheNetworkCallData();
        return this.connection.getResponseMessage();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpsUrlConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        T t = this.connection;
        return t instanceof HttpsURLConnection ? ((HttpsURLConnection) t).getServerCertificates() : new Certificate[0];
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpsUrlConnection
    public SSLSocketFactory getSslSocketFactory() {
        T t = this.connection;
        if (t instanceof HttpsURLConnection) {
            return ((HttpsURLConnection) t).getSSLSocketFactory();
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public URL getUrl() {
        return this.connection.getURL();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public boolean getUseCaches() {
        return this.connection.getUseCaches();
    }

    synchronized void internalLogNetworkCall() {
        String str;
        String str2;
        try {
            if (this.isSDKStarted && !this.didLogNetworkCall) {
                this.didLogNetworkCall = true;
                long sdkCurrentTime = this.embrace.getInternalInterface().getSdkCurrentTime();
                String uRLString = EmbraceHttpPathOverride.getURLString(new EmbraceHttpUrlConnectionOverride(this.connection));
                try {
                    long max = this.outputStream == null ? 0L : Math.max(this.outputStream.getCount(), 0L);
                    long max2 = Math.max(0L, this.responseSize.get());
                    if (this.inputStreamAccessException == null && this.lastConnectionAccessException == null && this.responseCode.get() != 0) {
                        this.embrace.getInternalInterface().recordNetworkRequest(EmbraceNetworkRequest.fromCompletedRequest(uRLString, HttpMethod.fromString(getRequestMethod()), this.startTime.longValue(), sdkCurrentTime, max, max2, this.responseCode.get(), this.traceId, this.traceparent, this.networkCaptureData.get()));
                    } else {
                        if (this.inputStreamAccessException != null) {
                            str = this.inputStreamAccessException.getClass().getCanonicalName();
                            str2 = this.inputStreamAccessException.getMessage();
                        } else if (this.lastConnectionAccessException != null) {
                            str = this.lastConnectionAccessException.getClass().getCanonicalName();
                            str2 = this.lastConnectionAccessException.getMessage();
                        } else {
                            str = null;
                            str2 = null;
                        }
                        if (str == null) {
                            str = "UnknownState";
                        }
                        this.embrace.getInternalInterface().recordNetworkRequest(EmbraceNetworkRequest.fromIncompleteRequest(uRLString, HttpMethod.fromString(getRequestMethod()), this.startTime.longValue(), sdkCurrentTime, str, str2 != null ? str2 : "HTTP response state unknown", this.traceId, this.traceparent, this.networkCaptureData.get()));
                    }
                } catch (Exception e) {
                    logError(e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setAllowUserInteraction(boolean z) {
        this.connection.setAllowUserInteraction(z);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setChunkedStreamingMode(int i) {
        this.connection.setChunkedStreamingMode(i);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setConnectTimeout(int i) {
        this.connection.setConnectTimeout(i);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setDefaultUseCaches(boolean z) {
        this.connection.setDefaultUseCaches(z);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setDoInput(boolean z) {
        this.connection.setDoInput(z);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setDoOutput(boolean z) {
        this.connection.setDoOutput(z);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setFixedLengthStreamingMode(int i) {
        this.connection.setFixedLengthStreamingMode(i);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpsUrlConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        T t = this.connection;
        if (t instanceof HttpsURLConnection) {
            ((HttpsURLConnection) t).setHostnameVerifier(hostnameVerifier);
        }
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setIfModifiedSince(long j) {
        this.connection.setIfModifiedSince(j);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.connection.setInstanceFollowRedirects(z);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setReadTimeout(int i) {
        this.connection.setReadTimeout(i);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.connection.setRequestMethod(str);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setRequestProperty(String str, String str2) {
        this.connection.setRequestProperty(str, str2);
        if (hasNetworkCaptureRules()) {
            this.requestHeaders = getProcessedHeaders(getRequestProperties());
        }
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpsUrlConnection
    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        T t = this.connection;
        if (t instanceof HttpsURLConnection) {
            ((HttpsURLConnection) t).setSSLSocketFactory(sSLSocketFactory);
        }
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setUseCaches(boolean z) {
        this.connection.setUseCaches(z);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public String toString() {
        return this.connection.toString();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public boolean usingProxy() {
        return this.connection.usingProxy();
    }

    EmbraceUrlConnectionDelegate(T t, boolean z, Embrace embrace) {
        this.didLogNetworkCall = false;
        this.responseSize = new AtomicLong(-1L);
        this.responseCode = new AtomicInteger(0);
        this.headerFields = new AtomicReference<>(null);
        this.networkCaptureData = new AtomicReference<>(null);
        this.traceparent = null;
        this.connection = t;
        this.enableWrapIoStreams = z;
        this.embrace = embrace;
        this.createdTime = embrace.getInternalInterface().getSdkCurrentTime();
        this.isSDKStarted = embrace.isStarted();
    }

    private void cacheNetworkCallData(byte[] bArr) {
        Map<String, List<String>> hashMap;
        if (this.isSDKStarted) {
            setStartTime(Long.valueOf(this.embrace.getInternalInterface().getSdkCurrentTime()));
            if (this.headerFields.get() == null) {
                synchronized (this.headerFields) {
                    try {
                        if (this.headerFields.get() == null) {
                            if (this.enableWrapIoStreams) {
                                hashMap = new HashMap<>(this.connection.getHeaderFields());
                                hashMap.remove("Content-Encoding");
                                hashMap.remove("Content-Length");
                            } else {
                                hashMap = this.connection.getHeaderFields();
                            }
                            this.headerFields.set(hashMap);
                        }
                    } catch (Exception e) {
                        this.lastConnectionAccessException = e;
                    } finally {
                    }
                }
            }
            if (this.responseCode.get() == 0) {
                synchronized (this.responseCode) {
                    if (this.responseCode.get() == 0) {
                        try {
                            this.responseCode.set(this.connection.getResponseCode());
                        } catch (Exception e2) {
                            this.lastConnectionAccessException = e2;
                        }
                    }
                }
            }
            if (this.responseSize.get() == -1) {
                synchronized (this.responseSize) {
                    if (this.responseSize.get() == -1) {
                        try {
                            this.responseSize.set(this.connection.getContentLength());
                        } catch (Exception e3) {
                            this.lastConnectionAccessException = e3;
                        }
                    }
                }
            }
            if (!this.enableWrapIoStreams) {
                internalLogNetworkCall();
            }
            if (shouldCaptureNetworkData()) {
                synchronized (this.networkCaptureData) {
                    try {
                        if (shouldCaptureNetworkData()) {
                            NetworkCaptureData networkCaptureData = this.networkCaptureData.get();
                            if (networkCaptureData == null) {
                                this.networkCaptureData.set(new NetworkCaptureData(this.requestHeaders, this.connection.getURL().getQuery(), this.outputStream != null ? this.outputStream.getRequestBody() : null, getProcessedHeaders(this.headerFields.get()), bArr, null));
                            } else if (bArr != null) {
                                this.networkCaptureData.set(new NetworkCaptureData(networkCaptureData.getRequestHeaders(), networkCaptureData.getRequestQueryParams(), networkCaptureData.getCapturedRequestBody(), networkCaptureData.getResponseHeaders(), bArr, null));
                            }
                        }
                    } catch (Exception e4) {
                        this.lastConnectionAccessException = e4;
                    } finally {
                    }
                }
            }
        }
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public void setFixedLengthStreamingMode(long j) {
        this.connection.setFixedLengthStreamingMode(j);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public Object getContent(Class<?>[] clsArr) throws IOException {
        identifyTraceId();
        return this.connection.getContent(clsArr);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.EmbraceHttpUrlConnection
    public String getHeaderField(final String str) {
        return (String) retrieveHeaderField(str, null, new qs2() { // from class: io.embrace.android.embracesdk.internal.network.http.a
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                String lambda$getHeaderField$1;
                lambda$getHeaderField$1 = EmbraceUrlConnectionDelegate.this.lambda$getHeaderField$1(str);
                return lambda$getHeaderField$1;
            }
        });
    }
}
