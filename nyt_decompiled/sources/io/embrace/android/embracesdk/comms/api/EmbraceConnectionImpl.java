package io.embrace.android.embracesdk.comms.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
class EmbraceConnectionImpl implements EmbraceConnection {
    private HttpURLConnection httpUrlConnection;
    private Integer responseCode = null;
    private EmbraceUrl url;

    public EmbraceConnectionImpl(HttpURLConnection httpURLConnection, EmbraceUrl embraceUrl) {
        this.httpUrlConnection = httpURLConnection;
        this.url = embraceUrl;
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public void connect() throws IOException {
        this.httpUrlConnection.connect();
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public InputStream getErrorStream() {
        return this.httpUrlConnection.getErrorStream();
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public String getHeaderField(String str) {
        return this.httpUrlConnection.getHeaderField(str);
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.httpUrlConnection.getHeaderFields();
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public InputStream getInputStream() throws IOException {
        return this.httpUrlConnection.getInputStream();
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public OutputStream getOutputStream() throws IOException {
        return this.httpUrlConnection.getOutputStream();
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public String getRequestMethod() {
        return this.httpUrlConnection.getRequestMethod();
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public int getResponseCode() throws IOException {
        Integer num = this.responseCode;
        return num == null ? this.httpUrlConnection.getResponseCode() : num.intValue();
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public String getResponseMessage() throws IOException {
        return this.httpUrlConnection.getResponseMessage();
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return ((HttpsURLConnection) this.httpUrlConnection).getSSLSocketFactory();
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public EmbraceUrl getURL() {
        return this.url;
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public boolean isHttps() {
        return this.httpUrlConnection instanceof HttpsURLConnection;
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public void setConnectTimeout(Integer num) {
        this.httpUrlConnection.setConnectTimeout(num.intValue());
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public void setDoOutput(Boolean bool) {
        this.httpUrlConnection.setDoOutput(bool.booleanValue());
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public void setReadTimeout(Integer num) {
        this.httpUrlConnection.setReadTimeout(num.intValue());
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.httpUrlConnection.setRequestMethod(str);
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public void setRequestProperty(String str, String str2) {
        this.httpUrlConnection.setRequestProperty(str, str2);
    }

    @Override // io.embrace.android.embracesdk.comms.api.EmbraceConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        ((HttpsURLConnection) this.httpUrlConnection).setSSLSocketFactory(sSLSocketFactory);
    }
}
