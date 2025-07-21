package io.embrace.android.embracesdk.internal.network.http;

import android.annotation.TargetApi;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
class EmbraceHttpsUrlConnectionImpl<T extends HttpsURLConnection> extends HttpsURLConnection {
    private final EmbraceHttpsUrlConnection embraceHttpsUrlConnectionDelegate;

    public EmbraceHttpsUrlConnectionImpl(T t, boolean z) {
        this(t, new EmbraceUrlConnectionDelegate(t, z));
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.embraceHttpsUrlConnectionDelegate.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.embraceHttpsUrlConnectionDelegate.connect();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.embraceHttpsUrlConnectionDelegate.disconnect();
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.embraceHttpsUrlConnectionDelegate.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.embraceHttpsUrlConnectionDelegate.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.embraceHttpsUrlConnectionDelegate.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.embraceHttpsUrlConnectionDelegate.getContent();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.embraceHttpsUrlConnectionDelegate.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.embraceHttpsUrlConnectionDelegate.getContentLength();
    }

    @Override // java.net.URLConnection
    @TargetApi(24)
    public long getContentLengthLong() {
        return this.embraceHttpsUrlConnectionDelegate.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.embraceHttpsUrlConnectionDelegate.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.embraceHttpsUrlConnectionDelegate.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.embraceHttpsUrlConnectionDelegate.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.embraceHttpsUrlConnectionDelegate.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.embraceHttpsUrlConnectionDelegate.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.embraceHttpsUrlConnectionDelegate.getErrorStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.embraceHttpsUrlConnectionDelegate.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.embraceHttpsUrlConnectionDelegate.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.embraceHttpsUrlConnectionDelegate.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.embraceHttpsUrlConnectionDelegate.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    @TargetApi(24)
    public long getHeaderFieldLong(String str, long j) {
        return this.embraceHttpsUrlConnectionDelegate.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.embraceHttpsUrlConnectionDelegate.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.embraceHttpsUrlConnectionDelegate.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.embraceHttpsUrlConnectionDelegate.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.embraceHttpsUrlConnectionDelegate.getInputStream();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.embraceHttpsUrlConnectionDelegate.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.embraceHttpsUrlConnectionDelegate.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.embraceHttpsUrlConnectionDelegate.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.embraceHttpsUrlConnectionDelegate.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.embraceHttpsUrlConnectionDelegate.getOutputStream();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.embraceHttpsUrlConnectionDelegate.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.embraceHttpsUrlConnectionDelegate.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.embraceHttpsUrlConnectionDelegate.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.embraceHttpsUrlConnectionDelegate.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.embraceHttpsUrlConnectionDelegate.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.embraceHttpsUrlConnectionDelegate.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.embraceHttpsUrlConnectionDelegate.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.embraceHttpsUrlConnectionDelegate.getResponseMessage();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.embraceHttpsUrlConnectionDelegate.getSslSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.embraceHttpsUrlConnectionDelegate.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.embraceHttpsUrlConnectionDelegate.getUrl();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.embraceHttpsUrlConnectionDelegate.getUseCaches();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.embraceHttpsUrlConnectionDelegate.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.embraceHttpsUrlConnectionDelegate.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.embraceHttpsUrlConnectionDelegate.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.embraceHttpsUrlConnectionDelegate.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.embraceHttpsUrlConnectionDelegate.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.embraceHttpsUrlConnectionDelegate.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.embraceHttpsUrlConnectionDelegate.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.embraceHttpsUrlConnectionDelegate.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.embraceHttpsUrlConnectionDelegate.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.embraceHttpsUrlConnectionDelegate.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.embraceHttpsUrlConnectionDelegate.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.embraceHttpsUrlConnectionDelegate.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.embraceHttpsUrlConnectionDelegate.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.embraceHttpsUrlConnectionDelegate.setSslSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.embraceHttpsUrlConnectionDelegate.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.embraceHttpsUrlConnectionDelegate.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.embraceHttpsUrlConnectionDelegate.usingProxy();
    }

    EmbraceHttpsUrlConnectionImpl(T t, EmbraceUrlConnectionDelegate<T> embraceUrlConnectionDelegate) {
        super(t.getURL());
        this.embraceHttpsUrlConnectionDelegate = embraceUrlConnectionDelegate;
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.embraceHttpsUrlConnectionDelegate.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.embraceHttpsUrlConnectionDelegate.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.embraceHttpsUrlConnectionDelegate.setFixedLengthStreamingMode(j);
    }
}
